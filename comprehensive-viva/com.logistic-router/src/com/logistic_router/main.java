package com.logistic_router;

public class main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 35));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 50, 80, 95));

        d.printSummary();
    }
}
