package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;
	
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		String nomVictime = victime.getNom();
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(nomVictime + ", si tu tiens à ta vie donne moi ta bourse");
		int argentExtorquer = victime.seFaireExtroquer();
		gagnerArgent(argentExtorquer);
		super.parler("J'ai piqué les " + argentExtorquer + " sous de " + nomVictime + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		this.reputation ++;
	}
	
	public int perdre() {
		this.reputation --;
		parler("j'ai perdu mon duel et mes " + getArgent() + " sous, snif ... J'ai déshonoré le clan de " + this.clan);
		return perdreArgent(getArgent());
	}
	
	public void gagner(int gain) {
		this.reputation ++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + super.nom + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	public static void main(String[] args) {
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir" ,"whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco", 15);
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	
	
	}
	
	
}
