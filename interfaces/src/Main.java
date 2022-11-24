public class Main {
    public static void main(String[] args) {
        CustomerManager manager1=new CustomerManager(new MySqlCustomerDal());
        manager1.Add();

        CustomerManager manager2=new CustomerManager(new PostgresCustomerDal());
        manager2.Add();
    }
}