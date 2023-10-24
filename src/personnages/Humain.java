package personnages;

public class Humain {
	protected int argent;
	protected String nom;
	protected String boissonFav;
	
	public Humain(int argent, String nom, String boissonFav) {
		this.argent = argent;
		this.nom = nom;
		this.boissonFav = boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoissonFav() {
		return boissonFav;
	}
	
	private String prendreParole() {
		String texte = "(" + nom + ") - ";
		return texte;
	}
	
	protected void parler(String texte) {
		System.out.println(prendreParole() + texte);
		}
	
	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");	
			argent -= prix;
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
}
