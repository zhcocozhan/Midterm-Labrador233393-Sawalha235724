import java.awt.*;
import java.awt.geom.*;

public class Star implements DrawingObject{
    
    double x;
    double y;
    Color color;

    public Star(double x, double y,  Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        Triangle t1 = new Triangle(x,y,5,10,Color.WHITE);
        
    }

    @Override
    public void draw(Graphics2D g2d){
    Triangle t1 = new Triangle(x,y,5,10,Color.WHITE);
        for(int i=0; i<5; i++){
        t1.draw(g2d);
        t1.rotate(Math.toRadians(72));
        }
    base.draw(g2d);
    }

}
