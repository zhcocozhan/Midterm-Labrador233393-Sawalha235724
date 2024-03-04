import java.awt.*;
import java.awt.geom.*;
public class DogBase implements DrawingObject{
    double x;
    double y;
    KeyHandlers forBark;

    public DogBase(double x, double y){
        this.x = x;
        this.y = y;
        forBark = new KeyHandlers();
    }

    @Override
    public void draw(Graphics2D g2d){
    
    Color beige = new Color(255,195,105);
    Color darkBeige = new Color(60, 37, 1);
    Color outline = new Color(120,84,28);

    /* The following block of code is for the tail of the dog */
    Path2D.Double tail = new Path2D.Double();
    tail.moveTo(x+90, y+100);
    tail.curveTo(x+125, y+70, x+130, y+100, x+75, y+140);
    g2d.setStroke(new BasicStroke(2));
    g2d.setColor(beige);
    g2d.fill(tail);
    g2d.setColor(outline);
    g2d.draw(tail);

    /*The following blockl of code is for the body,head, and paws of the dog. */
    Circle head = new Circle(x, y, 70, beige, outline);
    Ellipse2D.Double body = new Ellipse2D.Double(x-16,y+30,105,125);
    DogPaws lPaw = new DogPaws(x-1, y+100, beige, outline);
    DogPaws rPaw = new DogPaws(x+52, y+100, beige, outline);

    g2d.setColor(outline);
    g2d.setStroke(new BasicStroke(3));
    g2d.draw(body);
    g2d.setColor(beige);
    g2d.fill(body);
    head.draw(g2d);
    lPaw.draw(g2d);
    rPaw.draw(g2d);
    


    /*The following code is for the eyes of the dog.*/
    Circle lEye = new Circle(x+17, y+20, 9, Color.BLACK, Color.BLACK);
    Circle rEye = new Circle(x+45, y+20, 9, Color.BLACK, Color.BLACK);
    Circle lEyeOrb1 = new Circle(x+21.95, y+21, 1, Color.WHITE, Color.WHITE);
    Circle rEyeOrb1 = new Circle(x+49.95, y+21, 1, Color.WHITE, Color.WHITE);
    Circle lEyeOrb2 = new Circle(x+20.5, y+26, 0.5, Color.WHITE, Color.WHITE);
    Circle rEyeOrb2 = new Circle(x+48.5, y+26, 0.5, Color.WHITE, Color.WHITE);

    lEye.draw(g2d);
    rEye.draw(g2d);
    lEyeOrb1.draw(g2d);
    rEyeOrb1.draw(g2d);
    lEyeOrb2.draw(g2d);
    rEyeOrb2.draw(g2d);

    /* The following block of code is for the mouth and nose of the dog */
  
    Path2D.Double mouth = new Path2D.Double();
    mouth.moveTo(x+25,y+45);
    mouth.curveTo(x+15, y+55, x+30, y+55, x+35, y+48);
    mouth.curveTo(x+40, y+55, x+55, y+55, x+45, y+45);

    Path2D.Double nose = new Path2D.Double();
    nose.moveTo(x+30, y+40);
    nose.lineTo(x+40, y+40);
    nose.lineTo(x+35, y+50);
    nose.closePath();

    Line2D.Double whisker1 = new Line2D.Double(x+29, y+46, x+19, y+45);
    Line2D.Double whisker2 = new Line2D.Double(x+28, y+49, x+19, y+51);
    Line2D.Double whisker3 = new Line2D.Double(x+40, y+46, x+50, y+45);
    Line2D.Double whisker4 = new Line2D.Double(x+41, y+49, x+51, y+51);
    
    g2d.setStroke(new BasicStroke(1));
    g2d.setColor(darkBeige);
    g2d.draw(whisker1);
    g2d.draw(whisker2);
    g2d.draw(whisker3);
    g2d.draw(whisker4);

    g2d.setColor(outline);
    g2d.draw(mouth);
    g2d.fill(nose);

    /*The following block of code is for the ears of the dog */
    Path2D.Double earsLeft = new Path2D.Double();
    earsLeft.moveTo(x+9, y+10);
    earsLeft.curveTo(x+13, y-15, x+18, y-8, x+24, y+2.5);
    earsLeft.closePath();

    Path2D.Double earsRight = new Path2D.Double();
    earsRight.moveTo(x+46, y+2.5);
    earsRight.curveTo(x+52, y-8, x+57, y-15, x+61, y+10);
    earsRight.closePath();

    g2d.setStroke(new BasicStroke(3));
    g2d.draw(earsLeft);
    g2d.draw(earsRight);


    g2d.setColor(beige);
    g2d.fill(earsLeft);
    g2d.fill(earsRight);
    }

