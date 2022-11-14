package personnages;

public class Yakuza extends Humain {
	private int reputation =4;
	private String clan;
	
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.reputation = reputation;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		String nomVictime = victime.getNom();
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(nomVictime + ", si tu tiens à ta vie donne moi ta bourse");
		int argentVictime = victime.getArgent();
		super.argent = super.argent + argentVictime;
		victime.seFaireExtroquer();
		super.parler("J'ai piqué les " + argentVictime + " sous de " + nomVictime + ", ce qui me fait " + super.argent + " sous dans ma poche. Hi ! Hi !");
		this.reputation ++;
	}
	
	public int perdre() {
		this.reputation --;
		parler("j'ai perdu mon duel et mes " + super.argent + " sous, snif ... J'ai déshonoré le clan de " + this.clan);
		return perdreArgent(super.argent);
	}
	
	public void gagner(int gain) {
		this.reputation ++;
		super.argent = super.argent + gain;
		parler("Ce ronin pensait vraiment battre " + super.nom + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	public static void main(String[] args) {
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir" ,"whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco", 15);
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	
	
	}
	
	
}
