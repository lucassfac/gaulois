package personnages;

public class Romain {

	private String nom;
	private int force;
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Romain Obelix = new Romain("Obx", 8);
	}
	public void recevoirCoup(int forceCoup) {
		force = this.force - forceCoup;
		if (this.force < 1) {
			System.out.printf("J'abandonne");
			
		}
		else {
			System.out.printf("Aie");
		}
	}
	


}