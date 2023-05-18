package paquete04;

import java.util.Scanner;
import paquete02.*;

public class principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad, autos;
        int cont = 3;
        double sMinino;
        String cadenaFinal;
        
        
        cadenaFinal = "";
        for(int i = 1; i <= cont; i++){
            System.out.println("Ingrese el nombre del vendedor");
            nombre = sc.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = sc.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = sc.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = sc.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n\n",
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());
            sc.nextLine();
        }
        
        System.out.printf("%s\n", cadenaFinal);
    }
}
