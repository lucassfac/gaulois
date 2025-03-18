package personnages;

import objets.Equipement;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le romain " + nom + ": ";
	}


	public Equipement[] recevoirCoup(int forceCoup) {

		Equipement[] equipementEjecte = null;

		forceCoup = CalculResistanceEquipement(forceCoup);

		force -= forceCoup;

		switch (force) {

		case 0:

			parler("Aïe");

			break;

		default:

			equipementEjecte = ejecterEquipement();

			parler("J'abandonne...");

			break;

		}

		return equipementEjecte;

	}

	private int CalculResistanceEquipement(int forceCoup) {
  String texte;

		texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;

		int resistanceEquipement = 0;

		if (!(nbEquipement == 0)) {

			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";

			for (int i = 0; i < nbEquipement;) {

				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {

					resistanceEquipement += 8;

				} else {

					System.out.println("Equipement casque");

					resistanceEquipement += 5;

				}

				i++;

			}

			texte = +resistanceEquipement + "!";

		}

		parler(texte);

		forceCoup -= resistanceEquipement;

		return forceCoup;

	}

	private Equipement[] ejecterEquipement() {

		Equipement[] equipementEjecte = new Equipement[nbEquipement];

		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");

		// TODO

		int nbEquipementEjecte = 0;

		for (int i = 0; i < nbEquipement; i++) {

			if (equipements[i] == null) {

				continue;

			} else {

				equipementEjecte[nbEquipementEjecte] = equipements[i];

				nbEquipementEjecte++;

				equipements[i] = null;

			}

		}

		return equipementEjecte;

	}

	public void sEquiper(Equipement equipement) {

		switch (nbEquipement) {

		case 0:

			equipements[nbEquipement] = equipement;

			nbEquipement++;

			System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement);

			break;

		case 1:

			if (equipements[0] == equipement) {

				System.out.println("Le soldat " + getNom() + " posséde deja un " + equipement);

			} else {

				equipements[nbEquipement] = equipement;

				nbEquipement++;

				System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement);

			}

			break;

		case 2:

			System.out.println("Le soldat " + getNom() + " est déja bien protégé!");

			break;

		}

	}

	public static void main(String[] args) {

		Romain romain = new Romain("Minus", 0);

		System.out.println(Equipement.BOUCLIER);

		System.out.println(Equipement.CASQUE);

		romain.sEquiper(Equipement.CASQUE);

		romain.sEquiper(Equipement.CASQUE);

		romain.sEquiper(Equipement.BOUCLIER);

		romain.sEquiper(Equipement.CASQUE);

	}

}