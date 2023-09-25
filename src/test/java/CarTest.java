import com.codebase.Car;
import com.codebase.Type;
import com.codebase.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car1,car2,car3;
    @Before
    public void before(){
        car1 = new Car(Type.ELECTRIC, Tyres.MICHELIN, 50000, "Silver", 0);
        car2 = new Car(Type.ICE, Tyres.BUDGET, 5000, "Red", 3000);
        car3 = new Car(Type.HYBRID, Tyres.CONTINENTAL, 35000, "BLUE", 500);
    }

    @Test
    public void hasEngine(){
        assertEquals(Type.ELECTRIC, car1.getEngine());
    }

}
