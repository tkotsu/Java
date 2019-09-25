public class Supermercat{
    public static void main(String[] args) {
        String objecte;
        float preu;
        float des;
        float des2;
        float res;
        float res2;
        System.out.println("Introdueix el nom de l'article:");
        objecte = System.console().readLine();
        System.out.println("Introdueix el preu original: (€)");
        preu = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el descompte a aplicar: (%)");
        des = Float.parseFloat(System.console().readLine());
        des2 = des/100;
        res = preu*des2;
        res2 = preu-res;

        System.out.println("El preu final de l'article "+objecte+" es de "+res2+"€");
    }
}