package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
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
	
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Ast", 8);
		System.out.println(g);
	}
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la m�choire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);
	}
}
