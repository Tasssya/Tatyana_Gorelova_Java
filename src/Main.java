import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter any number");
        {
            int a = console.nextInt();
            if (a > 7)
                System.out.println("Hello");
        }
        System.out.println("Enter Name");
        String name = console.next();
        {
            if (name == "John")
                System.out.println("Hello John");
            else
                System.out.println("There is no such name");
        }

        System.out.println("Enter numeric array, enter 0 when finished");
        ArrayList<Integer> numbers = new ArrayList<>();
        int numb;
        while ((numb = console.nextInt()) != 0) {
            numbers.add(numb);
        }

        System.out.println("Numbers from your array, multiplies 3:");
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}













