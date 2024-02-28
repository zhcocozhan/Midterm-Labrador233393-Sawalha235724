import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject{
    
    double x;
    double y;
    double rise;
    double base;
    Color color;

    public Triangle(double x, double y, double rise, double base, Color color){
        this.x = x;
        this.y = y;
        this.rise = rise;
        this.base = base;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double trianglePath = new Path2D.Double();
        trianglePath.moveTo(x,y);
        trianglePath.lineTo(x+base, y);
        trianglePath.lineTo((2*x+base)/2, y-rise);
        trianglePath.closePath();
        g2d.setColor(color);
        g2d.fill(trianglePath);

    }

}