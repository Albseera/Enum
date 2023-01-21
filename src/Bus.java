

public class Bus extends Transport<DriverD> {
    public enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private final Integer minCapacity;
        private final Integer maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            String out1="";
            String out2="";
            if (minCapacity != null) {
                out1 = "от " + minCapacity;
            } else if (maxCapacity != null) {
                out2 = "до " + maxCapacity;

            }
            return "Вместимость " + out1 + " " + out2 + " " + "человек";
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
        setType(TransportTypes.BUS);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автобус: " + capacity);
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " поехал");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус марки " + getBrand() + " остановился");
    }


    @Override
    public double maxSpeed() {
        return getEngineVolume();
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}