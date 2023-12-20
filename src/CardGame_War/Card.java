
package CardGame_War;
public class Card {

     
     

	 
	 
	 
//	
//	public int getCardToDraw() {
//		cardToDraw = randomSelection.nextInt(52);
//		name = deckOBJ.names[cardToDraw];
//		return cardToDraw;
//	}
	
	public void describe(int index, boolean isPlayer1) {
		if(isPlayer1) {
			if(index < 9) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Hearts ****"  + " :Player 1");
			}
			
			else if(index == 9) {
				System.out.println("\n\n\n****Your card is the: Jack of Hearts ****"  + " :Player 1");
			}
			
			else if(index == 10) {
				System.out.println("\n\n\n****Your card is the: Queen of Hearts ****"  + " :Player 1");
			}
			
			else if(index == 11) {
				System.out.println("\n\n\n****Your card is the: King of Hearts ****"  + " :Player 1");
			}
			
			else if(index == 12) {
				System.out.println("\n\n\n****Your card is the: Ace of Hearts ****"  + " :Player 1");
			}
			
			else if( index < 13 + 9 && index > 12) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Diamonds ****"  + " :Player 1");
			}
			
			else if(index == 9 + 13) {
				System.out.println("\n\n\n****Your card is the: Jack of Diamonds ****"  + " :Player 1");
			}
			
			else if(index == 10 + 13) {
				System.out.println("\n\n\n****Your card is the: Queen of Diamonds ****"  + " :Player 1");
			}
			
			else if(index == 11 + 13) {
				System.out.println("\n\n\n****Your card is the: King of Diamonds ****"  + " :Player 1");
			}
			
			else if(index == 12 + 13) {
				System.out.println("\n\n\n****Your card is the: Ace of Diamonds ****"  + " :Player 1");
			}
			
			else if( index < (13 * 2) + 9 && index > 12 + 13) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Clubs ****"  + " :Player 1");
			}
			
			else if(index == 9 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Jack of Clubs ****"  + " :Player 1");
			}
			
			else if(index == 10 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Queen of Clubs ****"  + " :Player 1");
			}
			
			else if(index == 11 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: King of Clubs ****"  + " :Player 1");
			}
			
			else if(index == 12 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Ace of Clubs ****"  + " :Player 1");
			}
			

			else if( index < (13 * 3) + 9 && index > (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Hearts ****"  + " :Player 1");
			}
			
			else if(index == 9 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Jack of Spades ****"  + " :Player 1");
			}
			
			else if(index == 10 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Queen of Spades ****"  + " :Player 1");
			}
			
			else if(index == 11 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: King of Spades ****"  + " :Player 1");
			}
			
			else if(index == 12 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Ace of Spades ****"  + " :Player 1");
			}
		}
		
		//Player2
		else {
			if(index < 9) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Hearts ****"  + " :Player 2");
			}
			
			else if(index == 9) {
				System.out.println("\n\n\n****Your card is the: Jack of Hearts ****"  + " :Player 2");
			}
			
			else if(index == 10) {
				System.out.println("\n\n\n****Your card is the: Queen of Hearts ****"  + " :Player 2");
			}
			
			else if(index == 11) {
				System.out.println("\n\n\n****Your card is the: King of Hearts ****"  + " :Player 2");
			}
			
			else if(index == 12) {
				System.out.println("\n\n\n****Your card is the: Ace of Hearts ****"  + " :Player 2");
			}
			
			else if( index < 13 + 9 && index > 12) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Diamonds ****"  + " :Player 2");
			}
			
			else if(index == 9 + 13) {
				System.out.println("\n\n\n****Your card is the: Jack of Diamonds ****"  + " :Player 2");
			}
			
			else if(index == 10 + 13) {
				System.out.println("\n\n\n****Your card is the: Queen of Diamonds ****"  + " :Player 2");
			}
			
			else if(index == 11 + 13) {
				System.out.println("\n\n\n****Your card is the: King of Diamonds ****"  + " :Player 2");
			}
			
			else if(index == 12 + 13) {
				System.out.println("\n\n\n****Your card is the: Ace of Diamonds ****"  + " :Player 2");
			}
			
			else if( index < (13 * 2) + 9 && index > 12 + 13) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Clubs ****"  + " :Player 2");
			}
			
			else if(index == 9 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Jack of Clubs ****"  + " :Player 2");
			}
			
			else if(index == 10 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Queen of Clubs ****"  + " :Player 2");
			}
			
			else if(index == 11 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: King of Clubs ****"  + " :Player 2");
			}
			
			else if(index == 12 + (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: Ace of Clubs ****"  + " :Player 2");
			}
			

			else if( index < (13 * 3) + 9 && index > (13 * 2)) {
				System.out.println("\n\n\n****Your card is the: " + index + 2 + "of Spades ****"  + " :Player 2");
			}
			
			else if(index == 9 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Jack of Spades ****"  + " :Player 2");
			}
			
			else if(index == 10 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Queen of Spades ****"  + " :Player 2");
			}
			
			else if(index == 11 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: King of Spades ****"  + " :Player 2");
			}
			
			else if(index == 12 + (13 * 3)) {
				System.out.println("\n\n\n****Your card is the: Ace of Spades ****"  + " :Player 2");
			}
		}
		}

	
	}


//
//	3.  Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
//
//	a.  Using the Card describe() method when each card is flipped illustrates the game play.
//
//	b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
//
//	c.  Printing the updated score after each turn shows game progression.
//
//	d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

