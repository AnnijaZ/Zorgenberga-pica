package picerija.pd;

import javax.swing.JOptionPane;

public class Klients {
	//Atributi
	public String adrese;
	public String talrunis;
	public String vards;

	
	//Konstruktors
	public Klients(String klientaVards, String klientaTalrunis, String klientaAdrese) {
		this.adrese = klientaVards;
		this.talrunis = klientaTalrunis;
		this.vards = klientaAdrese;

	}



	
	//Metodes
	public void izvadit(){
		JOptionPane.showMessageDialog(null, "Klients\n\nVards: "+vards+"\nTalrunis: "+talrunis+"\nAdrese: "+adrese);
	}
	
}
