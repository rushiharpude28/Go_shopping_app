package Customer;

import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopFactory;

public class customer {
    public static void main(String[] args) {
        ShopFactory sf = new GSShopFactory();

        PrimeAcc pa = new GSPrimeAcc(3, "Ganeh", 400, true);
        pa.bookProduct(pa.getCharges());
        pa.toString();
        System.out.println("--------------------------------------------------------------");

        PrimeAcc pa1 = new GSPrimeAcc(4, "Akshay", 250, false);
        pa1.bookProduct(pa1.getCharges());
        pa1.toString();
        System.out.println("--------------------------------------------------------------");

        NormalAcc na = new GSNormalAcc(5, "Ritesh", 300, 50);
        na.bookProduct(na.getdeliveryCharges());
        na.toString();

    }
}
