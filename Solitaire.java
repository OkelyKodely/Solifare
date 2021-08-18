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
            //
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

        Clicker m[] = new Clicker[28];

        public void mouseDragged(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public ClickSystem() {
            m[0] = new Clicker(200, 100, stack1);

            m[1] = new Clicker(400, 100, stack2);
            m[2] = new Clicker(400, 130, stack2);

            m[3] = new Clicker(500, 100, stack3);
            m[4] = new Clicker(500, 130, stack3);
            m[5] = new Clicker(500, 160, stack3);

            m[6] = new Clicker(600, 100, stack4);
            m[7] = new Clicker(600, 130, stack4);
            m[8] = new Clicker(600, 160, stack4);
            m[9] = new Clicker(600, 190, stack4);

            m[10] = new Clicker(700, 100, stack5);
            m[11] = new Clicker(700, 130, stack5);
            m[12] = new Clicker(700, 160, stack5);
            m[13] = new Clicker(700, 190, stack5);
            m[14] = new Clicker(700, 100, stack5);

            m[15] = new Clicker(800, 130, stack6);
            m[16] = new Clicker(800, 160, stack6);
            m[17] = new Clicker(800, 190, stack6);
            m[18] = new Clicker(800, 130, stack6);
            m[19] = new Clicker(800, 160, stack6);
            m[20] = new Clicker(800, 190, stack6);

            m[21] = new Clicker(900, 130, stack7);
            m[22] = new Clicker(900, 160, stack7);
            m[23] = new Clicker(900, 190, stack7);
            m[24] = new Clicker(900, 130, stack7);
            m[25] = new Clicker(900, 160, stack7);
            m[26] = new Clicker(900, 190, stack7);
            m[27] = new Clicker(900, 220, stack7);
        }
        
        class Clicker {
            int x, y;
            long width = 60; long height = 30;
            ArrayList<Card> stack;
            MouseEvent e;
            GroupCards gc = new GroupCards();
            class GroupCards {
                MouseEvent e;
                ArrayList<Card> kards = new ArrayList<>();
                public String getCondition() {
                    if(isRegioned(this.e)) {
                        return "NOT TO MOVE CARDS";
                    }
                    else {
                        return "MOVE~";
                    }
                }
                public ArrayList<Card> getCards() {
                    return this.kards;
                }
            }
            public Clicker(int x, int y, ArrayList<Card> stack) {
                this.x = x;
                this.y = y;
                this.stack = stack;
            }
            public String getCanonicalName() {
                return this.stack.getClass().getCanonicalName();
            }
            public GroupCards getGroupCards() {
                this.gc = new GroupCards();
                this.gc.e = this.e;
                if(this.gc.getCondition().equals("MOVE~")) {
                    int x = this.gc.e.getX();
                    int y = this.gc.e.getY();
                    this.fillGroupCards(x,y);
                }
                return this.gc;
            }
            public void setGroupCards() {
                this.gc = new GroupCards();
                this.gc.e = this.e;
                if(this.gc.getCondition().equals("MOVE~")) {
                    int x = this.gc.e.getX();
                    int y = this.gc.e.getY();
                    this.fillStackCards(x,y);
                }
            }
            public void fillGroupCards(int x, int y) {
                if(x == 200 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack1.remove(0));
                }
                else if(x == 300 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack2.remove(0));
                    this.gc.kards.add(stack2.remove(1));
                }
                else if(x == 300 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack2.remove(1));
                }
                else if(x == 400 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack3.remove(0));
                    this.gc.kards.add(stack3.remove(1));
                    this.gc.kards.add(stack3.remove(2));
                }
                else if(x == 400 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack3.remove(1));
                    this.gc.kards.add(stack3.remove(2));
                }
                else if(x == 400 && y >= 160 && y <= 190) {
                    this.gc.kards.add(stack3.remove(2));
                }
                else if(x == 500 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack4.remove(0));
                    this.gc.kards.add(stack4.remove(1));
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack4.remove(1));
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 160 && y <= 190) {
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 600 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack5.remove(0));
                    this.gc.kards.add(stack5.remove(1));
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack5.remove(1));
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 160 && y <= 190) {
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack5.remove(4));
                }
            }
            public void fillStackCards(int x, int y) {
                if(x == 200 && y >= 100 && y <= 130) {
                    for(int i=0; i<this.gc.kards.size(); i++) {
                        stack1.add(this.gc.kards.remove(i));
                    }
                }
                else if(x == 300 && y >= 100 && y <= 130) {
                    if(stack2.size() == 1 || stack2.size() == 0) {
                        for(int i=0; i<this.gc.kards.size(); i++) {
                            stack2.add(this.gc.kards.remove(i));
                        }
                    }
                    else if(stack2.size() == 2) {
                        for(int i=0; i<this.gc.kards.size(); i++) {
                            stack2.add(1, this.gc.kards.remove(i));
                        }
                    }
                }
                else if(x == 300 && y >= 130 && y <= 160) {
                    for(int i=0; i<this.gc.kards.size(); i++) {
                        stack2.add(this.gc.kards.remove(i));
                    }
                }
                else if(x == 400 && y >= 100 && y <= 130) {
                    if()
                    this.gc.kards.add(stack3.remove(0));
                    this.gc.kards.add(stack3.remove(1));
                    this.gc.kards.add(stack3.remove(2));
                }
                else if(x == 400 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack3.remove(1));
                    this.gc.kards.add(stack3.remove(2));
                }
                else if(x == 400 && y >= 160 && y <= 190) {
                    for(int i=0; i<this.gc.kards.size(); i++) {
                        stack3.add(this.gc.kards.remove(i));
                    }
                }
                else if(x == 500 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack4.remove(0));
                    this.gc.kards.add(stack4.remove(1));
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack4.remove(1));
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 160 && y <= 190) {
                    this.gc.kards.add(stack4.remove(2));
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 500 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack4.remove(3));
                }
                else if(x == 600 && y >= 100 && y <= 130) {
                    this.gc.kards.add(stack5.remove(0));
                    this.gc.kards.add(stack5.remove(1));
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 130 && y <= 160) {
                    this.gc.kards.add(stack5.remove(1));
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 160 && y <= 190) {
                    this.gc.kards.add(stack5.remove(2));
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack5.remove(3));
                    this.gc.kards.add(stack5.remove(4));
                }
                else if(x == 600 && y >= 190 && y <= 220) {
                    this.gc.kards.add(stack5.remove(4));
                }
            }
            public boolean isRegioned(MouseEvent e) {
                if(e == null) {
                    return false ;
                }
                if(e.getX() >= this.x && e.getX() <= this.x + this.width &&
                    e.getY() >= this.y && e.getY() <= this.y + this.height) {
                    this.e = e;
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
    
    ArrayList<Card> stack1 = new ArrayList<>();
    ArrayList<Card> stack2 = new ArrayList<>();
    ArrayList<Card> stack3 = new ArrayList<>();
    ArrayList<Card> stack4 = new ArrayList<>();
    ArrayList<Card> stack5 = new ArrayList<>();
    ArrayList<Card> stack6 = new ArrayList<>();
    ArrayList<Card> stack7 = new ArrayList<>();
    
    public void deal() {

        ArrayList<Card> c = cas.crs;
        System.out.println(c.size());
        int count = 1;
        ArrayList<Card> controller = new ArrayList<>();
        if(c.size() == 28 || 12 == 12)
            for(int i=24; i<c.size(); i++) {
                if(count == 1) {
                    controller = stack1;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 200+126;
                    int y = 100;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 2 && count <= 3) {
                    controller = stack2;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 300+126;
                    int y = 100;
                    if(count > 2)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 4 && count <= 6) {
                    controller = stack3;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 400+126;
                    int y = 100;
                    if(count > 4)
                        y = y + 30;
                    if(count > 5)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 7 && count <= 10) {
                    controller = stack4;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 500+126;
                    int y = 100;
                    if(count > 7)
                        y = y + 30;
                    if(count > 8)
                        y = y + 30;
                    if(count > 9)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 11 && count <= 15) {
                    controller = stack5;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 600+126;
                    int y = 100;
                    if(count > 11)
                        y = y + 30;
                    if(count > 12)
                        y = y + 30;
                    if(count > 13)
                        y = y + 30;
                    if(count > 14)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 16 && count <= 21) {
                    controller = stack6;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 700+126;
                    int y = 100;
                    if(count > 16)
                        y = y + 30;
                    if(count > 17)
                        y = y + 30;
                    if(count > 18)
                        y = y + 30;
                    if(count > 19)
                        y = y + 30;
                    if(count > 20)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 22 && count <= 28) {
                    controller = stack7;
                    Card cd = c.get(i);
                    controller.add(cd);
                    int x = 800+126;
                    int y = 100;
                    if(count > 22)
                        y = y + 30;
                    if(count > 23)
                        y = y + 30;
                    if(count > 24)
                        y = y + 30;
                    if(count > 25)
                        y = y + 30;
                    if(count > 26)
                        y = y + 30;
                    if(count > 27)
                        y = y + 30;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
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