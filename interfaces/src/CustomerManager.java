public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void Add(){
        this.customerDal.Add();
    }
}
