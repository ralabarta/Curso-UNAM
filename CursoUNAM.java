package com.innova.cursoUNAM;

/**
 * @author Rubiel Alejandro González Labarta
 */
public class CursoUNAM {

    public static void main(String[] args) {
        System.out.println("Hola Mundo :)");
        short i = 0; // 2 bytes 
        byte j = 0; // 1 byte
        int k = 0; // 4 bytes
        long l = 0; // 8 bytes
        float estatura = 1.8F; // 4 bytes
        double resultado = 3.5; // 8 bytes
        char genero = 'F'; // 2 bytes
        boolean status = true;
        //Cast de datos
        double d = 100.79;
        int e = (int) d;
        // Arreglos
        int [] miArregloInt = new int [5];
        miArregloInt [2] = 8;
        miArregloInt [4] = 9;
        System.out.println(miArregloInt [2]+" Es lo que hay y :"+miArregloInt [4] );
        double [][] miArregloDouble2D = new double [3][3]; //matriz
        miArregloDouble2D [1][1] = 4.56;
        System.out.println(miArregloDouble2D [1][1]);
        char arreglo3D [][][] = new char [3][3][3]; 
        arreglo3D [2][2][2] = 'N';
        System.out.println("Arreglo 3D -> " + arreglo3D [2][2][2]);
        //Operadores
        int a =2;
        int b =5;
        int c =0;
        //Suma
        c=a+b;
        System.out.println(c);
        //resta
        c=a-b;
        System.out.println(c);
        //Multiplicacion
        c=a*b;
        System.out.println(c);
        //Division
        c=a/b;
        System.out.println(c);
        //Resto
        c=a%b;
        System.out.println(c);
        
        //Operaciones de Asignación con operación
        c=2;
        c+=a;
        System.out.println(c);
        c-=a;
        System.out.println(c);
        c*=a;
        System.out.println(c);
        c/=a;
        System.out.println(c);
        c%=a;
        System.out.println(c);
        
        //Operador incremento Prefijo ++
        //Operador decremento Prefijo --
        int z = 3;
        ++z; // z=z+1
        //Operador incremento Postfijo ++
        z++; // z=z+1
        
        //Operadores de equidad (== y !=)
        
        System.out.println("Comparando " + (a==b));
        if (a!=b) {
            System.out.println("Diferentes " );
        }else{System.out.println("Iguales " );}
        
        //Operadores relacionales <  >  <=  >=
        if (a>=b) {
            System.out.println("Es mayor o igual" );
        }else{System.out.println("Es menor o igual" );}
        
        //Operadores lógicos && (and) || (or) ! (not)
        boolean y = true;
        boolean x = false;
        //AND
        if (x && y) {
            System.out.println("Operación Verdadera" );
        }else{System.out.println("Operación falsa" );}
         //OR
        if (x || y) {
            System.out.println("Operación Verdadera" );
        }else{System.out.println("Operación falsa" );}
         //NOT
       System.out.println("NOT ->" + !y);
        
       //CONTROL DE FLUJO: If/Else  Switch  For  While  Foreach
        int control1 = 5;
        int control2 = 10;
        //Ej. Obten el numero mayor
        if (control1>control2) {
            System.out.println("Control 1 Es mayor" );
        }else if (control2>control1) {System.out.println("Control 2 Es el mayor" );}
        else if (control2==control1) {System.out.println("Ambos son iguales" );}
        
        //Ej. Switch
        int control3 = 1009; 
        switch(control3){
            case 1008: 
                 break;
            case 1009: 
                System.out.println("Control3 vale 1009");
                 break;
            default:
                 System.out.println("Control3 tiene otro valor");
                break;
        }
        
        // While
        int control4 = 1;
        
        while (control4 <= 5) {            
            System.out.println("control4 vale: " +control4);
            control4++;
        }
        
        // For
        for (int m = 0; m < 10; m++) {
            System.out.println("m vale: " +m);
        }
        
        //Array
        int arregloT [] = new int [3];
        for (int m = 0; m < arregloT.length; m++) {
            arregloT[m]=m * 6;
            System.out.println("Arreglo en " + m + " vale: " +arregloT[m]);
        }
        
        //Foreach
        for(int m: arregloT){
            System.out.println("Valor: " + m);
        }
        
        
    }

}
