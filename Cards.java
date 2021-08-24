/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author d
 */
public class Cards {
    public ArrayList<Card> cars = new ArrayList<>();
    public ArrayList<Card> crs = new ArrayList<>();
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
            Image potImg = ImageIO.read(this.getClass().getResource("../pot.jpg"));
            singleton.Singleton.getInstance().gr.drawImage(potImg, 80, 85, 104, 160, null);
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
