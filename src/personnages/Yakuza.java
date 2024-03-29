package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int réputation = 0;
	
	
	public Yakuza(int argent, String nom, String boissonFav, String clan) {
		super(argent, nom, boissonFav);
		this.clan = clan;
	}
	
	public int getRéputation() {
		return réputation;
	}

	public void extorquer(Commercant victime) {
		String nomvictime = victime.getNom();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(nomvictime + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		argent += gain;
		parler("J’ai piqué les " + gain + " sous de " + nomvictime + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
		réputation ++;

	}
	
	public void gagner(int gain) {
		String txt_victoire = "Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.";
		argent += gain;
		réputation++;
		parler(txt_victoire);
	}
	
	public void perdre() {
		String txt_perdre = " J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + ".";
		parler(txt_perdre);
		argent = 0;
		réputation --;
	}
}
