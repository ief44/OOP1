package ovChipkaart;

import java.time.LocalDate;

public class Driver {


public static void main(String[]args) {
	Paal paal = new Paal ( 20.0 ,  "Nijmegen"); 
	Ovchipkaart kaart = new Ovchipkaart (3528);
	kaart.setSaldo(15.0);
	Reiziger reiziger = new Reiziger(kaart, "Issam");
	reiziger.checkIn(paal);
    }
}