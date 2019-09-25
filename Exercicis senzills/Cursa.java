public class Cursa{
    public static void main(String[] args) {

        String nom;
        int edat;
        String sexe;

        System.out.println("Com et dius?");
        nom = System.console().readLine();
        System.out.println("Quants anys tens");
        edat = Integer.parseInt(System.console().readLine());
        System.out.println("Introdueix el teu genere: (F/M)");
        sexe = System.console().readLine();

        if (edat<=16){
            
            if (sexe.equals("M"))
                System.out.println(""+nom+" la teva categoria es: Juvenil masculi");

            else if (sexe.equals("F")) 
                System.out.println(""+nom+" la teva categoria es: Juvenil femeni");
        }

        else if (edat<=65){
            
            if (sexe.equals("M"))
                System.out.println(""+nom+" la teva categoria es: Senior masculi");

            else if (sexe.equals("F"))
                System.out.println(""+nom+" la teva categoria es: Senior femenu");
        }

        else if (edat>65){

            if (sexe.equals("M"))
                System.out.println(""+nom+" la teva categoria es: Vetera masculi");

            else if(sexe.equals("F"))
                System.out.println(""+nom+" la teva categoria es: Vetera femeni");
        }
    }
}