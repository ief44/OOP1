package ovChipkaart;

import java.time.LocalDate;

public class Paal {
private double instaptarief;
private String locatie;

public Paal(double instaptarief, String locatie) {
	this.instaptarief = instaptarief;
	this.locatie = locatie;
   }
 public double getInstaptarief() {
	 return instaptarief;
 }
 public String getLocatie() {
	 return locatie;
 }
 public void checkIn(Ovchipkaart kaart) {
	 if(kaart.getVervaldatum().isBefore(LocalDate.now())) {
		 System.out.println("inchecken mislukt, datum is verlopen");
	 }
	 if(kaart.getSaldo() < instaptarief) {
		 System.out.println("inchecken mislukt, onvoldoende saldo");
		return; 
	 }
	 kaart.setIngecheckt(true);
	 System.out.println("inchecken voldaan");
 }
}
