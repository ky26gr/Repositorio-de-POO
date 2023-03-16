public class Empresarial extends Contacto{
    private String correo;

    public Empresarial(String nombre, String id, int edad, String correo) {
        super(nombre, id, edad);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return super.toString()+'\'' + " Empresarial: " +
                "correo: " + correo + '\'';
    }
}
