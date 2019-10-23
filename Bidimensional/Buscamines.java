import java.util.Random;

public class Buscamines{
    public static void main(String[] args) {

        int linies = Integer.parseInt(System.console().readLine("Digues el numero de linies que vols: "));
        int bombes = Integer.parseInt(System.console().readLine("Digues el numero de bombes que vols: "));
        int buscamines[][]=new int [linies][linies];
        String buscaminesdef [][]= new String [linies][linies];
        Random r= new Random();
        int posicioa=r.nextInt(linies);
        int posiciob=r.nextInt(linies);

        for (int i=0;i<buscaminesdef.length;i++){
            for (int j=0;j<buscaminesdef[0].length;j++){
                buscaminesdef[i][j]="▓▓";
            }
        }
        int timur=0;
        while(timur<bombes){
            posicioa=r.nextInt(linies);
            posiciob=r.nextInt(linies);

            if (buscamines[posicioa][posiciob]==1000){
                posicioa=r.nextInt(linies);
                posiciob=r.nextInt(linies);
            }
            else {
                buscamines[posicioa][posiciob]=1000;
                timur++;
            } 
            System.out.print(posicioa+" "+posiciob);
            System.out.print("\n");
        }
        for(int i=0;i<buscamines.length;i++){
            for(int j=0;j<buscamines[0].length;j++){
               
            }
        }

        System.out.print("\n");
        System.out.print("\t");
        for (int i=0;i<buscamines[0].length;i++){
            System.out.print((i)+"\t");
        }
        for(int i=0;i<buscamines.length;i++){
            System.out.print("\n");
            System.out.print("\n");
            System.out.print((i)+"\t");
            for(int j=0;j<buscamines[0].length;j++){
                System.out.print(buscamines[i][j]+"\t");
            }
        }
        System.out.print("\n");
        System.console().readLine("Prem intro per jugar.");

        boolean acabat=false;
        boolean explotat = false;
        while(!acabat && !explotat){
            String bomba = System.console().readLine("Quina posicio tries? (0-0) ");
            String []parts = bomba.split("-");
            int part1 = Integer.parseInt(parts[0]);
            int part2 = Integer.parseInt(parts[1]);
            System.out.print(buscamines[part1][part2]);
        }
    }
}