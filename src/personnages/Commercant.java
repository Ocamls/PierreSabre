package personnages;

public class Commercant extends Humain{
	public Commercant(String nom, int argent) {
		super(nom,"thé",argent);
	}
		
	public int seFaireExtroquer() {
		int argentExtorquer = getArgent();
		perdreArgent(argentExtorquer);
		super.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentExtorquer;
	}
	
	public void recevoir(int don) {
		gagnerArgent(don);
		String texte = don + " sous ! Je te remercie généreux donnateur!";
		super.parler(texte);
	}
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtroquer();
		marco.recevoir(15);
		marco.boire();
	}
}
