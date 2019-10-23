public class Quetanllarg{
    public static void main(String[] args) {
        String frase;
        System.out.println("Escriu una frase de la que vulguis saber quantes lletres té: ");
        frase = System.console().readLine();
        System.out.println("la frase que has escrit conté: "+frase.length());
    }
}