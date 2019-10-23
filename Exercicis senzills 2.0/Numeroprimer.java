public class Numeroprimer{
    public static void main(String[] args) {
        int num;
        int con = 2;
        boolean comp = true;
        System.out.println("Quin numero vols saber si es primer? (del 1 al 20)");
        num = Integer.parseInt(System.console().readLine());
        while (comp && con !=num){
            if ((num % con) == 0)
                comp=false;
                con++;
            
            
        }

            if(comp==true){
                System.out.println("Es un numero primer");
            }
            else{
                System.out.println("No es un numero primer");
            }
    }
}