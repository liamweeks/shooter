package Display;
import javax.swing.*;
import java.awt.*;

public class Display extends Canvas {
    private static final int WIDTH = 800;

    /*
        private: this code is only viewable inside the Display class
        static: not an Display instance, but part of the Display type, so we can use it even without instantiating a Display object
        final: makes a method/variable immutable, so we cannot modify their value even if we inherit or override

     */
    private static final int HEIGHT = 600;
    private static final String TITLE = "Shooter Game";

    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.pack();
        frame.setTitle(TITLE);
        frame.setSize(screenSize);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE /*3*/);
        //frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
