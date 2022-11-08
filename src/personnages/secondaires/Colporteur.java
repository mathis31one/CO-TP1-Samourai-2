package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant {

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}

	@Override
	public int seFaireExtorquer() {
		int argent = this.getArgent()/2;
		this.perdreArgent(argent);
		this.parler("héhé je n'ai donné que la moitié");
		return(argent);
	}
}
