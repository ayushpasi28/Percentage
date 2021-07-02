
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EARTH
 */
public class Percentage {
    public static void main(String[] args) {
            float percentage;
            float total_marks;
        total_marks = 300f;
      float scored,hindi,english,maths;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter hindi marks ::");
      hindi= sc.nextFloat();

      System.out.println("Enter  english marks ::");
      english = sc.nextFloat();
 
        System.out.println("Enter  maths marks");
        maths = sc.nextFloat();
        scored=hindi+english+maths;
      percentage = (float)((scored / total_marks) * 100);
      System.out.println("Percentage ::"+ percentage);
            
    }
    
}
