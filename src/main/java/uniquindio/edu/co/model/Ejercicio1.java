package uniquindio.edu.co.model;

// Liquidación de cosecha cafetera

public class Ejercicio1 {
    private String name;
    private double cofferecolected;
    private double APORTESEGURIDAD = 0.04;
    private double PRICEKG = 1200;

    public double calcularPagoBruto() {
        return cofferecolected * PRICEKG;
    }

    public double calcularDescuentoSeguridad() {
        return calcularPagoBruto() * APORTESEGURIDAD;
    }

    public double calcularNetoPagar() {
        return calcularPagoBruto() - calcularDescuentoSeguridad();
    }

    public double calculatepay(double cofferecolected, double APORTESEGURIDAD, double PRICEKG) {
        return (cofferecolected * PRICEKG) * (1 - APORTESEGURIDAD);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCofferecolected() {
        return cofferecolected;
    }

    public void setCofferecolected(double cofferecolected) {
        this.cofferecolected = cofferecolected;
    }

    public double getPRICEKG() {
        return PRICEKG;
    }

    public void setPRICEKG(double PRICEKG) {
        this.PRICEKG = PRICEKG;
    }

    public double getAPORTESEGURIDAD() {
        return APORTESEGURIDAD;
    }

    public void setAPORTESEGURIDAD(double APORTESEGURIDAD) {
        this.APORTESEGURIDAD = APORTESEGURIDAD;
    }

    @Override
    public String toString() {
        return "Ejercicio1{" +
                "Recolector='" + name + '\'' +
                ", Kilos Recolectados=" + cofferecolected + " kg" +
                ", Precio por Kilo=" + PRICEKG +
                ", Pago Bruto=" + calcularPagoBruto() +
                ", Descuento Seguridad Social (" + (APORTESEGURIDAD * 100) + "%)=" + calcularDescuentoSeguridad() +
                ", NETO A PAGAR=" + calcularNetoPagar() +
                '}';
    }
}
