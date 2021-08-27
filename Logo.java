package views;

import singleton.Singleton;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author d
 */
public class Logo {
    int x = 293, y = 25;
    public void drawLogoMiddle() {
        try {
            Image ima = ImageIO.read(this.getClass().getResource("../logo8.png"));
            Singleton.getInstance().gr.drawImage(ima, 900, 10, 260, 260, null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

