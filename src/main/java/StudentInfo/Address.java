package StudentInfo;

public class Address {
    private String no;
    private String street;
    private String district;
    private String city;
  
    public Address(){}
    
    public Address(String no, String street, String district, String city){
        this.no = no;
        this.street = street;
        this.district = district;
        this.city = city;    
    }
    
    public String toStringAddress(){
        return no + " " + street + " Q." + district + " TP/Tinh " + city;
    }
    
    public void setNo(String no){
        this.no = no;
    }
    
    public String getNo(){
        return no;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setDistrict(String district){
        this.district = district;
    }
    
    public String getDistrict(){
        return district;
    }
    
    public void setCity(String city){
        this.no = city;
    }
    
    public String getCity(){
        return city;
    }
}
