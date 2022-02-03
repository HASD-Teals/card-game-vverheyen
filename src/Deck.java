public class Deck {
    // PROPERTIES
    private Card[] cards;
    private int suits;
    private int number;
    private boolean ace;

    private void makeDeck() {

    }

    // DEFAULT CONSTRUCTOR
    public Deck() {
        Card[] deck = new Card[52];
        this.suits = 4;
        this.number = 13;
        this.ace = false;
            for (int i=1; i<suits; i++) {
                for (int j=1; j<number; j++) {
                    deck[(i*number)+j-number].setValue(j);           //ERROR WITH NULL?? IN deck[...]
                    if ((i*number)+j<number+1) {
                        deck[(i*number)+j].setSymbol('♥');
                        deck[(i*number)+j].setColor("Red");
                    }
                    if ((i*number)+j-number>number && (i*number)+j-number<(number*2)+1) {
                        deck[(i*number)+j].setSymbol('♦');
                        deck[(i*number)+j].setColor("Red");
                    }
                    if ((i*number)+j-number>number*2 && (i*number)+j-number<(number*3)+1) {
                        deck[(i*number)+j].setSymbol('♠');
                        deck[(i*number)+j].setColor("Black");
                    }
                    if ((i*number)+j-number>number*3) {
                        deck[(i*number)+j].setSymbol('♣');
                        deck[(i*number)+j].setColor("Black");
                    }
                    if (j==11) {
                        deck[(i*number)+j].setRank("Jack");
                    }
                    if (j==12) {
                        deck[(i*number)+j].setRank("Queen");
                    }
                    if (j==13) {
                        deck[(i*number)+j].setRank("King");
                    }
                }
            }
    }

    // OVERRIDE CONSTRUCTOR
    public Deck(int suits, int number, boolean ace) {
        Card[] deck = new Card[suits * number];
        this.suits = suits;
        this.number = number;
        this.ace = ace;
            for (int i=0; i<suits-1; i++) {
                for (int j=1; j<number; j++) {
                    deck[(i*number)+j].setValue(j);
                }
            }

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
    public void shuffleCards(Card[] cards) {
        Card a;
        int length = cards.length - 1;
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * (length - 0) + 0);
            a = cards[i];
            cards[i] = cards[random];
            cards[random] = a;
        }
    }

    public void compare(Card card1, Card card2) {
        if (card1.getValue() == card2.getValue()) {
            System.out.println("The cards are equal");
        } else {
            System.out.println("The cards are not equal");
        }
    }

}
