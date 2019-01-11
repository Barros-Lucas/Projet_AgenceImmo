package Classes;
import java.util.Date;

class Appart extends BienImmobilier {

	private int nbPiece;
	private int etage;
	private Double chargesMensuelles;

	public Appart(int id, Personne vendeur, String adresse, Meridien orientation, int prix, Date dateMiseDispostion,
			int nbPiece, int etage, Double chargesMensuelles) {
		super(id, vendeur, adresse, orientation, prix, dateMiseDispostion);
		this.nbPiece = nbPiece;
		this.etage = etage;
		this.chargesMensuelles = chargesMensuelles;
	}

}
