package ovChipkaart;
 
  import java.time.LocalDate;
 
  public class Ovchipkaart {

      private double saldo;
      private LocalDate vervaldatum;
      private int kaartnummer;
      private boolean ingecheckt;
      private Locatie incheckLocatie;
      private double incheckTarief;
      public Ovchipkaart(int kaartnummer) {

          this.kaartnummer = kaartnummer;
          this.saldo = 0.0;
          this.ingecheckt = false;
          this.vervaldatum = LocalDate.now().plusYears(5);

      }
 
      public void setSaldo(double bedrag) {
       saldo += bedrag; }

      public double getSaldo() {
       return saldo; }

      public boolean isIngecheckt() {
       return ingecheckt; }

      public void setIngecheckt(boolean ingecheckt) {
       this.ingecheckt = ingecheckt; }

      public int getKaartnummer() {
       return kaartnummer; }

      public LocalDate getVervaldatum() {
       return vervaldatum; }

      public Locatie getIncheckLocatie() {
       return incheckLocatie; }

      public void setIncheckLocatie(Locatie locatie) {
       this.incheckLocatie = locatie; }

      public double getIncheckTarief() {
       return incheckTarief; }

      public void setIncheckTarief(double tarief){
       this.incheckTarief = tarief; }

  }
 