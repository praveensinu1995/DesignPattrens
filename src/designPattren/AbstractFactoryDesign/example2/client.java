package designPattren.AbstractFactoryDesign.example2;

public class client {
    public static void main(String[] args) {
        WayOFTransport road=new Road();
        road.craeteVehicle().moive();
        road.craeteVehicle().strat();

        WayOFTransport water=new Water();
        water.craeteVehicle().strat();
        water.craeteVehicle().moive();

    }
}
