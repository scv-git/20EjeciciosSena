package uniquindio.edu.co.model;

public class Ejercicio8 {
    private static final double HORAS_ORDINARIAS = 44;
    private static final double RECARGO_HORA_EXTRA = 1.25;

    private String operario;
    private double horasTrabajadas;
    private double tarifaHora;

    public double calcularHorasOrdinarias() {
        return Math.min(horasTrabajadas, HORAS_ORDINARIAS);
    }

    public double calcularHorasExtras() {
        return Math.max(0, horasTrabajadas - HORAS_ORDINARIAS);
    }

    public double calcularPagoOrdinario() {
        return calcularHorasOrdinarias() * tarifaHora;
    }

    public double calcularPagoExtras() {
        return calcularHorasExtras() * tarifaHora * RECARGO_HORA_EXTRA;
    }

    public double calcularTotal() {
        return calcularPagoOrdinario() + calcularPagoExtras();
    }

    public String getOperario() {
        return operario;
    }

    public void setOperario(String operario) {
        this.operario = operario;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return "Ejercicio8{" +
                "Operario='" + operario + '\'' +
                ", Pago Ordinario (" + calcularHorasOrdinarias() + "h)=" + calcularPagoOrdinario() +
                ", Pago Extras (" + calcularHorasExtras() + "h al 125%)=" + calcularPagoExtras() +
                ", TOTAL=" + calcularTotal() +
                '}';
    }
}
