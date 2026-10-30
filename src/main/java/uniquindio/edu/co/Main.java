package uniquindio.edu.co;
import uniquindio.edu.co.model.*;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera) {
            System.out.println("=== LISTA DE EJERCICIOS ===");
            System.out.println("1. Liquidación de cosecha cafetera");
            System.out.println("2. División de cuenta en restaurante con propina");
            System.out.println("3. Conversor de segundos para renderizado de video");
            System.out.println("4. Presupuesto de combustible para viaje");
            System.out.println("5. Alerta de sobrepeso en equipaje aéreo");
            System.out.println("6. Control de temperatura en cuarto frío");
            System.out.println("7. Despacho por cajas cerradas en bodega");
            System.out.println("8. Pago de horas extras semanales");
            System.out.println("9. Clasificación del IMC");
            System.out.println("10. Facturación escalonada de acueducto");
            System.out.println("11. Comisiones de ventas por metas");
            System.out.println("12. Descuento por día de compra y medio de pago");
            System.out.println("13. Aprobación de crédito hipotecario");
            System.out.println("14. Triaje de urgencias hospitalarias");
            System.out.println("15. Convocatoria de beca internacional");
            System.out.println("16. Verificación de año bisiesto");
            System.out.println("17. Validador de triángulos");
            System.out.println("18. Peaje vial automatizado por categoría");
            System.out.println("19. Casa de cambio internacional");
            System.out.println("20. Cotizador de suscripción a gimnasio");

            int numeroejercio = validacionint(scanner, "Ingrese una opcion: ");
            scanner.nextLine();

            switch (numeroejercio) {
                case 1:
                    mostrarContexto(
                            1,
                            "LIQUIDACIÓN DE COSECHA CAFETERA",
                            "Liquide el pago diario del recolector de café."
                    );

                    Ejercicio1 ej1 = new Ejercicio1();

                    System.out.print("Ingrese el nombre: ");
                    ej1.setName(scanner.nextLine());

                    ej1.setCofferecolected(validaciondouble(scanner, "Ingrese el café recolectado (kg): "));
                    scanner.nextLine();

                    System.out.println(ej1.toString());
                    bandera = seguirocerrar(scanner);
                    break;

                case 2:
                    mostrarContexto(
                            2,
                            "DIVISIÓN DE CUENTA EN RESTAURANTE CON PROPINA",
                            "Divida la cuenta del restaurante entre las personas."
                    );

                    Ejercicio2 ej2 = new Ejercicio2();

                    ej2.setValorcuentabase(validaciondouble(scanner, "Ingrese el valor de la cuenta base: "));
                    ej2.setNumeropersonas(validacionint(scanner, "Ingrese el numero de personas: "));
                    scanner.nextLine();

                    System.out.println(ej2.toString());
                    bandera = seguirocerrar(scanner);
                    break;

                case 3:
                    mostrarContexto(
                            3,
                            "CONVERSOR DE SEGUNDOS PARA RENDERIZADO DE VIDEO",
                            "Convierta los segundos a horas, minutos y segundos."
                    );

                    Ejercicio3 ej3 = new Ejercicio3();

                    ej3.setSegundosrenderizado(validacionint(scanner, "Ingrese los segundos de renderizado: "));
                    scanner.nextLine();

                    System.out.println(ej3.toString());
                    bandera = seguirocerrar(scanner);
                    break;

                case 4: {
                    mostrarContexto(
                            4,
                            "PRESUPUESTO DE COMBUSTIBLE PARA VIAJE",
                            "Calcule el combustible y el costo estimado del viaje."
                    );

                    Ejercicio4 ej4 = new Ejercicio4();

                    System.out.print("Ingrese el nombre de la ruta: ");
                    ej4.setRuta(scanner.nextLine());

                    ej4.setDistanciaKilometros(validaciondouble(scanner, "Ingrese la distancia total (km): "));
                    ej4.setRendimientoKilometrosGalon(validaciondouble(scanner, "Ingrese el rendimiento del vehículo (km/galón): "));
                    ej4.setPrecioGalon(validaciondouble(scanner, "Ingrese el precio del galón de gasolina: "));
                    scanner.nextLine();

                    System.out.println(ej4.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 5: {
                    mostrarContexto(
                            5,
                            "ALERTA DE SOBREPESO EN EQUIPAJE AÉREO",
                            "Verifique el peso del equipaje y aplique el recargo si corresponde."
                    );

                    Ejercicio5 ej5 = new Ejercicio5();

                    System.out.print("Ingrese el nombre del pasajero: ");
                    ej5.setPasajero(scanner.nextLine());

                    ej5.setValorTiquete(validaciondouble(scanner, "Ingrese el valor base del tiquete: "));
                    ej5.setPesoMaleta(validaciondouble(scanner, "Ingrese el peso de la maleta (kg): "));
                    scanner.nextLine();

                    System.out.println(ej5.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 6: {
                    mostrarContexto(
                            6,
                            "CONTROL DE TEMPERATURA EN CUARTO FRÍO",
                            "Evalúe la temperatura del cuarto frío y el riesgo del inventario."
                    );

                    Ejercicio6 ej6 = new Ejercicio6();

                    ej6.setTemperatura(validaciondouble(scanner, "Ingrese la temperatura actual (°C): "));
                    ej6.setLitrosAlmacenados(validaciondouble(scanner, "Ingrese la cantidad de litros almacenados: "));
                    scanner.nextLine();

                    System.out.println(ej6.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 7: {
                    mostrarContexto(
                            7,
                            "DESPACHO POR CAJAS CERRADAS EN BODEGA",
                            "Determine las cajas completas y las baldosas faltantes."
                    );

                    Ejercicio7 ej7 = new Ejercicio7();

                    ej7.setCantidadBaldosas(validacionint(scanner, "Ingrese la cantidad total de baldosas pedidas: "));
                    scanner.nextLine();

                    System.out.println(ej7.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 8: {
                    mostrarContexto(
                            8,
                            "PAGO DE HORAS EXTRAS SEMANALES",
                            "Calcule el pago de horas ordinarias y extras."
                    );

                    Ejercicio8 ej8 = new Ejercicio8();

                    System.out.print("Ingrese el nombre del operario: ");
                    ej8.setOperario(scanner.nextLine());

                    ej8.setHorasTrabajadas(validaciondouble(scanner, "Ingrese el total de horas trabajadas en la semana: "));
                    ej8.setTarifaHora(validaciondouble(scanner, "Ingrese la tarifa de la hora ordinaria: "));
                    scanner.nextLine();

                    System.out.println(ej8.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 9: {
                    mostrarContexto(
                            9,
                            "CLASIFICACIÓN DEL IMC",
                            "Calcule el IMC y clasifique el diagnóstico."
                    );

                    Ejercicio9 ej9 = new Ejercicio9();

                    System.out.print("Ingrese el nombre del deportista: ");
                    ej9.setDeportista(scanner.nextLine());

                    ej9.setPeso(validaciondouble(scanner, "Ingrese el peso en kilogramos: "));
                    ej9.setEstatura(validaciondouble(scanner, "Ingrese la estatura en metros: "));
                    scanner.nextLine();

                    System.out.println(ej9.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 10: {
                    mostrarContexto(
                            10,
                            "FACTURACIÓN ESCALONADA DE ACUEDUCTO",
                            "Calcule la factura del acueducto según el consumo."
                    );

                    Ejercicio10 ej10 = new Ejercicio10();

                    ej10.setConsumoMetrosCubicos(validaciondouble(scanner, "Ingrese el consumo del mes en m3: "));
                    scanner.nextLine();

                    System.out.println(ej10.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 11: {
                    mostrarContexto(
                            11,
                            "COMISIONES DE VENTAS POR METAS",
                            "Calcule la comisión y el pago total del asesor."
                    );

                    Ejercicio11 ej11 = new Ejercicio11();

                    ej11.setSueldoBasico(validaciondouble(scanner, "Ingrese el sueldo básico mensual: "));
                    ej11.setVentasMes(validaciondouble(scanner, "Ingrese el total de ventas del mes: "));
                    scanner.nextLine();

                    System.out.println(ej11.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 12: {
                    mostrarContexto(
                            12,
                            "DESCUENTO POR DÍA DE COMPRA Y MEDIO DE PAGO",
                            "Aplique el descuento según el día y el medio de pago."
                    );

                    Ejercicio12 ej12 = new Ejercicio12();

                    ej12.setValorCompra(validaciondouble(scanner, "Ingrese el valor de la compra: "));
                    ej12.setEsMartes(validacionint(scanner, "¿Hoy es Martes de Descuento? (1 = Sí, 2 = No): "));

                    if (ej12.getEsMartes() == 1) {
                        ej12.setMedioPago(validacionint(scanner, "Ingrese el medio de pago (1 = Efectivo, 2 = Tarjeta): "));
                    }
                    scanner.nextLine();

                    System.out.println(ej12.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 13: {
                    mostrarContexto(
                            13,
                            "APROBACIÓN DE CRÉDITO HIPOTECARIO",
                            "Evalúe la solicitud de crédito hipotecario."
                    );

                    Ejercicio13 ej13 = new Ejercicio13();

                    ej13.setIngresoMensual(validaciondouble(scanner, "Ingrese el ingreso mensual del solicitante: "));
                    scanner.nextLine();

                    if (ej13.getIngresoMensual() >= 3000000) {
                        ej13.setAntiguedadAnios(validacionint(scanner, "Ingrese la antigüedad laboral en años: "));
                        ej13.setDeudasActuales(validaciondouble(scanner, "Ingrese el valor de sus deudas actuales: "));
                        scanner.nextLine();
                    }

                    System.out.println(ej13.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 14: {
                    mostrarContexto(
                            14,
                            "TRIAJE DE URGENCIAS HOSPITALARIAS",
                            "Clasifique el nivel de triaje del paciente."
                    );

                    Ejercicio14 ej14 = new Ejercicio14();

                    ej14.setDificultadRespiratoria(validacionint(scanner, "¿Presenta dificultad respiratoria grave? (1 = Sí, 2 = No): "));

                    if (ej14.getDificultadRespiratoria() != 1) {
                        ej14.setTemperatura(validaciondouble(scanner, "Ingrese la temperatura corporal (°C): "));
                        ej14.setNivelDolor(validacionint(scanner, "Ingrese el nivel de dolor (1 a 10): "));
                    }
                    scanner.nextLine();

                    System.out.println(ej14.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 15: {
                    mostrarContexto(
                            15,
                            "CONVOCATORIA DE BECA INTERNACIONAL",
                            "Verifique si el aspirante cumple los requisitos."
                    );

                    Ejercicio15 ej15 = new Ejercicio15();

                    ej15.setEdad(validacionint(scanner, "Ingrese la edad: "));
                    ej15.setPromedio(validaciondouble(scanner, "Ingrese el promedio acumulado: "));
                    ej15.setInglesCertificado(validacionint(scanner, "¿Tiene inglés certificado? (1 = Sí, 0 = No): "));
                    ej15.setGanoConcurso(validacionint(scanner, "¿Ganó un concurso de algoritmos? (1 = Sí, 0 = No): "));
                    scanner.nextLine();

                    System.out.println(ej15.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 16: {
                    mostrarContexto(
                            16,
                            "VERIFICACIÓN DE AÑO BISIESTO",
                            "Determine si el año es bisiesto."
                    );

                    Ejercicio16 ej16 = new Ejercicio16();

                    ej16.setAnio(validacionint(scanner, "Ingrese el año a evaluar: "));
                    scanner.nextLine();

                    System.out.println(ej16.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 17: {
                    mostrarContexto(
                            17,
                            "VALIDADOR DE TRIÁNGULOS",
                            "Verifique y clasifique el triángulo."
                    );

                    Ejercicio17 ej17 = new Ejercicio17();

                    ej17.setLadoA(validaciondouble(scanner, "Ingrese la longitud del lado A: "));
                    ej17.setLadoB(validaciondouble(scanner, "Ingrese la longitud del lado B: "));
                    ej17.setLadoC(validaciondouble(scanner, "Ingrese la longitud del lado C: "));
                    scanner.nextLine();

                    System.out.println(ej17.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 18: {
                    mostrarContexto(
                            18,
                            "PEAJE VIAL AUTOMATIZADO POR CATEGORÍA",
                            "Calcule el cobro del peaje según la categoría y el telepeaje."
                    );

                    Ejercicio18 ej18 = new Ejercicio18();

                    System.out.print("Ingrese la placa del vehículo: ");
                    ej18.setPlaca(scanner.nextLine());

                    ej18.setCategoria(validacionint(scanner, "Ingrese la categoría (1 = Automóvil, 2 = Bus, 3 = Camión, 4 = Tractomula): "));
                    ej18.setTelepeaje(validacionint(scanner, "¿Tiene telepeaje activo? (1 = Sí, 2 = No): "));
                    scanner.nextLine();

                    System.out.println(ej18.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 19: {
                    mostrarContexto(
                            19,
                            "CASA DE CAMBIO INTERNACIONAL",
                            "Convierta pesos colombianos a la moneda seleccionada."
                    );

                    Ejercicio19 ej19 = new Ejercicio19();

                    ej19.setPesosColombianos(validaciondouble(scanner, "Ingrese la cantidad de pesos colombianos a cambiar: "));
                    ej19.setMonedaDestino(validacionint(scanner, "Elija la moneda destino (1 = Dólar, 2 = Euro, 3 = Real): "));
                    scanner.nextLine();

                    System.out.println(ej19.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 20: {
                    mostrarContexto(
                            20,
                            "COTIZADOR DE SUSCRIPCIÓN A GIMNASIO",
                            "Calcule la cotización del plan de gimnasio."
                    );

                    Ejercicio20 ej20 = new Ejercicio20();

                    System.out.print("Ingrese el nombre del cliente: ");
                    ej20.setCliente(scanner.nextLine());

                    ej20.setPlan(validacionint(scanner, "Elija el plan (1 = Mensual, 2 = Trimestral, 3 = Anual): "));
                    ej20.setEdad(validacionint(scanner, "Ingrese la edad del cliente: "));
                    ej20.setEntrenador(validacionint(scanner, "¿Desea incluir entrenador personalizado? (1 = Sí, 2 = No): "));
                    scanner.nextLine();

                    System.out.println(ej20.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    bandera = seguirocerrar(scanner);
                    break;
            }
        }

        scanner.close();
    }


    public static boolean seguirocerrar(Scanner scanner) {
        System.out.println("Quieres revisar otro ejercicio: SI/NO ");
        String confirmacion = scanner.nextLine().trim();

        return confirmacion.equalsIgnoreCase("SI");
    }

    public static void mostrarContexto(int numero, String titulo, String descripcion) {
        System.out.println("\n=== EJERCICIO " + numero + ": " + titulo + " ===");
        System.out.println(descripcion);
        System.out.println();
    }

    public static int validacionint(Scanner scanner,String mensaje){
        boolean validacion=true;
        int numero=0;

        while(validacion){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                numero=scanner.nextInt();
                validacion=false;
            }
            else{
                scanner.next();
                System.out.println("Ingrese un numero valido \n\n  ");

            }
        }
        return numero;

    }

    public static double validaciondouble(Scanner scanner,String mensaje){
        boolean validacion=true;
        double numero=0;

        while(validacion){
            System.out.println(mensaje);
            if(scanner.hasNextDouble()){
                numero=scanner.nextDouble();
                validacion=false;
            }
            else{
                scanner.next();
                System.out.println("Ingrese un numero valido \n  ");

            }
        }
        return numero;

    }
}
