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
            if (sexe=="M")
                System.out.println(""+nom+" la teva categoria es: Juvenil masculi");
            else if (sexe=="F") 
                System.out.println(""+nom+" la teva categoria es: Juvenil femeni");
            else 
            System.out.println("me gustan las poitas 2");
        }
        else
        System.out.println("me gustan las poitas");
    }
}