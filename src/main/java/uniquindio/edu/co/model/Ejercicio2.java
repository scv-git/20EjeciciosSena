package uniquindio.edu.co.model;

// División de cuenta en restaurante con propina

public class Ejercicio2 {
    private static final double PORCENTAJE_IMPOCONSUMO = 0.08;

    private double valorcuentabase;
    private int numeropersonas;
    private double propina = 10;

    public double calcularImpoconsumo() {
        return valorcuentabase * PORCENTAJE_IMPOCONSUMO;
    }

    public double calcularPropina() {
        return valorcuentabase * (propina / 100.0);
    }

    public double calcularTotalFactura() {
        return valorcuentabase + calcularImpoconsumo() + calcularPropina();
    }

    public double calcularCuotaPorPersona() {
        if (numeropersonas <= 0) {
            return 0;
        }
        return calcularTotalFactura() / numeropersonas;
    }

    public double calculapropina(double valorcuentabase, int numeropersonas, double propina) {
        return valorcuentabase * (propina / 100.0);
    }

    public double getValorcuentabase() {
        return valorcuentabase;
    }

    public void setValorcuentabase(double valorcuentabase) {
        this.valorcuentabase = valorcuentabase;
    }

    public int getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(int numeropersonas) {
        this.numeropersonas = numeropersonas;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getPorcentajeImpoconsumo() {
        return PORCENTAJE_IMPOCONSUMO;
    }

    @Override
    public String toString() {
        return "Ejercicio2{" +
                "Consumo Base=" + valorcuentabase +
                ", Impoconsumo (8%)=" + calcularImpoconsumo() +
                ", Propina (" + propina + "%)=" + calcularPropina() +
                ", TOTAL FACTURA=" + calcularTotalFactura() +
                ", Cuota por cada amigo (" + numeropersonas + " personas)=" + calcularCuotaPorPersona() +
                '}';
    }
}
