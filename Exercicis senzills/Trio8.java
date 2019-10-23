import java.util.Random;
public class Trio8{
    public static void main(String[] args) {
        
        Random r = new Random();
        int numPremiat=r.nextInt(1000);
        int arrayNums[] = new int[1000];
        int numAleatori=0;
        boolean trobat = false;
        int intents=0;
        int repetits=0;

        for(int i=0;i<arrayNums.length;i++){

            arrayNums[i]=2000;
        }

        while(!trobat){

            numAleatori=r.nextInt(1000);
            boolean coincidencia=false;

            for(int i=0;i<arrayNums.length;i++){

                if(numAleatori==arrayNums[i]){

                    coincidencia=true;

                }
            }
            if(coincidencia==false){

                arrayNums[intents]=numAleatori;
                intents++;

                if(numAleatori==numPremiat){

                    trobat=true;
                }
            }
            else if(coincidencia==true){
               repetits++; 
            }
        }
        System.out.println("Premi! El numero d'intents ha estat de "+intents);
        System.out.println("S'ha repetit "+repetits+" vegades.");
        System.out.println("El numero premiat és: "+numPremiat);
        System.out.println("El numero aleatori és: "+numAleatori);
    }
}