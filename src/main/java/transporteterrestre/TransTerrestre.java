package transporteterrestre;

public abstract class TransTerrestre {
    private String tipoTransporte;
    private String color;
    private int numeroRuedas;

    public TransTerrestre() {

    }

    public TransTerrestre(String tipoTransporte, String color, int numeroRuedas) {
        this.tipoTransporte = tipoTransporte;
        this.color = color;
        this.numeroRuedas = numeroRuedas;

    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return "TrasTere " +
                "tipoTransporte='" + tipoTransporte + '\'' +
                ", color='" + color + '\'' +
                ", numeroRuedas=" + numeroRuedas ;
    }
}
