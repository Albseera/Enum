import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private T car;
    private final String fullname;
    private boolean hasDriveLicense;
    private double driveExperience;

    public Driver(String fullname, boolean hasDriveLicense, double driveExperience) {
        this.fullname = fullname;
        this.hasDriveLicense = hasDriveLicense;
        this.driveExperience = driveExperience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();



    public String getFullname() {
        return fullname;
    }

    public boolean isHasDriveLicense() {
        return hasDriveLicense;
    }

    public void setHasDriveLicense(boolean hasDriveLicense) {
        this.hasDriveLicense = hasDriveLicense;
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
        return Objects.hash(fullname, hasDriveLicense, driveExperience);
    }

    @Override
    public String toString() {
        return fullname + " Наличие прав: " + (hasDriveLicense ? "есть" : "нет") + " Стаж: " + driveExperience + " лет.";
    }
}