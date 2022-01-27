package picerija.pd;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Picerija {
	
	static Pica[] izveidotPicu(Pica[] masivs, int veids){
		String picasVeids;
		int picasIzmers;
		int Nr = 0;
		for(int i=0; i<masivs.length; i++){
			int picasNr = Nr++;
		
			do {
			picasVeids = JOptionPane.showInputDialog("Picas veids: ");
			}while(picasVeids != "Pepperoni" || picasVeids != "Margarita" || picasVeids != "Havaju" || picasVeids != "Siera" || picasVeids != "Italu");
			do {
			picasIzmers = Integer.parseInt(JOptionPane.showInputDialog("Picas izmers\n 15cm | 20cm | 30cm | 50cm "));
			}while(picasIzmers != 15 || picasIzmers != 20 || picasIzmers != 30 || picasIzmers != 50);
			//boolean pasDzeriens = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai nemsiet dzerienu(true/false)"));
				
			masivs[i]= new Pica(picasNr, picasIzmers, picasVeids);
			
			
			
		}
		return masivs;
	}

	public static void main(String[] args) {
		String izvele;
		Pica[] picasMasivs = null;
		Klients[] klientaMasivs = null;
		JFrame frame = new JFrame();
		
		do{
			izvele = JOptionPane.showInputDialog("1-Izveidot picu |2-Piefikset klienta info |3-Izvadit pasutijuma info un cenu | stop-apturet");
			izvele = izvele.toLowerCase();
			
			switch(izvele){
			case "1":
				try{
					
					int picuSkaits = Integer.parseInt(JOptionPane.showInputDialog("Cik picas izveidot?"));
						picasMasivs = new Pica[picuSkaits];
						picasMasivs = izveidotPicu(picasMasivs, 1);
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame, "Darbiba nepastav!", "Klume", JOptionPane.ERROR_MESSAGE );
				}
			break;
			
			case "2":
				
			
			case "3":
					/*for(int i=0; i<picasMasivs.length; i++){
						picasMasivs[i].izvadit();	
					}*/
		
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


