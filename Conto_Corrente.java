public abstract class Conto_Corrente 
{
  double conto; 
  Conto_Corrente(double conto){
  }
  
  abstract void Trasferisci(int n, int somma, Conto_Giocatore a, Conto_Casino b);

}