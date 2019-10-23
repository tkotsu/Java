import java.util.Random;

public class Bidimensional{
    public static void main(String[] args) {

        Random r = new Random();
        
        int arrayNum[][]=new int[3][10];

        for (int i=0; i<arrayNum.length; i++){
            System.out.print("\n");
            for (int j=0; j<arrayNum[2].length; j++){
                arrayNum[i][j]=r.nextInt((10));
                System.out.print(arrayNum[i][j]+" ");
            }
        }
    }
}