package uniquindio.edu.co.model;

public class Ejercicio9 {
    private String deportista;
    private double peso;
    private double estatura;

    public double calcularImc() {
        return peso / (estatura * estatura);
    }

    public String clasificarImc() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public String getDeportista() {
        return deportista;
    }

    public void setDeportista(String deportista) {
        this.deportista = deportista;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Ejercicio9{" +
                "Paciente='" + deportista + '\'' +
                ", Peso=" + peso + " kg" +
                ", Estatura=" + estatura + " m" +
                ", IMC Calculado=" + calcularImc() +
                ", Diagnóstico Médico=" + clasificarImc() +
                '}';
    }
}
