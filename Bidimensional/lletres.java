import java.util.Random;

public class lletres {
    public static void main(String[] args) {
        int rondes;
        String noms[] = new String[2];
        int constantnum = 0;
        int vocalnum = 0;
        char cov[] = new char[] { 'c', 'v' };
        Random r = new Random();
        String vocals = "AEIOU";
        String consonants = "QWRTYPLKJHGFDSZXCVBNM";
        char taulafin[] = new char[9];

        for (int i = 0; i < noms.length; i++) {
            noms[i] = System.console().readLine("Com es diu el jugador numero " + (i + 1) + ": ");
        }

        rondes = Integer.parseInt(System.console().readLine("Quantes rondes voleu jugar? "));

        for (int q = 0; q < rondes; q++) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < taulafin.length; i++) {
                    boolean ok = true;
                    while (ok) {
                        int covfin = r.nextInt(2);
                        if (cov[covfin] == 'c' && constantnum < 5) {
                            taulafin[i] = consonants.charAt(r.nextInt(consonants.length()));
                            constantnum++;
                            ok = false;

                        } else if (cov[covfin] == 'v' && vocalnum < 4) {
                            taulafin[i] = vocals.charAt(r.nextInt(vocals.length()));
                            vocalnum++;
                            ok = false;

                        }
                    }
                }
            }
        }
    }
}