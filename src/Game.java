import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Game {

    public Game () {

    }

    public static void maze() {
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        double borderX[] = {0, 0, 50, 50};
        double borderY[] = {0, 50, 50, 0};
        StdDraw.polygon(borderX, borderY);

        StdDraw.setPenColor(StdDraw.BLACK); //maze lines
        StdDraw.line(10, 0, 10, 10);
        StdDraw.line(10, 10, 20, 10);
        StdDraw.line(30, 0, 30, 20);
        StdDraw.line(30, 20, 10, 20);
        StdDraw.line(40, 0, 40, 10);
        StdDraw.line(40, 20, 50, 20);
        StdDraw.line(20, 30, 50, 30);
        StdDraw.line(10, 30, 10, 40);
        StdDraw.line(10, 40, 40, 40);
        StdDraw.line(40, 40, 40, 50);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(71, 30, 3);
        StdDraw.filledSquare(71, 22, 3);
        StdDraw.filledSquare(79, 22, 3);
        StdDraw.filledSquare(63, 22, 3);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.setFont(StdDraw.COMIC_SANS);
        StdDraw.text(71, 30, "W");
        StdDraw.text(71, 22 ,"S");
        StdDraw.text(79, 22, "D");
        StdDraw.text(63, 22, "A");

        StdDraw.setFont(StdDraw.BIG_COMIC_SANS);
        StdDraw.text(71, 40, "Use:");
        StdDraw.text(71, 12, "To Move!");

        StdDraw.text(120, 35,"Move to the colored");
        StdDraw.text(120, 30, "spaces to move on to the");
        StdDraw.text(120, 25, "Next Level");

        StdDraw.setFont(StdDraw.BIGGER_COMIC_SANS);
        StdDraw.text(71, 60, "LEVEL 1: TUTORIAL");



        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(37.5, 45, 2.3, 4.8); // visual representation of end goal
    }

    public static void level2 () {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.setFont(StdDraw.BIGGER_COMIC_SANS);
        StdDraw.text(71, 60, "LEVEL 2");
        double borderX[] = {31, 31, 111, 111};
        double borderY[] = {0, 50, 50, 0};
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        StdDraw.polygon(borderX, borderY);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(33.7, 2.7, 2.5);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledSquare(33.7, 47.3, 2.5);
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.filledSquare(108.3, 47.3, 2.5);
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledSquare(108.3, 2.7, 2.5);
    }

    /************************************************************************
     * Method: Music1                                                        *
     * Purpose: Plays a wav file from the source folder              *
     * Parameters: Start, End, Noise, Tic                                                          *
     * Return Value: N/A                                                   *
     ************************************************************************/
    public static void Music1() {
        Clip clip;
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("Density & Time - MAZE NO COPYRIGHT 8-bit Music.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(100000);
        }
        catch (Exception ex) {
            System.out.println("Error Playing Sound");
            ex.printStackTrace();
        }
    }

    public static void level1A () {
        StdDraw.clear(StdDraw.GRAY);

        double x = 11;
        double y = 5;
        double speed = 0.2;

        maze();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, 0.5); // movable square

        StdDraw.enableDoubleBuffering();
        while (true) {
           /* Music1();*/
            while (true) {
                if (x >= 10 && y >= 0 && x <= 20 && y <= 10) {
                    if (StdDraw.isKeyPressed('W') && y < 9) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 20 && y >= 0 && x <= 30 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 29) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 19) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 10 && x <= 20 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 9) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 11) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 0 && y >= 0 && x <= 10 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 9) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 1) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 0 && x <= 20 && y <= 10) {
                    if (StdDraw.isKeyPressed('W') && y < 9) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 20 && x <= 50 && y <= 30) {
                    if (StdDraw.isKeyPressed('W') && y < 29) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 9) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 21) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 30 && y >= 0 && x <= 40 && y <= 21) {
                    if (StdDraw.isKeyPressed('W') && y < 21) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 39) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 31) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >= 10 && x <= 50 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 35) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 40 && y >= 0 && x <= 50 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 41) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 21 && x <= 20 && y <= 40) {
                    if (StdDraw.isKeyPressed('W') && y < 39) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 19) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 11) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 30 && x <= 50 && y <= 40) {
                    if (StdDraw.isKeyPressed('W') && y < 39) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 31) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 40 && y >= 30 && x <= 50 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 41) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 31) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 40 && x <= 37 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 37) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 1) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 41) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >= 40 && x <= 39 && y <= 50) {
                    break;
                }
            }
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.show(1);
            break;
        }
        level2A();
    }

    public static void level1B () {
        StdDraw.clear(StdDraw.GRAY);

        double x = 30;
        double y = 45;
        double speed = 0.2;

        maze();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, 0.5); // movable square

        StdDraw.enableDoubleBuffering();
        while (true) {
            /*Music1();*/
            while (true) {
                if (x >= 10 && y >= 0 && x <= 20 && y <= 10) {
                    if (StdDraw.isKeyPressed('W') && y < 9) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 20 && y >= 0 && x <= 30 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 29) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 19) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 10 && x <= 20 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 9) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 11) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 0 && y >= 0 && x <= 10 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 9) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 1) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 0 && x <= 20 && y <= 10) {
                    if (StdDraw.isKeyPressed('W') && y < 9) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 21) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 20 && x <= 50 && y <= 30) {
                    if (StdDraw.isKeyPressed('W') && y < 29) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 9) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 21) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 30 && y >= 0 && x <= 40 && y <= 21) {
                    if (StdDraw.isKeyPressed('W') && y < 21) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 39) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 31) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >= 10 && x <= 50 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 35) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 40 && y >= 0 && x <= 50 && y <= 20) {
                    if (StdDraw.isKeyPressed('W') && y < 19) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 41) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 21 && x <= 20 && y <= 40) {
                    if (StdDraw.isKeyPressed('W') && y < 39) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 19) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 11) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 10 && y >= 30 && x <= 50 && y <= 40) {
                    if (StdDraw.isKeyPressed('W') && y < 39) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 11) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 31) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 40 && y >= 30 && x <= 50 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 49) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 41) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 31) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 9 && y >= 40 && x <= 37 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 37) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 1) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 41) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        maze();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >= 40 && x <= 39 && y <= 50) {
                    break;
                }
            }
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.show(1);
            break;
        }
        level2A();
    }

    public static void level2A () {
        StdDraw.clear(StdDraw.GRAY);

        double x = 38;
        double y = 3;
        double speed = 0.2;

        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(111,42.5, 103.5, 42.5);
        StdDraw.line(103.5, 42.5, 103.5, 50);

        level2();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, 0.5);

        StdDraw.enableDoubleBuffering();
        while (true){
            while (true) {
                if (x >= 35 && y >= 0 && x <= 106 && y <= 5) {
                    if (StdDraw.isKeyPressed('W') && y < 5) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 106) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 36) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 1) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >= 5 && x <= 103.5 && y <= 42.5) {
                    if (StdDraw.isKeyPressed('W') && y < 42.5) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 103.5) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 35) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 5) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 35 && y >=  42.5 && x <= 103.5 && y <= 50) {
                    if (StdDraw.isKeyPressed('W') && y < 49) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 102.5) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 36) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 42.5) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
                if (x >= 31 && y >= 5 && x <= 35 && y <= 45) {
                    if (StdDraw.isKeyPressed('W') && y < 45) {
                        y += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('D') && x < 35) {
                        x += speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();
                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('A') && x > 32) {
                        x -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                    if (StdDraw.isKeyPressed('S') && y > 5) {
                        y -= speed;
                        StdDraw.clear(StdDraw.GRAY);
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.line(111,42.5, 103.5, 42.5);
                        StdDraw.line(103.5, 42.5, 103.5, 50);
                        level2();                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledSquare(x, y, 0.5);
                        StdDraw.show(1);
                    }
                }
            }
        }
    }

    public static void level2AlphaA () {

    }

    public static void level2BravoA () {

    }
}

