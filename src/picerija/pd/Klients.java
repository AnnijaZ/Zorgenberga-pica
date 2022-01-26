package picerija.pd;

public class Klients {
	//Atributi
	String adrese;
	String talrunis;
	String vards;
	int PasNr;
	
	//Konstruktors
	public Klients(String KAdrese, String KTalrunis, String KVards, int KPasNr) {
		this.adrese = KAdrese;
		this.talrunis = KTalrunis;
		this.vards = KVards;
		this.PasNr = KPasNr;
	}
	
	//Metodes
	public int noteiktPasNr() {
		return PasNr;
	}
	
}
