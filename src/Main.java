public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иванов", true, 4.0);
        DriverC driverC = new DriverC("Петров", true, 8.0);
        DriverD driverD = new DriverD("Сидоров", true, 20.0);

        Car carA = new Car("ВАЗ", "2110", 10.5, driverB);
        Truck trackA = new Truck("КАМАЗ", "4565", 7.0, driverC);
        Bus busA = new Bus("МЕРС", "454", 4.0, driverD);

        System.out.println(trackA.getType());
        trackA.setCarrying(Truck.Carrying.N2);
        trackA.printType();
        busA.setCapacity(Bus.Capacity.SMALL);
        busA.printType();
       carA.getDriver().setHasDriveLicense(false);

        carA.goDiagnostic();
        trackA.goDiagnostic();
       busA.goDiagnostic();



    }

    public static void printAll(Transport<?>... transports) {
        for (Transport<?> transport : transports) {
            System.out.printf("Для %s %s %s\n", transport.getClass().getSimpleName(), transport.getBrand(), transport.getModel());

        }
    }


}