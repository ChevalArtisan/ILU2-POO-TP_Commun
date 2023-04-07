package model;

public class ReservationHotel extends Reservation {
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitsDouble, int numChambre) {
		super(jour, mois);
		this.numChambre = numChambre;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitsDouble;
	}
	
	public String toString() {
		return "Le "+jour+"/"+mois+"chambre n°"+numChambre+" avec "+nbLitSimple+" et "+nbLitDouble;
	}
	
	
}
