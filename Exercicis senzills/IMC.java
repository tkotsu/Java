public class IMC{
    public static void main(String[] args) {
        float pes;
        float alçada;
        float res;
        System.out.println("Quants kilos peses? ");
        pes = Float.parseFloat(System.console().readLine());
        System.out.println("Quants metres medeixes? ");
        alçada = Float.parseFloat(System.console().readLine());
        res = pes/(alçada*alçada);
        
        if (res<18.5)
        System.out.println("El seu IMC es: "+res+" Hauries de guanyar pes.");
        else if (res<24.9)
        System.out.println("El seu IMC es: "+res+" Estas be de pes.");
        else if (res<26.9)
        System.out.println("El seu IMC es: "+res+" Estas una miqueta per sobre del pes recomenat.");
        else if (res<29.9)
        System.out.println("El seu 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ");
    }
}