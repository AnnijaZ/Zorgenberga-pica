package picerija.pd;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Picerija {
	
	static Pica[] izveidotPicu(Pica[] masivs){
		String picasVeids;
		int picasIzmers;
		boolean pasDzeriens;
		int Nr = 0;
		for(int i=0; i<masivs.length; i++){
			int picasNr = Nr++;
		
			do {
			picasVeids = JOptionPane.showInputDialog("Picas veids: \npepperoni || margarita || havaju || siera || italu");
			picasVeids = picasVeids.toLowerCase();
			}while(!picasVeids.equals("pepperoni") && !picasVeids.equals("margarita") && !picasVeids.equals("havaju") && !picasVeids.equals("siera") && !picasVeids.equals("italu"));
			do {
			picasIzmers = Integer.parseInt(JOptionPane.showInputDialog("Picas izmers\n 15cm | 20cm | 30cm | 50cm "));
			}while(picasIzmers != 15 && picasIzmers != 20 && picasIzmers != 30 && picasIzmers != 50);
			do {
			pasDzeriens = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai nemsiet dzerienu(true/false)"));
			}while(pasDzeriens != true && pasDzeriens != false);
			masivs[i]= new Pica(picasNr, picasIzmers, picasVeids, pasDzeriens);
			
			
			
		}
		return masivs;
	}
	
	public static Klients ievaditKlientu(Klients jauns){

			String klientaVards = JOptionPane.showInputDialog("Ievadi klienta vardu: ");
			String klientaTalrunis = JOptionPane.showInputDialog("Ievadi klienta talruni: ");
			String klientaAdrese = JOptionPane.showInputDialog("Ievadi klienta adresi: ");
			boolean  klientaPiegade = Boolean.parseBoolean(JOptionPane.showInputDialog("Piegade?(true/false)"));
				
			jauns = new Klients(klientaVards, klientaTalrunis, klientaAdrese, klientaPiegade);
			
		
		return jauns;
	}

	public static void main(String[] args) {
		String izvele;
		Pica[] picasMasivs = null;
		Klients jaunsKlients = null;
		JFrame frame = new JFrame();
		
		do{
			izvele = JOptionPane.showInputDialog("1-Piefikset klienta info|2-Pasutijums |3-Izvadit pasutijuma info un cenu | stop-apturet");
			izvele = izvele.toLowerCase();
			
			switch(izvele){
			case "1":
				try{
					jaunsKlients = ievaditKlientu(jaunsKlients);
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame, "Darbiba nepastav!", "Klume", JOptionPane.ERROR_MESSAGE );
				}
			break;
			
			case "2":
				try{
					
					int	picuSkaits = Integer.parseInt(JOptionPane.showInputDialog("Cik picas pasutit?"));
						picasMasivs = new Pica[picuSkaits];
						picasMasivs = izveidotPicu(picasMasivs);
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame, "Darbiba nepastav!", "Klume", JOptionPane.ERROR_MESSAGE );
				}
			break;
			
			case "3":
				jaunsKlients.izvadit();
					for(int i=0; i<picasMasivs.length; i++){
						picasMasivs[i].izvadit();	
					}
		
			break;
			
			case "stop":
				JOptionPane.showMessageDialog(frame, "Programma aptureta!", "Bridinajums!", JOptionPane.WARNING_MESSAGE );
			break;
			
			default:
				JOptionPane.showMessageDialog(frame, "Darbiba nepastav!", "Kluda!", JOptionPane.ERROR_MESSAGE );
			}
		}while(!izvele.equals("stop"));
		
	}


	}


