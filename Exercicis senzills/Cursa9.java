public class Cursa9 {
    public static void main(String[] args) {

        String arrayNom[] = new String[1000];
        int posicion = 0;
        String nom1 = "D";
        boolean fi = false;
        long start;
        while (!fi) {
            System.out.println("Introdueix el teu nom(Per finalitzar escriu x): ");
            nom1 = System.console().readLine();
            if (nom1.equals("x")) {
                fi = true;
            } else {
                arrayNom[posicion] = nom1;
                posicion++;              
                
            }

        }

        for(int i=0;i<(posicion);i++){
            System.out.println("Nom: "+arrayNom[i]+" Dorsal: "+(i+1));
        }

        System.console().readLine("Escriu intro per començar la cursa");
        start = System.currentTimeMillis();
        long arrayTemps[] = new long[posicion];
        int arrayFi[] = new int[posicion];
        for(int i=0; i<posicion;i++){
            arrayFi[i]=(Integer.parseInt(System.console().readLine("Introdueix el dorsal: "))-1);

            arrayTemps[i]=((System.currentTimeMillis()));


        }

        for(int i=0;i<posicion;i++){
            System.out.println("-------------------------------------------");
            float Temps = arrayTemps[i]-start;
            float Temps2=Temps/1000; 
            System.out.println("Ha arribat "+arrayNom[arrayFi[i]]);
            System.out.println("Ha tardat "+Temps2+" segons");
            System.out.println("-------------------------------------------");
        }
/*
        System.out.println("prem enter al començar la cursa.");
        start = System.console().readLine();
        tempsco = System.currentTimeMillis();

        while (posicion2 != 0) {
            System.out.println("numero del dorsal que arriba: ");
            poscur = Integer.parseInt(System.console().readLine());
            tempsfin = System.currentTimeMillis();
            int poscurdef = poscur - 1;
            System.out.println(arrayNom[poscurdef]);

            posd++;

            posicion2--;
        }
*/
    }
}