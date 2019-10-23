public class DNI{
    public static void main(String[] args) {
        int dni;
        int div = 23;
        int posc = 0;
        char arraynum[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Introdueix el numero del teu dni: ");
        dni = Integer.parseInt(System.console().readLine());
        posc = dni % div;
        System.out.println("El teu DNI es: "+dni+""+arraynum[posc]);

        }
    }
