/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsystem;

import data.Card;
import data.StackOne;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import singleton.Singleton;
import views.BottomStacks;
import views.Logo;
import views.Stacker;

/**
 *
 * @author d
 */
public class WinnerSystem implements MouseMotionListener, MouseListener {

    Klicker m[] = new Klicker[4];
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
        Singleton.getInstance().yeoyaee = "something";
        Singleton.getInstance().themouseevent = me;
        rt = 0;
        if(1==2)return;
        int id = 0;
        String stackn = "stac1";
        {
            int xx = me.getX();
            int yy = me.getY();
            
            boolean retarn = false;

            if(xx >= 0 + 50 && xx <= 0 + 50 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                stackn = "tack1";
                retarn = true;
            }
            else if(xx >= 0 + 190 && xx <= 0 + 190 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                stackn = "tack2";
                retarn = true;
            }
            else if(xx >= 0 + 330 && xx <= 0 + 330 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 1;
                stackn = "tack3";
                retarn = true;
            }
            else if(xx >= 0 + 470 && xx <= 0 + 470 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                stackn = "tack4";
                retarn = true;
            }
            
            if(stackn.equals("tack1")) {
                if(singleton.Singleton.getInstance().k.size() > 0) {
                    if(singleton.Singleton.getInstance().bs.stackone.stack.size() == 0) {
                        if(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number == 1) {
                            singleton.Singleton.getInstance().bs.stackone.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                            singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                        }                        
                    }    
                }
                else if(singleton.Singleton.getInstance().bs.stackone.stack.get(singleton.Singleton.getInstance().bs.stackone.stack.size() - 1).suit == 
                        singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).suit && 
                        singleton.Singleton.getInstance().bs.stackone.stack.get(singleton.Singleton.getInstance().bs.stackone.stack.size() - 1).number +1== 
                        singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number) {
                    singleton.Singleton.getInstance().bs.stackone.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                    singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                }
            }
            if(stackn.equals("tack2")) {
                if(singleton.Singleton.getInstance().k.size() > 0) {
                    if(singleton.Singleton.getInstance().bs.stacktwo.stack.size() == 0) {
                        if(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number == 1) {
                            singleton.Singleton.getInstance().bs.stacktwo.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                            singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                        }                        
                    }
                    else if(singleton.Singleton.getInstance().bs.stacktwo.stack.get(singleton.Singleton.getInstance().bs.stacktwo.stack.size() - 1).suit == 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).suit && 
                            singleton.Singleton.getInstance().bs.stacktwo.stack.get(singleton.Singleton.getInstance().bs.stacktwo.stack.size() - 1).number +1== 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number) {
                        singleton.Singleton.getInstance().bs.stacktwo.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                        singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                    }
                }
            }
            if(stackn.equals("tack3")) {
                if(singleton.Singleton.getInstance().k.size() > 0) {
                    if(singleton.Singleton.getInstance().bs.stackthree.stack.size() == 0) {
                        if(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number == 1) {
                            singleton.Singleton.getInstance().bs.stackthree.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                            singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                        }
                    }
                    else if(singleton.Singleton.getInstance().bs.stackthree.stack.get(singleton.Singleton.getInstance().bs.stackthree.stack.size() - 1).suit == 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).suit && 
                            singleton.Singleton.getInstance().bs.stackthree.stack.get(singleton.Singleton.getInstance().bs.stackthree.stack.size() - 1).number +1== 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number) {
                        singleton.Singleton.getInstance().bs.stackthree.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                        singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                    }
                }
            }
            if(stackn.equals("tack4")) {
                if(singleton.Singleton.getInstance().k.size() > 0) {
                    if(singleton.Singleton.getInstance().bs.stackfour.stack.size() == 0) {
                        if(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number == 1) {
                            singleton.Singleton.getInstance().bs.stackfour.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                            singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                        }
                    }
                    else if(singleton.Singleton.getInstance().bs.stackfour.stack.get(singleton.Singleton.getInstance().bs.stackfour.stack.size() - 1).suit == 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).suit && 
                            singleton.Singleton.getInstance().bs.stackfour.stack.get(singleton.Singleton.getInstance().bs.stackfour.stack.size() - 1).number +1== 
                            singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1).number) {
                        singleton.Singleton.getInstance().bs.stackfour.stack.add(singleton.Singleton.getInstance().k.get(singleton.Singleton.getInstance().k.size() - 1));
                        singleton.Singleton.getInstance().k.remove(singleton.Singleton.getInstance().k.size() - 1);
                    }
                }
            }
            
            singleton.Singleton.getInstance().bs.drawall();
            
            if(retarn)
                return;
        }
        
        String st = "";
        st = singleton.Singleton.getInstance().st;
        if(st == null) st = "";
        System.out.println("stst2234::"+st);
        if("a".equals("b")) {
        if(st.equals("stack1")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack1.size() == 0) {
                xxxx = 200;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack1.size() > 0) {
                xxxx = 200;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack1.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack1.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack2")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack2.size() == 0) {
                xxxx = 300;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack2.size() > 0) {
                xxxx = 300;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack2.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack2.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack3")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack3.size() == 0) {
                xxxx = 400;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack3.size() > 0) {
                xxxx = 400;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack3.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack3.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack4")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack4.size() == 0) {
                xxxx = 500;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack4.size() > 0) {
                xxxx = 500;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack4.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack4.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack5")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack5.size() == 0) {
                xxxx = 600;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack5.size() > 0) {
                xxxx = 600;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack5.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack5.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack6")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack6.size() == 0) {
                xxxx = 700;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack6.size() > 0) {
                xxxx = 700;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack6.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack6.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        if(st.equals("stack7")) {
            int xxxx = -1;
            int yyyy = -1;
            if(singleton.Singleton.getInstance().stack7.size() == 0) {
                xxxx = 800;
                yyyy = 130;
            }
            else if(singleton.Singleton.getInstance().stack7.size() > 0) {
                xxxx = 800;
                yyyy = 130;
                for(int i=0; i<singleton.Singleton.getInstance().stack7.size(); i++) {
                    yyyy += 30;
                }
            }
            for(int i=0; i<singleton.Singleton.getInstance().ka.size(); i++) {
                singleton.Singleton.getInstance().ka.get(i).x = xxxx;
                singleton.Singleton.getInstance().ka.get(i).y = yyyy;
                singleton.Singleton.getInstance().stack7.add(singleton.Singleton.getInstance().ka.get(i));
                yyyy += 30;
            }
        }
        }
        
        System.out.println("sss:"+Singleton.getInstance().ka.size());

        if(Singleton.getInstance().ka != null)
        {
            int yay = 100;
            boolean ay = false;
            for(int i=0; i<Singleton.getInstance().ka.size(); i++)
            {
                if(stackn.equals("tack1")) {
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
                if(stackn.equals("tack2")) {
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
                if(stackn.equals("tack3")) {
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
                if(stackn.equals("tack4")) {
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
                if(stackn.equals("tack5")) {
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
                if(stackn.equals("tack6")) {
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
                if(stackn.equals("tack7")) {
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
                    m[j].name = "tack1";
                    m[j].name1 = "tack1";
                }
                if(xx >= 100 + 200 && xx <= 100 + 200 + 60) {
                    m[j].name = "tack2";
                    m[j].name1 = "tack2";
                }
                if(xx >= 200 + 200 && xx <= 200 + 200 + 60) {
                    m[j].name = "tack3";
                    m[j].name1 = "tack3";
                }
                if(xx >= 300 + 200 && xx <= 300 + 200 + 60) {
                    m[j].name = "tack4";
                    m[j].name1 = "tack4";
                }
                if(xx >= 400 + 200 && xx <= 400 + 200 + 60) {
                    m[j].name = "tack5";
                    m[j].name1 = "tack5";
                }
                if(xx >= 500 + 200 && xx <= 500 + 200 + 60) {
                    m[j].name = "tack6";
                    m[j].name1 = "tack6";
                }
                if(xx >= 600 + 200 && xx <= 600 + 200 + 60) {
                    m[j].name = "tack7";
                    m[j].name1 = "tack7";
                }
            }
        }

        singleton.Singleton.getInstance().gr.setColor(new Color(123, 197, 81));
        singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 900);
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
        for(int ii=0; ii<singleton.Singleton.getInstance().bs.stackone.stack.size(); ii++) {
            singleton.Singleton.getInstance().bs.stackone.stack.get(ii).drawCardAtLocation(singleton.Singleton.getInstance().bs.stackone.stack.get(ii).x, singleton.Singleton.getInstance().bs.stackone.stack.get(ii).y);
        }
        for(int ii=0; ii<singleton.Singleton.getInstance().bs.stacktwo.stack.size(); ii++) {
            singleton.Singleton.getInstance().bs.stacktwo.stack.get(ii).drawCardAtLocation(singleton.Singleton.getInstance().bs.stacktwo.stack.get(ii).x, singleton.Singleton.getInstance().bs.stacktwo.stack.get(ii).y);
        }
        for(int ii=0; ii<singleton.Singleton.getInstance().bs.stackthree.stack.size(); ii++) {
            singleton.Singleton.getInstance().bs.stackthree.stack.get(ii).drawCardAtLocation(singleton.Singleton.getInstance().bs.stackthree.stack.get(ii).x, singleton.Singleton.getInstance().bs.stackthree.stack.get(ii).y);
        }
        for(int ii=0; ii<singleton.Singleton.getInstance().bs.stackfour.stack.size(); ii++) {
            singleton.Singleton.getInstance().bs.stackfour.stack.get(ii).drawCardAtLocation(singleton.Singleton.getInstance().bs.stackfour.stack.get(ii).x, singleton.Singleton.getInstance().bs.stackfour.stack.get(ii).y);
        }
    }

    public void mouseDragged(MouseEvent me) {
        if(1==1) return;
        boolean safe = false;
        cunt++;
        if(cunt == currentcunt + 1) {
            currentcunt = cunt;
            safe = true;
        }
        for(int i=0; i<m.length; i++) {
            if(m[i].isRegioned(me)) {
                Klicker.GroupCards gc = null;
                if(!safe && !m[i].getSetName().equals("")) {
                    for(int j=0; j<m.length; j++) {
                        m[j].name = m[i].getSetName();

                    }
                }
                if(m[i].name.equals("tack1")) {
                    gc = m[i].getGroupCards("tack1");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "tack1";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = null;
                    stack = singleton.Singleton.getInstance().bs.stackone.stack;
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = me.getY();
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("tack2")) {
                    gc = m[i].getGroupCards("tack2");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "tack2";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = null;
                    stack = singleton.Singleton.getInstance().bs.stacktwo.stack;
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = me.getY();
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("tack3")) {
                    gc = m[i].getGroupCards("tack3");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "tack3";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = null;
                    stack = singleton.Singleton.getInstance().bs.stackthree.stack;
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = me.getY();
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
                else if(m[i].name.equals("tack4")) {
                    gc = m[i].getGroupCards("tack4");
                    for(int j=0; j<m.length; j++) {
                        m[j].name1 = "tack4";
                    }
                    int yyy = 0;
                    ArrayList<Card> stack = null;
                    stack = singleton.Singleton.getInstance().bs.stackfour.stack;
                    for(int ii=0; ii<stack.size(); ii++) {
                        if(ii == 0)
                            yyy = me.getY();
                        else
                            yyy += 30;
                        stack.get(ii).drawCardAtLocation(me.getX(), yyy);
                    }
                }
            }
        }
    }
    
    BottomStacks bs = null;

    public WinnerSystem() {

        bs = singleton.Singleton.getInstance().bs;
        
        m[0] = new Klicker(50, 660, singleton.Singleton.getInstance().bs.stackone.stack, "tack1");
        m[1] = new Klicker(190, 660, singleton.Singleton.getInstance().bs.stacktwo.stack, "tack2");
        m[2] = new Klicker(330, 660, singleton.Singleton.getInstance().bs.stackthree.stack, "tack3");
        m[3] = new Klicker(470, 660, singleton.Singleton.getInstance().bs.stackfour.stack, "tack4");

        Thread s3 = new Thread() {
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {}
                    System.out.println("stackone: " + Singleton.getInstance().bs.stackone.stack.size());
                    System.out.println("stacktwo: " + Singleton.getInstance().bs.stacktwo.stack.size());
                    System.out.println("stackthree: " + Singleton.getInstance().bs.stackthree.stack.size());
                    System.out.println("stackfour: " + Singleton.getInstance().bs.stackfour.stack.size());
                    Singleton.getInstance().bs.drawall();
                }
            }
        };
        s3.start();
    }

    class Klicker {

        int x;
        int y;
        long width = 100;
        long height = 200;
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
        public Klicker(int x, int y, ArrayList<Card> stack, String stackString) {
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

            int sp = 0;
            
            int id = 0;

            if(xx >= 0 + 50 && xx <= 0 + 50 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                sp = 1;
            }
            if(xx >= 0 + 190 && xx <= 0 + 190 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                sp = 2;
            }
            if(xx >= 0 + 330 && xx <= 0 + 330 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                sp = 3;
            }
            if(xx >= 0 + 470 && xx <= 0 + 470 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                sp = 4;
            }

            int stackPos = sp;

            this.fillGroupCards(singleton.Singleton.getInstance().ka, stackPos, xx, yy);

            return this.gc;
        }
        public void fillGroupCards(ArrayList<Card> stck, int stackPos, int xx, int yy) {
            if(stackPos == 1 || pressed.equals("tack1")) {
                for(int i=0; i<Singleton.getInstance().ka.size(); i++) {
                    if(i == Singleton.getInstance().ka.size() - 1) {
                        singleton.Singleton.getInstance().bs.stackone.stack.add(Singleton.getInstance().ka.get(i));
                        break;
                    }
                }
                for(int i=0; i<singleton.Singleton.getInstance().bs.stackone.stack.size(); i++) {
                    singleton.Singleton.getInstance().bs.stackone.stack.get(i).x = 70;
                    singleton.Singleton.getInstance().bs.stackone.stack.get(i).y = 660;
                }
            }
            if(stackPos == 2 || pressed.equals("tack2")) {
                for(int i=0; i<Singleton.getInstance().ka.size(); i++) {
                    if(i == Singleton.getInstance().ka.size() - 1) {
                        singleton.Singleton.getInstance().bs.stacktwo.stack.add(Singleton.getInstance().ka.get(i));
                        break;
                    }
                }
                for(int i=0; i<singleton.Singleton.getInstance().bs.stacktwo.stack.size(); i++) {
                    singleton.Singleton.getInstance().bs.stacktwo.stack.get(i).x = 370;
                    singleton.Singleton.getInstance().bs.stacktwo.stack.get(i).y = 660;
                }
            }
            if(stackPos == 3 || pressed.equals("tack3")) {
                for(int i=0; i<Singleton.getInstance().ka.size(); i++) {
                    if(i == Singleton.getInstance().ka.size() - 1) {
                        singleton.Singleton.getInstance().bs.stackthree.stack.add(Singleton.getInstance().ka.get(i));
                        break;
                    }
                }
                for(int i=0; i<singleton.Singleton.getInstance().bs.stackthree.stack.size(); i++) {
                    singleton.Singleton.getInstance().bs.stackthree.stack.get(i).x = 670;
                    singleton.Singleton.getInstance().bs.stackthree.stack.get(i).y = 660;
                }
            }
            if(stackPos == 4 || pressed.equals("tack4")) {
                for(int i=0; i<Singleton.getInstance().ka.size(); i++) {
                    if(i == Singleton.getInstance().ka.size() - 1) {
                        singleton.Singleton.getInstance().bs.stackfour.stack.add(Singleton.getInstance().ka.get(i));
                        break;
                    }
                }
                for(int i=0; i<singleton.Singleton.getInstance().bs.stackfour.stack.size(); i++) {
                    singleton.Singleton.getInstance().bs.stackfour.stack.get(i).x = 920;
                    singleton.Singleton.getInstance().bs.stackfour.stack.get(i).y = 660;
                }
            }
        }
        public boolean isRegioned(MouseEvent e) {
            this.e = e;
            if(e.getX() >= this.x && e.getX() <= this.x + this.width &&
                e.getY() >= this.y && e.getY() <= this.y + this.height) {
                return true;
            }
            return false;
        }
    }
}