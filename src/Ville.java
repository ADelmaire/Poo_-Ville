
public class Ville {

	public String nom;
	public int nombreHabitants;
	public String pays;
	public int sup;

	// constructeur par d�faut
	// ou constructeur sans param�tres
	// valeurs par d�faut...tr�s peu utilis�
	// clic droit-source-generate constructor from Superclass
	public Ville() {
		System.out.println("construction de l'objet ville");
		nom = "Lille";
		nombreHabitants = 10000;
		pays = "France";
		sup = 1000;
	}
	// constructeur indispensable pour construire un objet,
	// appel� dans new Ville()

	public Ville(String nom, int nombreHabitants, String pays, int sup) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.pays = pays;
		this.sup = sup;
	}
	// constructeur avec param�tres
	// clic droit-source-generate constructor using fields

	// d�marche: 1.on cr�e les propri�t�s
	// 2. on g�n�re le constructeur par d�faut
	// 3. on g�n�re ou on �crit le constructeur avec param�tres

}
