package uniquindio.edu.co.model;

public class Ejercicio5 {
    private static final double PESO_PERMITIDO = 23;
    private static final double RECARGO_POR_KILO = 15000;

    private String pasajero;
    private double valorTiquete;
    private double pesoMaleta;

    public double calcularKilosExcedentes() {
        return Math.max(0, pesoMaleta - PESO_PERMITIDO);
    }

    public double calcularRecargo() {
        return calcularKilosExcedentes() * RECARGO_POR_KILO;
    }

    public double calcularTotal() {
        return valorTiquete + calcularRecargo();
    }

    public boolean tieneSobrepeso() {
        return pesoMaleta > PESO_PERMITIDO;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public double getValorTiquete() {
        return valorTiquete;
    }

    public void setValorTiquete(double valorTiquete) {
        this.valorTiquete = valorTiquete;
    }

    public double getPesoMaleta() {
        return pesoMaleta;
    }

    public void setPesoMaleta(double pesoMaleta) {
        this.pesoMaleta = pesoMaleta;
    }

    @Override
    public String toString() {
        String alerta = tieneSobrepeso()
                ? "[ALERTA] Equipaje con sobrepeso de " + calcularKilosExcedentes() +
                  " kg. Recargo aplicado: " + calcularRecargo() + " | "
                : "[OK] Equipaje dentro del peso permitido | ";
        return "Ejercicio5{" +
                alerta +
                "Pasajero='" + pasajero + '\'' +
                ", Valor Tiquete=" + valorTiquete +
                ", Peso Maleta=" + pesoMaleta + " kg" +
                ", Total a Pagar=" + calcularTotal() +
                '}';
    }
}
