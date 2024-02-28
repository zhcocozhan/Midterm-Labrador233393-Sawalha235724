import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SceneCanvas extends JComponent{

    private int width;
    private int height;
    private BackgroundDay daybg;
    private Pentagon p;
    private Tree t;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        this.setPreferredSize(new Dimension(width, height));
        daybg = new BackgroundDay(0, 0, width, height);
        p = new Pentagon(100, 200, Color.WHITE);
        t = new Tree(600, 600, 6, Color.GREEN, 300, 50, new Color(108, 60, 31));
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
    
        daybg.draw(g2d);
        p.draw(g2d);
        t.draw(g2d);
       




    }
}
