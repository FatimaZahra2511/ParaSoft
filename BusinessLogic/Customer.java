package BusinessLogic;

public class Customer {
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String CIN;
    
    public Customer (String name, String Address, String PhoneNum,String CIN){

        this. Name = name;
        this. Address = Address;
        this. PhoneNumber = PhoneNum;
        this. CIN =CIN;
    }
    public void SetCustomerName (String name){
        this.Name = name;    
    }
    public void SetCustomerAddress (String address){
        this.Address = address;    
    }
    public void SetPhoneNumber (String PhoneNumber){
        this.PhoneNumber = PhoneNumber;    
    }
    public void SetCustomerCIN (String CIN){
        this.CIN = CIN;    
    }
    public String getCustomerName (){
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCIN() {
        return CIN;
    }

    @Override
    public String toString() {
        return "Customer {\n\tName: " + Name + "\n\tAddress: "+ Address + "\n\tPhone Number: " + PhoneNumber + "\n\tCIN: " + CIN + "\n }";
    }
    
}