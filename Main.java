
public class Main {

	public static void main(String[] args) {
		Pays unPays = new Pays("France","francais","euro","Paris");
		
		System.out.println(unPays.toString());;
		
		Capitale uneCapitale = new Capitale("Paris",5,10);
		
		System.out.println(uneCapitale.toString());
	}
}
