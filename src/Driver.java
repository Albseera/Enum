import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private T car;
    private double driveExperience;
    private final String fullname;
    private boolean driveLicense;


    public Driver(String fullname, boolean driveLicense, double driveExperience) {
        this.fullname = fullname;
        this.driveExperience = driveExperience;
        this.driveLicense = driveLicense;

    }

    public abstract void startMoving();

    public abstract void stopMoving();



    public String getFullname() {
        return fullname;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public double getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(double driveExperience) {
        this.driveExperience = driveExperience;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }



    @Override
    public int hashCode() {
        return Objects.hash(fullname, driveLicense, driveExperience);
    }

    @Override
    public String toString() {
        return fullname + " Права: " + (driveLicense ? "есть" : "нет") + " Стаж: " + driveExperience + " лет.";
    }
}