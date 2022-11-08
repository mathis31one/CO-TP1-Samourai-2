package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{

	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commercant c) {
		if(n > this.getArgent()) {
			this.parler("je ne peux donner "+n);
		}else {
			c.gagnerArgent(n);
			this.perdreArgent(n);
		}
	}
	
	public void provoquer(Yakusa y) {
		if(this.honneur * 2 > y.getReputation()) {
			this.gagnerArgent(y.perdreDuel());
			this.honneur += 1;
			this.parler("Je t’ai eu petit yakusa!");
		}else {
			this.honneur -= 1;
			this.parler("J'ai perdu...");
		}
	}

}
