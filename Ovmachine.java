package ovChipkaart;

public class Ovmachine {

	public class OvMachine {

	    Ovchipkaart kaart;

	    public OvMachine(Ovchipkaart kaart) {
	        this.kaart = kaart;
	    }

	    public Ovchipkaart getKaart() {
	        return kaart;
	    }

	    public void toonSaldo() {
	    	System.out.println("Saldo: " + kaart.getSaldo());
	        // code hier
	    }

	    public void laadOp(double bedrag) {
	    	 kaart.setSaldo(kaart.getSaldo() + bedrag);
	        // code hier
	    }
	}
	
	
	
}
