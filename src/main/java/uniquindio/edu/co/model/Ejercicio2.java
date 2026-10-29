package uniquindio.edu.co.model;
import java.util.Scanner;


//dividir cuenta


public class Ejercicio2 {
    private double valorcuentabase;
    private int numeropersonas;
    private double propina=10;
    private String estadopropina;


    public double calculapropina(double valorcuentabase, int numeropersonas, double propina){
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Desea Agregar propina SI/NO: ");
        String agregarpropina=scanner.nextLine().trim();

        if(agregarpropina.equalsIgnoreCase("SI")){
            setEstadopropina("SI");
            return (valorcuentabase/numeropersonas)*(propina/100);
        }
        else

            setEstadopropina("NO");
            return valorcuentabase/numeropersonas;


    }

    public String getEstadopropina() {
        return estadopropina;
    }

    public void setEstadopropina(String estadopropina) {
        this.estadopropina = estadopropina;
    }

    public double getValorcuentabase() {
        return valorcuentabase;
    }

    public void setValorcuentabase(double valorcuentabase) {
        this.valorcuentabase = valorcuentabase;
    }

    public int getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(int numeropersonas) {
        this.numeropersonas = numeropersonas;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Ejercicio2{" +
                "Valor Cuenta Base=" + valorcuentabase +
                ", Numero Personas Para Dividir La Cuenta=" + numeropersonas +
                ", Propina voluntaria=" + propina +"%"+", Total="+ calculapropina(valorcuentabase,numeropersonas,propina)+valorcuentabase+ ", Propina Agregada="+ estadopropina+
                '}';
    }
}
