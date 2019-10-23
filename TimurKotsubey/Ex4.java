import java.util.Random;

public class Ex4{
    public static void main(String[] args) {
        Random r = new Random();
        int dau = r.nextInt(6);
        int arraynums[] = new int[1000];
        int i = 0;
        int dau0=0;
        int dau1=0;
        int dau2=0;
        int dau3=0;
        int dau4=0;
        int dau5=0;

        while (i<arraynums.length){
            dau = r.nextInt(6)+1;
            arraynums[i]=dau;
            if (arraynums[i]==1){
                dau0++;
            }
            else if(arraynums[i]==2){
                dau1++;
            }
            else if(arraynums[i]==3){
                dau2++;
            }
            else if(arraynums[i]==4){
                dau3++;
            }
            else if(arraynums[i]==5){
                dau4++;
            }
            else if(arraynums[i]==6){
                dau5++;
            }
            i++;
        }
        System.out.println("Número 1: "+dau0+" unitats.");
        System.out.println("Número 2: "+dau1+" unitats.");
        System.out.println("Número 3: "+dau2+" unitats.");
        System.out.println("Número 4: "+dau3+" unitats.");
        System.out.println("Número 5: "+dau4+" unitats.");
        System.out.println("Número 6: "+dau5+" unitats.");
    }
    }
