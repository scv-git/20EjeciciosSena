package uniquindio.edu.co.model;

public class Ejercicio11 {
    private double sueldoBasico;
    private double ventasMes;

    public double calcularPorcentajeComision() {
        if (ventasMes < 5000000) {
            return 0;
        } else if (ventasMes < 10000000) {
            return 0.05;
        } else if (ventasMes < 20000000) {
            return 0.08;
        } else {
            return 0.12;
        }
    }

    public double calcularComision() {
        return ventasMes * calcularPorcentajeComision();
    }

    public double calcularTotal() {
        return sueldoBasico + calcularComision();
    }

    public String obtenerNivelComision() {
        return "Comisión del " + (calcularPorcentajeComision() * 100) + "%";
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    @Override
    public String toString() {
        return "Ejercicio11{" +
                "Nivel Alcanzado=" + obtenerNivelComision() +
                " (" + calcularComision() + ")" +
                ", Sueldo Básico=" + sueldoBasico +
                ", Ventas del Mes=" + ventasMes +
                ", PAGO TOTAL=" + calcularTotal() +
                '}';
    }
}
