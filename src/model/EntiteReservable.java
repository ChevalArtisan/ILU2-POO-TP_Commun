package model;

public abstract class EntiteReservable<F>{
	private CalendrierAnnuel calendrier;
	private int numIdentification;
	
	public int getNumIdentification() {
		return numIdentification;
	}
	public void setNumIdentification(int numIdentification) {
		this.numIdentification = numIdentification;
	}
	
	public boolean estLibre(formulaire) {
		return calendrier.estLibre(get)
	}
}
