package uniquindio.edu.co.model;


//Liquidar pego recolector

public class Ejercicio1 {
    private String name;
    private double cofferecolected;
    private double APORTESEGURIDAD=0.04;
    private double PRICEKG=1200;


    public double calculatepay(double cofferecolected, double APORTESEGURIDAD, double PRICEKG) {
        return (cofferecolected*PRICEKG)*APORTESEGURIDAD;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCofferecolected() {
        return cofferecolected;
    }

    public void setCofferecolected(double cofferecolected) {
        this.cofferecolected = cofferecolected;
    }

    public double getPRICEKG() {
        return PRICEKG;
    }

    public void setPRICEKG(double PRICEKG) {
        this.PRICEKG = PRICEKG;
    }

    public double getAPORTESEGURIDAD() {
        return APORTESEGURIDAD;
    }

    public void setAPORTESEGURIDAD(double APORTESEGURIDAD) {
        this.APORTESEGURIDAD = APORTESEGURIDAD;
    }

    @Override
    public String toString() {
        return "Ejercicio1{" +
                "Precio Kilo Cafe=" + PRICEKG +
                ", Descuento Porcentaje Aporte Seguridad=" + APORTESEGURIDAD*100 +"%"+
                ", Kilos recoletados=" + cofferecolected +
                ", Nombre='" + name + ", Pago al empleado=" + calculatepay(cofferecolected,APORTESEGURIDAD,PRICEKG) + '\'' +
                '}';
    }
}
