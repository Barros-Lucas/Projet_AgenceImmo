package Classes;

public class Voeux {

	private enum TypeBien {
		TERRAIN, MAISON, APPART, UNDEFINED;
	}

	private TypeBien typeDeBien;

	private int budget;
	private String secteurAchat;
	private Meridien orientation;
	// Terrain & Maison
	private int surfaceSol;
	private int longueurFacade;
	// Maison
	private int surfaceHabitable;
	private int nbEtage;
	private String moyenChauffage;
	// Appart
	private int etage;
	private Double chargesMensuelles;
	// Appart & Maison
	private int nbPiece;

	public Voeux(int budget, Meridien orientation, String secteurAchat, int surfaceSol, int longueurFacade) {
		this.typeDeBien = TypeBien.TERRAIN;
		this.budget = budget;
		this.orientation = orientation;
		this.secteurAchat = secteurAchat;
		this.surfaceSol = surfaceSol;
		this.longueurFacade = longueurFacade;

		// SET other parameters to null/0
		// Maison
		this.surfaceHabitable = 0;
		this.nbEtage = 0;
		this.moyenChauffage = null;
		// Appart
		this.etage = 0;
		this.chargesMensuelles = 0.0;
	}

	public Voeux(int budget, Meridien orientation, String secteurAchat, int surfaceHabitable, int nbEtage,
			String moyenChauffage, int nbPiece) {
		this.typeDeBien = TypeBien.MAISON;
		this.budget = budget;
		this.orientation = orientation;
		this.secteurAchat = secteurAchat;
		this.surfaceHabitable = surfaceHabitable;
		this.nbEtage = nbEtage;
		this.moyenChauffage = moyenChauffage;
		this.nbPiece = nbPiece;

		// SET other parameters to null/0
		// Appart
		this.etage = 0;
		this.chargesMensuelles = 0.0;
	}

	public Voeux(int budget, Meridien orientation, String secteurAchat, int etage, Double chargesMensuelles,
			int nbPiece) {
		this.typeDeBien = TypeBien.APPART;
		this.budget = budget;
		this.orientation = orientation;
		this.secteurAchat = secteurAchat;
		this.etage = etage;
		this.chargesMensuelles = chargesMensuelles;
		this.nbPiece = nbPiece;

		// SET other parameters to null/0
		// Terrain & Maison
		this.surfaceSol = 0;
		this.longueurFacade = 0;
		// Maison
		this.surfaceHabitable = 0;
		this.nbEtage = 0;
		this.moyenChauffage = null;
	}

	public Voeux() {
		this.typeDeBien = TypeBien.UNDEFINED;
		this.budget = 0;
		this.secteurAchat = null;
		this.orientation = null;
		// Terrain & Maison
		this.surfaceSol = 0;
		this.longueurFacade = 0;
		// Maison
		this.surfaceHabitable = 0;
		this.nbEtage = 0;
		this.moyenChauffage = null;
		// Appart
		this.etage = 0;
		this.chargesMensuelles = 0.0;
		// Appart & Maison
		this.nbPiece = 0;
	}

	// Vraiment utile? personne fait un nouveau voeux...
	public void changerVoeuxEnVoeuxTerrain(int budget, Meridien orientation, String secteurAchat, int surfaceSol,
			int longueurFacade) {
		this.typeDeBien = TypeBien.TERRAIN;
		this.budget = budget;
		this.orientation = orientation;
		this.secteurAchat = secteurAchat;
		this.surfaceSol = surfaceSol;
		this.longueurFacade = longueurFacade;
	}

}
