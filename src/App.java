import java.util.Random;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        //Scanner in = new scanner(System.in);
        Random random = new Random ();




        int randomNumber1 = random.nextInt(11);
        int randomNumber2 = random.nextInt(11);
        int randomNumber3 = random.nextInt(11);

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        if (randomNumber1 == 7 | randomNumber2 == 7 | randomNumber3 == 7){

            System.out.println("Onnea voitit!");

        } else System.out.println("Voi harmi, Hävisit!");








        
    }
}
