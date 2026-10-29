package uniquindio.edu.co.model;

public class Ejercicio17 {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public boolean isTrianguloValido() {
        return ladoA + ladoB > ladoC
                && ladoA + ladoC > ladoB
                && ladoB + ladoC > ladoA;
    }

    public String clasificarTriangulo() {
        if (!isTrianguloValido()) {
            return "No forma un triángulo";
        }
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero";
        }
        if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles";
        }
        return "Escaleno";
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        if (!isTrianguloValido()) {
            return "Ejercicio17{" +
                    "Estructura INVÁLIDA ---> Las vigas no forman un triángulo" +
                    '}';
        }
        return "Ejercicio17{" +
                "Estructura VÁLIDA ---> Las vigas forman un Triángulo " +
                clasificarTriangulo().toUpperCase() +
                '}';
    }
}
