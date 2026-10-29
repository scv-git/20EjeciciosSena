package uniquindio.edu.co.model;

public class Ejercicio18 {
    private String placa;
    private int categoria;
    private int telepeaje;

    public double calcularTarifaBase() {
        switch (categoria) {
            case 1:
                return 11500;
            case 2:
                return 18200;
            case 3:
                return 26000;
            case 4:
                return 42500;
            default:
                return 0;
        }
    }

    public String obtenerNombreCategoria() {
        switch (categoria) {
            case 1:
                return "Automóvil";
            case 2:
                return "Bus";
            case 3:
                return "Camión";
            case 4:
                return "Tractomula";
            default:
                return "Categoría inválida";
        }
    }

    public double calcularDescuento() {
        if (telepeaje == 1) {
            return calcularTarifaBase() * 0.05;
        }
        return 0;
    }

    public double calcularCobro() {
        return calcularTarifaBase() - calcularDescuento();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getTelepeaje() {
        return telepeaje;
    }

    public void setTelepeaje(int telepeaje) {
        this.telepeaje = telepeaje;
    }

    @Override
    public String toString() {
        return "Ejercicio18{" +
                "PEAJE NACIONAL" +
                ", Placa='" + placa + '\'' +
                ", Cat=" + obtenerNombreCategoria() + " (" + calcularTarifaBase() + ")" +
                ", Dto Telepeaje (5%)=" + calcularDescuento() +
                ", COBRO=" + calcularCobro() +
                '}';
    }
}
