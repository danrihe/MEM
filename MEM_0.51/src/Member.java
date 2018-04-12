public class Member implements Comparable<Member> {
    
    private String type, name, address, phone, paid;
    
   public Member(String tempType, String tempName, String tempAddress, String tempPhone, String tempPaid){ 
       
        type = tempType;
        name = tempName;
        address = tempAddress;
        phone = tempPhone;
        paid = tempPaid;
       
   } 
   
   public void setType(String tempType){
       
       type = tempType;
       
   }
   
   public void setName(String tempName){
       
       name = tempName;
       
   }
   
   public void setAdd(String tempAddress){
       
       address = tempAddress;
       
   }
   
   public void setPhone(String tempPhone){
    
       phone = tempPhone;
    
    }
   public void setPaid(String tempPaid){
       
       paid = tempPaid;
       
   }
   
   public String getType(){
       
       return type;
       
   }
   
   public String getName(){
       
       return name;
       
   }
   
   public String getAdd(){
       
       return address;
       
   }
    
   public String getPhone(){
       
       return phone;
       
   }
   public String getPaid(){
       
      return paid;
       
   }
   public String toString(){
       return String.format("%s %30s %20s %10s",name,address,phone,paid);
   }
   
   public int compareTo(Member other){
       if(this.name.compareTo(other.name)<0)
           return-1;
        else if(this.name.compareTo(other.name)>0)
            return 1;
        else 
            return 0;
       
   }
   
}