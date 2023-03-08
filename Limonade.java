public class Limonade extends Drink {
    
    public Limonade(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, int valueVolume){
        super(valueTitle,valuePrice,valueQuantity,valueUnit,valueVolume);
        
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  volume: %d",this.volume);
    } 
}
