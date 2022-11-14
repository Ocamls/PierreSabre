package personnages;

public class Humain {
	protected String nom;
	private String boissonFav;
	protected int argent;
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public int gagnerArgent(int gain) {
		this.argent = this.argent + gain;
		return this.argent;
	}
	
	public int perdreArgent(int perte) {
		this.argent = this.argent - perte;
		return this.argent;
	}
	
	public void direBonjour() {
		String texte ="Bonjour ! Je m'appelle " + this.nom +" et j'aime boire du " + this.boissonFav ;
		parler(texte);
	}
	
	public void boire(){
		String texte = "Mmmm, un bon verre de "+ this.boissonFav + " ! GLOUPS !";
		parler(texte);
	}
	
	
	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			String texte = "J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.";
			this.argent = perdreArgent(prix);
			parler(texte);
		}
		else {
			String texte = "Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.";
			parler(texte);
		}
	}

	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}

	

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Café", 100);
		prof.parler("Bonjour");
		prof.direBonjour();
		prof.acheter("un café", 50);
		prof.acheter("un café2", 10);
		prof.gagnerArgent(10);
		System.out.println(prof.getArgent());
		prof.boire();
	}

}
