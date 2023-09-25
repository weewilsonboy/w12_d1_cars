import com.codebase.Car;
import com.codebase.Customer;
import com.codebase.Type;
import com.codebase.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class CustomerTest {
    Customer customer;
    Car car1,car2,car3;
    ArrayList<Car> carArrayList = new ArrayList<>();


    @Before
    public void before(){
        car1 = new Car(Type.ELECTRIC, Tyres.MICHELIN, 50000, "Silver", 0);
        car2 = new Car(Type.ICE, Tyres.BUDGET, 5000, "Red", 3000);
        car3 = new Car(Type.HYBRID, Tyres.CONTINENTAL, 35000, "BLUE", 500);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        customer = new Customer(100000, carArrayList);
    }
    @Test
    public void hasMoney(){
        assertEquals(100000,customer.getMoney());
    }
    @Test
    public void hasOwnedCars(){
        assertEquals(carArrayList,customer.getOwnedCars());
    }
    @Test
    public void canBuyCar(){
        customer.buy(car1);
        assertEquals(4,customer.getOwnedCars().size());
    }
    @Test
    public void canSellCar(){
        Car carToSell = customer.getOwnedCars().get(0);
        assertEquals(car1,customer.sell(carToSell));
    }
}
