import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// Author - Daniel Cho
// www.github.com/okelykodely

public class Solitaire {

    boolean play = true;
    Stacker stacker = new Stacker();
    Logo logo = new Logo();
    
    Cards cas = new Cards();
    ArrayList<Card> shuffledDeck;
    ArrayList<Card> cards = new ArrayList<>();
    
    JFrame jframe = new JFrame("Solitaire");
    JPanel jpanel = new JPanel();
    
    Graphics gr = null;

    ArrayList<Card> stack1 = new ArrayList<>();
    ArrayList<Card> stack2 = new ArrayList<>();
    ArrayList<Card> stack3 = new ArrayList<>();
    ArrayList<Card> stack4 = new ArrayList<>();
    ArrayList<Card> stack5 = new ArrayList<>();
    ArrayList<Card> stack6 = new ArrayList<>();
    ArrayList<Card> stack7 = new ArrayList<>();

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
            int width = 105;
            int height = 151;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
                try {
                    Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                    gr.drawImage(potImg, 251, 561, 80, 80, null);
                } catch(Exception e) {}
            }
        }
        class Stack2 {
            int x = 450;
            int y = 560;
            int width = 105;
            int height = 151;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
                try {
                    Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                    gr.drawImage(potImg, 451, 561, 80, 80, null);
                } catch(Exception e) {}
            }
        }
        class Stack3 {
            int x = 650;
            int y = 560;
            int width = 105;
            int height = 151;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
                try {
                    Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                    gr.drawImage(potImg, 651, 561, 80, 80, null);
                } catch(Exception e) {}
            }
        }
        class Stack4 {
            int x = 850;
            int y = 560;
            int width = 105;
            int height = 151;
            public void drawIt() {
                gr.setColor(Color.WHITE) ;
                gr.drawRect(x, y, width, height);
                try {
                    Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                    gr.drawImage(potImg, 851, 561, 80, 80, null);
                } catch(Exception e) {}
            }
        }
    }
    
    class ClickSystem implements MouseMotionListener, MouseListener {

        Clicker m[] = new Clicker[28];
        boolean tr = false;
        int cunt;
        int currentcunt;
        String pressed = "";
        int pressed_id;
        int pressed_two;
        int pressed_xx;
        int pressed_yy;

        public void mouseClicked(MouseEvent me) {
        }

        public void mousePressed(MouseEvent me) {
            tr = true;
            cunt++;
        }

        public void mouseReleased(MouseEvent me) {
            tr = false;
            pressed = "";
            pressed_id=0;
            pressed_two=0;
            pressed_xx=0;
            pressed_yy = 0;
            for(int j=0; j<m.length; j++) {
                int xx = m[j].x;
                int yy = m[j].y;
                if(xx >= 0 + 200 && xx <= 0 + 200 + 60) {
                    m[j].name = "stack1";
                    m[j].name1 = "stack1";
                }
                if(xx >= 100 + 200 && xx <= 100 + 200 + 60) {
                    m[j].name = "stack2";
                    m[j].name1 = "stack2";
                }
                if(xx >= 200 + 200 && xx <= 200 + 200 + 60) {
                    m[j].name = "stack3";
                    m[j].name1 = "stack3";
                }
                if(xx >= 300 + 200 && xx <= 300 + 200 + 60) {
                    m[j].name = "stack4";
                    m[j].name1 = "stack4";
                }
                if(xx >= 400 + 200 && xx <= 400 + 200 + 60) {
                    m[j].name = "stack5";
                    m[j].name1 = "stack5";
                }
                if(xx >= 500 + 200 && xx <= 500 + 200 + 60) {
                    m[j].name = "stack6";
                    m[j].name1 = "stack6";
                }
                if(xx >= 600 + 200 && xx <= 600 + 200 + 60) {
                    m[j].name = "stack7";
                    m[j].name1 = "stack7";
                }
            }
        }

        public void mouseEntered(MouseEvent me) {
        }

        public void mouseExited(MouseEvent me) {
        }

        public void mouseMoved(MouseEvent me) {
        }

        private void drawStackCards() {
            for(int ii=0; ii<stack1.size(); ii++) {
                stack1.get(ii).drawCardAtLocation(stack1.get(ii).x, stack1.get(ii).y);
            }
            for(int ii=0; ii<stack2.size(); ii++) {
                stack2.get(ii).drawCardAtLocation(stack2.get(ii).x, stack2.get(ii).y);
            }
            for(int ii=0; ii<stack3.size(); ii++) {
                stack3.get(ii).drawCardAtLocation(stack3.get(ii).x, stack3.get(ii).y);
            }
            for(int ii=0; ii<stack4.size(); ii++) {
                stack4.get(ii).drawCardAtLocation(stack4.get(ii).x, stack4.get(ii).y);
            }
            for(int ii=0; ii<stack5.size(); ii++) {
                stack5.get(ii).drawCardAtLocation(stack5.get(ii).x, stack5.get(ii).y);
            }
            for(int ii=0; ii<stack6.size(); ii++) {
                stack6.get(ii).drawCardAtLocation(stack6.get(ii).x, stack6.get(ii).y);
            }
            for(int ii=0; ii<stack7.size(); ii++) {
                System.out.println("ii: " + ii + "--" + stack7.get(ii).x + "===" + stack7.get(ii).y);
                stack7.get(ii).drawCardAtLocation(stack7.get(ii).x, stack7.get(ii).y);
            }
            System.out.println(stack7.size() + " sevensize..");
        }
        
        public void mouseDragged(MouseEvent me) {
            if(!tr)
                return;
            gr.setColor(new Color(123, 197, 31));
            gr.fillRect(0, 0, 1070, 800);
            logo.drawLogoMiddle();
            cas.draw_All_TopOfStack();
            drawStackCards();
            boolean safe = false;
            cunt++;
            if(cunt == currentcunt + 1) {
                currentcunt = cunt;
                safe = true;
            }
            for(int i=0; i<m.length; i++) {
                if(m[i].isRegioned(me)) {
                    Clicker.GroupCards gc = null;//m[i].getGroupCards(m[i].getCanonicalName());
                    if(!safe && !m[i].getSetName().equals("")) {
                        for(int j=0; j<m.length; j++) {
                            m[j].name = m[i].getSetName();
                            m[j].name1= m[i].getSetName();
                        }
                    }
                    if(m[i].getCanonicalName().equals("stack1") || m[i].getSetName().equals("stack1")) {
                        gc = m[i].getGroupCards("stack1");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack1";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack2") || m[i].getSetName().equals("stack2")) {
                        gc = m[i].getGroupCards("stack2");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack2";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack3") || m[i].getSetName().equals("stack3")) {
                        gc = m[i].getGroupCards("stack3");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack3";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack4") || m[i].getSetName().equals("stack4")) {
                        gc = m[i].getGroupCards("stack4");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack4";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack5") || m[i].getSetName().equals("stack5")) {
                        gc = m[i].getGroupCards("stack5");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack5";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack6") || m[i].getSetName().equals("stack6")) {
                        gc = m[i].getGroupCards("stack6");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack6";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                    else if(m[i].getCanonicalName().equals("stack7") || m[i].getSetName().equals("stack7")) {
                        gc = m[i].getGroupCards("stack7");
                        for(int j=0; j<m.length; j++) {
                            m[j].name1 = "stack7";
                        }
                        ArrayList<Card> stack = gc.getCards();
                        for(int ii=0; ii<stack.size(); ii++) {
                            System.out.println(stack.get(ii).x + ", " + stack.get(ii).y);
                            stack.get(ii).drawCardAtLocation(stack.get(ii).x, stack.get(ii).y);
                        }
                    }
                }
            }
        }

        public ClickSystem() {
            
            m[0] = new Clicker(200, 100, stack1, "stack1");

            m[1] = new Clicker(300, 100, stack2, "stack2");
            m[2] = new Clicker(300, 130, stack2, "stack2");

            m[3] = new Clicker(400, 100, stack3, "stack3");
            m[4] = new Clicker(400, 130, stack3, "stack3");
            m[5] = new Clicker(400, 160, stack3, "stack3");

            m[6] = new Clicker(500, 100, stack4, "stack4");
            m[7] = new Clicker(500, 130, stack4, "stack4");
            m[8] = new Clicker(500, 160, stack4, "stack4");
            m[9] = new Clicker(500, 190, stack4, "stack4");

            m[10] = new Clicker(600, 100, stack5, "stack5");
            m[11] = new Clicker(600, 130, stack5, "stack5");
            m[12] = new Clicker(600, 160, stack5, "stack5");
            m[13] = new Clicker(600, 190, stack5, "stack5");
            m[14] = new Clicker(600, 220, stack5, "stack5");

            m[15] = new Clicker(700, 100, stack6, "stack6");
            m[16] = new Clicker(700, 130, stack6, "stack6");
            m[17] = new Clicker(700, 160, stack6, "stack6");
            m[18] = new Clicker(700, 190, stack6, "stack6");
            m[19] = new Clicker(700, 220, stack6, "stack6");
            m[20] = new Clicker(700, 250, stack6, "stack6");

            m[21] = new Clicker(800, 100, stack7, "stack7");
            m[22] = new Clicker(800, 130, stack7, "stack7");
            m[23] = new Clicker(800, 160, stack7, "stack7");
            m[24] = new Clicker(800, 190, stack7, "stack7");
            m[25] = new Clicker(800, 220, stack7, "stack7");
            m[26] = new Clicker(800, 250, stack7, "stack7");
            m[27] = new Clicker(800, 280, stack7, "stack7");
        }
        
        class Clicker {
            
            int x;
            int y;
            long width = 60;
            long height = 30;
            ArrayList<Card> kards = new ArrayList<>();
            String name;
            String name1;
            MouseEvent e;
            GroupCards gc = new GroupCards();
            int countt;
            
            class GroupCards {
                MouseEvent e;
                public ArrayList<Card> getCards() {
                    return kards;
                }
            }
            public Clicker(int x, int y, ArrayList<Card> stack, String stackString) {
                this.name1 = "";
                this.x = x;
                this.y = y;
                this.name = stackString;
            }
            public String getCanonicalName() {
                return this.name;
            }
            public String getSetName() {
                return this.name1;
            }
            public GroupCards getGroupCards(String stackName) {
                this.gc.e = this.e;
                int xx = this.gc.e.getX();
                int yy = this.gc.e.getY();

                int id = 0;

                if(xx >= 0 + 200 && xx <= 0 + 200 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                    id = 2;
                }
                else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                    id = 2;
                }
                else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                    id = 3;
                }
                else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                    id = 2;
                }
                else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                    id = 3;
                }
                else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                    id = 4;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                    id = 2;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                    id = 3;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                    id = 4;
                }
                else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                    id = 5;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                    id = 0;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                    id = 1;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                    id = 2;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                    id = 3;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                    id = 4;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                    id = 5;
                }
                else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 280 && yy <= 0 + 310) {
                    id = 6;
                }

                if(pressed.equals("")) {
                    pressed = stackName;
                    pressed_id = id;
                    pressed_xx = xx;
                    pressed_yy = yy;
                    if(pressed == "stack1") {
                        pressed_two = 1;
                    }
                    if(pressed == "stack2") {
                        pressed_two = 2;
                    }
                    if(pressed == "stack3") {
                        pressed_two = 3;
                    }
                    if(pressed == "stack4") {
                        pressed_two = 4;
                    }
                    if(pressed == "stack5") {
                        pressed_two = 5;
                    }
                    if(pressed == "stack6") {
                        pressed_two = 6;
                    }
                    if(pressed == "stack7") {
                        pressed_two = 7;
                    }
                }

                if(pressed.equals("stack1"))
                    this.fillGroupCards(stack1, 1, pressed_id, xx, yy);
                else if(pressed.equals("stack2"))
                    this.fillGroupCards(stack2, 2, pressed_id, xx, yy);
                else if(pressed.equals("stack3"))
                    this.fillGroupCards(stack3, 3, pressed_id, xx, yy);
                else if(pressed.equals("stack4"))
                    this.fillGroupCards(stack4, 4, pressed_id, xx, yy);
                else if(pressed.equals("stack5"))
                    this.fillGroupCards(stack5, 5, pressed_id, xx, yy);
                else if(pressed.equals("stack6"))
                    this.fillGroupCards(stack6, 6, pressed_id, xx, yy);
                else if(pressed.equals("stack7"))
                    this.fillGroupCards(stack7, 7, pressed_id, xx, yy);

                return this.gc;
            }
            public void setGroupCards() {
                this.gc.e = this.e;
                int x = this.gc.e.getX();
                int y = this.gc.e.getY();
                this.fillStackCards(x,y);
            }
            public void fillGroupCards(ArrayList<Card> stck, int stackPos, int id, int xx, int yy) {
                this.kards.clear();
                if(stackPos == 1 || pressed.equals("stack1")) {
                    for(int i=0; i<stack1.size(); i++) {
                        if(id <= i) {
                            stack1.get(i).x = xx;
                            stack1.get(i).y = yy;
                            if(i!=id)
                                stack1.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(!(kards.get(a).suit == stack1.get(a).suit &&
                                        kards.get(a).number == stack1.get(a).number)) {
                                    this.kards.add(stack1.get(i));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack1.get(a).suit &&
                                        kards.get(a).number == stack1.get(a).number) {
                                    stack1.remove(kards.get(a));
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 2 || pressed.equals("stack2")) {
                    for(int i=0; i<stack2.size(); i++) {
                        if(id <= i) {
                            stack2.get(i).x = xx;
                            stack2.get(i).y = yy;
                            if(i!=id)
                                stack2.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack2.get(a).suit &&
                                        kards.get(a).number == stack2.get(a).number) {

                                } else {
                                    this.kards.add(stack2.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack2.get(a).suit &&
                                        kards.get(a).number == stack2.get(a).number) {
                                    stack2.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 3 || pressed.equals("stack3")) {
                    for(int i=0; i<stack3.size(); i++) {
                        if(id <= i) {
                            stack3.get(i).x = xx;
                            stack3.get(i).y = yy;
                            if(i!=id)
                                stack3.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack3.get(a).suit &&
                                        kards.get(a).number == stack3.get(a).number) {

                                } else {
                                    this.kards.add(stack3.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack3.get(a).suit &&
                                        kards.get(a).number == stack3.get(a).number) {
                                    stack3.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 4 || pressed.equals("stack4")) {
                    for(int i=0; i<stack4.size(); i++) {
                        if(id <= i) {
                            stack4.get(i).x = xx;
                            stack4.get(i).y = yy;
                            if(i!=id)
                                stack4.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack4.get(a).suit &&
                                        kards.get(a).number == stack4.get(a).number) {

                                } else {
                                    this.kards.add(stack4.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack4.get(a).suit &&
                                        kards.get(a).number == stack4.get(a).number) {
                                    stack4.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 5 || pressed.equals("stack5")) {
                    for(int i=0; i<stack5.size(); i++) {
                        if(id <= i) {
                            stack5.get(i).x = xx;
                            stack5.get(i).y = yy;
                            if(i!=id)
                                stack5.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack5.get(a).suit &&
                                        kards.get(a).number == stack5.get(a).number) {

                                } else {
                                    this.kards.add(stack5.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack5.get(a).suit &&
                                        kards.get(a).number == stack5.get(a).number) {
                                    stack5.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 6 || pressed.equals("stack6")) {
                    for(int i=0; i<stack6.size(); i++) {
                        if(id <= i) {
                            stack6.get(i).x = xx;
                            stack6.get(i).y = yy;
                            if(i!=id)
                                stack6.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack6.get(a).suit &&
                                        kards.get(a).number == stack6.get(a).number) {

                                } else {
                                    this.kards.add(stack6.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack6.get(a).suit &&
                                        kards.get(a).number == stack6.get(a).number) {
                                    stack6.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
                else if(stackPos == 7 || pressed.equals("stack7")) {
                    for(int i=0; i<stack7.size(); i++) {
                        if(id <= i) {
                            stack7.get(i).x = xx;
                            stack7.get(i).y = yy;
                            if(i!=id)
                                stack7.get(i).y += 30;
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack7.get(a).suit &&
                                        kards.get(a).number == stack7.get(a).number) {

                                } else {
                                    this.kards.add(stack7.get(a));
                                }
                            }
                            for(int a=0; a<kards.size(); a++) {
                                if(kards.get(a).suit == stack7.get(a).suit &&
                                        kards.get(a).number == stack7.get(a).number) {
                                    stack7.remove(kards.get(a));
                                } else {
                                }
                            }
                        }
                    }
                }
            }
            public void fillStackCards(int x, int y) {
            }
            public boolean isRegioned(MouseEvent e) {
                if(e.getX() >= this.x && e.getX() <= this.x + this.width &&
                    e.getY() >= this.y && e.getY() <= this.y + this.height) {
                    this.e = e;
                    return true;
                }
                return false;
            }
        }
    }    
    
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
                gr.drawImage(potImg, 80, 85, null);
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
        stack1.clear();
        stack2.clear();
        stack3.clear();
        stack4.clear();
        stack5.clear();
        stack6.clear();
        stack7.clear();
        ArrayList<Card> c = cas.crs;
        System.out.println(c.size());
        int count = 1;
        ArrayList<Card> controller = new ArrayList<>();
        if(c.size() == 28 || 12 == 12)
            for(int i=24; i<c.size(); i++) {
                if(count == 1) {
                    controller = stack1;
                    Card cd = c.get(i);
                    stack1.add(cd);
                    int x = 200+0;
                    int y = 100;
                    cd.x = x;
                    cd.y = y;
                    count++;
                    cd.drawCardAtLocation(cd.x, cd.y);
                }
                else if(count >= 2 && count <= 3) {
                    controller = stack2;
                    Card cd = c.get(i);
                    stack2.add(cd);
                    int x = 300+0;
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
                    stack3.add(cd);
                    int x = 400+0;
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
                    stack4.add(cd);
                    int x = 500+0;
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
                    stack5.add(cd);
                    int x = 600+0;
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
                    stack6.add(cd);
                    int x = 700+0;
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
                    stack7.add(cd);
                    int x = 800+0;
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
        int x = 293, y = 425;
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
            switch(number) {
                case 1:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_1, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_1, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_1, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_1, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 2:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_2, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_2, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_2, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_2, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 3:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_3, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_3, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_3, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_3, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 4:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_4, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_4, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_4, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_4, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 5:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_5, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_5, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_5, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_5, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 6:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_6, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_6, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_6, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_6, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 7:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_7, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_7, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_7, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_7, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 8:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_8, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_8, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_8, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_8, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 9:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_9, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_9, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_9, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_9, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 10:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_10, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_10, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_10, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_10, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 11:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_11, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_11, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_11, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_11, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 12:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_12, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_12, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_12, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_12, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
                case 13:
                    switch(suit) {
                        case 1:
                            gr.drawImage(image1_13, 100, 100, 60, 120, null);
                            break;
                        case 2:
                            gr.drawImage(image2_13, 100, 100, 60, 120, null);
                            break;
                        case 3:
                            gr.drawImage(image3_13, 100, 100, 60, 120, null);
                            break;
                        case 4:
                            gr.drawImage(image4_13, 100, 100, 60, 120, null);
                            break;
                    }
                    break;
            }
        }
    
        public void drawCardAtLocation(int x, int  y) {
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
        jframe.setVisible(true);
        gr = jpanel.getGraphics();

        initCards();

        startGameplay();        
    }
    
    void initCards() {
 
        //cas.cars.clear();
 
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
 
        //cas.crs.clear();

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
        Solitaire.ClickSystem cs = new Solitaire.ClickSystem();
        jframe.addMouseMotionListener(cs);
        jframe.addMouseListener(cs);
        jpanel.setBackground(new Color(123, 197, 31));
        Thread t = new Thread() {
            public void run() {
                while(true) {
                    try {
                        ImageIcon i = new ImageIcon(getClass().getResource("loading-bar.gif"));
                        gr.drawImage(i.getImage(), 0, 0, 1070, 800, null);
                        Thread.sleep(100);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                    if(!play) {
                        return;
                    }
                }
            }
        };
        t.start();
        Thread thr = new Thread() {
            public void run() {
                while(true) {
                    try {
                        if(play) {
                            gr.setColor(new Color(123, 197, 31));
                            gr.fillRect(0, 0, 1070, 800);
                            initCards();
                            gr.setColor(new Color(123, 197, 31));
                            gr.fillRect(0, 0, 1070, 800);
                            deal();
                            gr.setColor(new Color(123, 197, 31));
                            gr.fillRect(0, 0, 1070, 800);
                            cs.drawStackCards();
                            play = false;
                        }
                        logo.drawLogoMiddle();
                        cas.draw_All_TopOfStack();   
                        stacker.executeDrawing();
                        Thread.sleep(1000);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
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
                    try {
                        Clip clip;
                        AudioInputStream audioInputStream;
                        audioInputStream =
                            AudioSystem.getAudioInputStream(
                                getClass().getResource("thre.wav"));
                        clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                    } catch(Exception e) {}
                    new Solitaire();
                }
            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}