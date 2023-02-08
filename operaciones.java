package calculadoras;

import java.util.Scanner;

 
public class operaciones {

  
    public static void main(String[] args) {
     
       
            
        Calculadoras objeto1= new Calculadoras();
        Scanner objeto2= new Scanner (System.in);
        int op;
       
       
        do {
            
                        
                            System.out.println("------------CALCULADORA--------------");
                            System.out.println("1.OPERACIONES BASICAS");
                            System.out.println("2.FUNCIONES TRIGONOMETRICAS");
                            System.out.println("3.POTENCIA");
                            System.out.println("4.RAIZ");
                            System.out.println("5.IVA");
                            System.out.println("0.SALIR DEL PROGRAMA");

                            System.out.println("Digite el numero de la operacion a realizar");
                            op= objeto2.nextInt();

         

                         switch (op) {


                         case 1:
                         System.out.println("ELIJA LA OPERACION"); 
                         System.out.println("1.SUMA");
                         System.out.println("2.RESTA");
                         System.out.println("3.MULTIPLPICAION");
                         System.out.println("4.DIVISION");
                         int c= objeto2.nextInt();    

                            switch(c)
                            {
                         case 1:
                         System.out.println("Ingrese el primer valor");
                         float a= objeto2.nextFloat();
                         System.out.println("Ingrese el segundo valor");
                         float b= objeto2.nextFloat();
                         System.out.println("La suma es: "+objeto1.suma(a, b));
                         break;

                        case 2:
                        System.out.println("Ingrese el primer valor");
                        a= objeto2.nextFloat();
                        System.out.println("Ingrese el segundo valor");
                        b= objeto2.nextFloat();
                        System.out.println("La resta es: "+ objeto1.resta(a,b));
                        break;

                        case 3:
                        System.out.println("Ingrese el primer valor");
                        a= objeto2.nextFloat();
                        System.out.println("Ingrese el segundo valor");
                        b= objeto2.nextFloat();
                        System.out.println("La multiplicacion es: "+ objeto1.multi(a,b));
                        break;

                        case 4:
                        System.out.println("Ingrese el primer valor");
                        a= objeto2.nextFloat();
                        System.out.println("Ingrese el segundo valor");
                        b= objeto2.nextFloat();
                        System.out.println("La division es: "+ objeto1.div(a,b));
                        break;

                            }

                        break;


                        case 2:
                         System.out.println("ELIJA LA FUNCION"); 
                         System.out.println("1.SENO");
                         System.out.println("2.COSENO");
                         System.out.println("3.TANGENTE");
                         int d= objeto2.nextInt();            

                            switch(d)
                            {
                        case 1:
                        System.out.println("Ingrese el angulo para el seno");
                        double n= objeto2.nextFloat();
                        System.out.println("El seno es: "+objeto1.seno(n));
                        break;

                        case 2:
                        System.out.println("Ingrese el angulo para el coseno");
                        n= objeto2.nextFloat();
                        System.out.println("El coseno es: "+ objeto1.coseno(n));
                        break;

                        case 3:
                        System.out.println("Ingrese el angulo para la tangente");
                        n= objeto2.nextFloat();
                        System.out.println("La tangente es: "+ objeto1.tangente(n));
                        break;


                            } 

                        break;

                        case 3:
                        System.out.println("Digite el numero");
                        double n= objeto2.nextDouble();
                        System.out.println("Digite la potencia del numero");
                        double m= objeto2.nextDouble();
                        System.out.println("La potencia es: "+ objeto1.potencia(n,m));                      
                        break;

                        case 4:
                        System.out.println("Digite el numero");
                        n= objeto2.nextDouble();
                        System.out.println("Digite el valor de la raiz");
                        m= objeto2.nextDouble();
                        System.out.println("La raiz es: "+ objeto1.raiz(n,m));            
                        break;

                        case 5:
                        System.out.println("Digite el porcentaje de iva");
                        float i= objeto2.nextFloat();
                        System.out.println("Digite el valor a calcular");
                        float v= objeto2.nextFloat();
                        System.out.println("El resultado es: "+ objeto1.iva(i,v));            
                        break;
                        default:
                            if (op<0 || op>5) {
                                  System.out.println("El numero digitado no es valido");   
                            }
                                   

                        break;
                    }
        } while (op !=0);
    }
    
}
