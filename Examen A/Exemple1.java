public class Exemple1{
    public static void main(String[] args) {
        System.out.println("Introdueix la teva edat");
        int edat = Integer.parseInt(System.console().readLine());

        if (edat<18){

            System.out.println("Hauras d'esperar "+(18-edat)+" anys per treuret el carnet de conduir.");
        }
        else{
            System.out.println("Ja et pots treure el carnet de conduir perque ja ets major d'edat.");
        }
    }
}