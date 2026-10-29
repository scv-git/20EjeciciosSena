package uniquindio.edu.co.model;

public class Ejercicio16 {
    private int anio;

    public boolean isBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        if (isBisiesto()) {
            return "Ejercicio16{" +
                    "El año " + anio + " ES BISIESTO" +
                    " (Febrero tiene 29 días - Total: 366 días para programación de cosecha)" +
                    '}';
        }
        return "Ejercicio16{" +
                "El año " + anio + " NO ES BISIESTO" +
                " (Febrero tiene 28 días - Total: 365 días para programación de cosecha)" +
                '}';
    }
}
