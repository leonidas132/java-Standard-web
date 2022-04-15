package transporteterrestre;

import utilidades.Document;

public class Automobil extends TransTerrestre{
    private Document documentoPropietario;
    private String tipoMotor;
    private String numeroPuestas;

    public Automobil() {

    }

    public Automobil(String tipoTransporte, String color, int numeroRuedas, Document documentoPropietario, String tipoMotor, String numeroPuestas) {
        super(tipoTransporte, color, numeroRuedas);
        this.documentoPropietario = documentoPropietario;
        this.tipoMotor = tipoMotor;
        this.numeroPuestas = numeroPuestas;
    }

    public Document getDocumentoPropietario() {
        return documentoPropietario;
    }

    public void setDocumentoPropietario(Document documentoPropietario) {
        this.documentoPropietario = documentoPropietario;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getNumeroPuestas() {
        return numeroPuestas;
    }

    public void setNumeroPuestas(String numeroPuestas) {
        this.numeroPuestas = numeroPuestas;
    }

    @Override
    public String toString() {
        return "Automobil : " +"tipo transporte :" +getTipoTransporte() +" color: "+ getColor() +" numero ruedas :"+ getNumeroRuedas()+
                getDocumentoPropietario() +" "+
                ", tipoMotor='" + tipoMotor + '\'' +
                ", numeroPuestas='" + numeroPuestas
              ;
    }
}
