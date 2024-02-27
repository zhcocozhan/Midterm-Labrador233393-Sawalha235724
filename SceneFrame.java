import java.awt.*;
import javax.swing.*;

public class SceneFrame{

    private JFrame frame;
    private int width;
    private int height;
    private SceneCanvas sc;

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

    }
    

}