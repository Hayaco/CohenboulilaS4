import java.util.Scanner;

public class test{
/** cette classe sert à à tester le blackjack */
	
public static void main(String []args){
	Deck d1 = new Deck ();
	BlackjackHand bjh1 = new BlackjackHand();
	//boolean k = d1.hasJokers();
	//System.out.println(k);
	//Scanner sc = new Scanner(System.in);
	int nbr1= (int)(2+Math.random()*4);
	
	//Card[] deals = new Card[nbr1];
	d1.shuffle();
	int continuer=1;
	Scanner reponse;
	while(continuer==1){
		for(int i=0; i<nbr1;i++){
			//deals[i] = d1.dealCard();
			bjh1.addCard(d1.dealCard());
		}
		for(int j=0;j< bjh1.getCardCount();j++){
			Card c2= bjh1.getCard(j);
			System.out.println(c2);
		}
		System.out.println("voulez vous continuer? si oui taper 1");
		reponse = new Scanner(System.in);
		continuer = reponse.nextInt();
	}
}
}
