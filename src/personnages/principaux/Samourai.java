package personnages.principaux;

public class Samourai extends Ronin {

	private String seigneur;
	public Samourai(String nom, int argent,String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je sers mon seigneur "+ this.seigneur);
	}
	
	
	public void boire(String boisson) {
		this.parler("Mmmm, un bon verre de "+ boisson+" ! GLOUPS !");
	}

}
