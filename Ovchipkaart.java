package ovChipkaart;

import java.time.LocalDate;

public class Ovchipkaart {

	private double saldo;
	private LocalDate vervaldatum;
	private int kaartnummer;
	private boolean ingecheckt;
	
	public Ovchipkaart(int kaartnummer);{
		this.kaartnummer = kaartnummer;
		this.saldo = 0.0;
		this.ingecheckt = false;
		this.vervaldatum = LocalDate.now().plusYears(5);
	}
	public void setSaldo(double bedrag) {
	      saldo += bedrag;
	  }
}
