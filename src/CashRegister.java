import java.io.File;
import java.io.IOException;
import java.util.*;

public class CashRegister {
    private Map<String, Product> productMap; // map from upc code to product info
    private List<Product> scannedItems;

    public CashRegister(String filename) throws IOException {
        productMap = new HashMap<>();
        scannedItems = new ArrayList<>();
        loadProducts(filename);
    }

    private void loadProducts(String filename) throws IOException {
        try (java.util.Scanner sc = new java.util.Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String upc = sc.next(); // upc
                String name = sc.next(); // product name
                double price = sc.nextDouble(); // price
                productMap.put(upc, new Product(upc, name, price));
            }
        }
    }

    public void addItem(String upc) {
        if (productMap.containsKey(upc)) {
            scannedItems.add(productMap.get(upc));
        }
    }

    // returns scanned items
    public List<Product> getScannedItems() {
        return scannedItems;
    }

    // returns calculated subtotal
    public double getSubtotal() {
        return scannedItems.stream().mapToDouble(Product::getPrice).sum();
    }

    // product class for upc
    public static class Product {
        private String upc;
        private String name;
        private double price;

        public Product(String upc, String name, double price) {
            this.upc = upc;
            this.name = name;
            this.price = price;
        }

        public String getUpc() { return upc; }
        public String getName() { return name; }
        public double getPrice() { return price; }

        @Override
        public String toString() {
            return name + " - $" + price;
        }
    }
}
