package game;
import java.util.Random;
import java.util.Scanner;

class guess {
        Random random = new Random();
        int number;
    public guess() {
        number = random.nextInt(100);
    }
    public int printNum() {
        System.out.println(number);
        return number;
    }
//int score = 50;
    public int userInput(int n) {
            if (n > number) {
                System.out.println(n + " is greater than number.");
//                score = score-10;
            } else if (n < number) {
                System.out.println(n + " is smaller than number.");
//                score = score-10;
            } else if (n == number) {
                System.out.println("congrats u guess the number. " + number);
//                System.out.println(score);
            }
            return number;
        }
    }


public class guessTheNumber {

    public static void main(String[] args) {
        int score = 50;
        Scanner sc = new Scanner(System.in);
        guess Guess = new guess();
        System.out.println("guess the number in 5 tries.");
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a integer between 1-100. try "+i+1);
            int n = sc.nextInt();
            if(Guess.userInput(n)==n){
                System.out.println(score+"/50");
                break;
            }
            else{
                score = score-10;
            }
//            Guess.userInput(n);
            Guess.printNum();
        }

    }
}