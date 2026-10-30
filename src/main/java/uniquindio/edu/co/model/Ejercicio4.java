package uniquindio.edu.co.model;

public class Ejercicio4 {
    private String ruta;
    private double distanciaKilometros;
    private double rendimientoKilometrosGalon;
    private double precioGalon;

    public double calcularGalonesNecesarios() {
        return distanciaKilometros / rendimientoKilometrosGalon;
    }

    public double calcularCostoEstimado() {

        return calcularGalonesNecesarios() * precioGalon;
    }

    public String getRuta() {

        return ruta;
    }

    public void setRuta(String ruta) {

        this.ruta = ruta;
    }

    public double getDistanciaKilometros() {

        return distanciaKilometros;
    }

    public void setDistanciaKilometros(double distanciaKilometros) {

        this.distanciaKilometros = distanciaKilometros;
    }

    public double getRendimientoKilometrosGalon() {

        return rendimientoKilometrosGalon;
    }

    public void setRendimientoKilometrosGalon(double rendimientoKilometrosGalon) {
        this.rendimientoKilometrosGalon = rendimientoKilometrosGalon;
    }

    public double getPrecioGalon() {
        return precioGalon;
    }

    public void setPrecioGalon(double precioGalon) {
        this.precioGalon = precioGalon;
    }

    @Override
    public String toString() {
        return "Ejercicio4{" +
                "Ruta='" + ruta + '\'' +
                ", Distancia=" + distanciaKilometros + " km" +
                ", Rendimiento=" + rendimientoKilometrosGalon + " km/galón" +
                ", Precio Galón=" + precioGalon +
                ", Combustible Requerido=" + calcularGalonesNecesarios() + " galones" +
                ", Costo Estimado=" + calcularCostoEstimado() +
                '}';
    }
}
