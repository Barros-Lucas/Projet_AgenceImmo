package Classes;
import java.util.LinkedList;
import java.util.List;

class Annonce {

	private Media media;
	private LinkedList<BienImmobilier> listeBien;

	public Annonce(Media media, LinkedList<BienImmobilier> listeBien) {
		this.media = media;
		this.listeBien = listeBien;
	}

	public Annonce(Media media) {
		this(media, new LinkedList<BienImmobilier>());
	}

	public Media getMedia() {
		return this.media;
	}

	public LinkedList<BienImmobilier> getBienAnnonce() {
		return this.listeBien;
	}

}
