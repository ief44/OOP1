package ovChipkaart;                                                                                                                                                                                                              
  import java.time.LocalDate;                                                                                                                                                                                                       
  public class Ovchipkaart {                                                                                                                                                                                                        
      private double saldo;
      private LocalDate vervaldatum;
      private int kaartnummer;
      private boolean ingecheckt;
      private Paal incheckpaal;
 
      public Ovchipkaart(int kaartnummer) {
          this.kaartnummer = kaartnummer;
          this.saldo = 0.0;
          this.ingecheckt = false;
          this.vervaldatum = LocalDate.now().plusYears(5);
      }
 
      public void setSaldo(double bedrag) {
          saldo += bedrag;
      }
 
      public double getSaldo() {
          return saldo;
      }
 
      public boolean isIngecheckt() {
          return ingecheckt;
      }
 
      public void setIngecheckt(boolean ingecheckt) {
          this.ingecheckt = ingecheckt;
      }
 
      public int getKaartnummer() {
          return kaartnummer;
      }
 
      public LocalDate getVervaldatum() {
          return vervaldatum;
      }
 
      public Paal getIncheckPaal() {
          return incheckpaal;
      }
 
      public void setIncheckPaal(Paal paal) {
          this.incheckpaal = paal;
      }
  }