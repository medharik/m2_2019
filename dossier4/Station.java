package exo_m2_2019_dossier4;

public class Station {
private String adresse;
private String arrondissement;
private Number numero;
private boolean ouvert;
@Override
	public String toString() {
		return adresse+", "+numero;
	}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getArrondissement() {
	return arrondissement;
}
public void setArrondissement(String arrondissement) {
	this.arrondissement = arrondissement;
}
public Number getNumero() {
	return numero;
}
public void setNumero(Number numero) {
	this.numero = numero;
}
public boolean isOuvert() {
	return ouvert;
}
public void setOuvert(boolean ouvert) {
	this.ouvert = ouvert;
}

}
