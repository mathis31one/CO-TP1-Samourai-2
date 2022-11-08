package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	private int traitrise;
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant c) {
		if(this.traitrise < 3) {
			this.gagnerArgent(c.seFaireExtorquer());
			this.traitrise += 1;
			this.parler("ni vu ni connu");
		}else {
			this.parler("je ne peux extorquer");
		}
	}
	
	public void faireLeGentil(int don, Humain h) {
		if(don <= this.getArgent()) {
			h.gagnerArgent(don);
			this.perdreArgent(don);
			if(don/10 > traitrise) {
				this.traitrise = 0;
			}else {
				this.traitrise -= don/10;
			}
			this.parler("Me voilà mieux vu");
		}else {
			this.parler("j'ai pas assez d'argent");
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traitrise est de "+ this.traitrise);
	}

}
