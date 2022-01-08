import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {
    static Board initBoard() {

        ArrayList<Row> ROWS = new ArrayList<>();

        //ROW INDEX 0
        Point p00 = new Point(0,0, false, Color.GREY, Color.GREY);
        Point p20 = new Point(2,0, false, Color.GREY, Color.GREY);
        Point p40 = new Point(4,0, false, Color.GREY, Color.GREY);
        Point p60 = new Point(6,0, false, Color.GREY, Color.GREY);
        Point p80 = new Point(8,0, false, Color.GREY, Color.GREY);
        Point p_20 = new Point(-2,0, false, Color.GREY, Color.GREY);
        Point p_40 = new Point(-4,0, false, Color.GREY, Color.GREY);
        Point p_60 = new Point(-6,0, false, Color.GREY, Color.GREY);
        Point p_80 = new Point(-8,0, false, Color.GREY, Color.GREY);
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
        Row r0 = new Row(p0, 9, 0);
        ROWS.add(r0);

        //ROW INDEX 1
        Point p11 = new Point(1, 1, false, Color.GREY, Color.GREY);
        Point p31 = new Point(3, 1, false, Color.GREY, Color.GREY);
        Point p51 = new Point(5, 1, false, Color.GREY, Color.GREY);
        Point p71 = new Point(7, 1, false, Color.GREY, Color.GREY);
        Point p91 = new Point(9, 1, false, Color.GREY, Color.GREY);
        Point p_11 = new Point(-1, 1, false, Color.GREY, Color.GREY);
        Point p_31 = new Point(-3, 1, false, Color.GREY, Color.GREY);
        Point p_51 = new Point(-5, 1, false, Color.GREY, Color.GREY);
        Point p_71 = new Point(-7, 1, false, Color.GREY, Color.GREY);
        Point p_91 = new Point(-9, 1, false, Color.GREY, Color.GREY);
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
        Row r1 = new Row(p1, 10, 1);
        ROWS.add(r1);

        //ROW INDEX 2
        Point p02 = new Point(0, 2, false, Color.GREY, Color.GREY);
        Point p22 = new Point(2, 2, false, Color.GREY, Color.GREY);
        Point p42 = new Point(4, 2, false, Color.GREY, Color.GREY);
        Point p62 = new Point(6, 2, false, Color.GREY, Color.GREY);
        Point p82 = new Point(8, 2, false, Color.GREY, Color.GREY);
        Point p102 = new Point(10, 2, false, Color.GREY, Color.GREY);
        Point p_22 = new Point(-2, 2, false, Color.GREY, Color.GREY);
        Point p_42 = new Point(-4, 2, false, Color.GREY, Color.GREY);
        Point p_62 = new Point(-6, 2, false, Color.GREY, Color.GREY);
        Point p_82 = new Point(-8, 2, false, Color.GREY, Color.GREY);
        Point p_102 = new Point(-10, 2, false, Color.GREY, Color.GREY);
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
        Row r2 = new Row(p2, 11, 2);
        ROWS.add(r2);

        //ROW INDEX 3
        Point p13 = new Point(1, 3, false, Color.GREY, Color.GREY);
        Point p33 = new Point(3, 3, false, Color.GREY, Color.GREY);
        Point p53 = new Point(5, 3, false, Color.GREY, Color.GREY);
        Point p73 = new Point(7, 3, false, Color.GREY, Color.GREY);
        Point p93 = new Point(9, 3, false, Color.GREY, Color.GREY);
        Point p113 = new Point(11, 3, false, Color.GREY, Color.GREY);
        Point p_13 = new Point(-1, 3, false, Color.GREY, Color.GREY);
        Point p_33 = new Point(-3, 3, false, Color.GREY, Color.GREY);
        Point p_53 = new Point(-5, 3, false, Color.GREY, Color.GREY);
        Point p_73 = new Point(-7, 3, false, Color.GREY, Color.GREY);
        Point p_93 = new Point(-9, 3, false, Color.GREY, Color.GREY);
        Point p_113 = new Point(-11, 3, false, Color.GREY, Color.GREY);
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
        Row r3 = new Row(p3, 12, 3);
        ROWS.add(r3);

        //ROW INDEX 4
        Point p04 = new Point(0, 4, false, Color.GREY, Color.GREY);
        Point p24 = new Point(2, 4, false, Color.GREY, Color.GREY);
        Point p44 = new Point(4, 4, false, Color.GREY, Color.GREY);
        Point p64 = new Point(6, 4, false, Color.GREY, Color.GREY);
        Point p84 = new Point(8, 4, false, Color.GREY, Color.GREY);
        Point p104 = new Point(10, 4, false, Color.GREY, Color.GREY);
        Point p124 = new Point(12, 4, false, Color.GREY, Color.GREY);
        Point p_24 = new Point(-2, 4, false, Color.GREY, Color.GREY);
        Point p_44 = new Point(-4, 4, false, Color.GREY, Color.GREY);
        Point p_64 = new Point(-6, 4, false, Color.GREY, Color.GREY);
        Point p_84 = new Point(-8, 4, false, Color.GREY, Color.GREY);
        Point p_104 = new Point(-10, 4, false, Color.GREY, Color.GREY);
        Point p_124 = new Point(-12, 4, false, Color.GREY, Color.GREY);
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
        Point p_35 = new Point(-3, 5, false, Color.GREY, Color.GREY);
        Point p_15 = new Point(-1, 5, false, Color.GREY, Color.GREY);
        Point p15 = new Point(1, 5, false, Color.GREY, Color.GREY);
        Point p35 = new Point(3, 5, false, Color.GREY, Color.GREY);
        ArrayList<Point> p5 = new ArrayList<>();
        p5.add(p_35);
        p5.add(p_15);
        p5.add(p35);
        p5.add(p15);
        Row r5 = new Row(p5, 4, 5);
        ROWS.add(r5);

        //ROW INDEX 6
        Point p06 = new Point(0, 6, false, Color.GREY, Color.GREY);
        Point p_26 = new Point(-2, 6, false, Color.GREY, Color.GREY);
        Point p26 = new Point(2, 6, false, Color.GREY, Color.GREY);
        ArrayList<Point> p6 = new ArrayList<>();
        p6.add(p06);
        p6.add(p_26);
        p6.add(p26);
        Row r6 = new Row(p6, 3, 6);
        ROWS.add(r6);

        //ROW INDEX 7
        Point p_17 = new Point(-1, 7, false, Color.GREY, Color.GREY);
        Point p17 = new Point(1, 7, false, Color.GREY, Color.GREY);
        ArrayList<Point> p7 = new ArrayList<>();
        p7.add(p_17);
        p7.add(p17);
        Row r7 = new Row(p7, 2, 7);
        ROWS.add(r7);

        //ROW INDEX 8
        Point p08 = new Point(0, 8, false, Color.GREY, Color.GREY);
        ArrayList<Point> p8 = new ArrayList<>();
        p8.add(p08);
        Row r8 = new Row(p8, 1, 8);
        ROWS.add(r8);

        //ROW INDEX -1
        Point p1_1 = new Point(1, -1, false, Color.GREY, Color.GREY);
        Point p3_1 = new Point(3, -1, false, Color.GREY, Color.GREY);
        Point p5_1 = new Point(5, -1, false, Color.GREY, Color.GREY);
        Point p7_1 = new Point(7, -1, false, Color.GREY, Color.GREY);
        Point p9_1 = new Point(9, -1, false, Color.GREY, Color.GREY);
        Point p_1_1 = new Point(-1, -1, false, Color.GREY, Color.GREY);
        Point p_3_1 = new Point(-3, -1, false, Color.GREY, Color.GREY);
        Point p_5_1 = new Point(-5, -1, false, Color.GREY, Color.GREY);
        Point p_7_1 = new Point(-7, -1, false, Color.GREY, Color.GREY);
        Point p_9_1 = new Point(-9, -1, false, Color.GREY, Color.GREY);
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
        Row r_1 = new Row(p_1, 10, -1);
        ROWS.add(r_1);

        //ROW INDEX -2
        Point p0_2 = new Point(0, -2, false, Color.GREY, Color.GREY);
        Point p2_2 = new Point(2, -2, false, Color.GREY, Color.GREY);
        Point p4_2 = new Point(4, -2, false, Color.GREY, Color.GREY);
        Point p6_2 = new Point(6, -2, false, Color.GREY, Color.GREY);
        Point p8_2 = new Point(8, -2, false, Color.GREY, Color.GREY);
        Point p10_2 = new Point(10, -2, false, Color.GREY, Color.GREY);
        Point p_2_2 = new Point(-2, -2, false, Color.GREY, Color.GREY);
        Point p_4_2 = new Point(-4, -2, false, Color.GREY, Color.GREY);
        Point p_6_2 = new Point(-6, -2, false, Color.GREY, Color.GREY);
        Point p_8_2 = new Point(-8, -2, false, Color.GREY, Color.GREY);
        Point p_10_2 = new Point(-10, -2, false, Color.GREY, Color.GREY);
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
        Row r_2 = new Row(p_2, 11, -2);
        ROWS.add(r_2);

        //ROW INDEX -3
        Point p1_3 = new Point(1, -3, false, Color.GREY, Color.GREY);
        Point p3_3 = new Point(3, -3, false, Color.GREY, Color.GREY);
        Point p5_3 = new Point(5, -3, false, Color.GREY, Color.GREY);
        Point p7_3 = new Point(7, -3, false, Color.GREY, Color.GREY);
        Point p9_3 = new Point(9, -3, false, Color.GREY, Color.GREY);
        Point p11_3 = new Point(11, -3, false, Color.GREY, Color.GREY);
        Point p_1_3 = new Point(-1, -3, false, Color.GREY, Color.GREY);
        Point p_3_3 = new Point(-3, -3, false, Color.GREY, Color.GREY);
        Point p_5_3 = new Point(-5, -3, false, Color.GREY, Color.GREY);
        Point p_7_3 = new Point(-7, -3, false, Color.GREY, Color.GREY);
        Point p_9_3 = new Point(-9, -3, false, Color.GREY, Color.GREY);
        Point p_11_3 = new Point(-11, -3, false, Color.GREY, Color.GREY);
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
        Row r_3 = new Row(p_3, 12, -3);
        ROWS.add(r_3);

        //ROW INDEX -4
        Point p0_4 = new Point(0, -4, false, Color.GREY, Color.GREY);
        Point p2_4 = new Point(2, -4, false, Color.GREY, Color.GREY);
        Point p4_4 = new Point(4, -4, false, Color.GREY, Color.GREY);
        Point p6_4 = new Point(6, -4, false, Color.GREY, Color.GREY);
        Point p8_4 = new Point(8, -4, false, Color.GREY, Color.GREY);
        Point p10_4 = new Point(10, -4, false, Color.GREY, Color.GREY);
        Point p12_4 = new Point(12, -4, false, Color.GREY, Color.GREY);
        Point p_2_4 = new Point(-2, -4, false, Color.GREY, Color.GREY);
        Point p_4_4 = new Point(-4, -4, false, Color.GREY, Color.GREY);
        Point p_6_4 = new Point(-6, -4, false, Color.GREY, Color.GREY);
        Point p_8_4 = new Point(-8, -4, false, Color.GREY, Color.GREY);
        Point p_10_4 = new Point(-10, -4, false, Color.GREY, Color.GREY);
        Point p_12_4 = new Point(-12, -4, false, Color.GREY, Color.GREY);
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
        Row r_4 = new Row(p_4, 13, -4);
        ROWS.add(r_4);

        //ROW INDEX -5
        Point p_3_5 = new Point(-3, -5, false, Color.GREY, Color.GREY);
        Point p_1_5 = new Point(-1, -5, false, Color.GREY, Color.GREY);
        Point p1_5 = new Point(1, -5, false, Color.GREY, Color.GREY);
        Point p3_5 = new Point(3, -5, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_5 = new ArrayList<>();
        p_5.add(p_3_5);
        p_5.add(p_1_5);
        p_5.add(p3_5);
        p_5.add(p1_5);
        Row r_5 = new Row(p_5, 4, -5);
        ROWS.add(r_5);

        //ROW INDEX -6
        Point p0_6 = new Point(0, -6, false, Color.GREY, Color.GREY);
        Point p_2_6 = new Point(-2, -6, false, Color.GREY, Color.GREY);
        Point p2_6 = new Point(2, -6, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_6 = new ArrayList<>();
        p_6.add(p0_6);
        p_6.add(p_2_6);
        p_6.add(p2_6);
        Row r_6 = new Row(p_6, 3, -6);
        ROWS.add(r_6);

        //ROW INDEX -7
        Point p_1_7 = new Point(-1, -7, false, Color.GREY, Color.GREY);
        Point p1_7 = new Point(1, -7, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_7 = new ArrayList<>();
        p_7.add(p_1_7);
        p_7.add(p1_7);
        Row r_7 = new Row(p_7, 2, -7);
        ROWS.add(r_7);

        //ROW INDEX -8
        Point p0_8 = new Point(0, -8, false, Color.GREY, Color.GREY);
        ArrayList<Point> p_8 = new ArrayList<>();
        p_8.add(p0_8);
        Row r_8 = new Row(p_8, 1, -8);
        ROWS.add(r_8);


        Board b = new Board(ROWS);
        return b;
    }

    static void addPlayersToBoard(int players_num, Board b) {
        if(players_num == 2) {

            //RED PLAYER POINTS

            b.getPoint(0, 8).changeTeamId(Color.RED);
            b.getPoint(0, 8).changeUsedTeamId(Color.RED);
            b.getPoint(0, 8).toggleIsUsed();

            b.getPoint(-1, 7).changeTeamId(Color.RED);
            b.getPoint(-1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 7).toggleIsUsed();

            b.getPoint(1, 7).changeTeamId(Color.RED);
            b.getPoint(1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(1, 7).toggleIsUsed();

            b.getPoint(-2, 6).changeTeamId(Color.RED);
            b.getPoint(-2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(-2, 6).toggleIsUsed();

            b.getPoint(0, 6).changeTeamId(Color.RED);
            b.getPoint(0, 6).changeUsedTeamId(Color.RED);
            b.getPoint(0, 6).toggleIsUsed();

            b.getPoint(2, 6).changeTeamId(Color.RED);
            b.getPoint(2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(2, 6).toggleIsUsed();

            b.getPoint(-3, 5).changeTeamId(Color.RED);
            b.getPoint(-3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-3, 5).toggleIsUsed();

            b.getPoint(-1, 5).changeTeamId(Color.RED);
            b.getPoint(-1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 5).toggleIsUsed();

            b.getPoint(1, 5).changeTeamId(Color.RED);
            b.getPoint(1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(1, 5).toggleIsUsed();

            b.getPoint(3, 5).changeTeamId(Color.RED);
            b.getPoint(3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(3, 5).toggleIsUsed();

            //GREEN PLAYER POINTS

            b.getPoint(0, -8).changeTeamId(Color.GREEN);
            b.getPoint(0, -8).changeUsedTeamId(Color.GREEN);
            b.getPoint(0, -8).toggleIsUsed();

            b.getPoint(-1, -7).changeTeamId(Color.GREEN);
            b.getPoint(-1, -7).changeUsedTeamId(Color.GREEN);
            b.getPoint(-1, -7).toggleIsUsed();

            b.getPoint(1, -7).changeTeamId(Color.GREEN);
            b.getPoint(1, -7).changeUsedTeamId(Color.GREEN);
            b.getPoint(1, -7).toggleIsUsed();

            b.getPoint(-2, -6).changeTeamId(Color.GREEN);
            b.getPoint(-2, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(-2, -6).toggleIsUsed();

            b.getPoint(0, -6).changeTeamId(Color.GREEN);
            b.getPoint(0, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(0, -6).toggleIsUsed();

            b.getPoint(2, -6).changeTeamId(Color.GREEN);
            b.getPoint(2, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(2, -6).toggleIsUsed();

            b.getPoint(-3, -5).changeTeamId(Color.GREEN);
            b.getPoint(-3, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(-3, -5).toggleIsUsed();

            b.getPoint(-1, -5).changeTeamId(Color.GREEN);
            b.getPoint(-1, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(-1, -5).toggleIsUsed();

            b.getPoint(1, -5).changeTeamId(Color.GREEN);
            b.getPoint(1, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(1, -5).toggleIsUsed();

            b.getPoint(3, -5).changeTeamId(Color.GREEN);
            b.getPoint(3, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(3, -5).toggleIsUsed();




        } else if (players_num == 3) {

            //RED PLAYER POINTS

            b.getPoint(0, 8).changeTeamId(Color.RED);
            b.getPoint(0, 8).changeUsedTeamId(Color.RED);
            b.getPoint(0, 8).toggleIsUsed();

            b.getPoint(-1, 7).changeTeamId(Color.RED);
            b.getPoint(-1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 7).toggleIsUsed();

            b.getPoint(1, 7).changeTeamId(Color.RED);
            b.getPoint(1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(1, 7).toggleIsUsed();

            b.getPoint(-2, 6).changeTeamId(Color.RED);
            b.getPoint(-2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(-2, 6).toggleIsUsed();

            b.getPoint(0, 6).changeTeamId(Color.RED);
            b.getPoint(0, 6).changeUsedTeamId(Color.RED);
            b.getPoint(0, 6).toggleIsUsed();

            b.getPoint(2, 6).changeTeamId(Color.RED);
            b.getPoint(2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(2, 6).toggleIsUsed();

            b.getPoint(-3, 5).changeTeamId(Color.RED);
            b.getPoint(-3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-3, 5).toggleIsUsed();

            b.getPoint(-1, 5).changeTeamId(Color.RED);
            b.getPoint(-1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 5).toggleIsUsed();

            b.getPoint(1, 5).changeTeamId(Color.RED);
            b.getPoint(1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(1, 5).toggleIsUsed();

            b.getPoint(3, 5).changeTeamId(Color.RED);
            b.getPoint(3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(3, 5).toggleIsUsed();

            //WHITE PLAYER POINTS

            b.getPoint(-9, -1).changeTeamId(Color.WHITE);
            b.getPoint(-9, -1).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -1).toggleIsUsed();

            b.getPoint(-10, -2).changeTeamId(Color.WHITE);
            b.getPoint(-10, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -2).toggleIsUsed();

            b.getPoint(-8, -2).changeTeamId(Color.WHITE);
            b.getPoint(-8, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -2).toggleIsUsed();

            b.getPoint(-11, -3).changeTeamId(Color.WHITE);
            b.getPoint(-11, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-11, -3).toggleIsUsed();

            b.getPoint(-9, -3).changeTeamId(Color.WHITE);
            b.getPoint(-9, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -3).toggleIsUsed();

            b.getPoint(-7, -3).changeTeamId(Color.WHITE);
            b.getPoint(-7, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-7, -3).toggleIsUsed();

            b.getPoint(-12, -4).changeTeamId(Color.WHITE);
            b.getPoint(-12, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-12, -4).toggleIsUsed();

            b.getPoint(-10, -4).changeTeamId(Color.WHITE);
            b.getPoint(-10, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -4).toggleIsUsed();

            b.getPoint(-8, -4).changeTeamId(Color.WHITE);
            b.getPoint(-8, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -4).toggleIsUsed();

            b.getPoint(-6, -4).changeTeamId(Color.WHITE);
            b.getPoint(-6, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-6, -4).toggleIsUsed();

            //BLUE PLAYER POINTS

            b.getPoint(9, -1).changeTeamId(Color.BLUE);
            b.getPoint(9, -1).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -1).toggleIsUsed();

            b.getPoint(10, -2).changeTeamId(Color.BLUE);
            b.getPoint(10, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -2).toggleIsUsed();

            b.getPoint(8, -2).changeTeamId(Color.BLUE);
            b.getPoint(8, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -2).toggleIsUsed();

            b.getPoint(11, -3).changeTeamId(Color.BLUE);
            b.getPoint(11, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(11, -3).toggleIsUsed();

            b.getPoint(9, -3).changeTeamId(Color.BLUE);
            b.getPoint(9, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -3).toggleIsUsed();

            b.getPoint(7, -3).changeTeamId(Color.BLUE);
            b.getPoint(7, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(7, -3).toggleIsUsed();

            b.getPoint(12, -4).changeTeamId(Color.BLUE);
            b.getPoint(12, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(12, -4).toggleIsUsed();

            b.getPoint(10, -4).changeTeamId(Color.BLUE);
            b.getPoint(10, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -4).toggleIsUsed();

            b.getPoint(8, -4).changeTeamId(Color.BLUE);
            b.getPoint(8, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -4).toggleIsUsed();

            b.getPoint(6, -4).changeTeamId(Color.BLUE);
            b.getPoint(6, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(6, -4).toggleIsUsed();


        } else if (players_num == 4) {

            //YELLOW PLAYER POINTS

            b.getPoint(-9, 1).changeTeamId(Color.YELLOW);
            b.getPoint(-9, 1).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-9, 1).toggleIsUsed();

            b.getPoint(-10, 2).changeTeamId(Color.YELLOW);
            b.getPoint(-10, 2).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-10, 2).toggleIsUsed();

            b.getPoint(-8, 2).changeTeamId(Color.YELLOW);
            b.getPoint(-8, 2).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-8, 2).toggleIsUsed();

            b.getPoint(-11, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-11, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-11, 3).toggleIsUsed();

            b.getPoint(-9, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-9, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-9, 3).toggleIsUsed();

            b.getPoint(-7, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-7, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-7, 3).toggleIsUsed();

            b.getPoint(-12, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-12, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-12, 4).toggleIsUsed();

            b.getPoint(-10, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-10, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-10, 4).toggleIsUsed();

            b.getPoint(-8, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-8, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-8, 4).toggleIsUsed();

            b.getPoint(-6, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-6, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-6, 4).toggleIsUsed();

            //WHITE PLAYER POINTS

            b.getPoint(-9, -1).changeTeamId(Color.WHITE);
            b.getPoint(-9, -1).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -1).toggleIsUsed();

            b.getPoint(-10, -2).changeTeamId(Color.WHITE);
            b.getPoint(-10, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -2).toggleIsUsed();

            b.getPoint(-8, -2).changeTeamId(Color.WHITE);
            b.getPoint(-8, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -2).toggleIsUsed();

            b.getPoint(-11, -3).changeTeamId(Color.WHITE);
            b.getPoint(-11, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-11, -3).toggleIsUsed();

            b.getPoint(-9, -3).changeTeamId(Color.WHITE);
            b.getPoint(-9, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -3).toggleIsUsed();

            b.getPoint(-7, -3).changeTeamId(Color.WHITE);
            b.getPoint(-7, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-7, -3).toggleIsUsed();

            b.getPoint(-12, -4).changeTeamId(Color.WHITE);
            b.getPoint(-12, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-12, -4).toggleIsUsed();

            b.getPoint(-10, -4).changeTeamId(Color.WHITE);
            b.getPoint(-10, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -4).toggleIsUsed();

            b.getPoint(-8, -4).changeTeamId(Color.WHITE);
            b.getPoint(-8, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -4).toggleIsUsed();

            b.getPoint(-6, -4).changeTeamId(Color.WHITE);
            b.getPoint(-6, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-6, -4).toggleIsUsed();

            //BLUE PLAYER POINTS

            b.getPoint(9, -1).changeTeamId(Color.BLUE);
            b.getPoint(9, -1).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -1).toggleIsUsed();

            b.getPoint(10, -2).changeTeamId(Color.BLUE);
            b.getPoint(10, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -2).toggleIsUsed();

            b.getPoint(8, -2).changeTeamId(Color.BLUE);
            b.getPoint(8, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -2).toggleIsUsed();

            b.getPoint(11, -3).changeTeamId(Color.BLUE);
            b.getPoint(11, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(11, -3).toggleIsUsed();

            b.getPoint(9, -3).changeTeamId(Color.BLUE);
            b.getPoint(9, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -3).toggleIsUsed();

            b.getPoint(7, -3).changeTeamId(Color.BLUE);
            b.getPoint(7, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(7, -3).toggleIsUsed();

            b.getPoint(12, -4).changeTeamId(Color.BLUE);
            b.getPoint(12, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(12, -4).toggleIsUsed();

            b.getPoint(10, -4).changeTeamId(Color.BLUE);
            b.getPoint(10, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -4).toggleIsUsed();

            b.getPoint(8, -4).changeTeamId(Color.BLUE);
            b.getPoint(8, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -4).toggleIsUsed();

            b.getPoint(6, -4).changeTeamId(Color.BLUE);
            b.getPoint(6, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(6, -4).toggleIsUsed();

            //BLACK PLAYER POINTS

            b.getPoint(9, 1).changeTeamId(Color.BLACK);
            b.getPoint(9, 1).changeUsedTeamId(Color.BLACK);
            b.getPoint(9, 1).toggleIsUsed();

            b.getPoint(10, 2).changeTeamId(Color.BLACK);
            b.getPoint(10, 2).changeUsedTeamId(Color.BLACK);
            b.getPoint(10, 2).toggleIsUsed();

            b.getPoint(8, 2).changeTeamId(Color.BLACK);
            b.getPoint(8, 2).changeUsedTeamId(Color.BLACK);
            b.getPoint(8, 2).toggleIsUsed();

            b.getPoint(11, 3).changeTeamId(Color.BLACK);
            b.getPoint(11, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(11, 3).toggleIsUsed();

            b.getPoint(9, 3).changeTeamId(Color.BLACK);
            b.getPoint(9, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(9, 3).toggleIsUsed();

            b.getPoint(7, 3).changeTeamId(Color.BLACK);
            b.getPoint(7, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(7, 3).toggleIsUsed();

            b.getPoint(12, 4).changeTeamId(Color.BLACK);
            b.getPoint(12, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(12, 4).toggleIsUsed();

            b.getPoint(10, 4).changeTeamId(Color.BLACK);
            b.getPoint(10, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(10, 4).toggleIsUsed();

            b.getPoint(8, 4).changeTeamId(Color.BLACK);
            b.getPoint(8, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(8, 4).toggleIsUsed();

            b.getPoint(6, 4).changeTeamId(Color.BLACK);
            b.getPoint(6, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(6, 4).toggleIsUsed();



        } else if (players_num == 6) {

            //YELLOW PLAYER POINTS

            b.getPoint(-9, 1).changeTeamId(Color.YELLOW);
            b.getPoint(-9, 1).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-9, 1).toggleIsUsed();

            b.getPoint(-10, 2).changeTeamId(Color.YELLOW);
            b.getPoint(-10, 2).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-10, 2).toggleIsUsed();

            b.getPoint(-8, 2).changeTeamId(Color.YELLOW);
            b.getPoint(-8, 2).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-8, 2).toggleIsUsed();

            b.getPoint(-11, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-11, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-11, 3).toggleIsUsed();

            b.getPoint(-9, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-9, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-9, 3).toggleIsUsed();

            b.getPoint(-7, 3).changeTeamId(Color.YELLOW);
            b.getPoint(-7, 3).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-7, 3).toggleIsUsed();

            b.getPoint(-12, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-12, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-12, 4).toggleIsUsed();

            b.getPoint(-10, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-10, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-10, 4).toggleIsUsed();

            b.getPoint(-8, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-8, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-8, 4).toggleIsUsed();

            b.getPoint(-6, 4).changeTeamId(Color.YELLOW);
            b.getPoint(-6, 4).changeUsedTeamId(Color.YELLOW);
            b.getPoint(-6, 4).toggleIsUsed();

            //WHITE PLAYER POINTS

            b.getPoint(-9, -1).changeTeamId(Color.WHITE);
            b.getPoint(-9, -1).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -1).toggleIsUsed();

            b.getPoint(-10, -2).changeTeamId(Color.WHITE);
            b.getPoint(-10, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -2).toggleIsUsed();

            b.getPoint(-8, -2).changeTeamId(Color.WHITE);
            b.getPoint(-8, -2).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -2).toggleIsUsed();

            b.getPoint(-11, -3).changeTeamId(Color.WHITE);
            b.getPoint(-11, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-11, -3).toggleIsUsed();

            b.getPoint(-9, -3).changeTeamId(Color.WHITE);
            b.getPoint(-9, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-9, -3).toggleIsUsed();

            b.getPoint(-7, -3).changeTeamId(Color.WHITE);
            b.getPoint(-7, -3).changeUsedTeamId(Color.WHITE);
            b.getPoint(-7, -3).toggleIsUsed();

            b.getPoint(-12, -4).changeTeamId(Color.WHITE);
            b.getPoint(-12, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-12, -4).toggleIsUsed();

            b.getPoint(-10, -4).changeTeamId(Color.WHITE);
            b.getPoint(-10, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-10, -4).toggleIsUsed();

            b.getPoint(-8, -4).changeTeamId(Color.WHITE);
            b.getPoint(-8, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-8, -4).toggleIsUsed();

            b.getPoint(-6, -4).changeTeamId(Color.WHITE);
            b.getPoint(-6, -4).changeUsedTeamId(Color.WHITE);
            b.getPoint(-6, -4).toggleIsUsed();

            //BLUE PLAYER POINTS

            b.getPoint(9, -1).changeTeamId(Color.BLUE);
            b.getPoint(9, -1).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -1).toggleIsUsed();

            b.getPoint(10, -2).changeTeamId(Color.BLUE);
            b.getPoint(10, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -2).toggleIsUsed();

            b.getPoint(8, -2).changeTeamId(Color.BLUE);
            b.getPoint(8, -2).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -2).toggleIsUsed();

            b.getPoint(11, -3).changeTeamId(Color.BLUE);
            b.getPoint(11, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(11, -3).toggleIsUsed();

            b.getPoint(9, -3).changeTeamId(Color.BLUE);
            b.getPoint(9, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(9, -3).toggleIsUsed();

            b.getPoint(7, -3).changeTeamId(Color.BLUE);
            b.getPoint(7, -3).changeUsedTeamId(Color.BLUE);
            b.getPoint(7, -3).toggleIsUsed();

            b.getPoint(12, -4).changeTeamId(Color.BLUE);
            b.getPoint(12, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(12, -4).toggleIsUsed();

            b.getPoint(10, -4).changeTeamId(Color.BLUE);
            b.getPoint(10, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(10, -4).toggleIsUsed();

            b.getPoint(8, -4).changeTeamId(Color.BLUE);
            b.getPoint(8, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(8, -4).toggleIsUsed();

            b.getPoint(6, -4).changeTeamId(Color.BLUE);
            b.getPoint(6, -4).changeUsedTeamId(Color.BLUE);
            b.getPoint(6, -4).toggleIsUsed();

            //BLACK PLAYER POINTS

            b.getPoint(9, 1).changeTeamId(Color.BLACK);
            b.getPoint(9, 1).changeUsedTeamId(Color.BLACK);
            b.getPoint(9, 1).toggleIsUsed();

            b.getPoint(10, 2).changeTeamId(Color.BLACK);
            b.getPoint(10, 2).changeUsedTeamId(Color.BLACK);
            b.getPoint(10, 2).toggleIsUsed();

            b.getPoint(8, 2).changeTeamId(Color.BLACK);
            b.getPoint(8, 2).changeUsedTeamId(Color.BLACK);
            b.getPoint(8, 2).toggleIsUsed();

            b.getPoint(11, 3).changeTeamId(Color.BLACK);
            b.getPoint(11, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(11, 3).toggleIsUsed();

            b.getPoint(9, 3).changeTeamId(Color.BLACK);
            b.getPoint(9, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(9, 3).toggleIsUsed();

            b.getPoint(7, 3).changeTeamId(Color.BLACK);
            b.getPoint(7, 3).changeUsedTeamId(Color.BLACK);
            b.getPoint(7, 3).toggleIsUsed();

            b.getPoint(12, 4).changeTeamId(Color.BLACK);
            b.getPoint(12, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(12, 4).toggleIsUsed();

            b.getPoint(10, 4).changeTeamId(Color.BLACK);
            b.getPoint(10, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(10, 4).toggleIsUsed();

            b.getPoint(8, 4).changeTeamId(Color.BLACK);
            b.getPoint(8, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(8, 4).toggleIsUsed();

            b.getPoint(6, 4).changeTeamId(Color.BLACK);
            b.getPoint(6, 4).changeUsedTeamId(Color.BLACK);
            b.getPoint(6, 4).toggleIsUsed();

            //RED PLAYER POINTS

            b.getPoint(0, 8).changeTeamId(Color.RED);
            b.getPoint(0, 8).changeUsedTeamId(Color.RED);
            b.getPoint(0, 8).toggleIsUsed();

            b.getPoint(-1, 7).changeTeamId(Color.RED);
            b.getPoint(-1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 7).toggleIsUsed();

            b.getPoint(1, 7).changeTeamId(Color.RED);
            b.getPoint(1, 7).changeUsedTeamId(Color.RED);
            b.getPoint(1, 7).toggleIsUsed();

            b.getPoint(-2, 6).changeTeamId(Color.RED);
            b.getPoint(-2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(-2, 6).toggleIsUsed();

            b.getPoint(0, 6).changeTeamId(Color.RED);
            b.getPoint(0, 6).changeUsedTeamId(Color.RED);
            b.getPoint(0, 6).toggleIsUsed();

            b.getPoint(2, 6).changeTeamId(Color.RED);
            b.getPoint(2, 6).changeUsedTeamId(Color.RED);
            b.getPoint(2, 6).toggleIsUsed();

            b.getPoint(-3, 5).changeTeamId(Color.RED);
            b.getPoint(-3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-3, 5).toggleIsUsed();

            b.getPoint(-1, 5).changeTeamId(Color.RED);
            b.getPoint(-1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(-1, 5).toggleIsUsed();

            b.getPoint(1, 5).changeTeamId(Color.RED);
            b.getPoint(1, 5).changeUsedTeamId(Color.RED);
            b.getPoint(1, 5).toggleIsUsed();

            b.getPoint(3, 5).changeTeamId(Color.RED);
            b.getPoint(3, 5).changeUsedTeamId(Color.RED);
            b.getPoint(3, 5).toggleIsUsed();

            //GREEN PLAYER POINTS

            b.getPoint(0, -8).changeTeamId(Color.GREEN);
            b.getPoint(0, -8).changeUsedTeamId(Color.GREEN);
            b.getPoint(0, -8).toggleIsUsed();

            b.getPoint(-1, -7).changeTeamId(Color.GREEN);
            b.getPoint(-1, -7).changeUsedTeamId(Color.GREEN);
            b.getPoint(-1, -7).toggleIsUsed();

            b.getPoint(1, -7).changeTeamId(Color.GREEN);
            b.getPoint(1, -7).changeUsedTeamId(Color.GREEN);
            b.getPoint(1, -7).toggleIsUsed();

            b.getPoint(-2, -6).changeTeamId(Color.GREEN);
            b.getPoint(-2, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(-2, -6).toggleIsUsed();

            b.getPoint(0, -6).changeTeamId(Color.GREEN);
            b.getPoint(0, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(0, -6).toggleIsUsed();

            b.getPoint(2, -6).changeTeamId(Color.GREEN);
            b.getPoint(2, -6).changeUsedTeamId(Color.GREEN);
            b.getPoint(2, -6).toggleIsUsed();

            b.getPoint(-3, -5).changeTeamId(Color.GREEN);
            b.getPoint(-3, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(-3, -5).toggleIsUsed();

            b.getPoint(-1, -5).changeTeamId(Color.GREEN);
            b.getPoint(-1, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(-1, -5).toggleIsUsed();

            b.getPoint(1, -5).changeTeamId(Color.GREEN);
            b.getPoint(1, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(1, -5).toggleIsUsed();

            b.getPoint(3, -5).changeTeamId(Color.GREEN);
            b.getPoint(3, -5).changeUsedTeamId(Color.GREEN);
            b.getPoint(3, -5).toggleIsUsed();

        }
    }

    static Boolean checkIsPossible(int curr_x, int curr_y, int new_x, int new_y, Board b) {
        if(b.getPoint(new_x, new_y).getIsUsed()){
            return false;
        } else {
            int abs_x = new_x - curr_x;
            int abs_y = new_y - curr_y;
            if ((Math.abs(new_x) - Math.abs(curr_x) > 2) || (Math.abs(new_x) - Math.abs(curr_x) < -2) && abs_y != 0 ) {
                return false;
            } else if ( (Math.abs(new_y) - Math.abs(curr_y) > 2) || (Math.abs(new_y) - Math.abs(curr_y) < -2) || abs_y < -2){
                return false;
            } else {
                if(abs_x == 2 && abs_y == 2 && b.getPoint(curr_x + 1, curr_y + 1).getIsUsed()) {
                    return true;
                }

                if(abs_x == -2 && abs_y == 2 && b.getPoint(curr_x - 1, curr_y + 1).getIsUsed()) {
                    return true;
                }

                if(abs_x == 2 && abs_y == -2 && b.getPoint(curr_x + 1, curr_y - 1).getIsUsed()) {
                    return true;
                }

                if(abs_x == -2 && abs_y == -2 && b.getPoint(curr_x - 1, curr_y - 1).getIsUsed()) {
                    return true;
                }

                if(abs_x == 4 && abs_y == 0 && b.getPoint(curr_x + 2, curr_y).getIsUsed()){
                    return true;
                }

                if(abs_x == -4 && abs_y == 0 && b.getPoint(curr_x - 2, curr_y).getIsUsed()){
                    return true;
                }

                if((abs_x == 2 && abs_y == 0) || (abs_x == -2 && abs_y == 0)){
                    return true;
                }

                if((abs_x == 1 && abs_y == 1) || (abs_x == -1 && abs_y == 1)){
                    return true;
                }

                if((abs_x == 1 && abs_y == -1) || (abs_x == -1 && abs_y == -1)){
                    return true;
                }
            }
        }
        return false;
    }

    static void updateBoard(int curr_x, int curr_y, int new_x, int new_y, Board b) {
        Color cur_id = b.getPoint(curr_x, curr_y).getUsedTeamId();
        b.getPoint(curr_x, curr_y).toggleIsUsed();
        b.getPoint(curr_x, curr_y).changeUsedTeamId(Color.GREY);
        b.getPoint(new_x, new_y).toggleIsUsed();
        b.getPoint(new_x, new_y).changeUsedTeamId(cur_id);
    }

    static Player getPlayer(Color id, ArrayList<Player> players){
        for(Player player : players){
            if(player.getId() == id)
                return player;
        }
        return null;
    }


    
    static Color checkPlayersScore(ArrayList<Player> players, Board b) {

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
                Color point_opponent_id = getPlayer(point_id, players).getOpponentId();

                if(point.getUsedTeamId() == point_opponent_id){
                    getPlayer(point_opponent_id, players).increaseScore();
                }

            }
        }

        for(Player player : players){
            if(player.getScore() == 10)
                return player.getId();
        }

        return null;
    }

    public static void main(String[] args){

        int now_players = 0;
        int max_players = 0;
        ArrayList<Player> players = new ArrayList<>();
        Board b = initBoard();

        addPlayersToBoard(6, b);

    }
}
