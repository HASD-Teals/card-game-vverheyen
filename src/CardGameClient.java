/**
 * Almost there. I've left some comments on where some things can be slightly
 * tweaked to get it to run. Nice work.
 * - Mr. Smith
 */
public class CardGameClient {
    public static void main(String[] args) throws Exception {
        // create two decks
        // shuffle decks
        // for loop through both and report each match
        // then report total number of matches at end of loop

        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        deck1.shuffleCards();
        deck2.shuffleCards();

        comparing(deck1, deck2);

    }

    public static void comparing(Deck deck, Deck deck2) {
        int counter = 0;
        for (int i = 0; i < 52; i++) {
            /**
             * You can use the getCardAt method on your Deck class to get the card and your
             * i index. Then, you can call the compare method on the Card class to compare
             * the cards from each deck at index i.
             */
            // if (deck[i]==deck2[i]) {
            if (deck.getCardAt(i).compare(deck2.getCardAt(i))) {
                System.out.println("There is a match at " + i);
                counter++;
            }
            if (counter == 0) {
                System.out.println("There are no matches");
            }
        }
    }
}
