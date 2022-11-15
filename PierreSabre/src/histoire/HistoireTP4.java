package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof = new Humain("Prof","kombucha",54 );
		Commercant Marco = new Commercant("Marco", 10);
		
//		Prof.direBonjour();
//		Prof.acheter("une boisson", 12);
//		Prof.Boire();
//		Prof.acheter("un jeu", 2);
//		Prof.acheter("un kimono", 50);
		
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.Boire();
	}

}
