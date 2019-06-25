public class Utilizador {

    private String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String manuel, String estado, TipoUtilizador tipoUtilizador) {
        this.estado = estado;
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }
}