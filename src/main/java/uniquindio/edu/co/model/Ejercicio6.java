package uniquindio.edu.co.model;

public class Ejercicio6 {
    private static final double PRECIO_LITRO = 3200;
    private static final double PORCENTAJE_PERDIDA = 0.12;

    private double temperatura;
    private double litrosAlmacenados;

    public boolean isCadenaOptima() {
        return temperatura <= 4.0;
    }

    public double calcularPerdida() {
        return litrosAlmacenados * PRECIO_LITRO * PORCENTAJE_PERDIDA;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getLitrosAlmacenados() {
        return litrosAlmacenados;
    }

    public void setLitrosAlmacenados(double litrosAlmacenados) {
        this.litrosAlmacenados = litrosAlmacenados;
    }

    @Override
    public String toString() {
        if (isCadenaOptima()) {
            return "Ejercicio6{" +
                    "Temperatura=" + temperatura + " °C" +
                    ", Litros Almacenados=" + litrosAlmacenados +
                    ", Estado=Cadena de frío óptima" +
                    '}';
        }
        return "Ejercicio6{" +
                "¡ALERTA DE TEMPERATURA (" + temperatura + " °C)!" +
                ", Litros en Riesgo=" + litrosAlmacenados +
                ", Pérdida Económica Estimada (12%)=" + calcularPerdida() +
                '}';
    }
}
