
public class Main {

	public static void main(String[] args) {
		
		Stapel stapel = new Stapel(10);
		
		String string = "Buch";
		
		stapel.reinlegen(string);
		
		stapel.reinlegen("Zeitung");
		stapel.reinlegen("Papier");
		
		stapel.ausgeben();
		
		String rausgeholt = stapel.rausholen();
		System.out.println(rausgeholt);
		
		stapel.ausgeben();

	}

}
