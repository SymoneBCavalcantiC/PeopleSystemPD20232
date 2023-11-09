package composicoes;

public class Telefone {

    private int numeroTel;
    private String tipoTel;


    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }

    @Override
    public String toString() {
        return tipoTel + ": " + numeroTel;
    }
}
