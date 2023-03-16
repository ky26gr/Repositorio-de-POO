public class Contacto {
    private Persona persona;
    private int edad;

    public Contacto(Persona persona, int edad) {
        this.persona = persona;
        this.edad = edad;
    }

    public Contacto(String nombre, String id, int edad){
        this.persona = new Persona(nombre,id);
        this.edad=edad;
    }



    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Contacto: " + persona +
                ", edad: " + edad;
    }
}
