package OOD.Deck_OF_CARD_CRACKING;
import java.util.*;
public class Deck<T extends Card> {
        private ArrayList<T> card;
        private int dealIndex = 0;
        private void setDeckOfCard(ArrayList<T> deckOfCards){

        }
        private void shuffle(){

        }
        public int remainCards(){
            return card.size() - dealIndex;
        }
//        public T[] dealHand(int number){
//            return
//        }
}
