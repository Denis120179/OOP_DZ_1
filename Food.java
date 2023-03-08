public class Food extends Product {
    String exdata;    
    public Food(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, String valueExdata){
        super(valueTitle,valuePrice,valueQuantity,valueUnit);
        this.exdata = valueExdata;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  exdata: %s",this.exdata);
    } 
}
