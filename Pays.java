
public class Pays 
{
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	
	public Pays() 
	{
		
	}
	
	public Pays (String unNom, String uneLangue, String uneMonnaie, String  uneCapitale)
	{
		nom= unNom;
		langue = uneLangue;
		monnaie = uneMonnaie;
		capitale = uneCapitale;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String nomMaj(String nom){
		return this.nom.toUpperCase();
	}
	
	public String toString(){
		return "Nom : " + this.nom.toUpperCase();
	}
}

