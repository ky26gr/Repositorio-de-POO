public class Amigos extends Contacto {
    private String sobrenombre;

    public Amigos(String nombre, String id, int edad, String sobrenombre) {
        super(nombre, id, edad);
        this.sobrenombre = sobrenombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    @Override
    public String toString() {
        return super.toString()+'\'' + " Amigo: " +
                "sobrenombre: " + sobrenombre + '\'';
    }
}
