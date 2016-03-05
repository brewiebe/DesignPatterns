import java.util.ArrayList;

/**
 * Created by brewi on 2016-02-02.
 */
public class TestMain {
    public static void main(String[] args){
        ArrayList<ProductProcess> productProcesses = new ArrayList<>();

        productProcesses.add(new Laptop());
        productProcesses.add(new SmartPhone());
        productProcesses.add(new Laptop());
        productProcesses.add(new SmartPhone());

        for (ProductProcess p: productProcesses) {
            p.manufactureProduct(p);
        }
    }

}
