//debut programme


public class Capitale {
	
	private String nom;
	private int nbhab;
	private int superficie;
	
	public Capitale() 
	{
		
	}
	
	public Capitale (String unNom, int nbHabitant, int uneSuperficie)
	{
		nom= unNom;
		nbhab = nbHabitant;
		superficie = uneSuperficie;
		
	}
	public String getNom() {
		return this.nom;
	}

	public void setNom(String unNom) {
		this.nom = unNom;
	}

	public int getNbhab() {
		return this.nbhab;
	}

	public void setNbhab(int nbHabitant) {
		this.nbhab = nbHabitant;
	}

	public int getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(int uneSuperficie) {
		this.superficie = uneSuperficie;
	}	
	public String toString(){
		return "Nom : " + this.nom + "\nNombre d'habitant : " + this.nbhab + "\nSuperficie :" + this.superficie + " KM²";
	}
}
