import java.util.Scanner;
import javax.swing.JOptionPane;
public class AddORMultiply {

static int num1,num2;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
        if (num1 > num2)
            Multiply();

        else
            Add();











    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */
    }

    private static void Multiply() {
        JOptionPane.showMessageDialog(null,num1*num2);
    }

    private static void Add() {
        JOptionPane.showMessageDialog(null,num1+num2);
    }


}
