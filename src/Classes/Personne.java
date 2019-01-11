package Classes;

public class Personne {

	private int id;
	private String nom;
	private String adresse;
	private String numeroTel;
	private String couriel;
	private Statut statut;

	public Personne(int id, String nom, String adresse, String numeroTel, String couriel, Statut statut) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.couriel = couriel;
		this.statut = statut;
	}

	// Constructeur pour les vendeurs, si aucun type renseigner il sera un vendeur.
	public Personne(int id, String nom, String adresse, String numeroTel, String couriel) {
		this(id, nom, adresse, numeroTel, couriel, Statut.VENDEUR);
	}

	public Statut getStatut() {
		return this.statut;
	}

}
