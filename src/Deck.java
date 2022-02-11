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
        for (int i=0; i<suits; i++) {
            for (int j=1; j<number; j++) {
            //can't get to work so I'm just sitting with basic inputs deck[(i*number)+j]= Card("Red", j,'♥' , j, true);
                deck[(i*number)+j].setValue(j);           
                if ((i*number)+j<number+1) {
                    deck[(i*number)+j].setSymbol('♥');
                    deck[(i*number)+j].setColor("Red");
                    deck[(i*number)+j].setRank(""+j);
                }
                if ((i*number)+j-number>number && (i*number)+j-number<(number*2)+1) {
                    deck[(i*number)+j].setSymbol('♦');
                    deck[(i*number)+j].setColor("Red");
                    deck[(i*number)+j].setRank(""+j);
                }
                if ((i*number)+j-number>number*2 && (i*number)+j-number<(number*3)+1) {
                    deck[(i*number)+j].setSymbol('♠');
                    deck[(i*number)+j].setColor("Black");
                    deck[(i*number)+j].setRank(""+j);
                }
                if ((i*number)+j-number>number*3) {
                    deck[(i*number)+j].setSymbol('♣');
                    deck[(i*number)+j].setColor("Black");
                    deck[(i*number)+j].setRank(""+j);
                }
                if (j==11) {
                    deck[(i*number)+j].setRank("Jack");
                    deck[(i*number)+j].setValue(11);
                }
                if (j==12) {
                    deck[(i*number)+j].setRank("Queen");
                    deck[(i*number)+j].setValue(12);
                }
                if (j==13) {
                    deck[(i*number)+j].setRank("King");
                    deck[(i*number)+j].setValue(13);
                }
                if (j==1) {
                    deck[(i*number)+j].setRank("Ace");
                }
                if (ace==true && j==1) {
                    deck[(i*number)+j].setValue(14);
                }
            }
        }
        this.cards = deck;
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
    public void shuffleCards() {
        Card a;
        int length = this.cards.length;
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * (length - 0) + 0);
            a = this.cards[i];
            this.cards[i] = this.cards[random];
            this.cards[random] = a;
        }
    }

    public void compare(Deck[] card1, Deck[] card2) {
        if (card1.getValue() == card2.getValue()) {
            System.out.println("The cards are equal");
        } else {
            System.out.println("The cards are not equal");
        }
    }
    public String toString() {
        String temp= "";
        for (int i=0;i<this.cards.length; i++) {
            temp+= this.cards[i].toString();    
            temp+= "\n";  
        }
        return temp;                  
    }

}

