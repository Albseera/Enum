public class Truck extends Transport<DriverC> {
    public enum Carrying {
        N1(null, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);

        final Double minValue;
        final Double maxValue;

        Carrying(Double minValue, Double maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
        @Override
        public String toString() {
            String out1="";
            String out2="";
            if (minValue != null) {
                out1 = "от " + minValue;
            } else if (maxValue != null) {
                out2 = "до " + maxValue;

            }
            return "Вместимость " + out1 + " " + out2 + " " + "тонн";
        }

    }
    private Carrying carrying;

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
        setType(TransportTypes.TRUCK);
    }
    @Override
    public void goDiagnostic() {
        try {
            if (!getDriver().isHasDriveLicense()){
                throw new FindLicense("У водителя отсутствуют водительские права!");
            }
        } catch (FindLicense e) {
            System.out.println(e.getMessage());
        }

        try {
            if (getDriver().getClass() != DriverC.class){
                throw new LicenseWrong("Невалидные права водителя!");
            }
        } catch (LicenseWrong e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void printType() {
        if (carrying == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getType() + " " + carrying);
            System.out.println("Грузовой автомобиль: " + carrying);
        }
    }

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик марки " + getBrand() + " поехал");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик марки " + getBrand() + " остановился");
    }





    @Override
    public double maxSpeed() {
        return getEngineVolume() ;
    }
}