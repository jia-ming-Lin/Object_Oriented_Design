package OOD.Deck_Of_Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shoe {
    private List<BlackjackCard> cards;
    private int numberOfDecks;
    private void createShoe(){
        this.cards = new ArrayList<>();
        for (int decks = 0; decks < numberOfDecks; decks++){
            List<BlackjackCard>  tmp = new Deck().getCards();
            for(int i = 0; i < tmp.size(); i++){
                cards.add(tmp.get(i));
            }
        }
    }
    public void shuffle() {
        int cardCount = cards.size();
        Random r = new Random();
        for(int i = 0; i < cardCount; i++){
            int index = r.nextInt(cardCount - i - 1);
            swap(i , index);
        }
    }
    private void  swap(int i , int j){
        BlackjackCard tmp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, tmp);
    }
    public BlackjackCard dealCard(){
        if(cards.size() == 0){
            createShoe();
        }
        return cards.remove(0);
    }
}
