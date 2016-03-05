/**
 * Created by brewi on 2016-02-02.
 */
public class SmartPhone extends ProductProcess {

    @Override
    void assembleProduct() {
        System.out.println("smart phone being assembled.");
    }

    @Override
    void testProduct() {
        System.out.println("smart phone being tested.");
    }

    @Override
    void packageProduct() {
        System.out.println("smart phone being packaged.");
    }

    @Override
    void storeProduct() {
        System.out.println("smart phone being stored.");
    }
}
