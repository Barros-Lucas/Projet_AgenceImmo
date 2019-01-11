package Classes;

public enum Media {
	JOURNEAUX(1), INTERNET(2), PRESSE(3);

	private int eInt;

	private Media(int i) {
		eInt = i;
	}

	public int getMediaInt() {
		return eInt;
	}

	public static Media convertIntToMedia(int i) {
		for (Media e : Media.values()) {
			if (e.getMediaInt() == i) {
				return e;
			}
		}
		return null;
	}
}