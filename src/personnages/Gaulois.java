package personnages;

import objets.Equipement;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	

	public String toString() {
		return getNom() + " [nom=" + nom + ", force=" + force + "]";
	}
	
	public void frapper(Romain romain) {
		parler(" envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesRoms = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesRoms != null && i < tropheesRoms.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = tropheesRoms[i];
		}
	}
	
	public static void main(String[] args) {
		Gaulois g = new Gaulois("ast",8);
		Romain obx = new Romain("obx",7);
		Romain Min = new Romain("Minux",6);
		
		g.parler("Bonjour Ob�lix.");
		obx.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		g.parler("Oui tr�s bonne id�e.");
		
		g.frapper(Min);
		g.frapper(Min);
		g.frapper(Min);
	}
}
