import com.ibm.cuda.CudaKernel;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
    private Object vehicle;
    private int actualcapacity;
    private List vehicles;
    private ParkingLotOwner owner;
    private List <ParkingLotObserver> observers;



    public ParkingLotSystem(int capacity) {
        this.vehicles = new ArrayList();
        this.actualcapacity = capacity;
    }

    public ParkingLotSystem() {

    }

    public boolean parkVehicle(Object vehicle) throws ParkinLotException {
        if (this.vehicles.size() == this.actualcapacity) {
            owner.capacityIsFull();
            throw new ParkinLotException("parking lot full");
        }
        if (this.isVehicleParked(vehicle))
            throw new ParkinLotException("Vehicle Already parked");
        this.vehicles.add(vehicle);
        return true;
    }
       public boolean unParkVehicle(Object vehicle) {
           if (this.vehicle == null) return false;
           if (this.vehicle.equals(vehicle)) {
               this.vehicle = null;
               if (vehicle == null) return false;
               if (this.vehicles.contains(vehicle)) {
                   this.vehicles.remove(vehicle);
                   return true;
               }

           }
           return false;
       }
        public void registerOwner (ParkingLotOwner parkingLotOwner){
            this.owner = parkingLotOwner;

        }

        public void setCapacity ( int capacity){
            this.actualcapacity = capacity;
        }


        public boolean isVehicleParked(Object vehicle){
            if (this.vehicles.contains(vehicle)) {
                return true;
            }
            return false;
        }

    public void registerParkingLotObservers(ParkingLotObserver observer) {
        this.observers.add(observer);
    }
}

