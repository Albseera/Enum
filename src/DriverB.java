public class DriverB extends Driver<Car> {
    public DriverB(String fullname, boolean driveLicense, double driveExperience) {
        super(fullname, driveLicense, driveExperience);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель категории B: %s начал движение\n", getFullname());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель категории B: %s закончил движение\n", getFullname());
    }


}
