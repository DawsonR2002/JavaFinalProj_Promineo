package CardGame_War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
	
	//referenced: https://stackoverflow.com/questions/16194921/initializing-arraylist-with-some-predefined-values
	//answered samba, edited Boris
	// and https://www.p1vc.org/ai
	List<Integer> Cards = new ArrayList<>(Arrays.asList(
			0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
			20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
			30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
			40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
			50, 51));
	
	List<Integer> popShuffle = new ArrayList<Integer>();
	Integer returnable;


	public List<Integer> shuffle() {
		Random rand = new Random();
		int selectedIndex = -1;
		while (Cards.size() != 0) {
			selectedIndex = rand.nextInt(Cards.size());
			popShuffle.add(Cards.get(selectedIndex));
			Cards.remove(selectedIndex);
		}
		
		return popShuffle;
	}
	
	
	public Integer draw() {
		if(!popShuffle.isEmpty()) {
			returnable = popShuffle.get(0);
			popShuffle.remove(0);
			return(returnable);
		}
		
		else {
			System.out.println("no more cards");
			
			//represents null
			return -1;
		}
	}
}



