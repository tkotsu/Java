public class Exemple2{
    public static void main(String[] args) {

        System.out.println("Usuari1: intro el teu nom");
        String nom1=System.console().readLine();

        System.out.println("Introdueix la edat");
        int edat1 = Integer.parseInt(System.console().readLine());

        System.out.println("Usuari2: intro el teu nom");
        String nom2=System.console().readLine();

        System.out.println("Introdueix la edat");
        int edat2 = Integer.parseInt(System.console().readLine());

        int diferencia=0;
        diferencia=edat1-edat2;

        if(diferencia==0){

            System.out.println("son iguals");

        }else if(diferencia<0){

            System.out.println(nom2+" és més gran. La diferència és "+(edat2-edat1));
            
        }else {

            System.out.println(nom1+" és més gran. La diferència és "+(edat1-edat2));
        }
    }
}