/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author d
 */
public class BottomStacks {
    public data.StackOne stackone;
    public data.StackTwo stacktwo;
    public data.StackThree stackthree;
    public data.StackFour stackfour;
    public BottomStacks() {
        stackone = new data.StackOne();
        stacktwo = new data.StackTwo();
        stackthree = new data.StackThree();
        stackfour = new data.StackFour();
    }
    public void drawall() {
        stackone.drawall();
        stacktwo.drawall();
        stackthree.drawall();
        stackfour.drawall();
    }
}
