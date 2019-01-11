package Classes;

public enum Statut {
	VENDEUR(1), ACHETEUR(2);

	private int eInt;

	private Statut(int i) {
		eInt = i;
	}

	public int getStatutInt() {
		return eInt;
	}

	public static Statut convertIntToStatut(int i) {
		for (Statut e : Statut.values()) {
			if (e.getStatutInt() == i) {
				return e;
			}
		}
		return null;
	}
}