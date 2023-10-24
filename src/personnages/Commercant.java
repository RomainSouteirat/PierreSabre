package personnages;

public class Commercant extends Humain{

	

	public Commercant(int argent, String nom, String boissonFav) {
		super(argent, nom, boissonFav);
		this.boissonFav = "thé";
	}
	
	public int seFaireExtorquer() {
		int extorquation = argent;
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return extorquation;	
	}
	
	public void recevoir(int don) {
		argent += don;
		parler(don + " sous ! Je te remercie généreux donateur!");
	}
}
