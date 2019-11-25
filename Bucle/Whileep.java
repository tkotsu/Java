public class Whileep{
    public static void main(String[] args) {
        
        int iteracio = 0;
        int final_it = 3;
        String llista[] = {"Maria","Josep","Pep"};

        while(iteracio<llista.length){ // el valor asignar a la array '.length' ens agafa la quantitat de dades que te com a numero propi.

            System.out.println(llista[iteracio]);
            iteracio++;
        }

        System.out.println("Ja estic");
        System.out.println(final_it);
    }
}