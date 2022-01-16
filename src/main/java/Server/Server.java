package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static Board b = initBoard();
    static int PORT = 8080;
    static int now_players = 0;
    static int max_players = 0;

    /** Variable used to watch under sequence of actions */
    static int turnIndex = 0;

    static boolean isServerCreated = false;
    static boolean isGameOver = false;

    /** Variable which is set to true when player already did short step */
    static boolean wasMadeSingleTurn = false;

    /** Stack with used colors */
    static Stack<String> usedColors = new Stack<>();

    /** Function which toggle Boolean variable IsServerCreated */
    static void toggleCreateStatus() {
        isServerCreated = !isServerCreated;
    }

    /** Function which return board
     * @return Board*/
    static Board getBoard() {
        return b;
    }

    /** Function which generate clear board*/
    static Board initBoard() {

        ArrayList<Row> ROWS = new ArrayList<>();

        //ROW INDEX 0
        Point p00 = new Point(12,8, false, Color.GREY, Color.GREY);
        Point p20 = new Point(14,8, false, Color.GREY, Color.GREY);
        Point p40 = new Point(16,8, false, Color.GREY, Color.GREY);
        Point p60 = new Point(18,8, false, Color.GREY, Color.GREY);
        Point p80 = new Point(20,8, false, Color.GREY, Color.GREY);
        Point p_20 = new Point(10,8, false, Color.GREY, Color.GREY);
        Point p_40 = new Point(8,8, false, Color.GREY, Color.GREY);
        Point p_60 = new Point(6,8, false, Color.GREY, Color.GREY);
        Point p_80 = new Point(4,8, false, Color.GREY, Color.GREY);
        ArrayList<Point> p0 = new ArrayList<>();
        p0.add(p00);
        p0.add(p20);
        p0.add(p40);
        p0.add(p60);
        p0.add(p80);
        p0.add(p_20);
        p0.add(p_40);
        p0.add(p_60);
        p0.add(p_80);
        Row r0 = new Row(p0, 9, 8);
        ROWS.add(r0);

        //ROW INDEX 1
        Point p11 = new Point(13, 7, false, Color.GREY, Color.GREY);
        Point p31 = new Point(15, 7, false, Color.GREY, Color.GREY);
        Point p51 = new Point(17, 7, false, Color.GREY, Color.GREY);
        Point p71 = new Point(19, 7, false, Color.GREY, Color.GREY);
        Point p91 = new Point(21, 7, false, Color.GREY, Color.GREY);
        Point p_11 = new Point(11, 7, false, Color.GREY, Color.GREY);
        Point p_31 = new Point(9, 7, false, Color.GREY, Color.GREY);
        Point p_51 = new Point(7, 7, false, Color.GREY, Color.GREY);
        Point p_71 = new Point(5, 7, false, Color.GREY, Color.GREY);
        Point p_91 = new Point(3, 7, false, Color.GREY, Color.GREY);
        ArrayList<Point> p1 = new ArrayList<>();
        p1.add(p11);
        p1.add(p31);
        p1.add(p51);
        p1.add(p71);
        p1.add(p91);
        p1.add(p_11);
        p1.add(p_31);
        p1.add(p_51);
        p1.add(p_71);
        p1.add(p_91);
        Row r1 = new Row(p1, 10, 7);
        ROWS.add(r1);

        //ROW INDEX 2
        Point p02 = new Point(12, 6, false, Color.GREY, Color.GREY);
        Point p22 = new Point(14, 6, false, Color.GREY, Color.GREY);
        Point p42 = new Point(16, 6, false, Color.GREY, Color.GREY);
        Point p62 = new Point(18, 6, false, Color.GREY, Color.GREY);
        Point p82 = new Point(20, 6, false, Color.GREY, Color.GREY);
        Point p102 = new Point(22, 6, false, Color.GREY, Color.GREY);
        Point p_22 = new Point(10, 6, false, Color.GREY, Color.GREY);
        Point p_42 = new Point(8, 6, false, Color.GREY, Color.GREY);
        Point p_62 = new Point(6, 6, false, Color.GREY, Color.GREY);
        Point p_82 = new Point(4, 6, false, Color.GREY, Color.GREY);
        Point p_102 = new Point(2, 6, false, Color.GREY, Color.GREY);
        ArrayList<Point> p2 = new ArrayList<>();
        p2.add(p02);
        p2.add(p22);
        p2.add(p42);
        p2.add(p62);
        p2.add(p82);
        p2.add(p102);
        p2.add(p_22);
        p2.add(p_42);
        p2.add(p_62);
        p2.add(p_82);
        p2.add(p_102);
        Row r2 = new Row(p2, 11, 6);
        ROWS.add(r2);

        //ROW INDEX 3
        Point p13 = new Point(13, 5, false, Color.GREY, Color.GREY);
        Point p33 = new Point(15, 5, false, Color.GREY, Color.GREY);
        Point p53 = new Point(17, 5, false, Color.GREY, Color.GREY);
        Point p73 = new Point(19, 5, false, Color.GREY, Color.GREY);
        Point p93 = new Point(21, 5, false, Color.GREY, Color.GREY);
        Point p113 = new Point(23, 5, false, Color.GREY, Color.GREY);
        Point p_13 = new Point(11, 5, false, Color.GREY, Color.GREY);
        Point p_33 = new Point(9, 5, false, Color.GREY, Color.GREY);
        Point p_53 = new Point(7, 5, false, Color.GREY, Color.GREY);
        Point p_73 = new Point(5, 5, false, Color.GREY, Color.GREY);
        Point p_93 = new Point(3, 5, false, Color.GREY, Color.GREY);
        Point p_113 = new Point(1, 5, false, Color.GREY, Color.GREY);
        ArrayList<Point> p3 = new ArrayList<>();
        p3.add(p13);
        p3.add(p33);
        p3.add(p53);
        p3.add(p73);
        p3.add(p93);
        p3.add(p113);
        p3.add(p_13);
        p3.add(p_33);
        p3.add(p_53);
        p3.add(p_73);
        p3.add(p_93);
        p3.add(p_113);
        Row r3 = new Row(p3, 12, 5);
        ROWS.add(r3);

        //ROW INDEX 4
        Point p04 = new Point(12, 4, false, Color.GREY, Color.GREY);
        Point p24 = new Point(14, 4, false, Color.GREY, Color.GREY);
        Point p44 = new Point(16, 4, false, Color.GREY, Color.GREY);
        Point p64 = new Point(18, 4, false, Color.GREY, Color.GREY);
        Point p84 = new Point(20, 4, false, Color.GREY, Color.GREY);
        Point p104 = new Point(22, 4, false, Color.GREY, Color.GREY);
        Point p124 = new Point(24, 4, false, Color.GREY, Color.GREY);
        Point p_24 = new Point(10, 4, false, Color.GREY, Color.GREY);
        Point p_44 = new Point(8, 4, false, Color.GREY, Color.GREY);
        Point p_64 = new Point(6, 4, false, Color.GREY, Color.GREY);
        Point p_84 = new Point(4, 4, false, Color.GREY, Color.GREY);
        Point p_104 = new Point(2, 4, false, Color.GREY, Color.GREY);
        Point p_124 = new Point(0, 4, false, Color.GREY, Color.GREY);
        ArrayList<Point> p4 = new ArrayList<>();
        p4.add(p04);
        p4.add(p24);
        p4.add(p44);
        p4.add(p64);
        p4.add(p84);
        p4.add(p104);
        p4.add(p124);
        p4.add(p_24);
        p4.add(p_44);
        p4.add(p_64);
        p4.add(p_84);
        p4.add(p_104);
        p4.add(p_124);
        Row r4 = new Row(p4, 13, 4);
        ROWS.add(r4);

        //ROW INDEX 5
        Point p_35 = new Point(9, 3, false, Color.GREY, Color.GREY);
        Point p_15 = new Point(11, 3, false, Color.GREY, Color.GREY);
        Point p15 = new Point(13, 3, false, Color.GREY, Color.GREY);
        Point p35 = new Point(15, 3, false, Color.GREY, Color.GREY);
        ArrayList<Point> p5 = new ArrayList<>();
        p5.add(p_35);
        p5.add(p_15);
        p5.add(p35);
        p5.add(p15);
        Row r5 = new Row(p5, 4, 3);
        ROWS.add(r5);

        //ROW INDEX 6
        Point p06 = new Point(12, 2, false, Color.GREY, Color.GREY);
        Point p_26 = new Point(10, 2, false, Color.GREY, Color.GREY);
        Point p26 = new Point(14, 2, false, Color.GREY, Color.GREY);
        ArrayList<Point> p6 = new ArrayList<>();
        p6.add(p06);
        p6.add(p_26);
        p6.add(p26);
        Row r6 = new Row(p6, 3, 2);
        ROWS.add(r6);

        //ROW INDEX 7
        Point p_17 = new Point(11, 1, false, Color.GREY, Color.GREY);
        Point p17 = new Point(13, 1, false, Color.GREY, Color.GREY);
        ArrayList<Point> p7 = new ArrayList<>();
        p7.add(p_17);
        p7.add(p17);
        Row r7 = new Row(p7, 2, 1);
        ROWS.add(r7);

        //ROW INDEX 8
        Point p08 = new Point(12, 0, false, Color.GREY, Color.GREY);
        ArrayList<Point> p8 = new ArrayList<>();
        p8.add(p08);
        Row r8 = new Row(p8, 1, 0);
        ROWS.add(r8);

        //ROW INDEX -1
        Point p1_1 = new Point(13, 9, false, Color.GREY, Color.GREY);
        Point p3_1 = new Point(15, 9, false, Color.GREY, Color.GREY);
        Point p5_1 = new Point(17, 9, false, Color.GREY, Color.GREY);
        Point p7_1 = new Point(19, 9, false, Color.GREY, Color.GREY);
        Point p9_1 = new Point(21, 9, false, Color.GREY, Color.GREY);
        Point p_1_1 = new Point(11, 9, false, Color.GREY, Color.GREY);
        Point p_3_1 = new Point(9, 9, false, Color.GREY, Color.GREY);
        Point p_5_1 = new Point(7, 9, false, Color.GREY, Color.GREY);
        Point p_7_1 = new Point(5, 9, false, Color.GREY, Color.GREY);
        Point p_9_1 = new Point(3, 9, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_1 = new ArrayList<>();
        p_1.add(p1_1);
        p_1.add(p3_1);
        p_1.add(p5_1);
        p_1.add(p7_1);
        p_1.add(p9_1);
        p_1.add(p_1_1);
        p_1.add(p_3_1);
        p_1.add(p_5_1);
        p_1.add(p_7_1);
        p_1.add(p_9_1);
        Row r_1 = new Row(p_1, 10, 9);
        ROWS.add(r_1);

        //ROW INDEX -2
        Point p0_2 = new Point(12, 10, false, Color.GREY, Color.GREY);
        Point p2_2 = new Point(14, 10, false, Color.GREY, Color.GREY);
        Point p4_2 = new Point(16, 10, false, Color.GREY, Color.GREY);
        Point p6_2 = new Point(18, 10, false, Color.GREY, Color.GREY);
        Point p8_2 = new Point(20, 10, false, Color.GREY, Color.GREY);
        Point p10_2 = new Point(22, 10, false, Color.GREY, Color.GREY);
        Point p_2_2 = new Point(10, 10, false, Color.GREY, Color.GREY);
        Point p_4_2 = new Point(8, 10, false, Color.GREY, Color.GREY);
        Point p_6_2 = new Point(6, 10, false, Color.GREY, Color.GREY);
        Point p_8_2 = new Point(4, 10, false, Color.GREY, Color.GREY);
        Point p_10_2 = new Point(2, 10, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_2 = new ArrayList<>();
        p_2.add(p0_2);
        p_2.add(p2_2);
        p_2.add(p4_2);
        p_2.add(p6_2);
        p_2.add(p8_2);
        p_2.add(p10_2);
        p_2.add(p_2_2);
        p_2.add(p_4_2);
        p_2.add(p_6_2);
        p_2.add(p_8_2);
        p_2.add(p_10_2);
        Row r_2 = new Row(p_2, 11, 10);
        ROWS.add(r_2);

        //ROW INDEX -3
        Point p1_3 = new Point(13, 11, false, Color.GREY, Color.GREY);
        Point p3_3 = new Point(15, 11, false, Color.GREY, Color.GREY);
        Point p5_3 = new Point(17, 11, false, Color.GREY, Color.GREY);
        Point p7_3 = new Point(19, 11, false, Color.GREY, Color.GREY);
        Point p9_3 = new Point(21, 11, false, Color.GREY, Color.GREY);
        Point p11_3 = new Point(23, 11, false, Color.GREY, Color.GREY);
        Point p_1_3 = new Point(11, 11, false, Color.GREY, Color.GREY);
        Point p_3_3 = new Point(9, 11, false, Color.GREY, Color.GREY);
        Point p_5_3 = new Point(7, 11, false, Color.GREY, Color.GREY);
        Point p_7_3 = new Point(5, 11, false, Color.GREY, Color.GREY);
        Point p_9_3 = new Point(3, 11, false, Color.GREY, Color.GREY);
        Point p_11_3 = new Point(1, 11, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_3 = new ArrayList<>();
        p_3.add(p1_3);
        p_3.add(p3_3);
        p_3.add(p5_3);
        p_3.add(p7_3);
        p_3.add(p9_3);
        p_3.add(p11_3);
        p_3.add(p_1_3);
        p_3.add(p_3_3);
        p_3.add(p_5_3);
        p_3.add(p_7_3);
        p_3.add(p_9_3);
        p_3.add(p_11_3);
        Row r_3 = new Row(p_3, 12, 11);
        ROWS.add(r_3);

        //ROW INDEX -4
        Point p0_4 = new Point(12, 12, false, Color.GREY, Color.GREY);
        Point p2_4 = new Point(14, 12, false, Color.GREY, Color.GREY);
        Point p4_4 = new Point(16, 12, false, Color.GREY, Color.GREY);
        Point p6_4 = new Point(18, 12, false, Color.GREY, Color.GREY);
        Point p8_4 = new Point(20, 12, false, Color.GREY, Color.GREY);
        Point p10_4 = new Point(22, 12, false, Color.GREY, Color.GREY);
        Point p12_4 = new Point(24, 12, false, Color.GREY, Color.GREY);
        Point p_2_4 = new Point(10, 12, false, Color.GREY, Color.GREY);
        Point p_4_4 = new Point(8, 12, false, Color.GREY, Color.GREY);
        Point p_6_4 = new Point(6, 12, false, Color.GREY, Color.GREY);
        Point p_8_4 = new Point(4, 12, false, Color.GREY, Color.GREY);
        Point p_10_4 = new Point(2, 12, false, Color.GREY, Color.GREY);
        Point p_12_4 = new Point(0, 12, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_4 = new ArrayList<>();
        p_4.add(p0_4);
        p_4.add(p2_4);
        p_4.add(p4_4);
        p_4.add(p6_4);
        p_4.add(p8_4);
        p_4.add(p10_4);
        p_4.add(p12_4);
        p_4.add(p_2_4);
        p_4.add(p_4_4);
        p_4.add(p_6_4);
        p_4.add(p_8_4);
        p_4.add(p_10_4);
        p_4.add(p_12_4);
        Row r_4 = new Row(p_4, 13, 12);
        ROWS.add(r_4);

        //ROW INDEX -5
        Point p_3_5 = new Point(9, 13, false, Color.GREY, Color.GREY);
        Point p_1_5 = new Point(11, 13, false, Color.GREY, Color.GREY);
        Point p1_5 = new Point(13, 13, false, Color.GREY, Color.GREY);
        Point p3_5 = new Point(15, 13, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_5 = new ArrayList<>();
        p_5.add(p_3_5);
        p_5.add(p_1_5);
        p_5.add(p3_5);
        p_5.add(p1_5);
        Row r_5 = new Row(p_5, 4, 13);
        ROWS.add(r_5);

        //ROW INDEX -6
        Point p0_6 = new Point(12, 14, false, Color.GREY, Color.GREY);
        Point p_2_6 = new Point(10, 14, false, Color.GREY, Color.GREY);
        Point p2_6 = new Point(14, 14, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_6 = new ArrayList<>();
        p_6.add(p0_6);
        p_6.add(p_2_6);
        p_6.add(p2_6);
        Row r_6 = new Row(p_6, 3, 14);
        ROWS.add(r_6);

        //ROW INDEX -7
        Point p_1_7 = new Point(11, 15, false, Color.GREY, Color.GREY);
        Point p1_7 = new Point(13, 15, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_7 = new ArrayList<>();
        p_7.add(p_1_7);
        p_7.add(p1_7);
        Row r_7 = new Row(p_7, 2, 15);
        ROWS.add(r_7);

        //ROW INDEX -8
        Point p0_8 = new Point(12, 16, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_8 = new ArrayList<>();
        p_8.add(p0_8);
        Row r_8 = new Row(p_8, 1, 16);
        ROWS.add(r_8);


        Board b = new Board(ROWS);
        return b;
    }

    /** Function which fill players points to board*/
    static void addPlayersToBoard(Stack<String> colors) {

        for(String color : colors){
            if(color.equals("YELLOW")){
                //YELLOW PLAYER POINTS

                b.getPoint(3, 7).changeTeamId(Color.YELLOW);
                b.getPoint(3, 7).changeUsedTeamId(Color.YELLOW);
                b.getPoint(3, 7).toggleIsUsed();

                b.getPoint(2, 6).changeTeamId(Color.YELLOW);
                b.getPoint(2, 6).changeUsedTeamId(Color.YELLOW);
                b.getPoint(2, 6).toggleIsUsed();

                b.getPoint(4, 6).changeTeamId(Color.YELLOW);
                b.getPoint(4, 6).changeUsedTeamId(Color.YELLOW);
                b.getPoint(4, 6).toggleIsUsed();

                b.getPoint(1, 5).changeTeamId(Color.YELLOW);
                b.getPoint(1, 5).changeUsedTeamId(Color.YELLOW);
                b.getPoint(1, 5).toggleIsUsed();

                b.getPoint(3, 5).changeTeamId(Color.YELLOW);
                b.getPoint(3, 5).changeUsedTeamId(Color.YELLOW);
                b.getPoint(3, 5).toggleIsUsed();

                b.getPoint(5, 5).changeTeamId(Color.YELLOW);
                b.getPoint(5, 5).changeUsedTeamId(Color.YELLOW);
                b.getPoint(5, 5).toggleIsUsed();

                b.getPoint(0, 4).changeTeamId(Color.YELLOW);
                b.getPoint(0, 4).changeUsedTeamId(Color.YELLOW);
                b.getPoint(0, 4).toggleIsUsed();

                b.getPoint(2, 4).changeTeamId(Color.YELLOW);
                b.getPoint(2, 4).changeUsedTeamId(Color.YELLOW);
                b.getPoint(2, 4).toggleIsUsed();

                b.getPoint(4, 4).changeTeamId(Color.YELLOW);
                b.getPoint(4, 4).changeUsedTeamId(Color.YELLOW);
                b.getPoint(4, 4).toggleIsUsed();

                b.getPoint(6, 4).changeTeamId(Color.YELLOW);
                b.getPoint(6, 4).changeUsedTeamId(Color.YELLOW);
                b.getPoint(6, 4).toggleIsUsed();
            } else if(color.equals("WHITE")) {
                //WHITE PLAYER POINTS

                b.getPoint(3, 9).changeTeamId(Color.WHITE);
                b.getPoint(3, 9).changeUsedTeamId(Color.WHITE);
                b.getPoint(3, 9).toggleIsUsed();

                b.getPoint(2, 10).changeTeamId(Color.WHITE);
                b.getPoint(2, 10).changeUsedTeamId(Color.WHITE);
                b.getPoint(2, 10).toggleIsUsed();

                b.getPoint(4, 10).changeTeamId(Color.WHITE);
                b.getPoint(4, 10).changeUsedTeamId(Color.WHITE);
                b.getPoint(4, 10).toggleIsUsed();

                b.getPoint(1, 11).changeTeamId(Color.WHITE);
                b.getPoint(1, 11).changeUsedTeamId(Color.WHITE);
                b.getPoint(1, 11).toggleIsUsed();

                b.getPoint(3, 11).changeTeamId(Color.WHITE);
                b.getPoint(3, 11).changeUsedTeamId(Color.WHITE);
                b.getPoint(3, 11).toggleIsUsed();

                b.getPoint(5, 11).changeTeamId(Color.WHITE);
                b.getPoint(5, 11).changeUsedTeamId(Color.WHITE);
                b.getPoint(5, 11).toggleIsUsed();

                b.getPoint(0, 12).changeTeamId(Color.WHITE);
                b.getPoint(0, 12).changeUsedTeamId(Color.WHITE);
                b.getPoint(0, 12).toggleIsUsed();

                b.getPoint(2, 12).changeTeamId(Color.WHITE);
                b.getPoint(2, 12).changeUsedTeamId(Color.WHITE);
                b.getPoint(2, 12).toggleIsUsed();

                b.getPoint(4, 12).changeTeamId(Color.WHITE);
                b.getPoint(4, 12).changeUsedTeamId(Color.WHITE);
                b.getPoint(4, 12).toggleIsUsed();

                b.getPoint(6, 12).changeTeamId(Color.WHITE);
                b.getPoint(6, 12).changeUsedTeamId(Color.WHITE);
                b.getPoint(6, 12).toggleIsUsed();
        } else if (color.equals("BLUE")){
                //BLUE PLAYER POINTS

                b.getPoint(21, 9).changeTeamId(Color.BLUE);
                b.getPoint(21, 9).changeUsedTeamId(Color.BLUE);
                b.getPoint(21, 9).toggleIsUsed();

                b.getPoint(22, 10).changeTeamId(Color.BLUE);
                b.getPoint(22, 10).changeUsedTeamId(Color.BLUE);
                b.getPoint(22, 10).toggleIsUsed();

                b.getPoint(20, 10).changeTeamId(Color.BLUE);
                b.getPoint(20, 10).changeUsedTeamId(Color.BLUE);
                b.getPoint(20, 10).toggleIsUsed();

                b.getPoint(23, 11).changeTeamId(Color.BLUE);
                b.getPoint(23, 11).changeUsedTeamId(Color.BLUE);
                b.getPoint(23, 11).toggleIsUsed();

                b.getPoint(21, 11).changeTeamId(Color.BLUE);
                b.getPoint(21, 11).changeUsedTeamId(Color.BLUE);
                b.getPoint(21, 11).toggleIsUsed();

                b.getPoint(19, 11).changeTeamId(Color.BLUE);
                b.getPoint(19, 11).changeUsedTeamId(Color.BLUE);
                b.getPoint(19, 11).toggleIsUsed();

                b.getPoint(24, 12).changeTeamId(Color.BLUE);
                b.getPoint(24, 12).changeUsedTeamId(Color.BLUE);
                b.getPoint(24, 12).toggleIsUsed();

                b.getPoint(22, 12).changeTeamId(Color.BLUE);
                b.getPoint(22, 12).changeUsedTeamId(Color.BLUE);
                b.getPoint(22, 12).toggleIsUsed();

                b.getPoint(22, 12).changeTeamId(Color.BLUE);
                b.getPoint(22, 12).changeUsedTeamId(Color.BLUE);
                b.getPoint(22, 12).toggleIsUsed();

                b.getPoint(18, 12).changeTeamId(Color.BLUE);
                b.getPoint(18, 12).changeUsedTeamId(Color.BLUE);
                b.getPoint(18, 12).toggleIsUsed();
            } else if(color.equals("BLACK")) {
                //BLACK PLAYER POINTS

                b.getPoint(21, 7).changeTeamId(Color.BLACK);
                b.getPoint(21, 7).changeUsedTeamId(Color.BLACK);
                b.getPoint(21, 7).toggleIsUsed();

                b.getPoint(20, 6 ).changeTeamId(Color.BLACK);
                b.getPoint(20, 6).changeUsedTeamId(Color.BLACK);
                b.getPoint(20, 6).toggleIsUsed();

                b.getPoint(20, 6).changeTeamId(Color.BLACK);
                b.getPoint(20, 6).changeUsedTeamId(Color.BLACK);
                b.getPoint(20, 6).toggleIsUsed();

                b.getPoint(23, 5).changeTeamId(Color.BLACK);
                b.getPoint(23, 5).changeUsedTeamId(Color.BLACK);
                b.getPoint(23, 5).toggleIsUsed();

                b.getPoint(21, 5).changeTeamId(Color.BLACK);
                b.getPoint(21, 5).changeUsedTeamId(Color.BLACK);
                b.getPoint(21, 5).toggleIsUsed();

                b.getPoint(19, 5).changeTeamId(Color.BLACK);
                b.getPoint(19, 5).changeUsedTeamId(Color.BLACK);
                b.getPoint(19, 5).toggleIsUsed();

                b.getPoint(24, 4).changeTeamId(Color.BLACK);
                b.getPoint(24, 4).changeUsedTeamId(Color.BLACK);
                b.getPoint(24, 4).toggleIsUsed();

                b.getPoint(22, 4).changeTeamId(Color.BLACK);
                b.getPoint(22, 4).changeUsedTeamId(Color.BLACK);
                b.getPoint(22, 4).toggleIsUsed();

                b.getPoint(20, 4).changeTeamId(Color.BLACK);
                b.getPoint(20, 4).changeUsedTeamId(Color.BLACK);
                b.getPoint(20, 4).toggleIsUsed();

                b.getPoint(18, 4).changeTeamId(Color.BLACK);
                b.getPoint(18, 4).changeUsedTeamId(Color.BLACK);
                b.getPoint(18, 4).toggleIsUsed();
            } else if(color.equals("RED")) {
                //RED PLAYER POINTS

                b.getPoint(12, 0).changeTeamId(Color.RED);
                b.getPoint(12, 0).changeUsedTeamId(Color.RED);
                b.getPoint(12, 0).toggleIsUsed();

                b.getPoint(11, 1).changeTeamId(Color.RED);
                b.getPoint(11, 1).changeUsedTeamId(Color.RED);
                b.getPoint(11, 1).toggleIsUsed();

                b.getPoint(13, 1).changeTeamId(Color.RED);
                b.getPoint(13, 1).changeUsedTeamId(Color.RED);
                b.getPoint(13, 1).toggleIsUsed();

                b.getPoint(10, 2).changeTeamId(Color.RED);
                b.getPoint(10, 2).changeUsedTeamId(Color.RED);
                b.getPoint(10, 2).toggleIsUsed();

                b.getPoint(12, 2).changeTeamId(Color.RED);
                b.getPoint(12, 2).changeUsedTeamId(Color.RED);
                b.getPoint(12, 2).toggleIsUsed();

                b.getPoint(14, 2).changeTeamId(Color.RED);
                b.getPoint(14, 2).changeUsedTeamId(Color.RED);
                b.getPoint(14, 2).toggleIsUsed();

                b.getPoint(9, 3).changeTeamId(Color.RED);
                b.getPoint(9, 3).changeUsedTeamId(Color.RED);
                b.getPoint(9, 3).toggleIsUsed();

                b.getPoint(11, 3).changeTeamId(Color.RED);
                b.getPoint(11, 3).changeUsedTeamId(Color.RED);
                b.getPoint(11, 3).toggleIsUsed();

                b.getPoint(13, 3).changeTeamId(Color.RED);
                b.getPoint(13, 3).changeUsedTeamId(Color.RED);
                b.getPoint(13, 3).toggleIsUsed();

                b.getPoint(15, 3).changeTeamId(Color.RED);
                b.getPoint(15, 3).changeUsedTeamId(Color.RED);
                b.getPoint(15, 3).toggleIsUsed();
            } else if (color.equals("GREEN")) {
                //GREEN PLAYER POINTS

                b.getPoint(12, 16).changeTeamId(Color.GREEN);
                b.getPoint(12, 16).changeUsedTeamId(Color.GREEN);
                b.getPoint(12, 16).toggleIsUsed();

                b.getPoint(11, 15).changeTeamId(Color.GREEN);
                b.getPoint(11, 15).changeUsedTeamId(Color.GREEN);
                b.getPoint(11, 15).toggleIsUsed();

                b.getPoint(13, 15).changeTeamId(Color.GREEN);
                b.getPoint(13, 15).changeUsedTeamId(Color.GREEN);
                b.getPoint(13, 15).toggleIsUsed();

                b.getPoint(10, 14).changeTeamId(Color.GREEN);
                b.getPoint(10, 14).changeUsedTeamId(Color.GREEN);
                b.getPoint(10, 14).toggleIsUsed();

                b.getPoint(12, 14).changeTeamId(Color.GREEN);
                b.getPoint(12, 14).changeUsedTeamId(Color.GREEN);
                b.getPoint(12, 14).toggleIsUsed();

                b.getPoint(14, 14).changeTeamId(Color.GREEN);
                b.getPoint(14, 14).changeUsedTeamId(Color.GREEN);
                b.getPoint(14, 14).toggleIsUsed();

                b.getPoint(9, 13).changeTeamId(Color.GREEN);
                b.getPoint(9, 13).changeUsedTeamId(Color.GREEN);
                b.getPoint(9, 13).toggleIsUsed();

                b.getPoint(11, 13).changeTeamId(Color.GREEN);
                b.getPoint(11, 13).changeUsedTeamId(Color.GREEN);
                b.getPoint(11, 13).toggleIsUsed();

                b.getPoint(13, 13).changeTeamId(Color.GREEN);
                b.getPoint(13, 13).changeUsedTeamId(Color.GREEN);
                b.getPoint(13, 13).toggleIsUsed();

                b.getPoint(15, 13).changeTeamId(Color.GREEN);
                b.getPoint(15, 13).changeUsedTeamId(Color.GREEN);
                b.getPoint(15, 13).toggleIsUsed();
            }
        }
    }

    /** Function which update board under player step
     * @param curr_x Old x
     * @param curr_y Old y
     * @param new_x Old x
     * @param new_y Old x*/
    static void updateBoard(int curr_x, int curr_y, int new_x, int new_y) {
        Color cur_id = b.getPoint(curr_x, curr_y).getUsedTeamId();
        b.getPoint(curr_x, curr_y).toggleIsUsed();
        b.getPoint(curr_x, curr_y).changeUsedTeamId(Color.GREY);
        b.getPoint(new_x, new_y).toggleIsUsed();
        b.getPoint(new_x, new_y).changeUsedTeamId(cur_id);
    }

    /** Function which check if player can do step which he want
     * @param curr_x Old x
     * @param curr_y Old y
     * @param new_x Old x
     * @param new_y Old x */
    static Boolean checkIsPossible(int curr_x, int curr_y, int new_x, int new_y) {
        if(b.getPoint(new_x, new_y).getIsUsed()){
            return false;
        } else {
            int abs_x = new_x - curr_x;
            int abs_y = new_y - curr_y;

            if (abs_x == 2 && abs_y == 2 && b.getPoint(curr_x + 1, curr_y + 1).getIsUsed()) {
                return true;
            }

            if (abs_x == -2 && abs_y == 2 && b.getPoint(curr_x - 1, curr_y + 1).getIsUsed()) {
                return true;
            }

            if (abs_x == 2 && abs_y == -2 && b.getPoint(curr_x + 1, curr_y - 1).getIsUsed()) {
                return true;
            }

            if (abs_x == -2 && abs_y == -2 && b.getPoint(curr_x - 1, curr_y - 1).getIsUsed()) {
                return true;
            }

            if (abs_x == 4 && abs_y == 0 && b.getPoint(curr_x + 2, curr_y).getIsUsed()) {
                return true;
            }

            if (abs_x == -4 && abs_y == 0 && b.getPoint(curr_x - 2, curr_y).getIsUsed()) {
                return true;
            }

            if ((abs_x == 2 && abs_y == 0) || (abs_x == -2 && abs_y == 0)) {
                return true;
            }

            if ((abs_x == 1 && abs_y == 1) || (abs_x == -1 && abs_y == 1)) {
                return true;
            }

            if ((abs_x == 1 && abs_y == -1) || (abs_x == -1 && abs_y == -1)) {
                return true;
            }
        }
        return false;
    }

    /** Function which delete all points of player with current id
     * @param id String with Id like "RED" or another */
    static void dropPlayer(String id){
        ArrayList<Row> rows = b.getRows();

        for(Row row : rows){
            ArrayList<Point> points = row.getPoints();
            for (Point point : points) {
                if(id.equals(point.getTextTeamId(id))){
                    point.changeUsedTeamId(Color.GREY);
                }
            }
        }
    }

    /** Function which return random int from 0 to 100
     * @return int Number from 0 to 100*/
    static int selectFirstTurnId(){
        return (int) ((Math.random() * (100)) + 0);
    }

    /** Function which search for player with id
     * @param id Color id of searched client
     * @return Player Player with Color id in param*/
    static Player getPlayer(Color id){
        for(Player player : players){
            if(player.getId() == id)
                return player;
        }
        return null;
    }

    /** Function which check players score and if anybody has 10 points returns his color
     * @return Color Color id of winner*/
    static Color checkPlayersScore() {

        for(Player player : players){
            player.changeScore(0);
        }

        ArrayList<Row> rows = b.getRows();

        for(Row row : rows){
            ArrayList<Point> points = row.getPoints();
            for (Point point : points) {

                if(point.getTeamId() == Color.GREY || !point.getIsUsed())
                    continue;

                Color point_id = point.getTeamId();
                Color point_opponent_id = Objects.requireNonNull(getPlayer(point_id)).getOpponentId();

                if(point.getUsedTeamId() == point_opponent_id){
                    Objects.requireNonNull(getPlayer(point_opponent_id)).increaseScore();
                }

            }
        }

        for(Player player : players){
            if(player.getScore() == 10)
                return player.getId();
        }

        return null;
    }

    /** ArrayList of created players */
    static ArrayList<Player> players = new ArrayList<>();

    /** Function which check used color and fill the board with player's color */
    static void createPlayers() {
        for(String color : usedColors){
            if(color.equals("RED")){
               if(usedColors.contains("BLACK")){
                   players.add(new Player(Color.RED, Color.BLACK));
               } else if (usedColors.contains("BLUE")) {
                   players.add(new Player(Color.RED, Color.BLUE));
               } else if (usedColors.contains("GREEN")) {
                   players.add(new Player(Color.RED, Color.GREEN));
               } else if (usedColors.contains("WHITE")) {
                   players.add(new Player(Color.RED, Color.WHITE));
               } else if (usedColors.contains("YELLOW")) {
                   players.add(new Player(Color.RED, Color.YELLOW));
               }
            } else if (usedColors.contains("BLACK")){
                if (usedColors.contains("BLUE")) {
                    players.add(new Player(Color.BLACK, Color.BLUE));
                } else if (usedColors.contains("GREEN")) {
                    players.add(new Player(Color.BLACK, Color.GREEN));
                } else if (usedColors.contains("WHITE")) {
                    players.add(new Player(Color.BLACK, Color.WHITE));
                } else if (usedColors.contains("YELLOW")) {
                    players.add(new Player(Color.BLACK, Color.YELLOW));
                } else if (usedColors.contains("RED")) {
                    players.add(new Player(Color.BLACK, Color.RED));
                }
            } else if (usedColors.contains("BLUE")){
                if (usedColors.contains("GREEN")) {
                    players.add(new Player(Color.BLUE, Color.GREEN));
                } else if (usedColors.contains("WHITE")) {
                    players.add(new Player(Color.BLUE, Color.WHITE));
                } else if (usedColors.contains("YELLOW")) {
                    players.add(new Player(Color.BLUE, Color.YELLOW));
                } else if (usedColors.contains("RED")) {
                    players.add(new Player(Color.BLUE, Color.RED));
                } else if (usedColors.contains("BLACK")) {
                    players.add(new Player(Color.BLUE, Color.BLACK));
                }
            } else if (usedColors.contains("GREEN")){
                if (usedColors.contains("WHITE")) {
                    players.add(new Player(Color.GREEN, Color.WHITE));
                } else if (usedColors.contains("YELLOW")) {
                    players.add(new Player(Color.GREEN, Color.YELLOW));
                } else if (usedColors.contains("RED")) {
                    players.add(new Player(Color.GREEN, Color.RED));
                } else if (usedColors.contains("BLACK")) {
                    players.add(new Player(Color.GREEN, Color.BLACK));
                } else if (usedColors.contains("BLUE")) {
                    players.add(new Player(Color.GREEN, Color.BLUE));
                }
            } else if (usedColors.contains("WHITE")){
                if (usedColors.contains("YELLOW")) {
                    players.add(new Player(Color.WHITE, Color.YELLOW));
                } else if (usedColors.contains("RED")) {
                    players.add(new Player(Color.WHITE, Color.RED));
                } else if (usedColors.contains("BLACK")) {
                    players.add(new Player(Color.WHITE, Color.BLACK));
                } else if (usedColors.contains("BLUE")) {
                    players.add(new Player(Color.WHITE, Color.BLUE));
                } else if (usedColors.contains("GREEN")) {
                    players.add(new Player(Color.WHITE, Color.GREEN));
                }
            } else if (usedColors.contains("YELLOW")){
                if (usedColors.contains("RED")) {
                    players.add(new Player(Color.YELLOW, Color.RED));
                } else if (usedColors.contains("BLACK")) {
                    players.add(new Player(Color.YELLOW, Color.BLACK));
                } else if (usedColors.contains("BLUE")) {
                    players.add(new Player(Color.YELLOW, Color.BLUE));
                } else if (usedColors.contains("GREEN")) {
                    players.add(new Player(Color.YELLOW, Color.GREEN));
                } else if (usedColors.contains("WHITE")) {
                    players.add(new Player(Color.YELLOW, Color.WHITE));
                }
            }
        }
    }

    /** ArrayList of connected clients */
    private static ArrayList<ClientHandler> clients = new ArrayList<>();

    /** Pool with fixed tread */
    private static ExecutorService pool = Executors.newFixedThreadPool(6);

    /** Function which returns ArrayList of clients */
    static ArrayList<ClientHandler> getClients() {
            return clients;
    }

    /** Function which delete client from ArrayList of clients
     * @param index Index of client you want to delete */
    static void dropClient(int index) {
        clients.remove(index);
    }


    /** Main function which starts server */
    public static void main(String[] args) throws IOException {

        ServerSocket listener = new ServerSocket(PORT);

        while(!isGameOver){
            System.out.println("[SERVER] Waiting for client connection...");
            Socket client = listener.accept();
            System.out.println("[SERVER] Connected to client!");
            ClientHandler clientThread = new ClientHandler(client);
            clients.add(clientThread);
            pool.execute(clientThread);
        }

    }
}