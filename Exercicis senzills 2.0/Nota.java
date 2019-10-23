public class Nota{
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota5;
        float notaex;
        float resnota;
        float resex;
        float restotal;

        System.out.println("Quina nota has tret a la primera prova?");
        nota1 = Float.parseFloat(System.console().readLine());
        System.out.println("Quina nota has tret a la segona prova?");
        nota2 = Float.parseFloat(System.console().readLine());
        System.out.println("Quina nota has tret a la tercera prova?");
        nota3 = Float.parseFloat(System.console().readLine());
        System.out.println("Quina nota has tret a la quarta prova?");
        nota4 = Float.parseFloat(System.console().readLine());
        System.out.println("Quina nota has tret a la cinquena prova?");
        nota5 = Float.parseFloat(System.console().readLine());
        System.out.println("Quina nota has tret al primer examen?");
        notaex = Float.parseFloat(System.console().readLine());

        resnota = ((nota1+nota2+nota3+nota4+nota5)/5);
        float res4 = (float)40/100;
        float resnota2 = (resnota*(res4));
        float res5 = (float)60/100;
        resex = notaex*res5;
        restotal = resex+resnota2;
        System.out.println("--------------------------------");
        System.out.println("La nota que has tret amb proves es "+resnota2);
        System.out.println("La nota que has tret amb els examens es "+resex);
        System.out.println("El total de nota del curs es "+restotal);
    }
}