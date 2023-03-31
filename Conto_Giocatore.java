import java.util.Scanner;
public class Conto_Giocatore extends Conto_Corrente 
{
	public Conto_Giocatore(double conto) 
	{
		super(conto);
		this.conto=1000;
	}
	
	public void Trasferisci(int n, int somma, ContoGiocatore a, ContoCasino b) {
		b.conto-=somma*5;
		this.conto+=somma*5;
	}
	void Gioco(Conto_Giocatore a, Conto_Casino b){
		Scanner n1=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("inserisci l'importo da giocare");
		int somma=s1.nextInt();
		if(somma<=a.conto&&somma<(b.conto/5)) 
		{
			System.out.println("Quale numero uscirà dal dado?");
			int n=n1.nextInt();
			int dado=(int)(1+Math.random()*((6-1)+1));
			System.out.println(dado);
			if(n==dado)
			{
				a.Trasferisci(n, somma, a, b);
				System.out.println("nuovo saldo: "+ a.conto);
				System.out.println("Il banco perde " + b.conto);
			}
			else
			{
				b.Trasferisci(n, somma, a, b);
				System.out.println("nuovo saldo: "+ a.conto);
				System.out.println("Il banco vince " + b.conto);
			}
			if(conto>0) 
			{
				System.out.println("Vuole giocare di nuovo?");
				Scanner s2=new Scanner(System.in);
				String s=s2.nextLine();
				if(s.equals("si")) {
					Gioco(a, b);
				
				}
		
			}
			else 
				System.out.println("Il tuo conto è esaurito: " + conto);
				
			
		}
		
		else
		System.out.println("La somma inserita è troppo alta");
	}
	
}