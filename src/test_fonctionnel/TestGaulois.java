package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Ast", 8);
		Gaulois Obelix = new Gaulois("Obx", 16);
		
		g.parler("Bonjour Ob�lix.");
		Obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		g.parler("Oui tr�s bonne id�e.");
		
	}
	
}
