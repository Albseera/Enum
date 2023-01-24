public enum TransportTypes {
    CAR("Легковой автомобиль"),
    TRUCK("Грузовой автомобиль"),
    BUS("Автобус");
    private final String info;

    TransportTypes(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}