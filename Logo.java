/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            Image ima = ImageIO.read(this.getClass().getResource("../logo.png"));
            Singleton.getInstance().gr.drawImage(ima, x, y, 460, 54, null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

