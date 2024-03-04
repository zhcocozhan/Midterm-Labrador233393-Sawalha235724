import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SceneFrame{

    private JFrame frame;
    private int width;
    private int height;
    //private DogBase db;
    private SceneCanvas sc;
    
    //KeyHandlers forBark = new KeyHandlers();

    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
        sc = new SceneCanvas(800, 600);
        
    }

    public void setUpGUI(){
        frame.setTitle("Midterm Project - Labrador - Sawalha");
        frame.add(sc);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addKeyListener(sc.db.forBark);
        frame.addKeyListener(sc.daybg.forDay);
        frame.addKeyListener(sc.nightbg.forNight);

        while(true){
            frame.repaint();
        }
    }

    
}