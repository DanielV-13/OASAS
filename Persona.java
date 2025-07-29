public class Persona extends Abstracta{

    //Atributos

    private String nombre2;
    private String nombre3;

    private String nombre;

    @Override
    public void decirHola() {
        super.decirHola();
        System.out.println("Adios");
        System.out.println("Pruebas");
    }
}
