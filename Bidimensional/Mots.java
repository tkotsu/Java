public class Mots{
    public static void main(String[] args) {
        int rondes;
        String noms [] = new String [2];
        String Primeraparaula;
        String mot;
        char ultima1;
        char ultima2;
        String ultimadef;

        rondes = Integer.parseInt(System.console().readLine("Quantes rondes vols jugar?"));
        for (int i=0; i<noms.length;i++){
            noms[i] = System.console().readLine("Com es diu el jugador numero "+(i+1)+"?");
        }

        Primeraparaula = System.console().readLine("Digues una paraula per començar:");
        ultima1 = Primeraparaula.charAt(Primeraparaula.length()-2);
        ultima2 = Primeraparaula.charAt(Primeraparaula.length()-1);
        ultimadef = String.valueOf(String.valueOf(ultima1)+String.valueOf(ultima2));
        
        int i=0;
        int j=0;

        loopxulo:
        for (i=0;i<rondes;i++){
            System.out.println();
            System.out.println("ronda "+(i+1));
            for (j=0;j<2;j++) {
                System.out.println("Torn del jugador "+noms[j]);
                System.out.println("Escriu una paraula que començi per "+ultimadef);
                mot = System.console().readLine();
                if (mot.startsWith(ultimadef)){
                    ultima1 = mot.charAt(mot.length()-2);
                    ultima2 = mot.charAt(mot.length()-1);
                    ultimadef = String.valueOf(String.valueOf(ultima1)+String.valueOf(ultima2));
                }
                else {
                    break loopxulo;
                }
            }
        }
        if (rondes == i){
            j = 5;
            System.out.println("Han guanyat els dos per aguantar fins la ultima ronda.");
        }
        
        if (j==1){
            System.out.println("Ha perdut el jugador "+noms[j]);
            System.out.println("Heu perdut en la ronda "+(i+1));
        }
        else if (j==0){
            System.out.println("Ha perdut el jugador "+noms[j]);
            System.out.println("Heu perdut en la ronda "+(i+1));
        }
    }
}