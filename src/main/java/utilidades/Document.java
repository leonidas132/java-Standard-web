package utilidades;

public class Document {
    private String tipoDocumento;
    private String numeroDocumento;
    private String estodoDelSeguro;

    public Document() {

    }

    public Document(String tipoDocumento, String numeroDocumento, String estodoDelSeguro) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.estodoDelSeguro = estodoDelSeguro;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEstodoDelSeguro() {
        return estodoDelSeguro;
    }

    public void setEstodoDelSeguro(String estodoDelSeguro) {
        this.estodoDelSeguro = estodoDelSeguro;
    }

    @Override
    public String toString() {
        return
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", estodoDelSeguro='" + estodoDelSeguro ;
    }
}
