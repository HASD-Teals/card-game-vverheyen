public class Deck {
    // PROPERTIES
    private Card[] cards;
    private int suits;
    private int number;
    private boolean ace;

    private void makeDeck() {
        Card[] deck = new Card[suits*number];
        for (int i=0; i<suits*number-1;i++) {
            deck[i]= new Card();
        }
        for (int i=1; i<suits; i++) {
            for (int j=1; j<number; j++) {
                deck[(i*number)+j-number].setValue(j);           
                if ((i*number)+j<number+1) {
                    deck[(i*number)+j-number].setSymbol('♥');
                    deck[(i*number)+j-number].setColor("Red");
                }
                if ((i*number)+j-number>number && (i*number)+j-number<(number*2)+1) {
                    deck[(i*number)+j-number].setSymbol('♦');
                    deck[(i*number)+j-number].setColor("Red");
                }
                if ((i*number)+j-number>number*2 && (i*number)+j-number<(number*3)+1) {
                    deck[(i*number)+j-number].setSymbol('♠');
                    deck[(i*number)+j-number].setColor("Black");
                }
                if ((i*number)+j-number>number*3) {
                    deck[(i*number)+j-number].setSymbol('♣');
                    deck[(i*number)+j-number].setColor("Black");
                }
                if (j==11) {
                    deck[(i*number)+j-number].setRank("Jack");
                    deck[(i*number)+j-number].setValue(11);
                }
                if (j==12) {
                    deck[(i*number)+j-number].setRank("Queen");
                    deck[(i*number)+j-number].setValue(12);
                }
                if (j==13) {
                    deck[(i*number)+j-number].setRank("King");
                    deck[(i*number)+j-number].setValue(13);
                }
                if (j==1) {
                    deck[(i*number)+j-number].setRank("Ace");
                }
                if (ace==true && j==1) {
                    deck[(i*number)+j-number].setValue(14);
                }
            }
        }
    }

    // DEFAULT CONSTRUCTOR
    public Deck() {
        this.suits = 4;
        this.number = 13;
        this.ace = false;
        makeDeck();
    }

    // OVERRIDE CONSTRUCTOR
    public Deck(int suits, int number, boolean ace) {
        makeDeck();
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
    //Still neeed to fix bc previous thing using this.cards still didn't work
    public String toString() {
        String temp= "";
        for (int i=0; ; i++) {
            temp+= Deck.toString();     
            temp+= "\n";  
        }
        return temp;                  
    }

}
