import java.awt.*;
import java.awt.geom.*;

public class Tree implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color colorLeaves;
    double rise;
    double base;
    Color colorTrunk;
    Triangle trunk;

    public Tree(double x, double y, double size, Color colorLeaves, double rise, double base, Color colorTrunk){
        this.x = x;
        this.y = y;
        this.size = size;
        this.colorLeaves = colorLeaves;
        //triVals = new Object[] {xTrunk, yTrunk, rise, base, colorTrunk};
        trunk = new Triangle(x, y, rise, base, colorTrunk);
    }

    @Override
    public void draw(Graphics2D g2d){
        trunk.draw(g2d);
        Ellipse2D.Double bottomLeaf = new Ellipse2D.Double(x-3.5, y+2, size, size+3);
        g2d.setColor(colorLeaves);
        g2d.fill(bottomLeaf);
        

    }

}
