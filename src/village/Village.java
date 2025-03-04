package village;

import personnages.Gaulois;

public class Village {
	private Gaulois[] villageois;
	private String nom;
	private int nbvillageoisMax;
	private int nbvillageois = 0;

	public Village(String nom, int nbvillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbvillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbvillageois] = gaulois;
		nbvillageois++;

	}

	public Gaulois trouverVillageois(int indicevillageois) {
		if (indicevillageois >= nbvillageois) {
			System.out.println("il n'y a pas autant d'habitants");
			return null;
		} else {
			return villageois[indicevillageois - 1];
		}
	}

	public static void main(String[] args) {
		Village rome = new Village("Rome", 30);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);

	}

}
