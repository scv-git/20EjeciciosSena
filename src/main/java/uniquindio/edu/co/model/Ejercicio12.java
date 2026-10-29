package uniquindio.edu.co.model;

public class Ejercicio12 {
    private double valorCompra;
    private int esMartes;
    private int medioPago;

    public double calcularPorcentajeDescuento() {
        if (esMartes == 1) {
            if (medioPago == 1) {
                return 0.15;
            } else {
                return 0.10;
            }
        }
        if (valorCompra > 500000) {
            return 0.03;
        }
        return 0;
    }

    public double calcularDescuento() {
        return valorCompra * calcularPorcentajeDescuento();
    }

    public double calcularTotal() {
        return valorCompra - calcularDescuento();
    }

    public String obtenerPromocion() {
        if (esMartes == 1) {
            return medioPago == 1 ? "Promoción Martes en Efectivo (15% Dto)"
                    : "Promoción Martes con Tarjeta (10% Dto)";
        }
        if (valorCompra > 500000) {
            return "Descuento general (3% Dto)";
        }
        return "Sin descuento";
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getEsMartes() {
        return esMartes;
    }

    public void setEsMartes(int esMartes) {
        this.esMartes = esMartes;
    }

    public int getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(int medioPago) {
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return "Ejercicio12{" +
                obtenerPromocion() +
                ", Descuento=" + calcularDescuento() +
                ", TOTAL NETO A PAGAR=" + calcularTotal() +
                '}';
    }
}
