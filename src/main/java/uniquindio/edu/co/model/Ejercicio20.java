package uniquindio.edu.co.model;

public class Ejercicio20 {
    private String cliente;
    private int plan;
    private int edad;
    private int entrenador;

    public double calcularValorPlan() {
        switch (plan) {
            case 1:
                return 90000;
            case 2:
                return 240000;
            case 3:
                return 850000;
            default:
                return 0;
        }
    }

    public int calcularMesesPlan() {
        switch (plan) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 12;
            default:
                return 0;
        }
    }

    public String obtenerNombrePlan() {
        switch (plan) {
            case 1:
                return "Mensual";
            case 2:
                return "Trimestral";
            case 3:
                return "Anual";
            default:
                return "Plan inválido";
        }
    }

    public boolean tieneDescuentoEdad() {
        return edad < 22 || edad > 60;
    }

    public double calcularDescuento() {
        if (tieneDescuentoEdad()) {
            return calcularValorPlan() * 0.10;
        }
        return 0;
    }

    public double calcularSuplementoEntrenador() {
        if (entrenador == 1) {
            return 50000 * calcularMesesPlan();
        }
        return 0;
    }

    public double calcularTotal() {
        return calcularValorPlan() - calcularDescuento() + calcularSuplementoEntrenador();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(int entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Ejercicio20{" +
                "Cliente='" + cliente + '\'' +
                ", Plan " + obtenerNombrePlan() + "=" + calcularValorPlan() +
                ", Dto Joven/Senior (10%)=" + calcularDescuento() +
                ", Suplemento Entrenador (" + calcularMesesPlan() + " meses x $50000)=" +
                calcularSuplementoEntrenador() +
                ", TOTAL A PAGAR EN RECEPCIÓN=" + calcularTotal() +
                '}';
    }
}
