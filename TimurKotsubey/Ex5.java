import java.util.Random;

public class Ex5{
    public static void main(String[] args) {
        int puntsa = 0;
        int puntsb = 0;
        String mov;
        Random r = new Random();
        int movm = r.nextInt(3);

        System.out.println("prem intro per continuar:");
        System.console().readLine();



        while (puntsa<3 && puntsb<3){
            System.out.println("Tria pedra(pe), paper(pa) o tisora(ti): ");
            mov = System.console().readLine();
            movm = r.nextInt(3);
            if (mov.equals("ti")){
                if (movm==0){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat tisores.");
                    System.out.println("La màquina ha triat paper.");
                    puntsa++;
                    System.out.println("Guanyes tu.. ;(");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("----------------------------");
                }
                else if(movm==1){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat tisores.");
                    System.out.println("La màquina ha triat pedra.");
                    puntsb++;
                    System.out.println("La màquina guanya!!! :D");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
                }
                else if(movm==2){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat tisores.");
                    System.out.println("La màquina ha triat tisores.");
                    System.out.println("ningú guanya.. v_v");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
                }
                
            }
            if (mov.equals("pe")){
                if (movm==0){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat pedra.");
                    System.out.println("La màquina ha triat paper.");
                    puntsb++;
                    System.out.println("La màquina guanya!!! :D");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("----------------------------");
                }
                else if(movm==1){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat pedra.");
                    System.out.println("La màquina ha triat pedra.");
                    System.out.println("Ningú guanya.. v_v");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
                }
                else if(movm==2){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat pedra.");
                    System.out.println("La màquina ha triat tisores.");
                    puntsa++;
                    System.out.println("Tu guanyes.. ;(");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
                }
            }
            if (mov.equals("pa")){
                if (movm==0){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat paper.");
                    System.out.println("La màquina ha triat paper.");
                    System.out.println("Ningú guanya.. v_v");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("----------------------------");
                }
                else if(movm==1){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat paper.");
                    System.out.println("La màquina ha triat pedra.");
                    puntsa++;
                    System.out.println("Tu guanyes.. ;(");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
                }
                else if(movm==2){
                    System.out.println("---------------------------");
                    System.out.println("Tu has triat paper.");
                    System.out.println("La màquina ha triat tisores.");
                    puntsb++;
                    System.out.println("La màquina guanya!!! :D");
                    System.out.println(""+puntsa+" - "+puntsb);
                    System.out.println("---------------------------");
            }

        }
    }
}
}