package OOD.Deck_Of_Card;
import java.util.ArrayList;
import java.util.List;
public class Deck {
    private List<BlackjackCard> cards;
    public Deck(){
        this.cards = new ArrayList<>();
        for(int i = 1; i <= 13; i++){
            for(SUIT suit : SUIT.values()){
                cards.add(new BlackjackCard(suit, i));
            }
        }
    }
    public List<BlackjackCard> getCards(){
        return cards;
    }
}
