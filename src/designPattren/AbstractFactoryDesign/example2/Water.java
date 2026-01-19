package designPattren.AbstractFactoryDesign.example2;

public class Water extends WayOFTransport{
    @Override
    Vehicle craeteVehicle() {
        return new Ship();
    }
}
