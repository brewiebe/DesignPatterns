/**
 * Created by brewi on 2016-02-02.
 */
public class Laptop extends ProductProcess {

    @Override
    void testProduct() {
        System.out.println("laptop being laptop being tested.");
    }

    @Override
    void assembleProduct() {
        System.out.println("laptop being assembled.");
    }

    @Override
    void packageProduct() {
        System.out.println("laptop being packaged.");
    }

    @Override
    void storeProduct() {
        System.out.println("laptop being stored.");
    }

}

