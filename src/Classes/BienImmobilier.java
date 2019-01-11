package Classes;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class BienImmobilier {

	private int id;
	private Personne vendeur;
	private Personne acheteur;
	private String adresse;
	private Meridien orientation;
	private int prix;
	private Date dateMiseDispostion;
	private Date dateVente;
	private List<RDV> listeVente;
	private RDV rdvMandat;
	private List<RDV> listeVisite;

	public BienImmobilier(int id, Personne vendeur, String adresse, Meridien orientation, int prix,
			Date dateMiseDispostion) {
		if (vendeur.getStatut() != Statut.VENDEUR) {
			throw new IllegalArgumentException("Un bien ne peux être référencé uniquement par un vendeur");
		}
		this.id = id;
		this.vendeur = vendeur;
		this.adresse = adresse;
		this.orientation = orientation;
		this.prix = prix;
		this.dateMiseDispostion = dateMiseDispostion;
		this.listeVente = new LinkedList<>();
		this.rdvMandat = null;
		this.listeVisite = new LinkedList<>();
		this.dateVente = null;
		this.acheteur = null;
	}

	public double getPrix() {
		return this.prix;
	}

}
