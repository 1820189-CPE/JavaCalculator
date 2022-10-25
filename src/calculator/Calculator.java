/* Created by: Neil Javier
    CPE 3A
*/


package calculator;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
            
                
		String choice;       
                Scanner scanner = new Scanner(System.in); 
              
                while (true){
		choice = JOptionPane.showInputDialog("""
                                                            Please Select an Operator:
                                                '+' Add    '-' Subtract    '*' Multiply   '/' Divide 
                                       
                                                'r' for squareroot              'x' Exit   """);
                try {
                switch (choice) {
                        case "+":
                              String no1_add = 
                              JOptionPane.showInputDialog("Enter the First Number: ");
                              String no2_add =
                              JOptionPane.showInputDialog("Enter the Second Number: ");

                              int add1 = Integer.parseInt(no1_add); 
                              int add2 = Integer.parseInt(no2_add);
                              int sum = add1 + add2;

                              JOptionPane.showMessageDialog(null, "Result: " + sum, 
                         "Addition", JOptionPane.PLAIN_MESSAGE);
                                break;
                                
                        case "-":
                              String no1_minus = 
                              JOptionPane.showInputDialog("Enter the First Number: ");
                              String no2_minus =
                              JOptionPane.showInputDialog("Enter the Second Number: ");

                              int minus1 = Integer.parseInt(no1_minus);
                              int minus2 = Integer.parseInt(no2_minus);
                              int minuend = minus1 - minus2;

                              JOptionPane.showMessageDialog(null, "Result: " + minuend,
                         "Subtraction", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                        case "*":
                              String no1_times =
                              JOptionPane.showInputDialog("Enter the First Number: ");
                              String no2_times =
                              JOptionPane.showInputDialog("Enter the Second Number: ");

                              int times1 = Integer.parseInt(no1_times);
                              int times2 = Integer.parseInt(no2_times);
                              int product = times1 * times2;

                              JOptionPane.showMessageDialog(null, "Result: " + product,
                         "Multiplication", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                         case "/":
                              String no1_divide =
                              JOptionPane.showInputDialog("Enter the First Number: ");
                              String no2_divide =
                              JOptionPane.showInputDialog("Enter the Second Number: ");

                              int divide1 = Integer.parseInt(no1_divide);
                              int divide2 = Integer.parseInt(no2_divide);
                              int quotient = divide1 / divide2;
                              JOptionPane.showMessageDialog(null, "Result: " + quotient,
                         "Division", JOptionPane.PLAIN_MESSAGE);         
                              break;
                             
                         case "r":   
                             String square =
                             JOptionPane.showInputDialog("Enter Value");
                             
                              int  root = Integer.parseInt(square);                             
                              JOptionPane.showMessageDialog(null, "Result: "+ Math.sqrt(root),
                         "Square Root", JOptionPane.PLAIN_MESSAGE); 
                              break;
                              
                        case "x":
                                JOptionPane.showMessageDialog(null,"Exiting Now! Goodbye");
                                System.exit(0);
                                break;
                        default:
                           JOptionPane.showMessageDialog(null,"Error Invalid!");
                           break;
                           
                }
                           
                    }catch (NumberFormatException el){
                    JOptionPane.showMessageDialog(null,"The entered input are not valid please try again");
                   }
                           
                    }
       
                }
        
           }