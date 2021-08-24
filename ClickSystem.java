/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import views.Logo;
import views.Stacker;
import data.Card;
import singleton.Singleton;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 *
 * @author d
 */
public class ClickSystem implements MouseMotionListener, MouseListener {

    Clicker m[] = new Clicker[28];
    ArrayList<Card> k = new ArrayList<>();
    boolean tr = false;
    int rt;
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
        rt = 0;

        int id = 0;
        String stackn = "stac1";
        {
            int xx = me.getX();
            int yy = me.getY();

            if(xx >= 0 + 200 && xx <= 0 + 200 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack1";
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack2";
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack2";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack3";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack3";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack3";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack4";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack4";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack4";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack4";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack5";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack5";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack5";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack5";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack5";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack6";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack6";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack6";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack6";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack6";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 5;
                stackn = "stack6";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 5;
                stackn = "stack7";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 280 && yy <= 0 + 310) {
                id = 6;
                stackn = "stack7";
            }
        }

        System.out.println("sss:"+Singleton.getInstance().ka.size());

        if(Singleton.getInstance().ka != null)
        {
            int yay = 100;
            boolean ay = false;
            for(int i=0; i<Singleton.getInstance().ka.size(); i++)
            {
                if(stackn.equals("stack1")) {
                    if(Singleton.getInstance().stack1.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 200;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack2")) {
                    if(Singleton.getInstance().stack2.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 300;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack3")) {
                    if(Singleton.getInstance().stack3.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 400;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack4")) {
                    if(Singleton.getInstance().stack4.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 500;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack5")) {
                    if(Singleton.getInstance().stack5.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 600;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack6")) {
                    if(Singleton.getInstance().stack6.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 700;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                }
                if(stackn.equals("stack7")) {
                    if(Singleton.getInstance().stack7.size() > 0 && !ay) {
                        Card s = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1);
                        Singleton.getInstance().ka.get(i).x = s.x;
                        Singleton.getInstance().ka.get(i).y = s.y + 30;
                    } else {
                        ay = true;
                        Singleton.getInstance().ka.get(i).x = 800;
                        Singleton.getInstance().ka.get(i).y = yay;
                        yay += 30;
                    }
                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                }
            }

            Singleton.getInstance().ka.clear();
        }

        {
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

        singleton.Singleton.getInstance().gr.setColor(new Color(123, 197, 31));
        singleton.Singleton.getInstance().gr.fillRect(0, 0, 1070, 800);
        drawStackCards();
        Logo logo = new Logo();
        logo.drawLogoMiddle();
        Singleton.getInstance().cas.draw_All_TopOfStack();   
        Stacker stacker = new Stacker();
        stacker.executeDrawing();
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseMoved(MouseEvent me) {
    }

    public void drawStackCards() {
        for(int ii=0; ii<Singleton.getInstance().stack1.size(); ii++) {
            Singleton.getInstance().stack1.get(ii).drawCardAtLocation(Singleton.getInstance().stack1.get(ii).x, Singleton.getInstance().stack1.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack2.size(); ii++) {
            Singleton.getInstance().stack2.get(ii).drawCardAtLocation(Singleton.getInstance().stack2.get(ii).x, Singleton.getInstance().stack2.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack3.size(); ii++) {
            Singleton.getInstance().stack3.get(ii).drawCardAtLocation(Singleton.getInstance().stack3.get(ii).x, Singleton.getInstance().stack3.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack4.size(); ii++) {
            Singleton.getInstance().stack4.get(ii).drawCardAtLocation(Singleton.getInstance().stack4.get(ii).x, Singleton.getInstance().stack4.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack5.size(); ii++) {
            Singleton.getInstance().stack5.get(ii).drawCardAtLocation(Singleton.getInstance().stack5.get(ii).x, Singleton.getInstance().stack5.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack6.size(); ii++) {
            Singleton.getInstance().stack6.get(ii).drawCardAtLocation(Singleton.getInstance().stack6.get(ii).x, Singleton.getInstance().stack6.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().stack7.size(); ii++) {
            Singleton.getInstance().stack7.get(ii).drawCardAtLocation(Singleton.getInstance().stack7.get(ii).x, Singleton.getInstance().stack7.get(ii).y);
        }
        for(int ii=0; ii<Singleton.getInstance().ka.size(); ii++) {
            Singleton.getInstance().ka.get(ii).drawCardAtLocation(Singleton.getInstance().ka.get(ii).x, Singleton.getInstance().ka.get(ii).y);
        }
    }

    public void mouseDragged(MouseEvent me) {
        if(!tr)
            return;
        singleton.Singleton.getInstance().gr.setColor(new Color(123, 197, 31));
        singleton.Singleton.getInstance().gr.fillRect(0, 0, 1070, 800);
        Logo logo = new Logo();
        logo.drawLogoMiddle();
        Singleton.getInstance().cas.draw_All_TopOfStack();
        drawStackCards();
        boolean safe = false;
        cunt++;
        if(cunt == currentcunt + 1) {
            currentcunt = cunt;
            safe = true;
        }
        for(int i=0; i<m.length; i++) {
            if(m[i].isRegioned(me)) {
                Clicker.GroupCards gc = null;
                if(!safe && !m[i].getSetName().equals("")) {
                    for(int j=0; j<m.length; j++) {
                        m[j].name = m[i].getSetName();

                    }
                }
                if(m[i].name.equals("stack1")) {
                    gc = m[i].getGroupCards("stack1");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack1";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack2")) {
                    gc = m[i].getGroupCards("stack2");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack2";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack3")) {
                    gc = m[i].getGroupCards("stack3");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack3";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack4")) {
                    gc = m[i].getGroupCards("stack4");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack4";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack5")) {
                    gc = m[i].getGroupCards("stack5");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack5";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack6")) {
                    gc = m[i].getGroupCards("stack6");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack6";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("stack7")) {
                    gc = m[i].getGroupCards("stack7");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "stack7";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = gc.getCards();
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = stack.get(ii).y;
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                System.out.println("gc.get:"+gc.getCards().size());
            }
        }
    }

    public ClickSystem() {

        m[0] = new Clicker(200, 100, Singleton.getInstance().stack1, "stack1");

        m[1] = new Clicker(300, 100, Singleton.getInstance().stack2, "stack2");
        m[2] = new Clicker(300, 130, Singleton.getInstance().stack2, "stack2");

        m[3] = new Clicker(400, 100, Singleton.getInstance().stack3, "stack3");
        m[4] = new Clicker(400, 130, Singleton.getInstance().stack3, "stack3");
        m[5] = new Clicker(400, 160, Singleton.getInstance().stack3, "stack3");

        m[6] = new Clicker(500, 100, Singleton.getInstance().stack4, "stack4");
        m[7] = new Clicker(500, 130, Singleton.getInstance().stack4, "stack4");
        m[8] = new Clicker(500, 160, Singleton.getInstance().stack4, "stack4");
        m[9] = new Clicker(500, 190, Singleton.getInstance().stack4, "stack4");

        m[10] = new Clicker(600, 100, Singleton.getInstance().stack5, "stack5");
        m[11] = new Clicker(600, 130, Singleton.getInstance().stack5, "stack5");
        m[12] = new Clicker(600, 160, Singleton.getInstance().stack5, "stack5");
        m[13] = new Clicker(600, 190, Singleton.getInstance().stack5, "stack5");
        m[14] = new Clicker(600, 220, Singleton.getInstance().stack5, "stack5");

        m[15] = new Clicker(700, 100, Singleton.getInstance().stack6, "stack6");
        m[16] = new Clicker(700, 130, Singleton.getInstance().stack6, "stack6");
        m[17] = new Clicker(700, 160, Singleton.getInstance().stack6, "stack6");
        m[18] = new Clicker(700, 190, Singleton.getInstance().stack6, "stack6");
        m[19] = new Clicker(700, 220, Singleton.getInstance().stack6, "stack6");
        m[20] = new Clicker(700, 250, Singleton.getInstance().stack6, "stack6");

        m[21] = new Clicker(800, 100, Singleton.getInstance().stack7, "stack7");
        m[22] = new Clicker(800, 130, Singleton.getInstance().stack7, "stack7");
        m[23] = new Clicker(800, 160, Singleton.getInstance().stack7, "stack7");
        m[24] = new Clicker(800, 190, Singleton.getInstance().stack7, "stack7");
        m[25] = new Clicker(800, 220, Singleton.getInstance().stack7, "stack7");
        m[26] = new Clicker(800, 250, Singleton.getInstance().stack7, "stack7");
        m[27] = new Clicker(800, 280, Singleton.getInstance().stack7, "stack7");
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
                return Singleton.getInstance().ka;
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

            if(xx >= 0 + 200 && xx <= 0 + 200 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 2;
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 2;
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 3;
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 2;
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 3;
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 4;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 2;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 3;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 4;
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 280 && yy <= 0 + 310) {
                id = 5;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 0;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 1;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 2;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 3;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 4;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 280 && yy <= 0 + 310) {
                id = 5;
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 310 && yy <= 0 + 340) {
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
                this.fillGroupCards(Singleton.getInstance().stack1, 1, pressed_id, xx, yy);
            else if(pressed.equals("stack2"))
                this.fillGroupCards(Singleton.getInstance().stack2, 2, pressed_id, xx, yy);
            else if(pressed.equals("stack3"))
                this.fillGroupCards(Singleton.getInstance().stack3, 3, pressed_id, xx, yy);
            else if(pressed.equals("stack4"))
                this.fillGroupCards(Singleton.getInstance().stack4, 4, pressed_id, xx, yy);
            else if(pressed.equals("stack5"))
                this.fillGroupCards(Singleton.getInstance().stack5, 5, pressed_id, xx, yy);
            else if(pressed.equals("stack6"))
                this.fillGroupCards(Singleton.getInstance().stack6, 6, pressed_id, xx, yy);
            else if(pressed.equals("stack7"))
                this.fillGroupCards(Singleton.getInstance().stack7, 7, pressed_id, xx, yy);

            return this.gc;
        }
        public void fillGroupCards(ArrayList<Card> stck, int stackPos, int id, int xx, int yy) {
            //Singleton.getInstance().ka.clear();
            //if(rt == 1)
                //return;
            //Singleton.getInstance().ka.clear();
            if(stackPos == 1 || pressed.equals("stack1")) {
                for(int i=0; i<Singleton.getInstance().stack1.size(); i++) {
                    if(id <= i) {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(!(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack1.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack1.get(i).number)) {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack1.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack1.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack1.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack1.get(i).number) {
                                Singleton.getInstance().stack1.remove(Singleton.getInstance().ka.get(a));
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 2 || pressed.equals("stack2")) {
                for(int i=0; i<Singleton.getInstance().stack2.size(); i++) {
                    if(id <= i) {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack2.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack2.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack2.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack2.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack2.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack2.get(i).number) {
                                Singleton.getInstance().stack2.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 3 || pressed.equals("stack3")) {
                for(int i=0; i<Singleton.getInstance().stack3.size(); i++) {
                    if(id <= i) {
                        Singleton.getInstance().stack3.get(i).x = xx;
                        Singleton.getInstance().stack3.get(i).y = yy;
                        yy += 30;
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack3.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack3.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack3.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack3.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack3.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack3.get(i).number) {
                                Singleton.getInstance().stack3.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 4 || pressed.equals("stack4")) {
                for(int i=0; i<Singleton.getInstance().stack4.size(); i++) {
                    if(id <= i) {
                        Singleton.getInstance().stack4.get(i).x = xx;
                        Singleton.getInstance().stack4.get(i).y = yy;
                        yy += 30;
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack4.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack4.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack4.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack4.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack4.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack4.get(i).number) {
                                Singleton.getInstance().stack4.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 5 || pressed.equals("stack5")) {
                for(int i=0; i<Singleton.getInstance().stack5.size(); i++) {
                    if(id <= i) {
                        Singleton.getInstance().stack5.get(i).x = xx;
                        Singleton.getInstance().stack5.get(i).y = yy;
                        yy += 30;
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack5.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack5.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack5.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack5.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack5.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack5.get(i).number) {
                                Singleton.getInstance().stack5.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 6 || pressed.equals("stack6")) {
                for(int i=0; i<Singleton.getInstance().stack6.size(); i++) {
                    if(id <= i) {
                        Singleton.getInstance().stack6.get(i).x = xx;
                        Singleton.getInstance().stack6.get(i).y = yy;
                        yy += 30;
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack6.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack6.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack6.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack6.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack6.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack6.get(i).number) {
                                Singleton.getInstance().stack6.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 7 || pressed.equals("stack7")) {
                for(int i=0; i<Singleton.getInstance().stack7.size(); i++) {
                    if(id <= i) {
                        Singleton.getInstance().stack7.get(i).x = xx;
                        Singleton.getInstance().stack7.get(i).y = yy;
                        yy += 30;
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack7.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack7.get(i).number) {

                            } else {
                                Singleton.getInstance().ka.add(Singleton.getInstance().stack7.get(i));
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                                Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                                break;
                            }
                        }
                        yy += 30;
                        if(Singleton.getInstance().ka.size() == 0)
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack7.get(i));
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack7.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack7.get(i).number) {
                                Singleton.getInstance().stack7.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                        }
                        } catch(Exception e) {}
                    }
                }
            }

            if(rt == 0)
                rt = 1;

//                if(Singleton.getInstance().ka.size() < 1)
//                    for(int i=0; i<kards.size(); i++) {
//                        Singleton.getInstance().ka.add(kards.get(i));
//                    }
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
