
public class Ville {

	public String nom;
	public int nombreHabitants;
	public String pays;
	public int sup;

	// constructeur par défaut
	// ou constructeur sans paramètres
	// valeurs par défaut...très peu utilisé
	// clic droit-source-generate constructor from Superclass
	public Ville() {
		System.out.println("construction de l'objet ville");
		nom = "Lille";
		nombreHabitants = 10000;
		pays = "France";
		sup = 1000;
	}
	// constructeur indispensable pour construire un objet,
	// appelé dans new Ville()

	public Ville(String nom, int nombreHabitants, String pays, int sup) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.pays = pays;
		this.sup = sup;
	}
	// constructeur avec paramètres
	// clic droit-source-generate constructor using fields

	// démarche: 1.on crée les propriétés
	// 2. on génére le constructeur par défaut
	// 3. on génère ou on écrit le constructeur avec paramètres

}
