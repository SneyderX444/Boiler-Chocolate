public class Main {

    public static void main(String[] args) {
        Boiler boiler = Boiler.getInstancia();

        boiler.llenar();
        boiler.mezclar();
        boiler.encenderResistencia();
        boiler.vaciar();
        boiler.apagarResistencia();
        boiler.llenar();

        Boiler otro = Boiler.getInstancia();
        System.out.println(boiler == otro);
    }
}