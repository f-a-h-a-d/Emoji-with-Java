
package scratch;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Main {
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
