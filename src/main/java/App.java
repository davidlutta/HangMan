import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) {

        String[] myWords = {"Tiger", "Moon", "Sun", "Dennis", "Lion", "Cat", "Mantissa","Java","Android","Hangman","Asia","Africa","America","Eurasia","Australia","Arctic","Antarctic"};
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        int myIndex = random.nextInt(4);
        String theWord = myWords[myIndex];

        boolean programRun = true;
        while (programRun) {

            System.out.println("Do you Want to play a game of Hang Man ?");
            System.out.println("Answer yes or no: ");
            String response = myScanner.nextLine();
            if (response.equals("yes")) {
                System.out.println("------------------------------");
                System.out.println("WELCOME TO HANGMAN");
                System.out.println("------------------------------");
                System.out.println("Here are the rules");
                System.out.println("1. You will be provided with a clue eg: the starting letter of the word");
                System.out.println("2. You have only 5 tries to get the right word so please keep count");
                System.out.println("3. If you fail the game will end and the word will be shown");
                System.out.println("4. If you get it right great !");
                System.out.println("------------------------------");
                System.out.println("LETS START !!!");
                System.out.println("The word that You should guess has a length of "+theWord.length());
                System.out.println("------------------------------");

                //Looping through the words
                for (int i = 0; i <= theWord.length(); i++) {
                    System.out.println("Enter the Letter you guess");
                    char myInput = myScanner.next().charAt(i);
                    if (myInput == theWord.charAt(i)) {
                        System.out.println("Correct ");
                    }

                }

                //To close the while loop
            } else if(response.equals("no")) {
                programRun = false;
            }
        }
    }
}