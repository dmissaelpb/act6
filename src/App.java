public class App {
    
    static String nombre;
    static double[] calificaciones = new double[5];
    static double promedio=0;
    static String cal;
    
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"+ '\n' );
        setDatos();
        promedio();
        calificacionFinal();
        
        printData();
        
    }
    
    public static void setDatos(){

        nombre= "nombre " ;
        calificaciones[0]=60;
        calificaciones[1]=50;
        calificaciones[2]=90;
        calificaciones[3]=100;
        calificaciones[4]=80;
        
    }

    
    
    
    public static void promedio(){
        double prom = 0; 
        for (int i = 0; i < calificaciones.length; i++) {
            prom = prom + calificaciones[i];
        }
        promedio = (prom/5);
    }
    
    public static void calificacionFinal(){
        if (promedio <= 50) 
        cal="F";
        if (promedio >= 51 && promedio <= 60) 
        cal = "E";
        if (promedio >= 61 && promedio <= 70) 
        cal = "D";    
        if (promedio >= 71 && promedio <= 80) 
        cal = "C";
        if (promedio >= 81 && promedio <= 90) 
        cal = "B";
        if (promedio >= 91 && promedio <= 100) 
        cal = "A";
        //System.out.println(cal);
    }
    
    public static void printData(){

        System.out.println("nombre: "+ nombre );

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación "+ i + ": "+  calificaciones[i] );
            
        }

        System.out.println("promedio: "+ promedio + '\n' + "Calificación: " + cal  );




        
        /*for (int i = 0; i < calificaciones.length; i++) 
            System.out.println(calificaciones[i]); */
        
    }
    
}