package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, int argent , String boisson) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(this.nom + " - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m’appelle"+this.nom+" et j’aime boire du "+this.boisson);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de "+ this.boisson+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	
	public void perdreArgent(int n) {
		this.argent -= n;
	}
}
