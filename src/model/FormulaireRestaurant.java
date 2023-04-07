package model;

public class FormulaireRestaurant  extends Formulaire{

	private int numService;
	private int nbPersonnes;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.numService = numService;
		this.nbPersonnes = nbPersonnes;
	}

	public int getIdentificationEntite() {
		return numReserve;
	}
	
	public void setIdentificationEntite(int num) {
		this.numReserve =num;
	}

	public int getNumService() {
		return numService;
	}

	public int getNombrePersonnes() {
		return nbPersonnes;
	}	
}
