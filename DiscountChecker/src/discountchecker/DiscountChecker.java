/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountchecker;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DiscountChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int age;
        boolean membershipStatus;
        double finalAmount;
        double totalDue;
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a member? (true/false): ");
        membershipStatus = scanner.nextBoolean();
        System.out.print("Enter the total amount due: R");
        totalDue = scanner.nextDouble();
        
        //For this app if the user is older than 59 or they have an active membership, they are entitled to a 20% discount
        if (age >= 60 || membershipStatus == true) {
            finalAmount = totalDue * 0.80; // Apply 20% discount
        } else {
            finalAmount = totalDue;
        }

        System.out.println("Total amount due = R" + finalAmount);
    }
    

}
