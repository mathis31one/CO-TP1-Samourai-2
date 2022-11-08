package personnages.principaux;

public class Samourai extends Ronin {

	private String seigneur;
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je sers mon seigneur "+ this.seigneur);
	}
	
	
	public void boire(String boisson) {
		this.parler("Mmmm, un bon verre de "+ boisson+" ! GLOUPS !");
	}

}
