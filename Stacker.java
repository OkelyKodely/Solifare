package views;

import data.Card;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import singleton.*;

public class Stacker {

    public void executeDrawing() {
        
        Stack1 q = new Stack1();
        Stack2 r = new Stack2();
        Stack3 s = new Stack3();
        Stack4 t = new Stack4();

        MouseEvent me = Singleton.getInstance().themouseevent;

        int xx = 0;
        int yy = 0;
        
        if(me != null) {
            xx = me.getX();
            yy = me.getY();
        }
        
        boolean retarn = false;

        if(xx >= 0 + 50 && xx <= 0 + 50 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
            retarn = true;
        }
        else if(xx >= 0 + 190 && xx <= 0 + 190 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
            retarn = true;
        }
        else if(xx >= 0 + 330 && xx <= 0 + 330 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
            retarn = true;
        }
        else if(xx >= 0 + 470 && xx <= 0 + 470 + 60 && yy >= 0 + 660 && yy <= 0 + 860) {
            retarn = true;
        }

        if(retarn && me != null) {
            Singleton.getInstance().themouseevent = null;
        for(int i=0; i<Singleton.getInstance().bs.stackone.stack.size(); i++) {
            Singleton.getInstance().yeoyaee = "hi";
            Card card = singleton.Singleton.getInstance().bs.stackone.stack.get(i);
            System.out.println("&-& " + card.number + " " + card.suit);

            
//            ArrayList<Card> ccaarrdd = new ArrayList<>();
//            for(int yay=0; yay<Singleton.getInstance().stack1.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack1.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack1.get(yay));
//                }
//            }
//            Singleton.getInstance().stack1 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack2.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack2.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack2.get(yay));
//                }
//            }
//            Singleton.getInstance().stack2 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack3.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack3.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack3.get(yay));
//                }
//            }
//            Singleton.getInstance().stack3 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack4.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack4.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack4.get(yay));
//                }
//            }
//            Singleton.getInstance().stack4 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack5.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack5.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack5.get(yay));
//                }
//            }
//            Singleton.getInstance().stack5 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack6.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack6.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack6.get(yay));
//                }
//            }
//            Singleton.getInstance().stack6 = ccaarrdd;
//            for(int yay=0; yay<Singleton.getInstance().stack7.size(); yay++) {
//                if(!(yay+1 == Singleton.getInstance().stack7.size())) {
//                    ccaarrdd.add(Singleton.getInstance().stack7.get(yay));
//                }
//            }
//            Singleton.getInstance().stack7 = ccaarrdd;
//            Singleton.getInstance().k.clear();
//            Singleton.getInstance().ka.clear();
//            Singleton.getInstance().stack1.remove(Singleton.getInstance().stack1.size()-1);
//            Singleton.getInstance().stack2.remove(Singleton.getInstance().stack2.size()-1);
//            Singleton.getInstance().stack3.remove(Singleton.getInstance().stack3.size()-1);
//            Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.size()-1);
//            Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.size()-1);
//            Singleton.getInstance().stack6.remove(Singleton.getInstance().stack6.size()-1);
//            Singleton.getInstance().stack7.remove(Singleton.getInstance().stack7.size()-1);

//            for(int j=0; j<Singleton.getInstance().stack1.size(); j++) {
//                if(Singleton.getInstance().stack1.get(j).number == card.number &&
//                        Singleton.getInstance().stack1.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack1.get(j).suit);
//                    //Singleton.getInstance().stack1.remove(j);
//                    Singleton.getInstance().stack1.remove(Singleton.getInstance().stack1.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack2.size(); j++) {
//                if(Singleton.getInstance().stack2.get(j).number == card.number &&
//                        Singleton.getInstance().stack2.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack2.get(j).suit);
//                    //Singleton.getInstance().stack2.remove(j);
//                    Singleton.getInstance().stack2.remove(Singleton.getInstance().stack2.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack3.size(); j++) {
//                if(Singleton.getInstance().stack3.get(j).number == card.number &&
//                        Singleton.getInstance().stack3.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack3.get(j).suit);
//                    //Singleton.getInstance().stack3.remove(j);
//                    Singleton.getInstance().stack3.remove(Singleton.getInstance().stack3.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack4.size(); j++) {
//                if(Singleton.getInstance().stack4.get(j).number == card.number &&
//                        Singleton.getInstance().stack4.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack4.get(j).suit);
//                    //Singleton.getInstance().stack4.remove(j);
//                    Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack5.size(); j++) {
//                if(Singleton.getInstance().stack5.get(j).number == card.number &&
//                        Singleton.getInstance().stack5.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack5.get(j).suit);
//                    //Singleton.getInstance().stack5.remove(j);
//                    Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack6.size(); j++) {
//                if(Singleton.getInstance().stack6.get(j).number == card.number &&
//                        Singleton.getInstance().stack6.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack6.get(j).suit);
//                    //Singleton.getInstance().stack6.remove(j);
//                    Singleton.getInstance().stack6.remove(Singleton.getInstance().stack6.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack7.size(); j++) {
//                if(Singleton.getInstance().stack7.get(j).number == card.number &&
//                        Singleton.getInstance().stack7.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack7.get(j).suit);
//                    //Singleton.getInstance().stack7.remove(j);
//                    Singleton.getInstance().stack7.remove(Singleton.getInstance().stack7.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//        }
//        for(int i=0; i<Singleton.getInstance().bs.stacktwo.stack.size(); i++) {
//            Singleton.getInstance().yeoyaee = "hi";
//            Card card = singleton.Singleton.getInstance().bs.stacktwo.stack.get(i);
//            for(int j=0; j<Singleton.getInstance().stack1.size(); j++) {
//                if(Singleton.getInstance().stack1.get(j).number == card.number &&
//                        Singleton.getInstance().stack1.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack1.get(j).suit);
//                    //Singleton.getInstance().stack1.remove(j);
//                    Singleton.getInstance().stack1.remove(Singleton.getInstance().stack1.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack2.size(); j++) {
//                if(Singleton.getInstance().stack2.get(j).number == card.number &&
//                        Singleton.getInstance().stack2.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack2.get(j).suit);
//                    //Singleton.getInstance().stack2.remove(j);
//                    Singleton.getInstance().stack2.remove(Singleton.getInstance().stack2.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack3.size(); j++) {
//                if(Singleton.getInstance().stack3.get(j).number == card.number &&
//                        Singleton.getInstance().stack3.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack3.get(j).suit);
//                    //Singleton.getInstance().stack3.remove(j);
//                    Singleton.getInstance().stack3.remove(Singleton.getInstance().stack3.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack4.size(); j++) {
//                if(Singleton.getInstance().stack4.get(j).number == card.number &&
//                        Singleton.getInstance().stack4.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack4.get(j).suit);
//                    //Singleton.getInstance().stack4.remove(j);
//                    Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack5.size(); j++) {
//                if(Singleton.getInstance().stack5.get(j).number == card.number &&
//                        Singleton.getInstance().stack5.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack5.get(j).suit);
//                    //Singleton.getInstance().stack5.remove(j);
//                    Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack6.size(); j++) {
//                if(Singleton.getInstance().stack6.get(j).number == card.number &&
//                        Singleton.getInstance().stack6.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack6.get(j).suit);
//                    //Singleton.getInstance().stack6.remove(j);
//                    Singleton.getInstance().stack6.remove(Singleton.getInstance().stack6.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack7.size(); j++) {
//                if(Singleton.getInstance().stack7.get(j).number == card.number &&
//                        Singleton.getInstance().stack7.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack7.get(j).suit);
//                    //Singleton.getInstance().stack7.remove(j);
//                    Singleton.getInstance().stack7.remove(Singleton.getInstance().stack7.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//        }
//        for(int i=0; i<Singleton.getInstance().bs.stackthree.stack.size(); i++) {
//            Singleton.getInstance().yeoyaee = "hi";
//            Card card = singleton.Singleton.getInstance().bs.stackthree.stack.get(i);
//            for(int j=0; j<Singleton.getInstance().stack1.size(); j++) {
//                if(Singleton.getInstance().stack1.get(j).number == card.number &&
//                        Singleton.getInstance().stack1.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack1.get(j).suit);
//                    //Singleton.getInstance().stack1.remove(j);
//                    Singleton.getInstance().stack1.remove(Singleton.getInstance().stack1.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack2.size(); j++) {
//                if(Singleton.getInstance().stack2.get(j).number == card.number &&
//                        Singleton.getInstance().stack2.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack2.get(j).suit);
//                    //Singleton.getInstance().stack2.remove(j);
//                    Singleton.getInstance().stack2.remove(Singleton.getInstance().stack2.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack3.size(); j++) {
//                if(Singleton.getInstance().stack3.get(j).number == card.number &&
//                        Singleton.getInstance().stack3.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack3.get(j).suit);
//                    //Singleton.getInstance().stack3.remove(j);
//                    Singleton.getInstance().stack3.remove(Singleton.getInstance().stack3.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack4.size(); j++) {
//                if(Singleton.getInstance().stack4.get(j).number == card.number &&
//                        Singleton.getInstance().stack4.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack4.get(j).suit);
//                    //Singleton.getInstance().stack4.remove(j);
//                    Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack5.size(); j++) {
//                if(Singleton.getInstance().stack5.get(j).number == card.number &&
//                        Singleton.getInstance().stack5.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack5.get(j).suit);
//                    //Singleton.getInstance().stack5.remove(j);
//                    Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack6.size(); j++) {
//                if(Singleton.getInstance().stack6.get(j).number == card.number &&
//                        Singleton.getInstance().stack6.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack6.get(j).suit);
//                    //Singleton.getInstance().stack6.remove(j);
//                    Singleton.getInstance().stack6.remove(Singleton.getInstance().stack6.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack7.size(); j++) {
//                if(Singleton.getInstance().stack7.get(j).number == card.number &&
//                        Singleton.getInstance().stack7.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack7.get(j).suit);
//                    //Singleton.getInstance().stack7.remove(j);
//                    Singleton.getInstance().stack7.remove(Singleton.getInstance().stack7.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//        }
//        for(int i=0; i<Singleton.getInstance().bs.stackfour.stack.size(); i++) {
//            Singleton.getInstance().yeoyaee = "hi";
//            Card card = singleton.Singleton.getInstance().bs.stackfour.stack.get(i);
//            for(int j=0; j<Singleton.getInstance().stack1.size(); j++) {
//                if(Singleton.getInstance().stack1.get(j).number == card.number &&
//                        Singleton.getInstance().stack1.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack1.get(j).suit);
//                    //Singleton.getInstance().stack1.remove(j);
//                    Singleton.getInstance().stack1.remove(Singleton.getInstance().stack1.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack2.size(); j++) {
//                if(Singleton.getInstance().stack2.get(j).number == card.number &&
//                        Singleton.getInstance().stack2.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack2.get(j).suit);
//                    //Singleton.getInstance().stack2.remove(j);
//                    Singleton.getInstance().stack2.remove(Singleton.getInstance().stack2.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack3.size(); j++) {
//                if(Singleton.getInstance().stack3.get(j).number == card.number &&
//                        Singleton.getInstance().stack3.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack3.get(j).suit);
//                    //Singleton.getInstance().stack3.remove(j);
//                    Singleton.getInstance().stack3.remove(Singleton.getInstance().stack3.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack4.size(); j++) {
//                if(Singleton.getInstance().stack4.get(j).number == card.number &&
//                        Singleton.getInstance().stack4.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack4.get(j).suit);
//                    //Singleton.getInstance().stack4.remove(j);
//                    Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack5.size(); j++) {
//                if(Singleton.getInstance().stack5.get(j).number == card.number &&
//                        Singleton.getInstance().stack5.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack5.get(j).suit);
//                    //Singleton.getInstance().stack5.remove(j);
//                    Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack6.size(); j++) {
//                if(Singleton.getInstance().stack6.get(j).number == card.number &&
//                        Singleton.getInstance().stack6.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack6.get(j).suit);
//                    //Singleton.getInstance().stack6.remove(j);
//                    Singleton.getInstance().stack6.remove(Singleton.getInstance().stack6.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
//            for(int j=0; j<Singleton.getInstance().stack7.size(); j++) {
//                if(Singleton.getInstance().stack7.get(j).number == card.number &&
//                        Singleton.getInstance().stack7.get(j).suit == card.suit) {
//                    System.out.println("-" + card.number + " " +
//                        Singleton.getInstance().stack7.get(j).suit);
//                    //Singleton.getInstance().stack7.remove(j);
//                    Singleton.getInstance().stack7.remove(Singleton.getInstance().stack7.size()-1);
//                    Singleton.getInstance().ka.clear();
//                    singleton.Singleton.getInstance().gr.setColor(new Color(123, 190, 81));
//                    singleton.Singleton.getInstance().gr.fillRect(0, 0, 1370, 600);
//                }
//            }
         }}

        singleton.Singleton.getInstance().gr.setColor(new Color(23, 90, 41));
        singleton.Singleton.getInstance().gr.fillRect(0, 600, 1370, 300);
        singleton.Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 188));
        singleton.Singleton.getInstance().gr.drawString("SOLITAIRE", 220, 500);
        singleton.Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 13));

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
            Singleton.getInstance().gr.setColor(Color.BLACK) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            Singleton.getInstance().gr.setColor(Color.RED) ;
            Singleton.getInstance().gr.drawLine(200, 70, 260, 70);
            Singleton.getInstance().gr.drawLine(300, 70, 360, 70);
            Singleton.getInstance().gr.drawLine(400, 70, 460, 70);
            Singleton.getInstance().gr.drawLine(500, 70, 560, 70);
            Singleton.getInstance().gr.drawLine(600, 70, 660, 70);
            Singleton.getInstance().gr.drawLine(700, 70, 760, 70);
            Singleton.getInstance().gr.drawLine(800, 70, 860, 70);
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
            Singleton.getInstance().gr.setColor(Color.BLACK) ;
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
            Singleton.getInstance().gr.setColor(Color.BLACK) ;
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
            Singleton.getInstance().gr.setColor(Color.BLACK) ;
            Singleton.getInstance().gr.drawRect(x, y, width, height);
            try {
                Image potImg = ImageIO.read(this.getClass().getResource("pot.jpg"));
                Singleton.getInstance().gr.drawImage(potImg, 902, 661, 80, 80, null);
            } catch(Exception e) {}
        }
    }
}