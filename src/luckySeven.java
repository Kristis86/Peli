import java.util.Random;
import java.util.Scanner;



public class luckySeven {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random ();

        int raha = 5;
        String input = "";
    
        raha--;

        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);
        int randomNumber3 = random.nextInt(10);

        System.out.println(randomNumber1 +1);
        System.out.println(randomNumber2 +1);
        System.out.println(randomNumber3 +1);

        if (randomNumber1 == 7 | randomNumber2 == 7 | randomNumber3 == 7 && raha >= 0){

            System.out.println("Onnea voitit!");
            raha++;
            System.out.println("Rahaa jäljellä " + raha + " euroa");
            if (raha > 0){

                System.out.println("Haluatko pelata uudellen?");
                input = in.nextLine();

            }

        } else System.out.println("Voi harmi, Hävisit!");

        if (raha > 0){

            System.out.println("Haluatko pelata uudellen?");
            input = in.nextLine();

        } else System.out.println("Peli loppui!");


        








        
    }
}
