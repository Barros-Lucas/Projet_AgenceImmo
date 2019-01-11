package Classes;

class Morale extends Personne {

	private int siren;
	private String formeJurique;

	public Morale(int id, String nom, String adresse, String numeroTel, String couriel, int siren,
			String formeJuridique, Statut statut) {
		super(id, nom, adresse, numeroTel, couriel, statut);
		this.siren = siren;
		this.formeJurique = formeJuridique;
	}

	public int getSiren() {
		return siren;
	}

	public void setSiren(int siren) {
		this.siren = siren;
	}

	public String getFormeJurique() {
		return formeJurique;
	}

	public void setFormeJurique(String formeJurique) {
		this.formeJurique = formeJurique;
	}

}
