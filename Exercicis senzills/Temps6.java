public class Temps6{
    public static void main(String[] args) {

        
        long finish;
        String jutges;
        long start = System.currentTimeMillis();


        System.out.println("Escriu 'Setze jutges d'un jutjat mengen fetge en un penjat'");
        jutges = System.console().readLine();
        finish = System.currentTimeMillis();


        if (jutges.equals("Setze jutges d'un jutjat mengen fetge en un penjat")){
        float res = (finish-start);
        float res2;
        res2 = res/1000;
        res2 = Float.parseFloat(String.format("%.2f", res2));
        System.out.println(""+res2+" segons");
        }


        else 
        System.out.println("T'has equivocat.");
    }
}