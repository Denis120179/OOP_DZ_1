public class Hygiene extends Product{
    int howmany;
    public Hygiene(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, int valueHowmany){
        super(valueTitle,valuePrice,valueQuantity,valueUnit);
        this.howmany = valueHowmany;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  howmany: %d",this.howmany);
    } 
}
