package Classes;
import java.util.Calendar;
import java.util.Date;

public class RDV {

	private Calendar dateRDV;

	public RDV(Calendar dateRDV) {
		this.dateRDV = dateRDV;
	}

	public String afficherDate() {
		String s = this.dateRDV.toString();
		return s;
	}

	public String afficherHeure() {
		Date s = this.dateRDV.getTime();
		return s.toString();
	}

}
