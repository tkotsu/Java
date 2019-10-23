public class Parellsenar{
    public static void main(String[] args) {
        int num;
        System.out.println("Introdueix el numero que vulguis saber si es senar o parell: ");
        num = Integer.parseInt(System.console().readLine());
        int res = num%2;
        if (res==0){
            System.out.println("El numero "+num+" es parell.");
        }
        else {
            System.out.println("El numero "+num+" es senar");
        }
    }
}