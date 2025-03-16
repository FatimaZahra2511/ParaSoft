package BusinessLogic;

public class Supplier {
  
    public String Name;
    public String Address;
    public String PhoneNumber;
    public String Description;

    public Supplier(String Name, String Address, String PhoneNumber, String Description) {

        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

   
    
      @Override

    public String toString() {
        
        return "Supplier{\n\tName: " + Name + "\n\tAddress: " + Address + "\n\tPhone Number: " + PhoneNumber + "\n\tDescription: " + Description + "\n}";
    }
}