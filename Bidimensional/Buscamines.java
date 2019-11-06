import java.util.Random;

public class Buscamines {
    public static void main(String[] args) {

        int linies = Integer.parseInt(System.console().readLine("Digues el numero de linies que vols: "));
        int bombes = Integer.parseInt(System.console().readLine("Digues el numero de bombes que vols: "));
        int buscamines[][] = new int[linies][linies];
        String buscaminesdef[][] = new String[linies][linies];
        Random r = new Random();
        int posicioa = r.nextInt(linies);
        int posiciob = r.nextInt(linies);

        for (int i = 0; i < buscaminesdef.length; i++) {
            for (int j = 0; j < buscaminesdef[0].length; j++) {
                buscaminesdef[i][j] = "▓▓";
            }
        }
        int timur = 0;
        while (timur < bombes) {
            posicioa = r.nextInt(linies);
            posiciob = r.nextInt(linies);

            if (buscamines[posicioa][posiciob] == 1000) {
                posicioa = r.nextInt(linies);
                posiciob = r.nextInt(linies);
            } else {
                buscamines[posicioa][posiciob] = 1000;
                timur++;
            }
            
        }

        for (int i = 0; i < buscamines.length; i++) {
            for (int j = 0; j < buscamines[0].length; j++) {
                if (buscamines[i][j]==1000){
                    if (i==0 && j==0){
                        if (buscamines[i][j+1]!=1000){
                            buscamines[i][j+1]++;
                        }
                        if (buscamines[i+1][j]!=1000){
                            buscamines[i+1][j]++;
                        }
                        if (buscamines[i+1][j+1]!=1000){
                            buscamines[i+1][j+1]++;
                        }
                    }
                    else if (i==(linies-1) && j==0){
                        if (buscamines[linies-2][j]!=1000){
                            buscamines[linies-2][j]++;
                        }
                        if (buscamines[linies-1][j+1]!=1000){
                            buscamines[linies-1][j+1]++;
                        }
                        if (buscamines[linies-2][j+1]!=1000){
                            buscamines[linies-2][j+1]++;
                        }
                    }
                    else if (i==0 && j==(linies-1)){
                        if (buscamines[i][linies-2]!=1000){
                            buscamines[i][linies-2]++;
                        }
                        if (buscamines[i+1][linies-1]!=1000){
                            buscamines[i+1][linies-1]++;
                        }
                        if (buscamines[i+1][linies-2]!=1000){
                            buscamines[i+1][linies-2]++;
                        }
                    }
                    else if (i==(linies-1) && j==(linies-1)){
                        if (buscamines[linies-2][linies-1]!=1000){
                            buscamines[linies-2][linies-1]++;
                        }
                        if (buscamines[linies-1][linies-2]!=1000){
                            buscamines[linies-1][linies-2]++;
                        }
                        if (buscamines[linies-2][linies-2]!=1000){
                            buscamines[linies-2][linies-2]++;
                        }
                    }
                    else if (i==0){
                        if (buscamines[i][j-1]!=1000){
                            buscamines[i][j-1]++;
                        }
                        if (buscamines[i][j+1]!=1000){
                            buscamines[i][j+1]++;
                        }
                        if (buscamines[i+1][j]!=1000){
                            buscamines[i+1][j]++;
                        }
                        if (buscamines[i+1][j-1]!=1000){
                            buscamines[i+1][j-1]++;
                        }
                        if (buscamines[i+1][j+1]!=1000){
                            buscamines[i+1][j+1]++;
                        }
                    }
                    else if (i==(linies-1)){
                        if (buscamines[linies-2][j]!=1000){
                            buscamines[linies-2][j]++;
                        }
                        if (buscamines[linies-2][j+1]!=1000){
                            buscamines[linies-2][j+1]++;
                        }
                        if (buscamines[linies-2][j-1]!=1000){
                            buscamines[linies-2][j-1]++;
                        }
                        if (buscamines[linies-1][j+1]!=1000){
                            buscamines[linies-1][j+1]++;
                        }
                        if (buscamines[linies-1][j-1]!=1000){
                            buscamines[linies-1][j-1]++;
                        }
                    }
                    else if (j==0){
                        if (buscamines[i][j+1]!=1000){
                            buscamines[i][j+1]++;
                        }
                        if (buscamines[i+1][j+1]!=1000){
                            buscamines[i+1][j+1]++;
                        }
                        if (buscamines[i-1][j+1]!=1000){
                            buscamines[i-1][j+1]++;
                        }
                        if (buscamines[i+1][j]!=1000){
                            buscamines[i+1][j]++;
                        }
                        if (buscamines[i-1][j]!=1000){
                            buscamines[i-1][j]++;
                        }
                    }
                    else if (j==(linies-1)){
                        if (buscamines[i][linies-2]!=1000){
                            buscamines[i][linies-2]++;
                        }
                        if (buscamines[i+1][linies-2]!=1000){
                            buscamines[i+1][linies-2]++;
                        }
                        if (buscamines[i-1][linies-2]!=1000){
                            buscamines[i-1][linies-2]++;
                        }
                        if (buscamines[i+1][linies-1]!=1000){
                            buscamines[i+1][linies-1]++;
                        }
                        if (buscamines[i-1][linies-1]!=1000){
                            buscamines[i-1][linies-1]++;
                        }
                    }
                    else {
                        if (buscamines[i][j-1]!=1000){
                            buscamines[i][j-1]++;
                        }
                        if (buscamines[i][j+1]!=1000){
                            buscamines[i][j+1]++;
                        }
                        if (buscamines[i+1][j]!=1000){
                            buscamines[i+1][j]++;
                        }
                        if (buscamines[i-1][j]!=1000){
                            buscamines[i-1][j]++;
                        }
                        if (buscamines[i-1][j-1]!=1000){
                            buscamines[i-1][j-1]++;
                        }
                        if (buscamines[i+1][j+1]!=1000){
                            buscamines[i+1][j+1]++;
                        }
                        if (buscamines[i-1][j+1]!=1000){
                            buscamines[i-1][j+1]++;
                        }
                        if (buscamines[i+1][j-1]!=1000){
                            buscamines[i+1][j-1]++;
                        }
                    }
                }
            }
        }

        System.out.print("\n");
        System.out.print("\t");
        for (int i = 0; i < buscamines[0].length; i++) {
            System.out.print((i) + "\t");
        }
        for (int i = 0; i < buscamines.length; i++) {
            System.out.print("\n");
            System.out.print("\n");
            System.out.print((i) + "\t");
            for (int j = 0; j < buscamines[0].length; j++) {
                System.out.print(buscaminesdef[i][j] + "\t");
            }
        }
        System.out.print("\n");
        System.console().readLine("Prem intro per jugar.");

        boolean acabat = false;
        boolean explotat = false;
        int torn=0;
        while (!acabat && !explotat) {
            System.out.print("\n");
            String bomba = System.console().readLine("Quina posicio tries? (0-0) ");
            torn++;
            String[] parts = bomba.split("-");
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);
            buscaminesdef[part1][part2]=Integer.toString(buscamines[part1][part2]);
            System.out.print("\t");
            for (int i = 0; i < buscamines[0].length; i++) {
                System.out.print((i) + "\t");
            }
            for (int i = 0; i < buscamines.length; i++) {
                System.out.println();
                System.out.print("\n");
                System.out.print(+(i) + "\t");
                for (int j = 0; j < buscamines[0].length; j++) {
                    System.out.print(buscaminesdef[i][j] + "\t");
                }
            }
            if (buscamines[part1][part2]==1000){
                explotat=true; 
                System.out.print("\n");
                System.out.println("T'has topat amb un creeperino.");
            }
            if (torn==(linies*linies)-bombes){
                acabat=true;
                System.out.print("\n");
                System.out.println("Has guanyat.");
            }
        }
    }
}