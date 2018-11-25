import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passangers> passangers;

    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passangers = new ArrayList<>();
    }

    public PlaneType getType() {
        return type;
    }

    public String getAirline() {
        return airline;
    }

    public ArrayList<Passangers> getPassangers() {
        return passangers;
    }
}
