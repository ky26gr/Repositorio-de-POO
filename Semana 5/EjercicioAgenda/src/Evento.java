public class Evento {
    private String lugar;

    public Evento(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Evento: " +
                "lugar: " + lugar + '\'';
    }
}
