package OOD.Deck_OF_CARD_CRACKING;

public enum Suit {
    Club (0),
    Diamond (1),
    Spade (2),
    Heart (3);
    private int value;
    private Suit(int v){
        this.value = v;
    }
    public int getValue(){
        return this.value;
    }
//    public static Suit geitSuitFromValue(int value){
//        return Suit
//    }
}
