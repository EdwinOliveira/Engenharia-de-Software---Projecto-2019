public class Utilizador extends Pessoa{

    private String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nomePessoa, String estado, TipoUtilizador tipoUtilizador) {
        super(nomePessoa);
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
}