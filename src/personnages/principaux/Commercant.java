package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		return(argent);
	}
	
	void recevoir(int argent) {
		this.gagnerArgent(argent);
	}

}
