public class DriverD extends Driver<Bus> {
    public DriverD(String fullname, boolean driveLicense, double driveExperience) {
        super(fullname, driveLicense, driveExperience);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель категории D: %s начал движение\n", getFullname());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Водитель категории D: %s закончил движение\n", getFullname());
    }


}