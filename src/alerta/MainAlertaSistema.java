package alerta;

public class MainAlertaSistema {
    static void main() {
        System.out.println("Existen "+AlertaSistema.getContador()+ " objetos creados");
        AlertaSistema as1 = new AlertaSistema(10, "Error de conexion");
        System.out.println("Id: "+as1.getIdentificador());
        System.out.println("Descripcion: "+as1.getDescripcion());
        System.out.println("Prioridad: "+as1.getPrioridad());
        System.out.println(as1.aumentarPrioridad()+" ; prioridad "+as1.getPrioridad());
        System.out.println(as1.aumentarPrioridad()+" ; prioridad "+as1.getPrioridad());
        System.out.println(as1.aumentarPrioridad()+" ; prioridad "+as1.getPrioridad());
        System.out.println(as1.esUrgente());
        System.out.println(as1.aumentarPrioridad()+" ; prioridad "+as1.getPrioridad());
        System.out.println(as1.aumentarPrioridad()+" ; prioridad "+as1.getPrioridad());
        as1.setDescripcion("");
        System.out.println("Descripcion: "+as1.getDescripcion());
    }
}
