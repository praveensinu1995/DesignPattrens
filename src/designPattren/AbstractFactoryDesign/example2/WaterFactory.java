package designPattren.AbstractFactoryDesign.example2;

public class WaterFactory extends TransportFactory {
    @Override
    Vehicle craeteVehicle() {
        return new Ship();
    }

    @Override
    Engine craeteEngine() {
        return new ShipEngine();
    }
}
