
public class Stapel {
	
	private String[] kellerspeicher;
	private int position = -1;
	
	public Stapel(int groesse) {
		
		kellerspeicher = new String[groesse];
		
	}
	
	public boolean istLeer() {
		return position == -1 ? true : false;
	}
	
	public void reinlegen(String wort) {
		
		position++;
		kellerspeicher[position] = wort;
		
	}
	
	public String rausholen() {
		
		if (istLeer()) {
			return "Stapel ist Leer. Rausholen nicht möglich.";
		} else {
			String aktuellesWort = kellerspeicher[position];
			kellerspeicher[position] = null;
			position--;
			return aktuellesWort;
		}
		
	}
	
	public void ausgeben() {
		
		for (int i=0; i < kellerspeicher.length; i++) {
			if (kellerspeicher[i] == null) break;
			System.out.println(i + ": " + kellerspeicher[i]);
		}
		
	}

}
