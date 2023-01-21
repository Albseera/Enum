public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иванов", true, 4.0);
        DriverC driverC = new DriverC("Петров", true, 8.0);
        DriverD driverD = new DriverD("Сидоров", true, 20.0);

        Car carA = new Car("ВАЗ", "2110", 10.5, driverB);
        Truck trackA = new Truck("КАМАЗ", "4565", 7.0, driverC);
        Bus busA = new Bus("МЕРС", "454", 4.0, driverD);

        System.out.println(busA.getDriver());
        System.out.println(driverD.getCar());


    }

    public static void printAll(Transport<?>... transports) {
        for (Transport<?> transport : transports) {
            System.out.printf("Для %s %s %s\n", transport.getClass().getSimpleName(), transport.getBrand(), transport.getModel());

        }
    }

    private static void printCheckinInformation(Transport<?>... transports) {
        for (Transport<?> transport : transports) {
            System.out.printf("Водитель: %s управляет автомобилем: %s %s %s и будет участвовать в заезде\n",
                    transport.getDriver().getFullname(), transport.getClass().getSimpleName(), transport.getBrand(),
                    transport.getModel());
        }
        System.out.println();
    }
}