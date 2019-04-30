package OOD.Deck_OF_CARD_CRACKING;

public abstract class Card {
    private boolean available = true;
    protected int faceValue ;
    protected Suit suit;
    public Card(int faceValue, Suit suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }
    public abstract int value();
    public Suit suit(){
        return this.suit;
    }
    public boolean getAvailable(){
        return this.available;
    }
    public void makeUnavailable(){
        this.available = false;
    }

    public void makeAvailable(){
        this.available = true;
    }
}
