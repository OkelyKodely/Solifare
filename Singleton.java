/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import data.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import views.BottomStacks;

/**
 *
 * @author d
 */
public class Singleton {
    public MouseEvent themouseevent;
    public String yeoyaee = "";
    public BottomStacks bs;
    public Graphics gr;
    public String st;
    public ArrayList<Card> stack1;
    public ArrayList<Card> stack2;
    public ArrayList<Card> stack3;
    public ArrayList<Card> stack4;
    public ArrayList<Card> stack5;
    public ArrayList<Card> stack6;
    public ArrayList<Card> stack7;
    public ArrayList<Card> ka;
    public ArrayList<Card> k;
    public Cards cas;
    public int rt;
    static Singleton singleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
