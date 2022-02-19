public class Card {
    // PROPERTIES
    private String color;
    private String rank;
    private char symbol;
    private int value;
    private boolean playable;

    // ♥ ♠ ♦ ♣
    // DEFAULT CONSTRUCTOR
    public Card() {
        this.color = "";
        this.rank = "";
        this.symbol = '♥';
        this.value = 0;
        this.playable = false;
    }

    // OVERLOAD CONSTRUCTOR
    public Card(String color, String rank, char symbol, int value, boolean playable) {
        this.color = color;
        this.rank = rank;
        this.symbol = symbol;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public String getRank() {
        return this.rank;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String report() {
        return color + ", " + rank + ", " + symbol + ", " + value + ", " + playable;
    }

    /**
     * Method to compare this card to another card (Card c) and return boolean value
     * if they are equal
     */
    public boolean compare(Card c) {
        if (this.value == c.getValue()) {
            return true;
        } else {
            return false;
        }
    }
}
