package picerija.pd;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Pica {
	//Atributi
	public int izmers;
	public int Nr;
	public String picasVeids;
	public boolean dzeriens;
	public double cena = 0;
	public boolean piegade;
	
	//Konstruktors
	
		public Pica(int PNr, int Pizmers, String PpicasVeids, boolean Pdzeriens, double Pcena, boolean klientaPiegade ) {
			this.Nr = PNr;
			this.izmers = Pizmers;
			this.picasVeids = PpicasVeids;
			this.dzeriens = Pdzeriens;
			this.cena = Pcena;
			this.piegade = klientaPiegade;
		
		}

		//Metodes
		public int noteiktIzmeru(){
			return izmers;
		}
		public double noteiktCenu(){
			if(picasVeids.equals("pepperoni") || picasVeids.equals("margarita") || picasVeids.equals("siera")) {
				this.cena += 5.50;
			}else {
				this.cena += 6.50;
			}
			
			if(izmers == 20) {
				this.cena += 1;
			}else if(izmers == 30) {
				this.cena += 2;
			}else if(izmers == 50) {
				this.cena += 3.50;
			}
			
			if(dzeriens == true) {
				 this.cena += 1.50; 
			}
			if(piegade == true) {
				 this.cena += 1.50; 
			}
			
			DecimalFormat df = new DecimalFormat("####0.00");
			df.format(cena);
			return cena;
		}
		
		public void izvadit(){
			JOptionPane.showMessageDialog(null, "Picas Nr: "+Nr+"\nPicas izmers: "+izmers+"\nPicas veids: "
			+picasVeids+"\nDzeriens: "+dzeriens+"\nVai ir piegade?: "+piegade+"\n\nCena: "+cena);
		}

}
