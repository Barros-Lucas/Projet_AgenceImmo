package Classes;
import java.util.Date;

class Mandat {

	private BienImmobilier bien;
	private Personne vendeur;
	private Date dureeMandat;
	private int prixMinimum;

	public Mandat(BienImmobilier bien, Personne vendeur, Date dureeMandat, int prixMinimum)
			throws IllegalArgumentException {
		if (vendeur.getStatut() != Statut.VENDEUR) {
			throw new IllegalArgumentException("Seul un vendeur peut réaliser un mandat");
		}
		this.bien = bien;
		this.vendeur = vendeur;
		this.dureeMandat = dureeMandat;
		this.prixMinimum = prixMinimum;
	}

}
