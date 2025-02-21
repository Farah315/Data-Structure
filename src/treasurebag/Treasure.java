/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treasurebag;

/**
 *
 * @author Al-Qema
 */
public class Treasure {
    String name;
    int count ;

    public Treasure(String name) {
        this.name = name;
        this.count = 1;
    }

    public void increaseCount() {
        count++;
    }

    public void decreaseCount() {
        count--;
    }

    public String toString() {
        return name + " - " + count + " times";
    }
}
   