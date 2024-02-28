import java.awt.*;
import java.awt.geom.*;

public class BackgroundNight implements DrawingObject{
    int x;
    int y;
    int width;
    int height;
    
    public BackgroundNight(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2d){
        Point2D.Double pt1 = new Point2D.Double(0, 0);
        Point2D.Double pt2 = new Point2D.Double(0, height);
        Color nightColor1 = new Color(21, 24, 41);
        Color nightColor2 = new Color(99, 101, 114);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        GradientPaint day = new GradientPaint(pt1, nightColor1, pt2, nightColor2, true);
        g2d.setPaint(day);
        g2d.fill(background);
        Pentagon one = new Pentagon(20, 20, Color.WHITE);

    }
}
