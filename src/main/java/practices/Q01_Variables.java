package practices;

public class Q01_Variables {
    // Write a Java program to break an integer into a sequence of individual digits.
// Hint: use / and %
// x: input: 12345
//    output: 1
//            2
//            3
//            4
//            5

    public static void main(String[] args) {

        int x = 12345;

        int ones = x % 10;      // 5
        int tens = (x / 10) % 10; // 4
        int hunders = (x / 100) % 10;  // 3
        int thousends = (x / 1000) % 10; // 2
        int tenThousends = (x / 10000) % 10;


        System.out.println(tenThousends + "\n" + thousends + "\n" + hunders + "\n" + tens + "\n" + ones);
    }
}
