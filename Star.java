import java.awt.*;
import java.awt.geom.*;

public class Star implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    public Star(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        
    }

    @Override
    public void draw(Graphics2D g2d){
    AffineTransform reset = g2d.getTransform();
    Triangle t1 = new Triangle(x,y,5,size,color);
    t1.draw(g2d);

    Triangle t2 = new Triangle(x+size, y, 5, size, color);   
    g2d.rotate(Math.toRadians(72), x+size, y);
    t2.draw(g2d); 

    g2d.setTransform(reset);
    Triangle t3 = new Triangle(x+1.31*size ,y+0.95*size, 5, size, color);   
    g2d.rotate(Math.toRadians(144), x+1.31*size, y+0.95*size);
    t3.draw(g2d); 

    g2d.setTransform(reset);
    Triangle t4 = new Triangle((2*x+size)/2,y+1.54*size, 5, size, color); 
    g2d.rotate(Math.toRadians(216),(2*x+size)/2, y+1.54*size);
    t4.draw(g2d);   

    g2d.setTransform(reset);
    Triangle t5 = new Triangle(x-0.31*size, y+0.95*size, 5, size, color); 
    g2d.rotate(Math.toRadians(288), x-0.31*size, y+0.95*size);
    t5.draw(g2d);   

    g2d.setTransform(reset);
    Pentagon base = new Pentagon(x, y, size, color);
    base.draw(g2d);

    }

}
