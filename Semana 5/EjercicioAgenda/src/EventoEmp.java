public class EventoEmp extends Evento{
    private String modalidad;

    public EventoEmp(String lugar, String modalidad) {
        super(lugar);
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return super.toString()+'\'' + " Evento Empresarial: " +
                "modalidad: " + modalidad + '\'';
    }
}
