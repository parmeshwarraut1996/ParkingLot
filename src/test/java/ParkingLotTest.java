import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {
    Object vehicle=null;
    @Test
    public void  givenAVehicle_WhenParked_ShouldReturnTrue(){
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean isParked = parkingLotSystem.parkVehicle(new Object());
        Assert.assertTrue(isParked);
    }


}
