public class Main {
    public static void main(String[] args) {

        System.out.println("Agenda");
        Agenda laAgenda = new Agenda();
        laAgenda.agregar(new Familia("Christian", "123", 21, "Tio" ));
        laAgenda.agregar(new Empresarial("Juan","456", 32, "juan@gmail.com"));
        laAgenda.agregar(new Amigos("Liz","789", 23,"Chela"));
        laAgenda.imprimir();
        System.out.println("***********************************************************************************");
        System.out.println("Agenda con Eventos incluidos");
        laAgenda.agregar(new EventoEmp("Alajuela"," Presencial"));
        laAgenda.agregar(new EventoFam("Guanacaste","3pm"));
        laAgenda.imprimir();
        System.out.println("***********************************************************************************");
        System.out.println("Agenda con un Contacto Eliminado");
        laAgenda.eliminar("123");
        laAgenda.imprimir();
    }
}