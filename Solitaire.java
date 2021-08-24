import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import data.*;
import singleton.Singleton;
import system.*;
import views.Stacker;
import views.Logo;

// Author - Daniel Cho
// www.github.com/okelykodely

public class Solitaire {

    Singleton singleton;
    ArrayList<Card> ka = new ArrayList<>();
    boolean play = true;
    
    Cards cas = new Cards();
    ArrayList<Card> shuffledDeck;
    ArrayList<Card> cards = new ArrayList<>();
    
    JFrame jframe = new JFrame("Solitaire made of Shrek");
    JPanel jpanel = new JPanel();
    
    Graphics gr;

    ArrayList<Card> stack1 = new ArrayList<>();
    ArrayList<Card> stack2 = new ArrayList<>();
    ArrayList<Card> stack3 = new ArrayList<>();
    ArrayList<Card> stack4 = new ArrayList<>();
    ArrayList<Card> stack5 = new ArrayList<>();
    ArrayList<Card> stack6 = new ArrayList<>();
    ArrayList<Card> stack7 = new ArrayList<>();

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
    
    Solitaire() {

        singleton = Singleton.getInstance();
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);
        
        jframe.setBounds(0, 0, 1070, 900);
        jpanel.setBounds(0, 0, 1070, 900);
        
        jframe.add(jpanel);
        jframe.setVisible(true);
        gr = jpanel.getGraphics();
        singleton.gr = gr;

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
        singleton.ka = ka;
        singleton.stack1 = stack1;
        singleton.stack2 = stack2;
        singleton.stack3 = stack3;
        singleton.stack4 = stack4;
        singleton.stack5 = stack5;
        singleton.stack6 = stack6;
        singleton.stack7 = stack7;
        singleton.cas = cas;
        ClickSystem cs = new ClickSystem();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        cs.drawStackCards();
                        Thread.sleep(2000);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a.start();
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
                        Logo logo = new Logo();
                        logo.drawLogoMiddle();
                        cas.draw_All_TopOfStack();   
                        Stacker stacker = new Stacker();
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
                                getClass().getResource("2..wav"));
                        clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                    
                    Solitaire sl = new Solitaire();
                }
            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}