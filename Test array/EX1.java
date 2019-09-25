public class EX1{
    public static void main(String[] args) {
        System.out.println("Introdueix un nom");
        String nom0 = System.console().readLine();
        System.out.println("Introdueix el segon nom");
        String nom1 = System.console().readLine();
        System.out.println("Introdueix el tercer nom");
        String nom2 = System.console().readLine();

        String arrayNoms[]={nom0,nom1,nom2};
        
        int posicio=(int)System.currentTimeMillis()%3;
        System.out.println("El guanyador és: "+arrayNoms[posicio]);
    }
}