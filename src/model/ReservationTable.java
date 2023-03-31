package model;

public class ReservationTable extends Reservation {
	private int numService;
	private int numTable;
	
	
	public ReservationTable(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	

}
