package uniquindio.edu.co.model;

// Calcular tiempo

public class Ejercicio3 {
    private int segundosrenderizado;


    public String calculartiempo(int segundosrenderizado){
        int calculohora=segundosrenderizado/3600;
        int calculominutos=(segundosrenderizado%3600)/60;
        int calculosegundos=(segundosrenderizado%3600)%60;
        return "Horas: "+calculohora+", Minutos: "+calculominutos+", Segundos: "+calculosegundos;
    }

    public int getSegundosrenderizado() {
        return segundosrenderizado;
    }

    public void setSegundosrenderizado(int segundosrenderizado) {
        this.segundosrenderizado = segundosrenderizado;
    }

    @Override
    public String toString() {
        return "Ejercicio3{" +
                "Segundos de renderizado=" + segundosrenderizado +calculartiempo(segundosrenderizado)+
                '}';
    }
}
