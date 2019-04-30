package OOD.Deck_OF_CARD_CRACKING;

import java.util.ArrayList;

public class Hand<T extends Card> {
    protected ArrayList<T> cards = new ArrayList<>();
    public int score(){
        int score = 0;
        for(T a : cards){
            score += a.value();
        }
        return score;
    }
    public void addCard(T card){
        cards.add(card);
    }
}
