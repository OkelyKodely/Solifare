import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


// author - Daniel Cho

// www.github.com/okelykodely

public class Solitaire {
    class Stacker {
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
            int x = 250;
            int y = 560;
            int width = 110;
            int height = 131;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
            }
        }
        class Stack2 {
            int x = 450;
            int y = 560;
            int width = 110;
            int height = 131;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
            }
        }
        class Stack3 {
            int x = 650;
            int y = 560;
            int width = 110;
            int height = 131;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
            }
        }
        class Stack4 {
            int x = 850;
            int y = 560;
            int width = 110;
            int height = 131;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
            }
        }
    }
    
    class ClickSystem implements MouseMotionListener, MouseListener {
        @Override
        public void mouseClicked(MouseEvent me) {
            ///
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        Clicker me1 = new Clicker(300, 100);
        
        Clicker me2 = new Clicker(400, 100);
        Clicker me3 = new Clicker(400, 130);

        public void mouseDragged(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public ClickSystem() {

        }
        
        class Clicker {
            int x, y;
            MouseEvent e = null;
            long width = 60; long height = 120;
            public void setEvent(MouseEvent e){
                this.e = e;
            }
            public Clicker(int x, int y) {
                this.x = x;
                this.y = y;
            }
            public boolean isRegioned(int xsource, int ysource) {
                if(xsource >= this.x && xsource <= this.x + this.width &&
                    ysource >= this.y && ysource <= this.y + this.height) {
                    return true;
                }
                return false;
            }
        }
    }    
    
    ClickSystem clocker =null;// new Clicker();///Clockernew();;

    boolean play = true;

    Stacker stacker = new Stacker();
    Logo logo = new Logo();
    
    int cursorForPlayCards = 1; // first card on play-cards;
    
    Cards cas = new Cards();
    ArrayList<Card> shuffledDeck;
    ArrayList<Card> cards = new ArrayList<>();
    
    
    JFrame jframe = new JFrame("Solitaire");
    JPanel jpanel = new JPanel();
    
    Graphics gr = null;

    class Cards {
        ArrayList<Card> cars = new ArrayList<>();
        ArrayList<Card> crs = new ArrayList<>();
        public Card getCardByNumberAndSuit(int number , int suit) {
            for(int i=0; i<cars.size(); i++) {
                if(cars.get(i).number == number &&
                        cars.get(i).suit == suit) {
                    Card cd = cars.get(i);
                    return cd;
                }
            }
            return null;
        }
        public void draw_All_TopOfStack() {
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                gr.drawImage(potImg, 90, 90, null);
            } catch(Exception e) {}
            for(int i=0; i<cars.size(); i++) {
                cars.get(i).drawTopOfStack();
            }
        }
        public Card getCardByID(int id) {
            for(int i=0; i<cars.size(); i++) {
                if(cars.get(i).id == id) {
                    Card cd = cars.get(i);
                    return cd;
                }
            }
            return null;
        }
    }
    
    public void deal() {

        ArrayList<Card> c = cas.crs;
        int y = 100;
        {
        Card cd = c.get(cursorForPlayCards-1);
        int x = 200+126;
        System.out.println(cd.number + " " + cd.suit);
        cd.drawCardAtLocation(x, y);
        }
        
        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 300+126;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }

        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 400+126;
         y = 100;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }

        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 500+126;
         y = 100;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }

        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 600+126;
         y = 100;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }

        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 700+126;
         y = 100;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }

        {
        cursorForPlayCards++;
        Card cd = c.get(cursorForPlayCards-1);
        int x = 800+126;
         y = 100;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        cursorForPlayCards++;
        cd = c.get(cursorForPlayCards-1);
        y = y + 24;
        cd.drawCardAtLocation(x, y);
        }
    }
    
    class Logo {
        int x = 297, y = 375;
        public void drawLogoMiddle() {
            try {
                Image ima = ImageIO.read(this.getClass().getResource("logo.png"));
                gr.drawImage(ima, x, y, 460, 84, null);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    class Card {
        
        int id;
        int x;
        int y;
        int suit;
        int number;
        
        Image image1_1;
        Image image2_1;
        Image image3_1;
        Image image4_1;

        Image image1_2;
        Image image2_2;
        Image image3_2;
        Image image4_2;

        Image image1_3;
        Image image2_3;
        Image image3_3;
        Image image4_3;

        Image image1_4;
        Image image2_4;
        Image image3_4;
        Image image4_4;

        Image image1_5;
        Image image2_5;
        Image image3_5;
        Image image4_5;

        Image image1_6;
        Image image2_6;
        Image image3_6;
        Image image4_6;

        Image image1_7;
        Image image2_7;
        Image image3_7;
        Image image4_7;

        Image image1_8;
        Image image2_8;
        Image image3_8;
        Image image4_8;

        Image image1_9;
        Image image2_9;
        Image image3_9;
        Image image4_9;

        Image image1_10;
        Image image2_10;
        Image image3_10;
        Image image4_10;

        Image image1_11;
        Image image2_11;
        Image image3_11;
        Image image4_11;

        Image image1_12;
        Image image2_12;
        Image image3_12;
        Image image4_12;

        Image image1_13;
        Image image2_13;
        Image image3_13;
        Image image4_13;

        Card() {
            try {
                image1_1 = ImageIO.read(this.getClass().getResource("1-1.png"));
                image2_1 = ImageIO.read(this.getClass().getResource("2-1.png"));
                image3_1 = ImageIO.read(this.getClass().getResource("3-1.png"));
                image4_1 = ImageIO.read(this.getClass().getResource("4-1.png"));
                
                image1_2 = ImageIO.read(this.getClass().getResource("1-2.png"));
                image2_2 = ImageIO.read(this.getClass().getResource("2-2.png"));
                image3_2 = ImageIO.read(this.getClass().getResource("3-2.png"));
                image4_2 = ImageIO.read(this.getClass().getResource("4-2.png"));

                image1_3 = ImageIO.read(this.getClass().getResource("1-3.png"));
                image2_3 = ImageIO.read(this.getClass().getResource("2-3.png"));
                image3_3 = ImageIO.read(this.getClass().getResource("3-3.png"));
                image4_3 = ImageIO.read(this.getClass().getResource("4-3.png"));

                image1_4 = ImageIO.read(this.getClass().getResource("1-4.png"));
                image2_4 = ImageIO.read(this.getClass().getResource("2-4.png"));
                image3_4 = ImageIO.read(this.getClass().getResource("3-4.png"));
                image4_4 = ImageIO.read(this.getClass().getResource("4-4.png"));

                image1_5 = ImageIO.read(this.getClass().getResource("1-5.png"));
                image2_5 = ImageIO.read(this.getClass().getResource("2-5.png"));
                image3_5 = ImageIO.read(this.getClass().getResource("3-5.png"));
                image4_5 = ImageIO.read(this.getClass().getResource("4-5.png"));

                image1_6 = ImageIO.read(this.getClass().getResource("1-6.png"));
                image2_6 = ImageIO.read(this.getClass().getResource("2-6.png"));
                image3_6 = ImageIO.read(this.getClass().getResource("3-6.png"));
                image4_6 = ImageIO.read(this.getClass().getResource("4-6.png"));

                image1_7 = ImageIO.read(this.getClass().getResource("1-7.png"));
                image2_7 = ImageIO.read(this.getClass().getResource("2-7.png"));
                image3_7 = ImageIO.read(this.getClass().getResource("3-7.png"));
                image4_7 = ImageIO.read(this.getClass().getResource("4-7.png"));

                image1_8 = ImageIO.read(this.getClass().getResource("1-8.png"));
                image2_8 = ImageIO.read(this.getClass().getResource("2-8.png"));
                image3_8 = ImageIO.read(this.getClass().getResource("3-8.png"));
                image4_8 = ImageIO.read(this.getClass().getResource("4-8.png"));

                image1_9 = ImageIO.read(this.getClass().getResource("1-9.png"));
                image2_9 = ImageIO.read(this.getClass().getResource("2-9.png"));
                image3_9 = ImageIO.read(this.getClass().getResource("3-9.png"));
                image4_9 = ImageIO.read(this.getClass().getResource("4-9.png"));

                image1_10 = ImageIO.read(this.getClass().getResource("1-10.png"));
                image2_10 = ImageIO.read(this.getClass().getResource("2-10.png"));
                image3_10 = ImageIO.read(this.getClass().getResource("3-10.png"));
                image4_10 = ImageIO.read(this.getClass().getResource("4-10.png"));

                image1_11 = ImageIO.read(this.getClass().getResource("1-11.png"));
                image2_11 = ImageIO.read(this.getClass().getResource("2-11.png"));
                image3_11 = ImageIO.read(this.getClass().getResource("3-11.png"));
                image4_11 = ImageIO.read(this.getClass().getResource("4-11.png"));

                image1_12 = ImageIO.read(this.getClass().getResource("1-12.png"));
                image2_12 = ImageIO.read(this.getClass().getResource("2-12.png"));
                image3_12 = ImageIO.read(this.getClass().getResource("3-12.png"));
                image4_12 = ImageIO.read(this.getClass().getResource("4-12.png"));

                image1_13 = ImageIO.read(this.getClass().getResource("1-13.png"));
                image2_13 = ImageIO.read(this.getClass().getResource("2-13.png"));
                image3_13 = ImageIO.read(this.getClass().getResource("3-13.png"));
                image4_13 = ImageIO.read(this.getClass().getResource("4-13.png"));
            } catch(Exception e) {}
        }
        public void drawTopOfStack() {
            x = 100;
            y = 100;
            switch(number) {
                case 1:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_1, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_1, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_1, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_1, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 2:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_2, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_2, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_2, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_2, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 3:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_3, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_3, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_3, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_3, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 4:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_4, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_4, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_4, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_4, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 5:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_5, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_5, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_5, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_5, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 6:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_6, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_6, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_6, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_6, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 7:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_7, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_7, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_7, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_7, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 8:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_8, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_8, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_8, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_8, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 9:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_9, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_9, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_9, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_9, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 10:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_10, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_10, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_10, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_10, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 11:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_11, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_11, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_11, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_11, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 12:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_12, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_12, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_12, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_12, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 13:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_13, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_13, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_13, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_13, x, y, 60, 120, null);
                            break;
                    }
                    break;
            }
        }
    
        public void drawCardAtLocation(int x, int  y) {
            System.out.println(number + ", " + suit);
            switch(number) {
                case 1:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_1, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_1, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_1, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_1, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 2:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_2, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_2, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_2, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_2, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 3:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_3, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_3, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_3, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_3, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 4:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_4, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_4, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_4, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_4, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 5:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_5, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_5, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_5, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_5, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 6:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_6, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_6, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_6, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_6, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 7:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_7, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_7, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_7, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_7, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 8:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_8, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_8, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_8, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_8, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 9:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_9, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_9, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_9, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_9, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 10:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_10, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_10, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_10, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_10, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 11:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_11, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_11, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_11, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_11, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 12:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_12, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_12, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_12, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_12, x, y, 60, 120, null);
                            break;
                    }
                    break;
                case 13:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_13, x, y, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_13, x, y, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_13, x, y, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_13, x, y, 60, 120, null);
                            break;
                    }
                    break;
            }
        }
    }

    Solitaire() {
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);
        
        jframe.setBounds(0, 0, 1070, 800);
        jpanel.setBounds(0, 0, 1070, 800);
        
        jframe.add(jpanel);
        jpanel.setBackground(new Color(63, 197, 111));
        
        jframe.setVisible(true);
        
        gr = jpanel.getGraphics();
        
        initCards();
        
        startGameplay();        
    }
    
    void initCards() {
        int DECK_SIZE = 52;

        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }
        
        int id = 0;
        ArrayList<Card> c = new ArrayList<Card>();
        for(int j=0; j<4; j++) {
            for(int i=0; i<13; i++) {
                Card cd = new Card();
                if(j == 0)
                    cd.suit = 1;
                else if(j == 1)
                    cd.suit = 2;
                else if(j == 2)
                    cd.suit = 3;
                else if(j == 3)
                    cd.suit = 4;
                cd.number = i+1;
                cd.id = id;
                cas.cars.add(cd);
                id++;
            }
        }
            
        shuffledDeck = new ArrayList<Card>();

        while (deck.size() > 0) {
            int index = (int) (Math.random() * deck.size());
            int v = deck.remove(index);
            Card cc = cas.getCardByID(v);
            shuffledDeck.add(cc);
        } 
        cas.cars = shuffledDeck;
        
        for(int i=24; i<52; i++) {
            cas.crs.add(cas.cars.get(i));
        }
        
        for(int i=24; i<52; i++) {
            try {
                cas.cars.remove(cas.cars.get(i));
            } catch(Exception e) {
                
            }
        }
    }
    
    void startGameplay() {
        Thread thr = new Thread() {
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                        logo.drawLogoMiddle();
                        cas.draw_All_TopOfStack();   
                        stacker.executeDrawing();
                        if(play) {
                            play = false;
                            cursorForPlayCards = 1;
                            
                            initCards(); // alsoShuffles , also.
                      
                            
                        }
                        cursorForPlayCards = 1;
                        deal();
                        jframe.requestFocus();
                    } catch(Exception e) {}
                }
            }
        };
        thr.start();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Solitaire solitaire = new Solitaire();
                }
            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}