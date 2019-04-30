package OOD.Deck_Of_Card;

public class Card {
    private SUIT suit;
    private int facevalue;
    public SUIT getSuit(){
        return this.suit;
    }
    public int returnValue(){
        return this.facevalue;
    }
    public Card(SUIT suit, int facevalue){
        this.facevalue = facevalue;
        this.suit = suit;
    }
}
