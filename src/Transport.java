public abstract class Transport<D extends Driver> implements Competing {
    private D driver;
    private String brand;
    private String model;
    private double engineVolume;
    private TransportTypes type;


    public Transport(String brand, String model, double engineVolume, D driver) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public String getBrand() {
        return brand;
    }


    public abstract void goDiagnostic()  throws Exception;


    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        if (driver.getCar() == null) {
            driver.setCar(this);
            if (this.driver != null) {
                this.driver.setCar(null);
            }
            this.driver = driver;
        }
    }
    public TransportTypes getType() {
        return type;
    }

    public void setType(TransportTypes type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Brand: " + getBrand() + "\n" +
                "Model: " + getModel() + "\n" +
                "Engine Volume: " + getEngineVolume();
    }


}
