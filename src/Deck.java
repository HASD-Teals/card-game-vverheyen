public class Deck {
    // PROPERTIES
    private Card[] cards;
        private int suits;
        private int number;
        private boolean ace;

    // DEFAULT CONSTRUCTOR
    public Deck() {
        Card[] deck = new Card[52];
        this.suits = 0;
        this.number = 0;
        this.ace = false;       
    }

    // OVERRIDE CONSTRUCTOR 
    public Deck (int suits, int number, boolean ace) {
        Card[] deck = new Card[suits*number];
        
        }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    public Card getCardAt(Card[] deck, int x) {
        return deck[x];
    }

    public int numberofCards(Card[] card) {
        return card.length;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    
    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }

    public void compare(Card card1, Card card2) {
        if (card1.getValue() == card2.getValue()) {
            System.out.println("The cards are equal");
        }
        else {
            System.out.println("The cards are not equal");
        }
    }

    public void deckList() {

    }
}
