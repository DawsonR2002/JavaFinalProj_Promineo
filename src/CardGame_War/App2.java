package CardGame_War;

import java.util.Random;

public class App2 {
	public static Deck deck = new Deck();
	static Card card = new Card();
	static Random randomSelectionDeck_Player = new Random();
	static Integer Player1Card = null;
	static Integer Player2Card = null;
	static int player1Weight = 0;
	static int player2Weight = 0;
	public static void main(String[] args) {
		
		 System.out.println("Created New Deck and Card");
		 Player player1 = new Player();
		 System.out.println("Player1 Ready");
		 
		 Player player2 = new Player();
		 System.out.println("Player2 Ready");
		
		
		
		

		deck.shuffle();
		System.out.println("Called deck.shuffle");
		
		
			System.out.println("Drawing for player1");
			player1.draw();
			System.out.println("Drawing for player2");
			player2.draw();
		
		
		
		
		
		
			player1.describe("Player 1");
			player2.describe("Player 2");
			System.out.println("Playing Game...\n\n");
			for(int i = 0; i < 26; i++) {
			Player1Card = player1.flip();
			Player2Card = player2.flip();

			player1Weight = player1.getCardWeight();
			player2Weight = player2.getCardWeight();
			
			if(player1Weight > player2Weight) {
				System.out.println("P1: " + player1Weight + " vs. P2:" + player2Weight);
				System.out.println("Point to Player 1\n\n");
				System.out.println("Scores: P1: " + player1.score + " vs. P2: " + player2.score );
				player1.incrementScore();
			}
			else if(player1Weight < player2Weight) {
				System.out.println("P1: " + player1Weight + " vs. P2:" + player2Weight);
				System.out.println("Point to Player 2 \n\n");
				System.out.println("Scores: P1: " + player1.score + " vs. P2: " + player2.score );
				player2.incrementScore();
			}
			else {
				System.out.println("P1: " + player1Weight + " vs. P2:" + player2Weight);
				System.out.println("Tie: No Point Awarded\n\n");
				System.out.println("Scores: P1: " + player1.score + " vs. P2: " + player2.score );
			}
		}
		
		if(player1.score > player2.score) {
			System.out.println("\nPlayer 1 wins.");
		}
		
		else if(player1.score < player2.score) {

			System.out.println("\nPlayer 2 wins.");
		}
		
		else {
			System.out.println("\nNobody wins: It is a Draw");
		}
	}

}
