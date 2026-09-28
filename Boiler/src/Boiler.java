public class Boiler {

    private static Boiler instancia;

    private boolean lleno;
    private boolean resistenciaEncendida;
    private boolean mezclando;

    private Boiler() {
        this.lleno = false;
        this.resistenciaEncendida = false;
        this.mezclando = false;
    }

    public static Boiler getInstancia() {
        if (instancia == null) {
            instancia = new Boiler();
        }
        return instancia;
    }

    public void llenar() {
        if (!lleno && !resistenciaEncendida) {
            lleno = true;
            System.out.println("El boiler se lleno con la mezcla de chocolate y leche");
        } else {
            System.out.println("No se puede llenar el boiler");
        }
    }

    public void mezclar() {
        if (lleno && !resistenciaEncendida) {
            mezclando = true;
            System.out.println("El boiler inicio el proceso de mezcla");
        } else {
            System.out.println("No se puede iniciar la mezcla");
        }
    }

    public void vaciar() {
        if (lleno && resistenciaEncendida) {
            lleno = false;
            mezclando = false;
            System.out.println("El boiler se vacio");
        } else {
            System.out.println("No se puede vaciar el boiler");
        }
    }

    public void encenderResistencia() {
        resistenciaEncendida = true;
        System.out.println("Resistencia encendida");
    }

    public void apagarResistencia() {
        resistenciaEncendida = false;
        System.out.println("Resistencia apagada");
    }

    public boolean isLleno() {
        return lleno;
    }

    public boolean isResistenciaEncendida() {
        return resistenciaEncendida;
    }

    public boolean isMezclando() {
        return mezclando;
    }
}