/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author d
 */
public class StackThree {
    public ArrayList<Card> stack = new ArrayList<>();
    public void drawall() {
        for(int i=0; i<stack.size(); i++) {
            stack.get(i).stackNeim = "StackThree";
            try {
                stack.get(i).drawCardAtLocation(330, 660);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
