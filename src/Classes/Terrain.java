package Classes;
import java.util.Date;

public class Terrain extends BienImmobilier {

	private int surfaceSol;
	private int longueurFacade;

	public Terrain(int id, Personne vendeur, String adresse, Meridien orientation, int prix, Date dateMiseDispostion,
			int surfaceSol, int longueurFacade) {
		super(id, vendeur, adresse, orientation, prix, dateMiseDispostion);
		this.surfaceSol = surfaceSol;
		this.longueurFacade = longueurFacade;
	}

}
