import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class BackgroundNight implements DrawingObject{
    int x;
    int y;
    int width;
    int height;
    KeyHandlers forNight;
    
    public BackgroundNight(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        forNight = new KeyHandlers();
    }

    public void draw(Graphics2D g2d){
        Point2D.Double pt1 = new Point2D.Double(0, 0);
        Point2D.Double pt2 = new Point2D.Double(0, height);
        Color nightColor1 = new Color(21, 24, 41);
        Color nightColor2 = new Color(99, 101, 114);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        GradientPaint night = new GradientPaint(pt1, nightColor1, pt2, nightColor2, true);
        g2d.setPaint(night);
        g2d.fill(background);
        Moon moon = new Moon(350, 150, 100);
        moon.draw(g2d);

        Star one = new Star(30, 60, 10, Color.WHITE);
        Star two = new Star(125, 40, 8, Color.WHITE);
        Star three = new Star(220, 75, 9, Color.WHITE);
        Star four = new Star(315, 90, 6, Color.WHITE);
        Star five = new Star(425, 65, 11, Color.WHITE);
        Star six = new Star(500, 110, 7, Color.WHITE);
        Star seven = new Star(610, 95, 9, Color.WHITE);
        Star eight = new Star(690, 70, 12, Color.WHITE); 
        Star nine = new Star(765, 60, 10, Color.WHITE);

        ArrayList<Star> stars = new ArrayList<Star>();
        stars.add(one);
        stars.add(two);
        stars.add(three);
        stars.add(four);
        stars.add(five);
        stars.add(six);
        stars.add(seven);
        stars.add(eight);
        stars.add(nine);

        for(int i=0; i<stars.size(); i++){
            Star starToDraw = stars.get(i);
            starToDraw.draw(g2d);
        }

    }
}
