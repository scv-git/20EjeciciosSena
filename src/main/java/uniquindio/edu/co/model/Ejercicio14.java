package uniquindio.edu.co.model;

public class Ejercicio14 {
    private int dificultadRespiratoria;
    private double temperatura;
    private int nivelDolor;

    public String clasificarTriaje() {
        if (dificultadRespiratoria == 1) {
            return "Nivel I (Rojo - Atención Inmediata)";
        }
        if (temperatura > 39.0 || nivelDolor >= 8) {
            return "Nivel II (Naranja - 15 min)";
        }
        return "Nivel III (Amarillo - 60 min)";
    }

    public String obtenerTiempoEspera() {
        if (dificultadRespiratoria == 1) {
            return "Inmediata";
        }
        if (temperatura > 39.0 || nivelDolor >= 8) {
            return "15 minutos";
        }
        return "60 minutos";
    }

    public int getDificultadRespiratoria() {
        return dificultadRespiratoria;
    }

    public void setDificultadRespiratoria(int dificultadRespiratoria) {
        this.dificultadRespiratoria = dificultadRespiratoria;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getNivelDolor() {
        return nivelDolor;
    }

    public void setNivelDolor(int nivelDolor) {
        this.nivelDolor = nivelDolor;
    }

    @Override
    public String toString() {
        return "Ejercicio14{" +
                "CLASIFICACIÓN TRIAJE: " + clasificarTriaje() +
                ", Tiempo máximo de espera=" + obtenerTiempoEspera() +
                '}';
    }
}
