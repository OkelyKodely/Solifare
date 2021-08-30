/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsystem;

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

    boolean empty = false;
    String st = "";
    String s= "";
    ArrayList<Clicker> m = new ArrayList<>();
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
                st = "";
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack2";
                st = "";
            }
            else if(xx >= 0 + 300 && xx <= 0 + 300 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack2";
                st = "";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack3";
                st = "";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack3";
                st = "";
            }
            else if(xx >= 0 + 400 && xx <= 0 + 400 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack3";
                st = "";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack4";
                st = "";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack4";
                st = "";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack4";
                st = "";
            }
            else if(xx >= 0 + 500 && xx <= 0 + 500 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack4";
                st = "";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack5";
                st = "";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack5";
                st = "";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack5";
                st = "";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack5";
                st = "";
            }
            else if(xx >= 0 + 600 && xx <= 0 + 600 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack5";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 700 && xx <= 0 + 700 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 5;
                stackn = "stack6";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 100 && yy <= 0 + 130) {
                id = 0;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 130 && yy <= 0 + 160) {
                id = 1;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 160 && yy <= 0 + 190) {
                id = 2;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 190 && yy <= 0 + 220) {
                id = 3;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 220 && yy <= 0 + 250) {
                id = 4;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 250 && yy <= 0 + 280) {
                id = 5;
                stackn = "stack7";
                st = "";
            }
            else if(xx >= 0 + 800 && xx <= 0 + 800 + 60 && yy >= 0 + 280 && yy <= 0 + 310) {
                id = 6;
                stackn = "stack7";
                st = "";
            }
            else {
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
        }

        System.out.println("sss:"+Singleton.getInstance().ka.size());

        String stacknn = "";
        
        if(Singleton.getInstance().ka != null)
        {
            int xx = me.getX();
            int yy = me.getY();
            boolean retarn = false;
            if(xx >= 0 + 50 && xx <= 0 + 50 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                System.out.println("qweqweqwe");
                stacknn = "tack1";
                retarn = true;
            }
            else if(xx >= 0 + 190 && xx <= 0 + 190 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                System.out.println("sdadfaafd");
                stacknn = "tack2";
                retarn = true;
            }
            else if(xx >= 0 + 330 && xx <= 0 + 330 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 1;
                System.out.println("zxvvzxcvzxc");
                stacknn = "tack2";
                retarn = true;
            }
            else if(xx >= 0 + 470 && xx <= 0 + 470 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
                id = 0;
                System.out.println("aaaaaaaaaaaaaasssssssssssssssss");
                stacknn = "tack3";
                retarn = true;
            }
            
            System.out.println("this is the size 2: " + Singleton.getInstance().stack2.size());
            System.out.println("thatttt: " + stackn);

            boolean fag = true;
            int yay = 100;
            boolean ay = false;
            if(!retarn && st.equals(""))
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
                    if(Singleton.getInstance().stack1.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        System.out.println("1it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                        if(empty) {
                            System.out.println("someth ");
                            Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 1");
                                if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).x;
                                            int __y = Singleton.getInstance().stack1.get(Singleton.getInstance().stack1.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack1.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    if(Singleton.getInstance().stack2.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        System.out.println("2it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                        if(empty) {
                            System.out.println("someth 1111>");
                            Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 2");
                                if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).x;
                                            int __y = Singleton.getInstance().stack2.get(Singleton.getInstance().stack2.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack2.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    if(Singleton.getInstance().stack3.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        if(empty) {
                            Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            System.out.println("3it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                            if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 3");
                                if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).x;
                                            int __y = Singleton.getInstance().stack3.get(Singleton.getInstance().stack3.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack3.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    if(Singleton.getInstance().stack4.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        if(empty) {
                            Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            System.out.println("4it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                            if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 4");
                                if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).x;
                                            int __y = Singleton.getInstance().stack4.get(Singleton.getInstance().stack4.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack4.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    System.out.println("nam:" + Singleton.getInstance().stack5.size());
                    if(Singleton.getInstance().stack5.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        if(empty) {
                            Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            System.out.println("5it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                            System.out.print("adf34:");System.out.println(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).number);
                            System.out.print("adf34:");System.out.println(Singleton.getInstance().ka.get(i).number);
                            if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 5");
                                if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).x;
                                            int __y = Singleton.getInstance().stack5.get(Singleton.getInstance().stack5.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack5.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    if(Singleton.getInstance().stack6.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        if(empty) {
                            Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            System.out.println("6it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                            if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 6");
                                if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).x;
                                            int __y = Singleton.getInstance().stack6.get(Singleton.getInstance().stack6.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack6.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
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
                    if(Singleton.getInstance().stack7.size() == 0) {
                        empty = true;
                        if(Singleton.getInstance().ka.get(i).number == 13) {
                            Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                        }
                        else
                            fag = false;
                    } else {
                        if(empty) {
                            Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                        }
                        else {
                            System.out.println("7it is ni,b 1afds:" + Singleton.getInstance().ka.size());
                            if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).number - 1 == 
                                    Singleton.getInstance().ka.get(i).number) {
                                System.out.println("it is ni,b 7");
                                if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 1 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 3) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 2 &&
                                    Singleton.getInstance().ka.get(i).suit == 4) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 3 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 1) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else if(Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size()-1).suit == 4 &&
                                    Singleton.getInstance().ka.get(i).suit == 2) {       
                                    empty = true;
                                    int _x = Singleton.getInstance().ka.get(i).x;
                                    int _y = Singleton.getInstance().ka.get(i).y;
                                    for(int u=0; u<m.size(); u++) {
                                        if(m.get(u).x == _x && m.get(u).y == _y) {
                                            int __x = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).x;
                                            int __y = Singleton.getInstance().stack7.get(Singleton.getInstance().stack7.size() - 1).y;                                        
                                            __y += 30;
                                            m.get(u).x = __x;
                                            m.get(u).y = __y;
                                        }
                                    }
                                    Singleton.getInstance().stack7.add(Singleton.getInstance().ka.get(i));
                                }
                                else
                                    fag = false;
                            }
                            else
                                fag = false;
                        }
                    }
                }
            }
            
            if(fag == false) {
                if(s.equals("stack1")) {
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
                if(s.equals("stack2")) {
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
                if(s.equals("stack3")) {
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
                if(s.equals("stack4")) {
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
                if(s.equals("stack5")) {
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
                if(s.equals("stack6")) {
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
                if(s.equals("stack7")) {
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
        }

        st = "";

        {
            tr = false;
            empty = false;
            pressed = "";
            pressed_id=0;
            pressed_two=0;
            pressed_xx=0;
            pressed_yy = 0;
            for(int j=0; j<m.size(); j++) {
                int xx = m.get(j).x;
                int yy = m.get(j).y;
                if(xx >= 0 + 200 && xx <= 0 + 200 + 60) {
                    m.get(j).name = "stack1";
                    m.get(j).name1 = "stack1";
                }
                if(xx >= 100 + 200 && xx <= 100 + 200 + 60) {
                    m.get(j).name = "stack2";
                    m.get(j).name1 = "stack2";
                }
                if(xx >= 200 + 200 && xx <= 200 + 200 + 60) {
                    m.get(j).name = "stack3";
                    m.get(j).name1 = "stack3";
                }
                if(xx >= 300 + 200 && xx <= 300 + 200 + 60) {
                    m.get(j).name = "stack4";
                    m.get(j).name1 = "stack4";
                }
                if(xx >= 400 + 200 && xx <= 400 + 200 + 60) {
                    m.get(j).name = "stack5";
                    m.get(j).name1 = "stack5";
                }
                if(xx >= 500 + 200 && xx <= 500 + 200 + 60) {
                    m.get(j).name = "stack6";
                    m.get(j).name1 = "stack6";
                }
                if(xx >= 600 + 200 && xx <= 600 + 200 + 60) {
                    m.get(j).name = "stack7";
                    m.get(j).name1 = "stack7";
                }
            }
        }

        singleton.Singleton.getInstance().gr.setColor(new Color(224, 197, 31));
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
        for(int ii=0; ii<Singleton.getInstance().stack1.size(); ii++) {
            Singleton.getInstance().stack1.get(ii).drawCardAtLocation(Singleton.getInstance().stack1.get(ii).x, Singleton.getInstance().stack1.get(ii).y);
        }
        System.out.print(Singleton.getInstance().stack2.size() + "  drawstac s2:");
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
    }

    public void mouseDragged(MouseEvent me) {
        singleton.Singleton.getInstance().gr.setColor(new Color(224, 197, 31));
        singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 900);
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
        for(int i=0; i<m.size(); i++) {
            m.get(i).e = me;
            if(st.equals("") && m.get(i).isRegioned(m.get(i).e)) {
                st = m.get(i).name;
                s = st;
                singleton.Singleton.getInstance().st = st;
            }
            Clicker.GroupCards gc = null;
            if(st.equals("stack1")) {
                gc = m.get(i).getGroupCards("stack1");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack1";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack2")) {
                gc = m.get(i).getGroupCards("stack2");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack2";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack3")) {
                gc = m.get(i).getGroupCards("stack3");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack3";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack4")) {
                gc = m.get(i).getGroupCards("stack4");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack4";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack5")) {
                gc = m.get(i).getGroupCards("stack5");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack5";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack6")) {
                gc = m.get(i).getGroupCards("stack6");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack6";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
            else if(st.equals("stack7")) {
                gc = m.get(i).getGroupCards("stack7");
                for(int j=0; j<m.size(); j++) {
                    m.get(j).name1 = "stack7";
                }
                int yyy = 0;
                int xxx = 0;
                ArrayList<Card> stack = gc.getCards();
                for(int ii=0; ii<stack.size(); ii++) {
                    if(ii == 0)
                        yyy = me.getY();
                    else
                        yyy += 30;
                    xxx = me.getX();
                    stack.get(ii).drawCardAtLocation(xxx, yyy);
                }
            }
        }
    }

    public ClickSystem() {

        k = new ArrayList<>();
        Singleton.getInstance().k = k;
        
        {
        Clicker n = new Clicker(200, 100, Singleton.getInstance().stack1, "stack1");
        n.stackname = "stack1";
        m.add(n);
        }

        {
        Clicker n = new Clicker(300, 100, Singleton.getInstance().stack2, "stack2");
        n.stackname = "stack2";
        m.add(n);
        }
        {
        Clicker n = new Clicker(300, 130, Singleton.getInstance().stack2, "stack2");
        n.stackname = "stack2";
        m.add(n);
        }
        
        {
        Clicker n = new Clicker(400, 100, Singleton.getInstance().stack3, "stack3");
        n.stackname = "stack3";
        m.add(n);
        }
        {
        Clicker n = new Clicker(400, 130, Singleton.getInstance().stack3, "stack3");
        n.stackname = "stack3";
        m.add(n);
        }
        {
        Clicker n = new Clicker(400, 160, Singleton.getInstance().stack3, "stack3");
        n.stackname = "stack3";
        m.add(n);
        }
        
        {
        Clicker n = new Clicker(500, 100, Singleton.getInstance().stack4, "stack4");
        n.stackname = "stack4";
        m.add(n);
        }
        {
        Clicker n = new Clicker(500, 130, Singleton.getInstance().stack4, "stack4");
        n.stackname = "stack4";
        m.add(n);
        }
        {
        Clicker n = new Clicker(500, 160, Singleton.getInstance().stack4, "stack4");
        n.stackname = "stack4";
        m.add(n);
        }
        {
        Clicker n = new Clicker(500, 190, Singleton.getInstance().stack4, "stack4");
        n.stackname = "stack4";
        m.add(n);
        }

        {
        Clicker n = new Clicker(600, 100, Singleton.getInstance().stack5, "stack5");
        n.stackname = "stack5";
        m.add(n);
        }
        {
        Clicker n = new Clicker(600, 130, Singleton.getInstance().stack5, "stack5");
        n.stackname = "stack5";
        m.add(n);
        }
        {
        Clicker n = new Clicker(600, 160, Singleton.getInstance().stack5, "stack5");
        n.stackname = "stack5";
        m.add(n);
        }
        {
        Clicker n = new Clicker(600, 190, Singleton.getInstance().stack5, "stack5");
        n.stackname = "stack5";
        m.add(n);
        }
        {
        Clicker n = new Clicker(600, 220, Singleton.getInstance().stack5, "stack5");
        n.stackname = "stack5";
        m.add(n);
        }

        {
        Clicker n = new Clicker(700, 100, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }
        {
        Clicker n = new Clicker(700, 130, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }
        {
        Clicker n = new Clicker(700, 160, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }
        {
        Clicker n = new Clicker(700, 190, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }
        {
        Clicker n = new Clicker(700, 220, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }
        {
        Clicker n = new Clicker(700, 250, Singleton.getInstance().stack6, "stack6");
        n.stackname = "stack6";
        m.add(n);
        }

        {
        Clicker n = new Clicker(800, 100, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 130, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 160, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 190, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 220, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 250, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
        {
        Clicker n = new Clicker(800, 280, Singleton.getInstance().stack7, "stack7");
        n.stackname = "stack7";
        m.add(n);
        }
    }

    class Clicker {

        String stackname = "";
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

            for(int j=0; j<7; j++)
            for(int i=0; i<20; i++) {
                if(xx >= 0 + 200 + j*100 && xx <= 0 + 200 + j*100 + 60 && yy >= 0 + 130 + i*30 && yy <= 0 + 160 + i*30) {
                    id = 0;
                }
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
            int truey = yy - 130;
            int ty = (int)Math.round(0.5+(double)truey/(double)30);
            //if(Singleton.getInstance().themouseevent != null)
                //return;
            if(stackPos == 1 || pressed.equals("stack1")) {
                if(Singleton.getInstance().stack1.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack1.size(); i++) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack1.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                        try {
                            if(1==1)
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack1.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack1.get(i).number) {
                                Singleton.getInstance().stack1.remove(Singleton.getInstance().ka.get(a));
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 2 || pressed.equals("stack2")) {
                if(Singleton.getInstance().stack2.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack2.size(); i++) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack2.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                        try {
                            if(1==1)
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack2.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack2.get(i).number) {
                                Singleton.getInstance().stack2.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 3 || pressed.equals("stack3")) {
                if(Singleton.getInstance().stack3.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack3.size(); i++) {
                    if(id <= i) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack3.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                            if(1==1)
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack3.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack3.get(i).number) {
                                Singleton.getInstance().stack3.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 4 || pressed.equals("stack4")) {
                if(Singleton.getInstance().stack4.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack4.size(); i++) {
                    if(id <= i) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack4.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                            if(1==1)
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack4.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack4.get(i).number) {
                                Singleton.getInstance().stack4.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 5 || pressed.equals("stack5")) {
                if(Singleton.getInstance().stack5.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack5.size(); i++) {
                    if(id <= i) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack5.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                            if(1==1)
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack5.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack5.get(i).number) {
                                Singleton.getInstance().stack5.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 6 || pressed.equals("stack6")) {
                if(Singleton.getInstance().stack6.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack6.size(); i++) {
                    if(id <= i) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack6.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                            if(1==1)
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack6.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack6.get(i).number) {
                                Singleton.getInstance().stack6.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
                }
            }
            else if(stackPos == 7 || pressed.equals("stack7")) {
                if(Singleton.getInstance().stack7.size() == 0) {
                    for(int i=ty; i<Singleton.getInstance().ka.size(); i++) {
                        //Singleton.getInstance().ka.get(i).drawCardAtLocation(xx, yy);
                        //yy+=30;
                    }
                }
                for(int i=ty; i<Singleton.getInstance().stack7.size(); i++) {
                    if(id <= i) {
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
                        if(Singleton.getInstance().ka.size() == 0) {
                            Singleton.getInstance().ka.add(Singleton.getInstance().stack7.get(i));
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).x = xx;
                            Singleton.getInstance().ka.get(Singleton.getInstance().ka.size()-1).y = yy;
                        }
                        yy += 30;
                            if(1==1)
                        try {
                        for(int a=0; a<Singleton.getInstance().ka.size(); a++) {
                            if(Singleton.getInstance().ka.get(a).suit == Singleton.getInstance().stack7.get(i).suit &&
                                    Singleton.getInstance().ka.get(a).number == Singleton.getInstance().stack7.get(i).number) {
                                Singleton.getInstance().stack7.remove(Singleton.getInstance().ka.get(a));
                            } else {
                            }
                            Singleton.getInstance().ka.get(a).drawCardAtLocation(xx, yy);
                        }
                        } catch(Exception e) {}
                    }
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
