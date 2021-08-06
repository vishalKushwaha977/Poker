
public class StandardCard {
	private int value;
	private String suit;
	private String color;

	public StandardCard(int value, String suit) {
		this.value = value;
		this.suit = suit;
		if (this.suit.equals("Hearts") || this.suit.equals("Diamonds")) {
			this.color = "Red";
		}
		if (this.suit.equals("Clubs") || this.suit.equals("Spades")) {
			this.color = "Black";
		}
	}

	public int getValue() {
		return this.value;
	}

	public String getSuit() {
		return this.suit;
	}

	public String getColor() {
		return this.color;
	}

	public String convertValueToName() {
		switch (this.value) {
		case 1:
			return "A";
		case 2:
			return "King";
		case 3:
			return "Queen";
		case 4:
			return "Jack";
		case 5:
			return "10";
		case 6:
			return "9";
		case 7:
			return "8";
		case 8:
			return "7";
		case 9:
			return "6";
		case 10:
			return "5";
		case 11:
			return "4";
		case 12:
			return "3";
		case 13:
			return "2";
		default:
			return "Value not Valid";
		}
	}

	@Override
	public String toString() {
		return (convertValueToName() + " of " + this.suit);
	}

	public static void main(String[] args) {
		// Suits - Done
		// Value - Done
		// Color - Done
		// getters - Done
		// toString - Done
		// convertValueToName - Done
		StandardCard card = new StandardCard(1, "Hearts");
		System.out.println(card.toString());

	}

}
