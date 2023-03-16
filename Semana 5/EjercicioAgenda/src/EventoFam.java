public class EventoFam extends Evento{
    private String hora;

    public EventoFam(String lugar, String hora) {
        super(lugar);
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return super.toString()+'\'' + " Evento Familiar: " +
                "hora: " + hora + '\'';
    }
}
