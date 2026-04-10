package ovChipkaart;                                                                                                                                                                                                              
  public class OvMachine {                                                                                                                                                                                                          
      private Ovchipkaart kaart;                                                                                                                                                                                                    
      public OvMachine(Ovchipkaart kaart) {
          this.kaart = kaart;
      }
 
      public Ovchipkaart getKaart() {
          return kaart;
      }
 
      public void toonSaldo() {
          System.out.println("Saldo: " + kaart.getSaldo());
      }
 
      public void laadOp(double bedrag) {
          kaart.setSaldo(bedrag);
          System.out.println("Saldo opgeladen met: " + bedrag);
      }
 
      public void laadOpTot(double doelbedrag) {
          double verschil = doelbedrag - kaart.getSaldo();
          if (verschil > 0) {
              kaart.setSaldo(verschil);
              System.out.println("Saldo opgeladen naar: " + doelbedrag);
          } else {
              System.out.println("Saldo is al hoger dan " + doelbedrag);
          }
      }
  }