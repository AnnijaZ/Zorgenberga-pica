package picerija.pd;

import javax.swing.JOptionPane;

public class Pica {
	//Atributi
	public int izmers;
	public int Nr;
	public String picasVeids;
	public boolean dzeriens;
	//public double cena;
	
	//Konstruktors
	
		public Pica(int PNr, int Pizmers, String PpicasVeids, boolean Pdzeriens ) {
			this.Nr = PNr;
			this.izmers = Pizmers;
			this.picasVeids = PpicasVeids;
			this.dzeriens = Pdzeriens;
			//this.cena = Pcena;
		
		}

		//Metodes
		public int noteiktIzmeru(){
			return izmers;
		}
		/*public double noteiktCenu(){
			return cena;
		}*/
		
		public void izvadit(){
			JOptionPane.showMessageDialog(null, "Picas Nr: "+Nr+"\nPicas izmers: "+izmers+"\nPicas veids: "+picasVeids+"\nDzeriens: "+dzeriens);
		}

}
