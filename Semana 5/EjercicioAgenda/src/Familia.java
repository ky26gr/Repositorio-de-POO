public class Familia extends Contacto{
    private String relacion;

    public Familia(String nombre, String id, int edad, String relacion) {
        super(nombre, id, edad);
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    @Override
    public String toString() {
        return super.toString()+'\'' + " Familia: " +
                "relacion: " + relacion + '\'';
    }
}
