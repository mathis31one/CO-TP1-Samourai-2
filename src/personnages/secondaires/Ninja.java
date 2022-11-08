package personnages.secondaires;

import java.util.Random;

import personnages.principaux.Yakusa;

public class Ninja extends Yakusa {
	private String clanSecret;
	private static final String[] clanNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		this.clanSecret = clanNinja[new Random().nextInt(clanNinja.length)];
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("(mon clan secret est "+this.getClan()+this.clanSecret+" et maintenant que tu le sais, je vais devoir te tuer)");
		
		
	}
}
