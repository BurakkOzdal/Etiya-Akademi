public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster Gaming");
        product.setPrice(10000);
        product.setUnitsInStock(10);

        System.out.println(product.getName()+" "+ product.getDescription()+ "Fiyat: "+product.getPrice());
    }
}