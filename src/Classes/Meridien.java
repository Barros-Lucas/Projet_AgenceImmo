package Classes;

public enum Meridien {
	VENDEUR(1), ACHETEUR(2);

	private int eInt;

	private Meridien(int i) {
		eInt = i;
	}

	public int getMeridienInt() {
		return eInt;
	}

	public static Meridien convertIntToMeridien(int i) {
		for (Meridien e : Meridien.values()) {
			if (e.getMeridienInt() == i) {
				return e;
			}
		}
		return null;
	}
}
