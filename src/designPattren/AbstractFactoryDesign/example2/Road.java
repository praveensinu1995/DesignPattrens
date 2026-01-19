package designPattren.AbstractFactoryDesign.example2;

public class Road extends WayOFTransport{
    @Override
    Vehicle craeteVehicle() {
        return new Truck();
    }
}
