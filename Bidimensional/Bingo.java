import java.util.Random;

public class Bingo {
    public static void main(String[] args) {

        Random r = new Random();
        int arrayNum[][] = new int[3][9];
        String bingo[][] = new String[3][9];
        int blanco[] = new int[9];
        int aux = 0;
        int aleatori = 0;
        int opcioa = 0;
        int opciob = 0;
        int opcioc = 0;
        int xd = 0;

        for (int ñ = 0; ñ < blanco.length; ñ++) {
            blanco[ñ] = 1000;
        }

        for (int l = 0; l < blanco.length; l++) {
            boolean ttttt = false;
            while ((opcioa < 3 || opciob < 3 || opcioc < 3) && !ttttt) {
                xd = r.nextInt(3);
                if (xd == 0 && opcioa < 3) {
                    blanco[l] = xd;
                    opcioa++;

                    ttttt = true;
                } else if (xd == 1 && opciob < 3) {
                    blanco[l] = xd;
                    opciob++;

                    ttttt = true;
                } else if (xd == 2 && opcioc < 3) {
                    blanco[l] = xd;
                    opcioc++;

                    ttttt = true;
                }
            }

        }
        System.out.print("\n");

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < arrayNum[0].length; j++) {
                int k = 0;
                while (k == 0) {
                    aleatori = r.nextInt(9) + (10 * j);
                    boolean coin = false;
                    boolean zero = false;

                    for (int m = 0; m < arrayNum.length; m++) {

                        if (arrayNum[m][j] == aleatori) {
                            coin = true;
                            break;
                        }
                        coin = false;
                    }
                    if (!coin) {
                        arrayNum[i][j] = aleatori;
                        System.out.print(arrayNum[i][j] + " ");
                        k++;
                    }
                }
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        for (int n = 0; n < blanco.length; n++) {
            System.out.print(blanco[n] + " ");
        }
        System.out.print("\n");
        for (int x = 0; x < 2; x++) {
            for (int j = 0; j < arrayNum[0].length; j++) {

                for (int i = 0; i < arrayNum.length - 1; i++) {
                    if (arrayNum[i][j] > arrayNum[i + 1][j]) {
                        aux = arrayNum[i][j];
                        arrayNum[i][j] = arrayNum[i + 1][j];
                        arrayNum[i + 1][j] = aux;

                    }

                }
            }
        }

        for (int i = 0; i < arrayNum.length; i++) {

            for (int j = 0; j < arrayNum[0].length; j++) {

                arrayNum[blanco[j]][j] = 0;
                if ((arrayNum[i][j]) == 0) {
                    bingo[i][j] = "X";
                } else {
                    bingo[i][j] = Integer.toString(arrayNum[i][j]);
                }

            }
        }
        for (int i = 0; i < bingo.length; i++) {
            System.out.println();
            for (int j = 0; j < bingo[0].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
        }
        System.out.print("\n");
        System.console().readLine("Prem intro per jugar.");

        int numbing = r.nextInt(100);
        int i = 0;
        int numrepe[] = new int[120];
        
    }
}
