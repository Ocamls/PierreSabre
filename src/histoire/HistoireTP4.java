package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir" ,"whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 54);
		
		roro.provoquer(yakuLeNoir);
		


	}

}
