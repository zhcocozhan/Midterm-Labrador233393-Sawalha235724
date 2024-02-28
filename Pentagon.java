import java.awt.*;
import java.awt.geom.*;

public class Pentagon implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    public Pentagon(double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(x, y);
        p.lineTo(x-10, y);
        p.lineTo((x-10)+(10*0.31),y+(0.95*(10)));
        p.lineTo((2*x-10)/2,y+(1.54*10));
        p.lineTo(x+3.1,y+(0.95*(10)));
        p.closePath();
        //Line2D.Double l1 = new Line2D.Double(x,y,x-3,y);
        //Line2D.Double l2 = new Line2D.Double(x-3,y,(x-3)*1.31,(y-0.95)*(x-3));
        //Line2D.Double l3 = new Line2D.Double((x-3)*1.31,(y-0.95)*(x-3),(2*x-3)/2,(y-1.54)*(x-3));
        //Line2D.Double l4 = new Line2D.Double((2*x-3)/2,(y-1.54)*(x-3),);
        g2d.setColor(color);
        g2d.fill(p);
    }

}
