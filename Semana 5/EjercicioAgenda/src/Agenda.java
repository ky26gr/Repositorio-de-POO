import java.util.LinkedList;

public class Agenda {
    LinkedList<Contacto> list = new LinkedList<Contacto>();
    LinkedList<Evento> listE = new LinkedList<Evento>();

    public void agregar(Contacto p) {
        list.add(p);
    }

    public void agregar(Evento e) {
        listE.add(e);
    }

    public void imprimir() {
        for (Contacto c : list) {
            System.out.println(c);
        }
        for (Evento m : listE) {
            System.out.println(m);
        }

    }

    public void eliminar(String k) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersona().getId() == k) {
                list.remove(i);
                i--;
            }
        }
    }
}


