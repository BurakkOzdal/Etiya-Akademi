public class MySqlCustomerDal implements CustomerDal{
    @Override
    public void Add() {
        System.out.println("Müşteriler MySqlden getirildi.");
    }
}
