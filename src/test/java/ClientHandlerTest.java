import Server.ClientHandler;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientHandlerTest {
    private static ExecutorService pool = Executors.newFixedThreadPool(6);

    @Test
    public void testClientHandler() throws IOException {

        ServerSocket listener = new ServerSocket(8080);

        Socket client = listener.accept();
        System.out.println("[SERVER] Connected to client!");
        ClientHandler clientThread = new ClientHandler(client);
        pool.execute(clientThread);

        Socket socket = new Socket("127.0.0.1", 8080);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String command = "CREATE";

        out.println(command);
        String serverResponse = input.readLine();

        assertEquals("CREATE OK", serverResponse);

        socket.close();
        System.exit(0);
    }
}
