package fom.oop.v6.task_08_07;

public class Warehouse {

    protected Product[] products;

    public Warehouse(int max) {
        this.products = new Product[max];
    }

    /**
     * Find the next free spot in our warehouse and
     * assign the given product (no matter what exact product it actually is)
     * to the free slot. Just ignore it, if we do not have any
     * free slots.
     * @param product
     */
    public void add(Product product) {
        // Now whatever concrete product you pass in,
        // you only see methods and attributes of the product class.
        // But that does not mean that your concrete product has disappeared:
        // Its just a simplified view, so you can handle it in a very
        // general manner aka "I do not care what your are, as long
        // as you are a product".
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) {
                this.products[i] = product;
                System.out.println("Product name: " + product.name + " at position " + i);

                break;
            }
        }
    }

}
