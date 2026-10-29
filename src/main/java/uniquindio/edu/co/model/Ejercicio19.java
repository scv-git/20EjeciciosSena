package uniquindio.edu.co.model;

public class Ejercicio19 {
    private double pesosColombianos;
    private int monedaDestino;

    public double calcularTasa() {
        switch (monedaDestino) {
            case 1:
                return 4000;
            case 2:
                return 4400;
            case 3:
                return 800;
            default:
                return 0;
        }
    }

    public String obtenerNombreMoneda() {
        switch (monedaDestino) {
            case 1:
                return "Dólar Estadounidense (USD)";
            case 2:
                return "Euro (EUR)";
            case 3:
                return "Real Brasileño (BRL)";
            default:
                return "Moneda inválida";
        }
    }

    public double calcularComision() {
        if (pesosColombianos < 1000000) {
            return pesosColombianos * 0.02;
        }
        return 0;
    }

    public double calcularNeto() {
        return pesosColombianos - calcularComision();
    }

    public double calcularDivisas() {
        double tasa = calcularTasa();
        if (tasa == 0) {
            return 0;
        }
        return calcularNeto() / tasa;
    }

    public double getPesosColombianos() {
        return pesosColombianos;
    }

    public void setPesosColombianos(double pesosColombianos) {
        this.pesosColombianos = pesosColombianos;
    }

    public int getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(int monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    @Override
    public String toString() {
        return "Ejercicio19{" +
                "Monto=" + pesosColombianos + " COP" +
                ", Comisión=" + calcularComision() + " COP" +
                ", Neto convertido=" + calcularNeto() + " COP" +
                ", Moneda Destino=" + obtenerNombreMoneda() +
                ", Recibe=" + calcularDivisas() +
                '}';
    }
}
