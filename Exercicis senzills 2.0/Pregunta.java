public class Pregunta{
    public static void main(String[] args) {
        String Pr1;
        String Pr2;
        String Pr3;
        int punts = 0;

        System.out.println("De quin color es el cel? ");
        Pr1 = System.console().readLine();
        System.out.println("On es l'institut cirviànum? ");
        Pr2 = System.console().readLine();
        System.out.println("Com hem dic? ");
        Pr3 = System.console().readLine();

        if (Pr1.equals("blau") && Pr2.equals("Torello") && Pr3.equals("Timur")){
            punts=3;
            System.out.println(punts);
        
        }
    }
}