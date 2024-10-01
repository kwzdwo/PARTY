import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //create a scanner and read in the partyAfil
        Scanner console = new Scanner(System.in);
        String partyAfil = "";

        System.out.println("Enter your party Affiliation [R, D, I]: ");
        partyAfil = console.nextLine();

        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You get a republican Elephant!");
        }
        else if (partyAfil.equalsIgnoreCase("D")) {
            System.out.println("You get an Democratic Donkey!");
        }
        else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println("You Are independent!");
        }
        else {
            System.out.println("You don't belong to any party!");
        }
    }

}