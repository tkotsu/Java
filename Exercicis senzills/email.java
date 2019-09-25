public class email{
    public static void main(String[] args) {
        
        String nom;
        String cognom;
        String domini;

        System.out.println("introduiex el seu nom: ");
        nom = System.console().readLine();
        System.out.println("Introduiex el seu cognom: ");
        cognom = System.console().readLine();
        System.out.println("Introduiex el domini que voleu utilitzar: ");
        domini = System.console().readLine();

        System.out.println("El seu correu es: "+nom+"."+cognom+"@"+domini);

    }
}