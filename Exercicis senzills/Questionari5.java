public class Questionari5{
    public static void main(String[] args) {


        String Pr1;
        String Pr2;
        String Pr3;
        String Pr4;


        System.out.println("Quants anys tinc?");
        Pr1 = System.console().readLine();

        if (Pr1.equals("18")){
            System.out.println("Quin joc m'agrada?");
            Pr2 = System.console().readLine();

            if (Pr2.equals("forza horizon 4")){
                System.out.println("On visc?");
                Pr3 = System.console().readLine();

                if (Pr3.equals("vic")){
                    System.out.println("Que m'agrada menjar?");
                    Pr4 = System.console().readLine();

                    if (Pr4.equals("pa")){
                        System.out.println("Has guanyat");
                        System.out.println("Tens tots els punts");

                    }else{
                        System.out.println("T'has equivocat.");
                        System.out.println("Tens 3 punts.");
                    }

                }else{
                    System.out.println("T'has equivocat.");
                    System.out.println("Tens 2 punts.");
                }

            }else{
                System.out.println("T'has equivocat.");
                System.out.println("Tens 1 punts.");
            }

        }else {
            System.out.println("T'has equivocat.");
            System.out.println("Tens 0 punts.");
        }
        
    } 
}