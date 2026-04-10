package ovChipkaart;
 
  import java.time.LocalDate;
 
  public class Paal {
      private double instaptarief;
      private Locatie locatie;
      private double tariefperkm;
 
      public Paal(double instaptarief, Locatie locatie, double tariefperkm) {
          this.instaptarief = instaptarief;
          this.locatie = locatie;
          this.tariefperkm = tariefperkm;
      }
 
      public double getInstaptarief() { return instaptarief; }
      public Locatie getLocatie() { return locatie; }
      public double getTariefperkm() { return tariefperkm; }
 
      public void checkIn(Ovchipkaart kaart) {
          if (kaart.getVervaldatum().isBefore(LocalDate.now())) {
              System.out.println("inchecken mislukt, datum is verlopen");
              return;
          }
          if (kaart.getSaldo() < instaptarief) {
              System.out.println("inchecken mislukt, onvoldoende saldo");
              return;
          }
          kaart.setIngecheckt(true);
          kaart.setIncheckPaal(this);
          kaart.setSaldo(-instaptarief);
          System.out.println("inchecken voldaan");
      }
 
      public void checkOut(Ovchipkaart kaart) {
          if (!kaart.isIngecheckt()) {
              System.out.println("Uitchecken mislukt: niet ingecheckt.");
              return;
          }
          Paal incheckPaal = kaart.getIncheckPaal();
          kaart.setSaldo(incheckPaal.getInstaptarief());
          double a = this.locatie.getX() - incheckPaal.getLocatie().getX();
          double b = this.locatie.getY() - incheckPaal.getLocatie().getY();
          double afstand = Math.sqrt(a * a + b * b);
          double kosten = afstand * tariefperkm;
          kaart.setSaldo(-kosten);
          kaart.setIngecheckt(false);
          System.out.println("Uitchecken geslaagd. Kosten: " + kosten);
      }
  }