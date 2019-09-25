public class Trio7{
    public static void main(String[] args) {
        
        int numran = (int)System.currentTimeMillis()%1000;
        int start = 0;

        while(start<numran){

            System.out.println("pensant");
            start++;
        }
        System.out.println("El numero es: "+numran);
        System.out.println("Els intents han set: "+start);
    }
}