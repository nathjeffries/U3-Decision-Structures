import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.sql.SQLOutput;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */
    public static void main(String[] args) {

        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What grade level are you in? (9, 10, 11, 12)"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had?"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("About how much money do you have? Round down to nearest $5"));

        if(gradeLevel >= 11){

            if(discipline >= 1){
                System.out.println("You can't go to Prom. That's ok, you can't get stood up for gasoline sushi either.");
            }else{

                if(money >= 40){
                    System.out.println("You can get a Prom ticket, but no gasoline sushi for u");
                }else{
                    System.out.println("You can't go to Prom, but you can get gasoline sushi");
                }

            }

        }else{
            System.out.println("You can't go to Prom. That's ok, you can't get stood up for gasoline sushi either.");

        }

    }

}
