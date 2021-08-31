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
public class StackOne {
    public ArrayList<Card> stack = new ArrayList<>();
    public void drawall() {
        System.out.println(stack.size() + "+++");
        for(int i=0; i<stack.size(); i++) {
            stack.get(i).stackNeim = "StackOne";
            try {
                stack.get(i).drawCardAtLocation(50, 660);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
