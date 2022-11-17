public class Main {
    public static void main(String[] args) {
        CustomerManager managerOracle=new CustomerManager(new OracleDatabaseManager());
        managerOracle.getCustomer();

        CustomerManager managerPostgres=new CustomerManager(new PostgresDatabaseManager());
        managerPostgres.getCustomer();

    }
}