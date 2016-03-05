/**
 * Created by brewi on 2016-02-02.
 */
public abstract class ProductProcess {

    abstract void assembleProduct();

    abstract void testProduct();

    abstract void packageProduct();

    abstract void storeProduct();

    public void manufactureProduct(ProductProcess product){
        product.assembleProduct();
        product.testProduct();
        product.packageProduct();
        product.storeProduct();
    }
}
