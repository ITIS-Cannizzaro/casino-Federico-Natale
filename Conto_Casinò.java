public class Conto_Casino extends Conto_Corrente{

 public Conto_Casino(double conto) {
  super(conto);
  this.conto=100000;
 }
 public void Trasferisci(int n, int somma, Conto_Giocatore a, Conto_Casino b) {
  a.conto-=somma;
  this.conto+=somma; 
 }
}
