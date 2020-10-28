package se.lexicon.almgru;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a child.");
                break;
            }
        } while (true);
    }
}
