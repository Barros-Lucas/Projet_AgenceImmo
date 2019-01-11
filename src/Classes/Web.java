package Classes;

public class Web extends Docs {

	private String url;

	public Web(String contenu, String url) {
		super(contenu);
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

}
