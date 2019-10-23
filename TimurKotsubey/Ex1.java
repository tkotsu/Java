public class Ex1{
    public static void main(String[] args) {
        int edat;
        System.out.println("Quants anys tens? ");
        edat = Integer.parseInt(System.console().readLine());
        if (edat>64){
            System.out.println("ja et pots jubilar");
        }
        else {
            int falta = 65-edat;
            System.out.println("Et queden "+falta+" anys per poderte jubilar.");
        }
    }
}