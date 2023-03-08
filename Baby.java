public class Baby extends Product{
    int minAge;
    String allergy;
     
    public Baby(String valueTitle, int valuePrice, int valueQuantity, String valueUnit, int valueMinAge, String valueAllergy){
        super(valueTitle,valuePrice,valueQuantity,valueUnit);
        this.minAge = valueMinAge;
        this.allergy = valueAllergy;
    } 

    @Override
    public String toString() {
       return String.format(super.toString() + "  minAge: %d" + "  allergy: %s",this.minAge, this.allergy);
    } 
}
