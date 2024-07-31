import java.util.HashMap;

public class Operation {
    private HashMap<Integer,Product> map = new HashMap<>();

    public void addProduct(Product product){
        map.put(product.getProductId(),product);
    }

    public void updateProduct(Product product) {
        if (map.containsKey(product.getProductId())) {
            map.put(product.getProductId(), product);
        } else {
            System.out.println("Product with id: "+product.getProductId()+" not found.");
        }
    }


    public void deleteProduct(int productId) {
        if (map.containsKey(productId)) {
            map.remove(productId);
        } else {
            System.out.println("Product with id: "+productId+" not found.");
        }
    }


    public Product getProductById(int productId) {
        return map.get(productId);
    }

    public void getAllProduct(){
        map.entrySet().stream().forEach(e -> {
            Product product = e.getValue();
            System.out.println(product);
        });
    }

    
}
