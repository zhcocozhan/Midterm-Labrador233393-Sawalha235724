import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SceneCanvas extends JComponent{

    private int width;
    private int height;
    BackgroundNight nightbg;
    BackgroundDay daybg;
    //private boolean bark;
    
    private Tree t;
    DogBase db;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        this.setPreferredSize(new Dimension(width, height));
        daybg = new BackgroundDay(0, 0, width, height);
        db = new DogBase(300, 400);
        nightbg = new BackgroundNight(0, 0, w, h);
    
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        daybg.draw(g2d);
        if(daybg.forDay.day){
            daybg.draw(g2d);
        }
        else if(nightbg.forNight.night){
            nightbg.draw(g2d);
        }
        //db.draw(g2d);
        if(db.forBark.barked){
            db.drawBark(g2d);
        }
        else db.draw(g2d);

        

        
    }

    
}
