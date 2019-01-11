package Classes;
import java.util.LinkedList;
import java.util.List;

public class Agence {

	private String nom;
	private String adresse;
	private List<RDV> listeRDV;
	private List<BienImmobilier> listeBien;
	private List<Annonce> listeAnnonce;
	

	public Agence(String nom, String adresse, List<RDV> listeRDV, List<BienImmobilier> listeBien,
			List<Annonce> listeAnnonce) {
		this.nom = nom;
		this.adresse = adresse;
		this.listeRDV = listeRDV;
		this.listeBien = listeBien;
		this.listeAnnonce = listeAnnonce;
	}

	public Agence(String nom, String adresse) {
		this(nom, adresse, new LinkedList<RDV>(), new LinkedList<BienImmobilier>(), new LinkedList<Annonce>());
	}

}
