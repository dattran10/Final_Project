package controller;
import javax.swing.JFrame;
import model.GameData;
import view.GamePanel;
import view.MainWindow;

/**
 * Version: 1.5
 * @author dattr
 */
public class Main {
    public static GamePanel gamePanel;
    public static GameData gameData;
    public static Animator animator;
    public static int WIN_WIDTH = 900;
    public static int WIN_HEIGHT = 600;
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                animator = new Animator();
                gameData = new GameData();
                gamePanel = new GamePanel();

                JFrame game = new MainWindow();
                game.setTitle("Final Project Space Battle");//MVC Game Framework
                game.setSize(WIN_WIDTH, WIN_HEIGHT);
                game.setLocation(100, 0);
                game.setResizable(false); // window size cannot change
                game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                game.setVisible(true);

                // start animation
                new Thread(animator).start();
            }
        });
    } // End main()
} // End class Main
