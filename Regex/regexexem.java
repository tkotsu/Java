import java.text.SimpleDateFormat;
import java.util.Date;

public class regexexem {
    public static void main(String[] args) {

        String usuaris[][] = new String[7][10];
        int anys[] = new int [10];
        String nom;
        String cognom;
        String adreça;
        String poblacio;
        String dataneix;
        int edat;
        String usuari;
        String passwd;
        boolean run = true;
        int u = 0;

        while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1: iniciar sessió");
            System.out.println("2: registrar-se");
            System.out.println("3: sortir");
            System.out.println("---------------------------------------------------------");
            String opcio = System.console().readLine();

            if (opcio.equals("1")) {

            } else if (opcio.equals("2")) {
                System.out.println("---------------------------------------------------------");
                System.out.println("Com et dius?");
                nom = System.console().readLine();
                usuaris[0][u] = nom;
                System.out.println("---------------------------------------------------------");

                System.out.println("---------------------------------------------------------");
                System.out.println("Quin es el teu cognom?");
                cognom = System.console().readLine();
                usuaris[1][u] = cognom;
                System.out.println("---------------------------------------------------------");

                System.out.println("---------------------------------------------------------");
                System.out.println("Quina es la teva adreça?");
                adreça = System.console().readLine();
                usuaris[2][u] = adreça;
                System.out.println("---------------------------------------------------------");

                System.out.println("---------------------------------------------------------");
                System.out.println("Quina es la teva població?");
                poblacio = System.console().readLine();
                usuaris[3][u] = poblacio;
                System.out.println("---------------------------------------------------------");

                boolean valid = false;
                System.out.println("---------------------------------------------------------");
                while (!valid) {
                    System.out.println("Quan vas nexier? (dd/mm/yyyy)");
                    String datausu = System.console().readLine();
                    String dataneixament[] = datausu.split("/");

                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String[] dataAvui = sdf.format(date).split("/");
                    if (Integer.parseInt(dataneixament[1])<13){
                        usuaris[4][u] = datausu;
                        valid=true;
                        edat = Integer.parseInt(dataAvui[2]) - Integer.parseInt(dataneixament[2]);
                        if (Integer.parseInt(dataAvui[1])<Integer.parseInt(dataneixament[1])){
                            edat = edat - 1;
                            anys[u] = edat;
                        }
                        else {
                            if(Integer.parseInt(dataAvui[0])<Integer.parseInt(dataneixament[0])){
                                edat = edat - 1;
                                anys[u] = edat;
                            }
                        }
                    }
                    else {
                        System.out.println("La data no es valida!");
                    }
                    
                    
                }
                System.out.println(anys[u]);
                System.out.println("---------------------------------------------------------");

                boolean acabat = false;
                System.out.println("---------------------------------------------------------");
                while (!acabat) {
                    acabat = true;
                    System.out.println("Quin nom d'usuari vols?");
                    usuari = System.console().readLine();
                    for (int i = 0; i < usuaris[0].length; i++) {
                        if (usuari.equals(usuaris[5][i])) {
                            System.out.println("L'usuari ja existeix.");
                            acabat = false;
                        }

                    }
                    if (acabat == true) {
                        usuaris[5][u] = usuari;
                    }
                }
                System.out.println("---------------------------------------------------------");

                acabat = false;
                System.out.println("---------------------------------------------------------");
                while (!acabat) {
                    System.out.println(
                            "Introdueix la teva contrasenya, ha de contenir un numero, una minuscula, una majuscula i ha de ser com a minim 8 caracters:");
                    passwd = System.console().readLine();
                    if (passwd.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$")) {
                        acabat = true;
                        usuaris[6][u] = passwd;
                    } else {
                        System.out.println("La contrasenya no es valida");
                    }
                }
                System.out.println("---------------------------------------------------------");
            } else {
                run = false;
            }

        }
    }
}
