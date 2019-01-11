package Classes;

class Commission {

	private RDV rdv;
	private BienImmobilier bien;
	private double montant;

	public Commission(RDV rdv, BienImmobilier bien) {
		this.rdv = rdv;
		this.bien = bien;
		this.montant = 7 * bien.getPrix() / 100;
	}

	public double getCommission() {
		return montant;
	}

}
