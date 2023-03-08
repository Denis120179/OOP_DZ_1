public class Bread extends Food{
    String flour;    
    public Bread(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, String valueExdata, String valueFlour){
        super(valueTitle,valuePrice,valueQuantity,valueUnit,valueExdata);
        this.flour = valueFlour;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  exdata: %s" + "  flour: %s",this.exdata, this.flour);
    } 
}
