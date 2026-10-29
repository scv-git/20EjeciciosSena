package uniquindio.edu.co.model;

public class Ejercicio13 {
    private static final double INGRESO_MINIMO = 3000000;
    private static final int ANTIGUEDAD_MINIMA = 2;
    private static final double PORCENTAJE_MAXIMO_ENDEUDAMIENTO = 0.30;

    private double ingresoMensual;
    private int antiguedadAnios;
    private double deudasActuales;

    public boolean isIngresoValido() {
        return ingresoMensual >= INGRESO_MINIMO;
    }

    public double calcularPorcentajeEndeudamiento() {
        if (ingresoMensual == 0) {
            return 0;
        }
        return (deudasActuales / ingresoMensual) * 100;
    }

    public boolean isCreditoAprobado() {
        return isIngresoValido()
                && antiguedadAnios >= ANTIGUEDAD_MINIMA
                && deudasActuales <= ingresoMensual * PORCENTAJE_MAXIMO_ENDEUDAMIENTO;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }

    public double getDeudasActuales() {
        return deudasActuales;
    }

    public void setDeudasActuales(double deudasActuales) {
        this.deudasActuales = deudasActuales;
    }

    @Override
    public String toString() {
        if (!isIngresoValido()) {
            return "Ejercicio13{" +
                    "[CRÉDITO RECHAZADO] El ingreso mensual de " + ingresoMensual +
                    " no alcanza el mínimo requerido de " + INGRESO_MINIMO +
                    '}';
        }
        if (antiguedadAnios < ANTIGUEDAD_MINIMA) {
            return "Ejercicio13{" +
                    "[CRÉDITO RECHAZADO] Antigüedad laboral insuficiente: " + antiguedadAnios +
                    " años (mínimo " + ANTIGUEDAD_MINIMA + ")" +
                    '}';
        }
        if (deudasActuales > ingresoMensual * PORCENTAJE_MAXIMO_ENDEUDAMIENTO) {
            return "Ejercicio13{" +
                    "[CRÉDITO RECHAZADO] Endeudamiento del " + calcularPorcentajeEndeudamiento() +
                    "% (máximo permitido 30%)" +
                    '}';
        }
        return "Ejercicio13{" +
                "[CRÉDITO APROBADO] Ingreso válido (" + ingresoMensual + ")" +
                ", antigüedad cumplida (" + antiguedadAnios + " años)" +
                " y endeudamiento del " + calcularPorcentajeEndeudamiento() + "% (<=30%)" +
                '}';
    }
}
