package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom,boissonFav, argent);		
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (getArgent()*10)/100;
		
		super.parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}

		public void provoquer(Yakuza adversaire) {
			int force = 2*this.honneur;
			if (force > adversaire.getReputation()) {
				parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
				parler("Je t'ai eu petit Yakuza");
				int gainVictoire = adversaire.perdre();
				this.honneur ++;
				gagnerArgent(gainVictoire);
			}
			else {
				parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
				int gainVictoireYakuza = getArgent();
				adversaire.gagner(gainVictoireYakuza);
				setArgent(0);
				this.honneur --;
			}
			
		}
		
		
		
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco", 20);
		roro.direBonjour();
		roro.donner(marco);
	}
}
