package alerta;

public class AlertaSistema {
    private final int identificador;
    private String descripcion;
    private int prioridad;
    private static int contador=0;

    /*

    private int identificador;

    private void setIdentificador(int identificador){
        if(identificador < 0)
            identificador = 0;
        this.identificador = identificador;
    }

    */

    public AlertaSistema(int identificador, String descripcion) {
        if(identificador < 0)
            identificador = 0;
        this.identificador = identificador;
        setDescripcion(descripcion);
        prioridad = 1;
        contador++;
    }

    public void setDescripcion(String descripcion){
        if(descripcion!=null && !descripcion.isBlank() && !descripcion.trim().isEmpty())
            this.descripcion=descripcion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public static int getContador() {
        return contador;
    }

    public boolean aumentarPrioridad(){
        if(prioridad < 5){
            prioridad++;
            return true;
        }
        return false;
    }

    public boolean esUrgente(){
        if(prioridad >= 4)
            return true;
        return false;
    }
}
