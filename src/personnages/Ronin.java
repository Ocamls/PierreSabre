package personnages;

public class Ronin extends Humain{
	private int reputation=1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom,boissonFav, argent);		
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (super.argent*10)/100;
		
		super.parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}

	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco", 20);
		roro.direBonjour();
		roro.donner(marco);
	}
}
