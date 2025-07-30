package JavaTut.Inheritence;


class User{
    private String name;
    private String contact;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContact(){
        return this.contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    void userDetail(){
        System.out.println("Name: "+this.name);
        System.out.println("Contact: "+this.contact);
    }
}

class Admin extends User{
    private String role;
    private String salary;

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getSalary(){
        return this.salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    void adminDetails(){
        System.out.println("Role: "+this.getRole());
        System.out.println("Salary: "+this.getSalary());
    }
}

class Customer extends User{
    private String orderNo;

    public String getOrderNo(){
        return this.orderNo;
    }
    public void setOrderNo(String orderNo){
        this.orderNo = orderNo;
    }
    void customerDetails(){
        System.out.println("Order No: "+this.getOrderNo());
    }
}

class Vendor extends User{
    private String orderType;

    public String getOrderType(){
        return this.orderType;
    }
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    void vendorDetails(){
        System.out.println("Order Type: "+this.getOrderType());
    }
}


public class Zomato {
    public static void main(String[] args){
        Admin admin = new Admin();
        admin.setName("Priyanshu Chourasia");
        admin.setRole("admin");
        admin.setSalary("123456789");
        admin.setContact("8797604045");
        admin.userDetail();
        admin.adminDetails();

        Customer customer = new Customer();
        customer.setName("Rahul");
        customer.setContact("123456");
        customer.setOrderNo("Panner");
        customer.userDetail();
        customer.customerDetails();

        Vendor vendor = new Vendor();
        vendor.setName("Rani");
        vendor.setContact("34353423");
        vendor.setOrderType("Non-Veg");
        vendor.userDetail();
        vendor.vendorDetails();
    }
}
