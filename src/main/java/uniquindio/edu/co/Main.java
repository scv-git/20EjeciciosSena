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
            System.out.print("Ingrese una opción: ");

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
                    bandera = seguirocerrar(scanner);
                    break;

                case 2:
                    Ejercicio2 ej2 = new Ejercicio2();

                    System.out.print("Ingrese el valor de la cuenta base: ");
                    ej2.setValorcuentabase(scanner.nextDouble());

                    System.out.print("Ingrese el numero de personas: ");
                    ej2.setNumeropersonas(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej2.toString());
                    bandera = seguirocerrar(scanner);
                    break;

                case 3:
                    Ejercicio3 ej3 = new Ejercicio3();

                    System.out.print("Ingrese los segundos de renderizado: ");
                    ej3.setSegundosrenderizado(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej3.toString());
                    bandera = seguirocerrar(scanner);
                    break;

                case 4: {
                    Ejercicio4 ej4 = new Ejercicio4();

                    System.out.print("Ingrese el nombre de la ruta: ");
                    ej4.setRuta(scanner.nextLine());

                    System.out.print("Ingrese la distancia total (km): ");
                    ej4.setDistanciaKilometros(scanner.nextDouble());

                    System.out.print("Ingrese el rendimiento del vehículo (km/galón): ");
                    ej4.setRendimientoKilometrosGalon(scanner.nextDouble());

                    System.out.print("Ingrese el precio del galón de gasolina: ");
                    ej4.setPrecioGalon(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej4.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 5: {
                    Ejercicio5 ej5 = new Ejercicio5();

                    System.out.print("Ingrese el nombre del pasajero: ");
                    ej5.setPasajero(scanner.nextLine());

                    System.out.print("Ingrese el valor base del tiquete: ");
                    ej5.setValorTiquete(scanner.nextDouble());

                    System.out.print("Ingrese el peso de la maleta (kg): ");
                    ej5.setPesoMaleta(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej5.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 6: {
                    Ejercicio6 ej6 = new Ejercicio6();

                    System.out.print("Ingrese la temperatura actual (°C): ");
                    ej6.setTemperatura(scanner.nextDouble());

                    System.out.print("Ingrese la cantidad de litros almacenados: ");
                    ej6.setLitrosAlmacenados(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej6.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 7: {
                    Ejercicio7 ej7 = new Ejercicio7();

                    System.out.print("Ingrese la cantidad total de baldosas pedidas: ");
                    ej7.setCantidadBaldosas(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej7.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 8: {
                    Ejercicio8 ej8 = new Ejercicio8();

                    System.out.print("Ingrese el nombre del operario: ");
                    ej8.setOperario(scanner.nextLine());

                    System.out.print("Ingrese el total de horas trabajadas en la semana: ");
                    ej8.setHorasTrabajadas(scanner.nextDouble());

                    System.out.print("Ingrese la tarifa de la hora ordinaria: ");
                    ej8.setTarifaHora(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej8.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 9: {
                    Ejercicio9 ej9 = new Ejercicio9();

                    System.out.print("Ingrese el nombre del deportista: ");
                    ej9.setDeportista(scanner.nextLine());

                    System.out.print("Ingrese el peso en kilogramos: ");
                    ej9.setPeso(scanner.nextDouble());

                    System.out.print("Ingrese la estatura en metros: ");
                    ej9.setEstatura(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej9.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 10: {
                    Ejercicio10 ej10 = new Ejercicio10();

                    System.out.print("Ingrese el consumo del mes en m3: ");
                    ej10.setConsumoMetrosCubicos(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej10.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 11: {
                    Ejercicio11 ej11 = new Ejercicio11();

                    System.out.print("Ingrese el sueldo básico mensual: ");
                    ej11.setSueldoBasico(scanner.nextDouble());

                    System.out.print("Ingrese el total de ventas del mes: ");
                    ej11.setVentasMes(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej11.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 12: {
                    Ejercicio12 ej12 = new Ejercicio12();

                    System.out.print("Ingrese el valor de la compra: ");
                    ej12.setValorCompra(scanner.nextDouble());

                    System.out.print("¿Hoy es Martes de Descuento? (1 = Sí, 2 = No): ");
                    ej12.setEsMartes(scanner.nextInt());

                    if (ej12.getEsMartes() == 1) {
                        System.out.print("Ingrese el medio de pago (1 = Efectivo, 2 = Tarjeta): ");
                        ej12.setMedioPago(scanner.nextInt());
                    }
                    scanner.nextLine();

                    System.out.println(ej12.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 13: {
                    Ejercicio13 ej13 = new Ejercicio13();

                    System.out.print("Ingrese el ingreso mensual del solicitante: ");
                    ej13.setIngresoMensual(scanner.nextDouble());
                    scanner.nextLine();

                    if (ej13.getIngresoMensual() >= 3000000) {
                        System.out.print("Ingrese la antigüedad laboral en años: ");
                        ej13.setAntiguedadAnios(scanner.nextInt());

                        System.out.print("Ingrese el valor de sus deudas actuales: ");
                        ej13.setDeudasActuales(scanner.nextDouble());
                        scanner.nextLine();
                    }

                    System.out.println(ej13.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 14: {
                    Ejercicio14 ej14 = new Ejercicio14();

                    System.out.print("¿Presenta dificultad respiratoria grave? (1 = Sí, 2 = No): ");
                    ej14.setDificultadRespiratoria(scanner.nextInt());

                    if (ej14.getDificultadRespiratoria() != 1) {
                        System.out.print("Ingrese la temperatura corporal (°C): ");
                        ej14.setTemperatura(scanner.nextDouble());

                        System.out.print("Ingrese el nivel de dolor (1 a 10): ");
                        ej14.setNivelDolor(scanner.nextInt());
                    }
                    scanner.nextLine();

                    System.out.println(ej14.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 15: {
                    Ejercicio15 ej15 = new Ejercicio15();

                    System.out.print("Ingrese la edad: ");
                    ej15.setEdad(scanner.nextInt());

                    System.out.print("Ingrese el promedio acumulado: ");
                    ej15.setPromedio(scanner.nextDouble());

                    System.out.print("¿Tiene inglés certificado? (1 = Sí, 0 = No): ");
                    ej15.setInglesCertificado(scanner.nextInt());

                    System.out.print("¿Ganó un concurso de algoritmos? (1 = Sí, 0 = No): ");
                    ej15.setGanoConcurso(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej15.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 16: {
                    Ejercicio16 ej16 = new Ejercicio16();

                    System.out.print("Ingrese el año a evaluar: ");
                    ej16.setAnio(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej16.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 17: {
                    Ejercicio17 ej17 = new Ejercicio17();

                    System.out.print("Ingrese la longitud del lado A: ");
                    ej17.setLadoA(scanner.nextDouble());

                    System.out.print("Ingrese la longitud del lado B: ");
                    ej17.setLadoB(scanner.nextDouble());

                    System.out.print("Ingrese la longitud del lado C: ");
                    ej17.setLadoC(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println(ej17.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 18: {
                    Ejercicio18 ej18 = new Ejercicio18();

                    System.out.print("Ingrese la placa del vehículo: ");
                    ej18.setPlaca(scanner.nextLine());

                    System.out.print("Ingrese la categoría (1 = Automóvil, 2 = Bus, 3 = Camión, 4 = Tractomula): ");
                    ej18.setCategoria(scanner.nextInt());

                    System.out.print("¿Tiene telepeaje activo? (1 = Sí, 2 = No): ");
                    ej18.setTelepeaje(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej18.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 19: {
                    Ejercicio19 ej19 = new Ejercicio19();

                    System.out.print("Ingrese la cantidad de pesos colombianos a cambiar: ");
                    ej19.setPesosColombianos(scanner.nextDouble());

                    System.out.print("Elija la moneda destino (1 = Dólar, 2 = Euro, 3 = Real): ");
                    ej19.setMonedaDestino(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println(ej19.toString());
                    bandera = seguirocerrar(scanner);
                    break;
                }

                case 20: {
                    Ejercicio20 ej20 = new Ejercicio20();

                    System.out.print("Ingrese el nombre del cliente: ");
                    ej20.setCliente(scanner.nextLine());

                    System.out.print("Elija el plan (1 = Mensual, 2 = Trimestral, 3 = Anual): ");
                    ej20.setPlan(scanner.nextInt());

                    System.out.print("Ingrese la edad del cliente: ");
                    ej20.setEdad(scanner.nextInt());

                    System.out.print("¿Desea incluir entrenador personalizado? (1 = Sí, 2 = No): ");
                    ej20.setEntrenador(scanner.nextInt());
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
}
