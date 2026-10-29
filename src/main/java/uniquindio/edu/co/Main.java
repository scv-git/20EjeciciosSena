package uniquindio.edu.co;
import uniquindio.edu.co.model.*;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        boolean bandera=true;


        while (bandera==true){
            System.out.printf("Ingrese una opcion: ");

        int numeroejercio = scanner.nextInt();
        scanner.nextLine();


        switch (numeroejercio) {
            case 1:
                Ejercicio1 ej1 = new Ejercicio1();

                System.out.print("Ingrese el nombre: ");
                ej1.setName(scanner.nextLine());


                System.out.print("Ingrese el café recolectado (kg): ");
                ej1.setCofferecolected(scanner.nextDouble());

                scanner.nextLine();

                System.out.println(ej1.toString());

                bandera=seguirocerrar();

                break;

            case 2:
                Ejercicio2 ej2 = new Ejercicio2();

                System.out.print("Ingrese el valor de la cuenta base: ");
                ej2.setValorcuentabase(scanner.nextDouble());

                System.out.print("Ingrese el numero de personas: ");
                ej2.setNumeropersonas(scanner.nextInt());

                scanner.nextLine();

                System.out.println(ej2.toString());

                bandera=seguirocerrar();


                break;

            case 3:
                Ejercicio3 ej3= new Ejercicio3();

                System.out.printf("Ingrese los segundos de renderizado: ");
                ej3.setSegundosrenderizado(scanner.nextInt());

                scanner.nextLine();

                System.out.println(ej3.toString());

                bandera=seguirocerrar();
        }


    }






        }


    public static boolean seguirocerrar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quieres revisar otro ejecicio: SI/NO ");
        String confirmacion = scanner.nextLine().trim();

        return confirmacion.equalsIgnoreCase("SI");

    }
}
