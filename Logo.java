package views;

import singleton.Singleton;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author d
 */
public class Logo {
    int x = 293, y = 25;
    public void drawLogoMiddle() {
        try {
            ImageIcon ima = new ImageIcon(this.getClass().getResource("../shrek.gif"));
            Singleton.getInstance().gr.drawImage(ima.getImage(), 900, 10, 260, 260, null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

