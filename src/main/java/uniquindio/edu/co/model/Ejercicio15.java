package uniquindio.edu.co.model;

public class Ejercicio15 {
    private int edad;
    private double promedio;
    private int inglesCertificado;
    private int ganoConcurso;

    public boolean isElegible() {
        return edad >= 18
                && edad <= 28
                && promedio >= 4.3
                && (inglesCertificado == 1 || ganoConcurso == 1);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getInglesCertificado() {
        return inglesCertificado;
    }

    public void setInglesCertificado(int inglesCertificado) {
        this.inglesCertificado = inglesCertificado;
    }

    public int getGanoConcurso() {
        return ganoConcurso;
    }

    public void setGanoConcurso(int ganoConcurso) {
        this.ganoConcurso = ganoConcurso;
    }

    @Override
    public String toString() {
        if (isElegible()) {
            return "Ejercicio15{" +
                    "RESULTADO DE CONVOCATORIA: ¡POSTULACIÓN APROBADA!" +
                    " Cumple requisitos de edad, promedio y mérito académico" +
                    '}';
        }
        return "Ejercicio15{" +
                "RESULTADO DE CONVOCATORIA: POSTULACIÓN RECHAZADA." +
                " No cumple todos los requisitos de edad, promedio o mérito académico" +
                '}';
    }
}
