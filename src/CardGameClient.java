public class CardGameClient {
    public static void main(String[] args) throws Exception {
        //create two decks
        //shuffle decks
        //for loop through both and report each match
        //then report total number of matches at end of loop
        
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        
        deck1.shuffleCards();
        deck2.shuffleCards();

        comparing(deck1, deck2);

    }
    public static void comparing(Deck deck, Deck deck2) {
        int counter=0;
        for (int i=0; i<52; i++) {
            if (deck[i]==deck2[i]) {
                System.out.println("There is a match at "+i);
                counter++;
            }
            if (counter==0) {
                System.out.println("There are no matches");
            }
        }
    }
}
