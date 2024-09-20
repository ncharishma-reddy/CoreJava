package tns;

public class Main {
	public static void main(String[] args) {
        // Create instances of Flipkart and Amazon products
        Product flipkartProduct = new Flipkart("Laptop", 55000);
        Product amazonProduct = new Amazon("Laptop", 53000);

        // Compare prices and decide which product to purchase
        Product chosenProduct = chooseProduct(flipkartProduct, amazonProduct);

        // Output the chosen product details
        System.out.println("Product chosen for purchasing:");
        System.out.println("Name: " + chosenProduct.getName());
        System.out.println("Price: " + chosenProduct.getPrice());
    }

    // Method to choose the product with the lower price
    public static Product chooseProduct(Product p1, Product p2) {
        if (p1.getPrice() < p2.getPrice()) {
            return p1;
        } else {
            return p2;
        }
    }
}
