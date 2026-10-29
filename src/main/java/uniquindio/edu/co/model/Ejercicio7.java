package uniquindio.edu.co.model;

public class Ejercicio7 {
    private static final int UNIDADES_POR_CAJA = 12;

    private int cantidadBaldosas;

    public boolean isMultiploExacto() {
        return cantidadBaldosas % UNIDADES_POR_CAJA == 0;
    }

    public int calcularCajasCompletas() {
        return cantidadBaldosas / UNIDADES_POR_CAJA;
    }

    public int calcularBaldosasFaltantes() {
        int sobrantes = cantidadBaldosas % UNIDADES_POR_CAJA;
        return sobrantes == 0 ? 0 : UNIDADES_POR_CAJA - sobrantes;
    }

    public int getCantidadBaldosas() {
        return cantidadBaldosas;
    }

    public void setCantidadBaldosas(int cantidadBaldosas) {
        this.cantidadBaldosas = cantidadBaldosas;
    }

    @Override
    public String toString() {
        if (isMultiploExacto()) {
            return "Ejercicio7{" +
                    "Cantidad de Baldosas=" + cantidadBaldosas +
                    ", Despacho=" + calcularCajasCompletas() + " cajas exactas" +
                    '}';
        }
        return "Ejercicio7{" +
                "Pedido incompleto: Se arman " + calcularCajasCompletas() +
                " cajas completas (" + calcularCajasCompletas() * UNIDADES_POR_CAJA + " uds)" +
                ". Faltan " + calcularBaldosasFaltantes() + " baldosas para completar la caja #" +
                (calcularCajasCompletas() + 1) +
                '}';
    }
}
