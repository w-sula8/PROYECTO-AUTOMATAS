package afd;

public class transicion {

    public String estado, letra, estado_obj;

    public transicion() {
        estado = null;
        letra = null;
        estado_obj = null;
    }

    public transicion(String estado, String letra, String estado_obj) {
        this.estado = estado;
        this.letra = letra;
        this.estado_obj = estado_obj;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getEstado_obj() {
        return estado_obj;
    }

    public void setEstado_obj(String estado_obj) {
        this.estado_obj = estado_obj;
    }

}
