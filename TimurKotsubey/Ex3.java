public class Ex3{
    public static void main(String[] args) {
        String nom;
        float voltes;

        System.out.println("Com et dius? ");
        nom = System.console().readLine();
        System.out.println("Escriu les voltes que has fet: ");
        voltes = Float.parseFloat(System.console().readLine());

        if (voltes<6){
            System.out.println(""+nom+", la teva nota al test de couper és un Molt Deficient.");
        }
        else if (voltes<8){
            System.out.println(""+nom+", la teva nota al test de couper és un Insuficient.");
        }
        else if (voltes<9){
            System.out.println(""+nom+", la teva nota al test de couper és un Suficient.");
        }
        else if (voltes<10){
            System.out.println(""+nom+", la teva nota al test de couper és un Bé.");
        }
        else if (voltes<11){
            System.out.println(""+nom+", la teva nota al test de couper és un Notable.");
        }
        else if (voltes>=11){
            System.out.println(""+nom+", la teva nota al test de couper és un Excel·lent.");
        }
    }
}