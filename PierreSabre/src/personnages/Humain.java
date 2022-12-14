package personnages;

public class Humain {
	private String nom;
	private String boissonfavorite;
	private int argent;
	
	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonfavorite() {
		return boissonfavorite;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" +nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonfavorite + ".");
	}
	
	public void Boire() {
		parler("Mmmm, un bon verre de " + boissonfavorite + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte){
		argent = argent - perte;
	}
	
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
}

