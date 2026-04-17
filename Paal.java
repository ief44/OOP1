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
          kaart.setIncheckLocatie(this.locatie);
          kaart.setIncheckTarief(this.instaptarief);
          kaart.setSaldo(-instaptarief);
          System.out.println("inchecken voldaan");
      }
     
      public void checkOut(Ovchipkaart kaart) {
          if (!kaart.isIngecheckt()) {
              System.out.println("Uitchecken mislukt: niet ingecheckt.");
              return;
          }
          kaart.setSaldo(kaart.getIncheckTarief());
          double kosten = locatie.afstandBerekenen(kaart.getIncheckLocatie()) * tariefperkm;
          kaart.setSaldo(-kosten);
          kaart.setIngecheckt(false);
          System.out.println("Uitchecken geslaagd. Kosten: " + kosten);
      }
  }