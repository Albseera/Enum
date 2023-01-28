

public class Car extends Transport<DriverB> {
    public enum TypesB {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNI("Универсал"),
        BIG("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String translate;

        TypesB(String translate) {
            this.translate = translate;
        }

        @Override
        public String toString() {
            return translate;
        }

    }
    private TypesB Type;

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
        setType(TransportTypes.CAR);
    }

    @Override
    public void goDiagnostic() throws FindLicense{

            if (!getDriver().isHasDriveLicense()){
                throw new FindLicense("У водителя отсутствуют водительские права!");
            }



    }



    @Override
    public void printType() {
        if (Type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getType() + " " + Type);
            System.out.println("Легковой автомобиль: " + Type);
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Авто марки " + getBrand() + " поехал");
    }

    @Override
    public void stopMoving() {
        System.out.println("Авто марки " + getBrand() + " остановился");
    }





    @Override
    public double maxSpeed() {
        return getEngineVolume() ;
    }

    public TypesB getBodyType() {
        return Type;
    }

    public void setBodyType(TypesB Type) {
        this.Type = Type;
    }
}