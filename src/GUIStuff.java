import java.awt.*;
import javax.swing.*;

public class GUIStuff
{

    public static JFrame jf;
    public static Graphics g;


    public static void main(String[] args)
    {

        jf = new JFrame("Testing Stuff Out");
        jf.setSize(800,600);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);

        Container cp;
        cp = jf.getContentPane();
        cp.add(new JComponent(){
            public void paintComponent(Graphics g){
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2));
                g2d.drawString("TEST", 10, 10);

                drawShapes(g2d, 400, 300, 10, 100, Color.red, Color.black);
                drawShapes(g2d, 440, 300, 10, 100, Color.blue, Color.black);
            }
        });


    }

    public static void drawShapes(Graphics2D g2d, int x, int y, int width, int height, Color fill, Color outline){

        g2d.setColor(fill);
        g2d.fillRect(x,y, width, height);
        g2d.setColor(outline);
        g2d.drawRect(x, y, width, height);
        g2d.drawString("TEST", 10, 10);
    }


}
