package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket clientSocket) throws IOException {
        this.client = clientSocket;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);
    }

    @Override
    public void run() {

        try {
            while (true) {
                String request = in.readLine();
                if(request.contains("CREATE")){
                    if(Server.isServerCreated){
                        out.println("CREATE BAD");
                    } else {
                        Server.toggleCreateStatus();
                        Server.now_players++;
                        System.out.println("[SERVER] Now players: " + Server.now_players);
                        out.println("CREATE OK");
                    }

                } else if(request.contains("JOIN")){
                    if(Server.now_players < Server.max_players && Server.isServerCreated){
                        Server.now_players++;
                        System.out.println("[SERVER] Now players: " + Server.now_players);
                        out.println("JOIN OK");

                        if(Server.max_players == 2){
                            out.println("2 PLAYERS");
                        }

                        //sending all used colors to client
                        if(Server.usedColors != null){
                            for(String color : Server.usedColors){
                                out.println("COLOR " + color);
                            }
                        }
                    } else {
                        out.println("JOIN BAD");
                    }

                } else if(request.contains("COLOR")){

                    String[] color_arr = request.split(" ");
                    String color_str = color_arr[1];

                    if(Server.usedColors != null && Server.usedColors.contains(color_str)){
                        out.println("COLOR BAD");
                    } else {
                        out.println("COLOR OK");
                        Server.usedColors.push(color_str);

                        //Sending used Colors to all connected clients
                        for(ClientHandler clientHandler : Server.getClients()){
                            if(clientHandler.client != client)
                                clientHandler.out.println("COLOR " + color_str);
                        }

                        if(Server.usedColors.size() == Server.max_players){
                            Server.initBoard();
                            Server.addPlayersToBoard(Server.usedColors);
                            Server.createPlayers();
                            for(ClientHandler clientHandler : Server.getClients()){
                                clientHandler.out.println("GAME STARTED");
                            }
                            System.out.println("[SERVER] GAME STARTED");

                            Server.turnIndex = Server.selectFirstTurnId();
                            Server.getClients().get(Server.turnIndex % Server.max_players).out.println("YOUR TURN");

                        }

                        for(String color : Server.usedColors){
                            System.out.println("[Server] Used color: " + color);
                        }
                    }

                } else if(request.contains("STEP")){

                    if(Server.wasMadeSingleTurn){
                        out.println("MOVE BAD");
                    } else {
                        String[] command = request.split(" ");
                        boolean isPossible = Server.checkIsPossible(Integer.parseInt(command[1]), Integer.parseInt(command[2]),
                                Integer.parseInt(command[3]), Integer.parseInt(command[4]));
                        if(isPossible){
                            Server.updateBoard(Integer.parseInt(command[1]), Integer.parseInt(command[2]),
                                    Integer.parseInt(command[3]), Integer.parseInt(command[4]));
                            out.println("MOVE OK");
                            for(ClientHandler clientHandler : Server.getClients()){
                                if(clientHandler.client != client)
                                    clientHandler.out.println("STEP " +  command[1] + " " + command[2] + " " + command[3] +" " + command[4] +
                                            Server.getBoard().getPoint(Integer.parseInt(command[3]), Integer.parseInt(command[4])).getTextUsedTeamId());
                            }
                            System.out.println("[SERVER] MOVED: " + command[1] + " " + command[2] + " " + command[3] +" " + command[4]);

                            int mod_x = Math.abs(Integer.parseInt(command[1]) - Integer.parseInt(command[3]));
                            int mod_y = Math.abs(Integer.parseInt(command[2]) - Integer.parseInt(command[4]));

                            if(mod_x <= 1 && mod_y <= 1) Server.wasMadeSingleTurn = true;

                            if(Server.checkPlayersScore() != null){
                                for(ClientHandler clientHandler : Server.getClients()){
                                    if(clientHandler.client != client)
                                        clientHandler.out.println("YOU LOST");
                                }
                                out.println("YOU WON");
                                System.out.println("[SERVER] GAME OVER");
                                Server.isGameOver = true;
                            }
                        } else {
                            out.println("MOVE BAD");
                        }
                    }

                } else if(request.contains("PLAYERS")) {
                    String[] command = request.split(" ");
                    Server.max_players = Integer.parseInt(command[0]);
                    out.println("PLAYERS OK");
                    System.out.println("[SERVER] MAX_PLAYERS: " + Server.max_players);
                } else if(request.contains("EXIT")){
                    String exit_id = (request.split(" "))[1];
                    ArrayList<ClientHandler> clients = Server.getClients();
                    for(int i = 0; i < Server.getClients().size(); i++){
                        if(clients.get(i).client == client){
                            Server.dropClient(i);
                            Server.dropPlayer(exit_id);
                        }
                    }

                    System.out.println("[SERVER] Socket disconnected, board cleared");

                    for(ClientHandler clientHandler : Server.getClients()){
                        clientHandler.out.println("DELETE " + exit_id);
                    }
                    System.out.println("[SERVER] All clients know about player leave");

                    out.println("EXIT OK");
                } else if (request.contains("FINISH")) {
                    out.println("NOT YOUR TURN");
                    Server.wasMadeSingleTurn = false;
                    Server.turnIndex++;
                    Server.getClients().get(Server.turnIndex % Server.max_players).out.println("YOUR TURN");
                } else if(request.contains(".")){
                    out.println("NOTHING");
                }
            }
        } catch (IOException e) {
           System.err.println("IOException in client handler");
           System.err.println(e.getStackTrace());
        } finally {
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
