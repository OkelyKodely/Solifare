package views;

import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import singleton.*;

public class Stacker {

    public void executeDrawing() {
        Stack1 q = new Stack1();
        Stack2 r = new Stack2();
        Stack3 s = new Stack3();
        Stack4 t = new Stack4();

        singleton.Singleton.getInstance().gr.setColor(new Color(123, 254, 81));
        singleton.Singleton.getInstance().gr.fillRect(0, 600, 1370, 900);

        q.drawIt();
        r.drawIt();
        s.drawIt();
        t.drawIt();
    }
    class Stack1 {
        int x = 50;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(new Color(215, 218, 185)) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            Singleton.getInstance().gr.drawLine(200, 85, 260, 75);
            Singleton.getInstance().gr.drawLine(300, 85, 360, 75);
            Singleton.getInstance().gr.drawLine(400, 85, 460, 75);
            Singleton.getInstance().gr.drawLine(500, 85, 560, 75);
            Singleton.getInstance().gr.drawLine(600, 85, 660, 75);
            Singleton.getInstance().gr.drawLine(700, 85, 760, 75);
            Singleton.getInstance().gr.drawLine(800, 85, 860, 75);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 52, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack2 {
        int x = 191;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(new Color(215, 218, 185)) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 352, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack3 {
        int x = 331;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(new Color(215, 218, 185)) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 652, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack4 {
        int x = 471;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(new Color(215, 218, 185)) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 902, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
}