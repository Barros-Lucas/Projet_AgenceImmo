package Classes;
import java.util.Date;

class Maison extends BienImmobilier {

	private int surfaceSol;
	private int longueurFacade;
	private int surfaceHabitable;
	private int nbPiece;
	private int nbEtage;
	private String moyenChauffage;

	public Maison(int id, Personne vendeur, String adresse, Meridien orientation, int prix, Date dateMiseDispostion,
			int surfaceSol, int longueurFacade, int surfaceHabitable, int nbPiece, int nbEtage, String moyenChauffage) {
		super(id, vendeur, adresse, orientation, prix, dateMiseDispostion);
		this.surfaceSol = surfaceSol;
		this.longueurFacade = longueurFacade;
		this.surfaceHabitable = surfaceHabitable;
		this.nbPiece = nbPiece;
		this.nbEtage = nbEtage;
		this.moyenChauffage = moyenChauffage;
	}

}
