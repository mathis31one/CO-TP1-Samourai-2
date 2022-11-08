package personnages.secondaires;

import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain {
	int nbConnaissances;
	private Humain [] memoire; 
	private Random r = new Random();
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
		this.nbConnaissances = 0;
		this.memoire = new Humain [30];
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if(this.nbConnaissances < 30) {
			memoire[this.nbConnaissances] = h;
			this.parler("Hanchanté "+h.getNom());
			this.nbConnaissances += 1;
		}else {
			this.parler("Je ne risque pas de me souvenir de "+h.getNom());
		}
	}
	
	private String humainHasard() {
		int i = this.r.nextInt(5);
		switch(i) {
		case 0:
			return("Ronin");
		case 1:
			return("Commercant");
		case 2:
			return("Samourai");
		case 3:
			return("Yakusa");
		case 4:
			return("Grand mère");
		default:
			return("Human");
		}
	}

	public void ragoter() {
		for (Humain humain : this.memoire) {
			if(humain instanceof Traitre) {
				this.parler("Je sais que "+humain.getNom()+" est un traitre !");
			}else {
				this.parler("je crois que "+humain.getNom()+" est "+humainHasard());
			}
		}
	}
}
