
package scratch;

/**
 *
 * @author FahadPC
 */
import javax.swing.*;
import java.awt.*;

class Drawpanel extends JPanel {
     public void paintComponent( Graphics g ){
        super.paintComponent(g);

        Color set = Color.ORANGE;

        g.setColor(set);
        g.fillOval(150,150,200,200);
        g.setColor(Color.black);
        g.fillRect(195,215,32,5);
        g.fillRect(280,215,32,5);

        g.fillRect(200,300,100,5);


    }
}

class Scratch {

    public static void main(String[] args) {
        Drawpanel panel = new Drawpanel();

        JFrame frame = new JFrame();

            frame.add(panel);

            frame.setSize(500,500);

            frame.setVisible(true);
            frame.setLayout(null);

            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}