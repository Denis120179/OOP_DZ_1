public class Milk extends Food {
    int fat;
    public Milk(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, String valueExdata, int valueFat){
        super(valueTitle,valuePrice,valueQuantity,valueUnit, valueExdata);
        this.fat = valueFat;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  exdata: %s" + "  fat: %d",this.exdata, this.fat);
    } 
}
