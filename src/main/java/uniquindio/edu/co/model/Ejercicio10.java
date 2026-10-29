package uniquindio.edu.co.model;

public class Ejercicio10 {
    private static final double CARGO_FIJO = 12000;

    private double consumoMetrosCubicos;

    public double calcularTarifa() {
        if (consumoMetrosCubicos <= 15) {
            return 2500;
        } else if (consumoMetrosCubicos <= 30) {
            return 3800;
        } else {
            return 5200;
        }
    }

    public double calcularCostoAgua() {
        return consumoMetrosCubicos * calcularTarifa();
    }

    public double calcularTotal() {
        return calcularCostoAgua() + CARGO_FIJO;
    }

    public String obtenerRangoConsumo() {
        if (consumoMetrosCubicos <= 15) {
            return "Tarifa Baja";
        } else if (consumoMetrosCubicos <= 30) {
            return "Tarifa Media";
        } else {
            return "Tarifa Alta";
        }
    }

    public double getConsumoMetrosCubicos() {
        return consumoMetrosCubicos;
    }

    public void setConsumoMetrosCubicos(double consumoMetrosCubicos) {
        this.consumoMetrosCubicos = consumoMetrosCubicos;
    }

    @Override
    public String toString() {
        return "Ejercicio10{" +
                "Consumo=" + consumoMetrosCubicos + " m3" +
                " (" + obtenerRangoConsumo() + " " + calcularTarifa() + "/m3)" +
                ", Costo Agua=" + calcularCostoAgua() +
                ", Cargo Fijo=" + CARGO_FIJO +
                ", TOTAL=" + calcularTotal() +
                '}';
    }
}
