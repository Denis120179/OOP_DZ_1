public class Drink extends Product{
    int volume;
    public Drink(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, int valueVolume){
        super(valueTitle,valuePrice,valueQuantity,valueUnit);
        this.volume = valueVolume;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  volume: %d",this.volume);
    } 
}
