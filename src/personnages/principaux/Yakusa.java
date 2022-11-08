package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {
	private String clan;
	private int reputation;

	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant commercant) {
		this.gagnerArgent(commercant.seFaireExtorquer());
		this.reputation += 1;
		this.parler("J’ai piqué le fric de " + commercant.getNom());
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de "+this.clan+".");
	}
	
	public void gagnerDuel() {
		this.parler("j'ai gagné mon combat !");
		this.reputation += 1;
	}
	
	public int perdreDuel() {
		this.parler("j'ai perdu mon combat !");
		this.reputation -= 1;
		int argent = this.getArgent();
		this.perdreArgent(argent);
		return(argent);
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
}
