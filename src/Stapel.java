
public class Stapel {
	
	String[] kellerspeicher;
	int position = -1;
	
	Stapel(int groesse) {
		
		kellerspeicher = new String[groesse];
		
	}
	
	public void reinlegen(String wort) {
		
		position++;
		kellerspeicher[position] = wort;
		
	}
	
	public String rausholen() {
		
		String aktuellesWort = kellerspeicher[position];
		kellerspeicher[position] = null;
		position--;
		return aktuellesWort;
		
	}
	
	public void ausgeben() {
		
		for (int i=0; i < kellerspeicher.length; i++) {
			if (kellerspeicher[i] == null) break;
			System.out.println(i + ": " + kellerspeicher[i]);
		}
		
	}

}
