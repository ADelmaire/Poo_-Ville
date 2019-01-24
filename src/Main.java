
public class Main {

	public static void main(String[] args) {

		Ville paris = new Ville();
		paris.nom = "Paris";
		paris.nombreHabitants = 11000000;
		paris.pays = "France";
		paris.sup = 123456789;

		Ville mars = new Ville();
		mars.nom = "Marseille";
		mars.nombreHabitants = 3000000;
		mars.pays = "France";
		mars.sup = 32654789;

		Ville barcelone = new Ville();
		barcelone.nom = "Barcelone";
		barcelone.nombreHabitants = 5000000;
		barcelone.pays = "Espagne";
		barcelone.sup = 56454789;

		System.out.println("La ville de " + paris.nom + " se trouve en " + paris.pays);
		System.out.println("La ville de " + mars.nom + " se trouve en " + mars.pays);
		System.out.println("La ville de " + barcelone.nom + " se trouve en " + barcelone.pays);

		barcelone.pays = "Catalogne";
		System.out.println("La ville de " + barcelone.nom + " se trouve en " + barcelone.pays);

		paris.nombreHabitants = paris.nombreHabitants + 1000;
		System.out.println(paris.nombreHabitants);

		Ville villeParDef = new Ville();
		System.out.println(villeParDef.nom);

		Ville nice = new Ville("Nice", 45663, "France", 456789);
		// création avec le constructeur avc paramètres
		// Ville bxl = new Ville(nom, nombreHabitants, pays, sup);

	}

}
