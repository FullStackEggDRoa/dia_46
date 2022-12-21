/*
    Ejercicio 11:
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
    clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un día del mes: ");
        int dia=leer.nextInt();
        System.out.print("Ingrese un més del año: ");
        int mes=leer.nextInt()-1;
        System.out.print("Ingrese un año: ");
        int anio=leer.nextInt()-1900;
        
        Date fecha = new Date(anio,mes,dia);
        Date fecha_actual = new Date();
        
        System.out.println("Diferencia en años, entre la Fecha Ingresada y la Fecha Acutal es: "+(fecha_actual.getYear()-fecha.getYear()));
    }
    
}
