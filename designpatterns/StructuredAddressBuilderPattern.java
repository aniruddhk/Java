package designpatterns;

public class StructuredAddressBuilderPattern {
    private String houseNo;
    private String streetName;
    private String addressLine1;
    private String addressLine2;

    public String getHouseNo() {
        return houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public String getPostCode() {
        return postCode;
    }

    private String addressLine3;
    private String postCode;

   public StructuredAddressBuilderPattern(String houseNo, String streetName, String addressLine1, String postCode){
       this.addressLine1 = addressLine1;
       this.houseNo = houseNo;
       this.streetName = streetName;
       this.postCode = postCode;
   }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public static void main(String[] args) {
        StructuredAddressBuilderPattern structuredAddressBuilderPattern = new StructuredAddressBuilderPattern("","","","");
        structuredAddressBuilderPattern.setAddressLine2("");
    }



}
