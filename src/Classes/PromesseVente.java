package Classes;
import java.util.Date;

public class PromesseVente {

	private BienImmobilier bien;
	private Personne acheteur;
	private int sommeVerse;
	private Date dateSignature;

	public PromesseVente(BienImmobilier bien, Personne acheteur, int sommeVerse, Date dateSignature)
			throws IllegalArgumentException {
		if (acheteur.getStatut() != Statut.ACHETEUR) {
			throw new IllegalArgumentException("Seul un acheteur peut réaliser une promesse de vente");
		}
		this.bien = bien;
		this.acheteur = acheteur;
		this.dateSignature = dateSignature;
		this.sommeVerse = sommeVerse;
	}

}
