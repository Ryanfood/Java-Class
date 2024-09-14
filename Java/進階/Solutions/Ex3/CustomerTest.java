public class CustomerTest {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setCustomerInfo(1, "Harry", "234 Maple St.", "02-9876-5432");
        cust1.display();       
        
        Customer cust2 = new Customer();
        cust2.setCustomerInfo(2, "Sally", "567 Oak St.", "04-2345-6789", "sally@gmail.com");
        cust2.display();             
        
    }
    
}