    public void drawBark(Graphics2D g2d){
            Color beige = new Color(255,195,105);
            Color darkBeige = new Color(60, 37, 1);
            Color outline = new Color(120,84,28);
            Color red = new Color(255, 112, 112);

            /* The following block of code is for the tail of the dog */
            Path2D.Double tail = new Path2D.Double();
            tail.moveTo(x+90, y+100);
            tail.curveTo(x+125, y+80, x+130, y+110, x+75, y+140);
            g2d.setStroke(new BasicStroke(2));
            g2d.setColor(beige);
            g2d.fill(tail);
            g2d.setColor(outline);
            g2d.draw(tail);
        
            /*The following blockl of code is for the body,head, and paws of the dog. */
            Circle head = new Circle(x, y, 70, beige, outline);
            Ellipse2D.Double body = new Ellipse2D.Double(x-16,y+30,105,125);
            DogPaws lPaw = new DogPaws(x-1, y+100, beige, outline);
            DogPaws rPaw = new DogPaws(x+52, y+100, beige, outline);
    
            g2d.setStroke(new BasicStroke(3));
            g2d.draw(body);
            g2d.setColor(beige);
            g2d.fill(body);
            head.draw(g2d);
            lPaw.draw(g2d);
            rPaw.draw(g2d);
            
        
            /*The following code is for the eyes of the dog.*/
            Path2D.Double lEye = new Path2D.Double();
            lEye.moveTo(x+17, y+27);
            lEye.curveTo(x+20, y+22, x+23, y+22, x+26, y+27);

            Path2D.Double rEye = new Path2D.Double();
            rEye.moveTo(x+45, y+27);
            rEye.curveTo(x+48, y+22, x+51, y+22, x+54, y+27);
            
            g2d.draw(rEye);
            g2d.draw(lEye);
            
        
            /* The following block of code is for the mouth, open mouth, and nose of the dog */
          
            Path2D.Double mouth = new Path2D.Double();
            mouth.moveTo(x+25,y+45);
            mouth.curveTo(x+15, y+55, x+30, y+55, x+35, y+48);
            mouth.curveTo(x+40, y+55, x+55, y+55, x+45, y+45);
            //mouth.curveTo(x)

            Path2D.Double open = new Path2D.Double();
            open.moveTo(x+27,y+52);
            open.curveTo(x+33, y+58, x+37, y+58, x+43, y+52);
        
            Path2D.Double nose = new Path2D.Double();
            nose.moveTo(x+30, y+40);
            nose.lineTo(x+40, y+40);
            nose.lineTo(x+35, y+50);
            nose.closePath();
        
            Line2D.Double whisker1 = new Line2D.Double(x+29, y+46, x+19, y+45);
            Line2D.Double whisker2 = new Line2D.Double(x+28, y+49, x+19, y+51);
            Line2D.Double whisker3 = new Line2D.Double(x+40, y+46, x+50, y+45);
            Line2D.Double whisker4 = new Line2D.Double(x+41, y+49, x+51, y+51);
            
            g2d.setStroke(new BasicStroke(1));
            g2d.setColor(darkBeige);
            g2d.draw(whisker1);
            g2d.draw(whisker2);
            g2d.draw(whisker3);
            g2d.draw(whisker4);
        
            g2d.setColor(red);
            g2d.draw(open);
            g2d.fill(open);
        
            g2d.setColor(outline);
            g2d.draw(mouth);
            g2d.fill(nose);

            
            /*The following block of code is for the ears of the dog */
            Path2D.Double earsLeft = new Path2D.Double();
            earsLeft.moveTo(x+9, y+10);
            earsLeft.curveTo(x+13, y-30, x+18, y-12, x+24, y+2.5);
            earsLeft.closePath();
        
            Path2D.Double earsRight = new Path2D.Double();
            earsRight.moveTo(x+46, y+2.5);
            earsRight.curveTo(x+52, y-12, x+57, y-30, x+61, y+10);
            earsRight.closePath();
        
            g2d.setStroke(new BasicStroke(3));
            g2d.draw(earsLeft);
            g2d.draw(earsRight);
        
        
            g2d.setColor(beige);
            g2d.fill(earsLeft);
            g2d.fill(earsRight);


    }

}
