package Classes;
import java.util.LinkedList;
import java.util.List;

class Description {

	private Annonce annonce;
	private BienImmobilier bien;
	private List<Docs> listeDocs;

	public Description(Annonce annonce, BienImmobilier bien) {
		this.annonce = annonce;
		this.bien = bien;
		this.listeDocs = new LinkedList<>();
	}

	public void ajouterDocs(Docs docs) {

	}

}
