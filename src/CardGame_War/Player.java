package CardGame_War;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*c.      Player

ii.    Methods

 
               4.     incrementScore (adds 1 to the Player’s score field)
               */
public class Player {
	Card card = new Card();
	Deck deck = new Deck();
	App2 app = new App2();
	List<Integer> hand = new ArrayList<Integer>();
	int score = 0;
	String name = "";
	private Integer flippedCard;

	
	
	public void describe(String player) {
		System.out.println(player + " " + hand);
	}
	
	public void draw() {
		for(int i = 0; i < 26 ; i++) {
			hand.add(app.deck.draw());

		}
	}
	
	public Integer flip() {
		if(!hand.isEmpty()) {
			
			//kept in global scope for another function
			flippedCard = hand.get(0);
			hand.remove(0);
		}
		
		return flippedCard;
	}
	
	public int getCardWeight() {
		return (flippedCard + 1) % 13;
	}
	
	public void incrementScore(){
		score += 1;
	}
	
	
	
	
}
