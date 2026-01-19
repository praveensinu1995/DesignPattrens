package designPattren.AbstractFactoryDesign.example2;

public class RoadFactory extends TransportFactory {
    @Override
    Vehicle craeteVehicle() {
        return new Truck();
    }

    @Override
    Engine craeteEngine() {
        return new TruckEngine();
    }
}
