package transporteterrestre;

import utilidades.Document;

public class Autobus extends TransTerrestre {
    private Document documentoPropietario;
    private int numeroPuestos;
    private String tipoRuta;
    private String empresa;

    public Autobus() {

    }

    public Autobus(String tipoTransporte, String color, int numeroRuedas, Document documentoPropietario, int numeroPuestos, String tipoRuta, String empresa) {
        super(tipoTransporte, color, numeroRuedas);
        this.documentoPropietario = documentoPropietario;
        this.numeroPuestos = numeroPuestos;
        this.tipoRuta = tipoRuta;
        this.empresa = empresa;
    }

    public Document getDocumentoPropietario() {
        return documentoPropietario;
    }

    public void setDocumentoPropietario(Document documentoPropietario) {
        this.documentoPropietario = documentoPropietario;
    }

    public int getNumeroPuestos() {
        return numeroPuestos;
    }

    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Autobus" + " color : "+getColor()+ " numero ruedas  : "+getNumeroRuedas() +" "+
                 documentoPropietario +
                ", numeroPuestos=" + numeroPuestos +
                ", tipoRuta ='" + tipoRuta + '\'' +
                ", empresa ='" + empresa ;
    }
}
