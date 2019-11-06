public class Funcion1{
    public static void main(String[] args) {
               int a = 0;
               System.out.println("El resultado es: ");
               System.out.println(WALA(a));
            }
        
            public static int WALA(int d){
                int c=Integer.parseInt(System.console().readLine("Primer numero: "));
                int b=Integer.parseInt(System.console().readLine("Segon numero: "));
                d=c-b;
                return d;
            }
        
    
}