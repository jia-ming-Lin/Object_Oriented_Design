package OOD.Deck_OF_CARD_CRACKING;

public class BlackJackCard extends Card {
    public BlackJackCard(int c, Suit suit){
        super(c, suit);
    }
    public int value(){
        if(this.faceValue == 1){
            return 1;
        }
        else if(this.faceValue >= 11 || this.faceValue <=13) return 10;
        else{
            return this.faceValue;
        }
    }
    public int minValue(){
        if(this.faceValue == 1){
            return 1;
        }else return value();
    }
    public int maxValue(){
        if(this.faceValue == 1){
            return 11;
        }else return value();
    }

}
