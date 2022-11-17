public class PostgresCustomerDal implements CustomerDal{
    @Override
    public void Add() {
        System.out.println("Müşteriler Postgresden getirildi.");
    }
}
