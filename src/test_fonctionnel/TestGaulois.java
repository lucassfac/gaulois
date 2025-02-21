package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Ast", 8);
		Gaulois Obelix = new Gaulois("Obx", 16);
		
		g.parler("Bonjour Obélix.");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		g.parler("Oui très bonne idée.");
		
	}
	
}
