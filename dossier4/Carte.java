package exo_m2_2019_dossier4;

import java.util.ArrayList;
import java.util.List;

public class Carte {
private Number numero;
private String nom;
private List<Station> stations=new ArrayList<Station>(); 
public void ajouter_station (Station station) {
	this.stations.add(station);
}
public void supprimer_station (Station station) {
	this.stations.remove(station);
	
}
public boolean contenir_station(Station station) {
	return this.stations.contains(station);
}

public void supprimer_tout() {
	this.stations.clear();
}
public int nombre_de_stations() {
	return this.stations.size();
}
public void modifier_station(int position,Station new_station) {
	 this.stations.set(position, new_station);

}


}
