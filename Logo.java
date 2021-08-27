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
            //Singleton.getInstance().gr.drawImage(ima, 0, 0, 1370, 900, null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

