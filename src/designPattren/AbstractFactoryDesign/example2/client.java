package designPattren.AbstractFactoryDesign.example2;

public class client {
    public static void main(String[] args) {
        TransportFactory road = new RoadFactory();
        road.craeteVehicle().moive();
        road.craeteVehicle().strat();
        road.craeteEngine().run();

        System.out.println("================================");


        TransportFactory water = new WaterFactory();
        water.craeteVehicle().strat();
        water.craeteVehicle().moive();
        water.craeteEngine().run();

    }
}
