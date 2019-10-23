public class Ex2{
    public static void main(String[] args) {
        String nom1;
        String nom2;
        int diners1;
        int diners2;
        int diferencia;

        System.out.println("Introdueix el teu nom: ");
        nom1 = System.console().readLine();
        System.out.println("Quants diners tens al banc? ");
        diners1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introdueix el teu nom: ");
        nom2 = System.console().readLine();
        System.out.println("Quants diners tens al banc? ");
        diners2 = Integer.parseInt(System.console().readLine());

        if (diners1<diners2){
            diferencia = diners2-diners1;
            System.out.println(""+nom2+" té "+diferencia+"€ més que "+nom1+".");
        }
        else if(diners2<diners1){
            diferencia = diners1-diners2;
            System.out.println(""+nom1+" té "+diferencia+"€ més que "+nom2+".");
        }
        else{
            System.out.println(""+nom1+" i "+nom2+" tenen la mateixa quantitat: "+diners1+"€.");
        }
    }
}