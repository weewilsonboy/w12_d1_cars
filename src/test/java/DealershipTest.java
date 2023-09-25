import com.codebase.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class DealershipTest {
    Customer customer;
    Car car1,car2,car3;
    ArrayList<Car> carArrayList = new ArrayList<>();
    Dealership dealership;

    @Before
    public void before(){
        car1 = new Car(Type.ELECTRIC, Tyres.MICHELIN, 50000, "Silver", 0);
        car2 = new Car(Type.ICE, Tyres.BUDGET, 5000, "Red", 3000);
        car3 = new Car(Type.HYBRID, Tyres.CONTINENTAL, 35000, "BLUE", 500);
        carArrayList.add(car1);
        customer = new Customer(100000, carArrayList);
        carArrayList.remove(0);
        carArrayList.add(car2);
        carArrayList.add(car3);
        dealership = new Dealership(400000, carArrayList);
    }
    @Test
    public void canSellToCustomer(){
        Car carToSell = dealership.getOwnedCars().get(0);
        dealership.sellToCustomer(carToSell,customer);
        assertEquals(car2, customer.getOwnedCars().get(1));
    }

    @Test
    public void canRepair(){
        dealership.repair(car2);
        assertEquals(397000,dealership.getTill());
    }

}
