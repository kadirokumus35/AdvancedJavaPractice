package practices;

import java.util.Random;

public class Q02_DoWhileLoop_GuessGame {

     /*
Write a game that finds random numbers between 0 and 100.
Hint: If the number you entered is less than randomNumber print ==> Enter a larger number.
If the number you entered is greater than randomNumber print  ==> Enter a smaller number.
If the number you entered is equal to randomNumber print  ==> Congratulations!!!  You found the number.
 */
     public static void main(String[] args) {


         int random = (int)Math.random()*101;
         System.out.println(random);
     }
}
