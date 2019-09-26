import java.util.HashSet;
import java.util.Set;

public class Trio7{

    public static void main(String[] args) {
        
        int intents = 1;
        int numran = (int)(Math.random()*(999 - 0) + 1);
        int endevinar = (int)(Math.random()*(999 - 0) + 1);

        while(endevinar!=numran){

            endevinar = (int)(Math.random()*(999 - 0) + 1);
            numran = (int)(Math.random()*(999 - 0) + 1);
            intents++;

            }

            System.out.println("Els intents han set: "+intents);
            System.out.println("el numero era: " +endevinar);


        }
    }