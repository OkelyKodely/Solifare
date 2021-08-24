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
            Singleton.getInstance().gr.setColor(Color.WHITE) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            Singleton.getInstance().gr.drawLine(200, 75, 260, 75);
            Singleton.getInstance().gr.drawLine(300, 75, 360, 75);
            Singleton.getInstance().gr.drawLine(400, 75, 460, 75);
            Singleton.getInstance().gr.drawLine(500, 75, 560, 75);
            Singleton.getInstance().gr.drawLine(600, 75, 660, 75);
            Singleton.getInstance().gr.drawLine(700, 75, 760, 75);
            Singleton.getInstance().gr.drawLine(800, 75, 860, 75);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 52, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack2 {
        int x = 351;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(Color.WHITE) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 352, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack3 {
        int x = 651;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(Color.WHITE) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 652, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
    class Stack4 {
        int x = 901;
        int y = 660;
        int width = 105;
        int height = 151;
        public void drawIt() {
            Singleton.getInstance().gr.setColor(Color.WHITE) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 902, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
}