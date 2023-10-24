package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(int argent, String nom, String boissonFav) {
		super(argent, nom, boissonFav);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (0.1*argent);
		argent -= don;
		parler(beneficiaire.getNom() + " prend ces " + don + ".");
	}
	
	
	public void provoquer(Yakuza adversaire) {
		int forceRonin = honneur * 2;
		int forceYakuza = adversaire.getRéputation();
		String txt_provoc = "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!";
		parler(txt_provoc);
		if (forceRonin > forceYakuza) {
			String txt_gagner = "Je t’ai eu petit yakusa!";
			int gain = adversaire.getArgent();
			argent += gain;
			honneur++;
			parler(txt_gagner);
			adversaire.perdre();
		}
		else if (forceYakuza > forceRonin){
			String txt_perdre = "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.";
			parler(txt_perdre);
			adversaire.gagner(argent);
			argent = 0;
			honneur--;
		} else {
			System.out.println("C'est un combat palpitant.../nEGALITE ! Les deux tombent KO.");
		}
	}
	
	
}
