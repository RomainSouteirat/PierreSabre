package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain romain = new Humain(54, "romain", "Coca");
		romain.direBonjour();
		romain.boire();
		romain.acheter("boisson", 12);
		romain.acheter("jeu", 2);
		romain.acheter("kimono", 50);
		Commercant marco = new Commercant(20, "Marco", "theeee");
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
