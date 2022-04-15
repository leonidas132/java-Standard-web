package transporteterrestre;

import utilidades.Document;

public class Motocicleta extends TransTerrestre {
    public Document documentoPropietario;
    public String cilindrage;

    public Motocicleta() {

    }

    public Motocicleta(String tipoTransporte, String color, int numeroRuedas, Document documentoPropietario, String cilindrage) {
        super(tipoTransporte, color, numeroRuedas);
        this.documentoPropietario = documentoPropietario;
        this.cilindrage = cilindrage;
    }

    public Document getDocumentoPropietario() {
        return documentoPropietario;
    }

    public void setDocumentoPropietario(Document documentoPropietario) {
        this.documentoPropietario = documentoPropietario;
    }

    public String getCilindrage() {
        return cilindrage;
    }

    public void setCilindrage(String cilindrage) {
        this.cilindrage = cilindrage;
    }
    public String toString (){
        return "Motocicleta : " +" Color : "+getColor() + " numero ruedas : "+ getNumeroRuedas() +" tipo documentos : " +getDocumentoPropietario().getTipoDocumento()+" " +
                " Numero documento"+ getDocumentoPropietario().getNumeroDocumento() + " Estado del seguro :" + getDocumentoPropietario().getEstodoDelSeguro()+" " +
                " Cilindrage : " + getCilindrage();
    }
}
