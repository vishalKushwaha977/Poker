import java.util.ArrayList;

public class StandardDeck {

	private ArrayList<StandardCard> deck = new ArrayList<StandardCard>();

	public StandardDeck() {
		reset();
		shuffleDeck();
	}

	public void reset() {
		this.deck.clear();
		for (int i = 2; i < 13; i++) {
			deck.add(new StandardCard(i, "Hearts"));
		}
		for (int j = 2; j < 14; j++) {
			deck.add(new StandardCard(j, "diamonds"));
		}
		for (int l = 2; l < 14; l++) {
			deck.add(new StandardCard(l, "Spades"));
		}
		for (int k = 2; k < 14; k++) {
			deck.add(new StandardCard(k, "Clubs"));
		}
	}

	// shuffleDeck Method
	public void shuffleDeck() {
		ArrayList<StandardCard> tempdeck = new ArrayList<StandardCard>();
		while (this.deck.size() > 0) {
			tempdeck.add(this.deck.remove(((int) Math.random() * 100) % this.deck.size()));
		}
		this.deck = tempdeck;
	}

	public StandardCard getNextCard() {
		return this.deck.remove(this.deck.size() - 1);
	}

	public int getRemainingCardCount() {
		return this.deck.size();
	}

	public static void main(String[] args) {
		StandardDeck sd = new StandardDeck();
		System.out.println(sd.deck.toString());
		System.out.println(sd.getNextCard());
		System.out.println(sd.getNextCard());
		System.out.println(sd.getNextCard());
		System.out.println(sd.getNextCard());
		System.out.println(sd.getRemainingCardCount());
	}

}
