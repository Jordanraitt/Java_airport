import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private String portCode;

    public Airport(String portCode) {
        hangar = new ArrayList<>();
    }

    public ArrayList<Plane> getHangar() {
        return hangar;
    }

    public int hangarCount(){
        return this.hangar.size();
    }

    public void addToHangar(Plane plane){
        this.hangar.add(plane);
    }

    public void takePlaneFromHanger() {
        this.hangar.remove(0);
    }

    public String getPortCode() {
        return portCode;
    }

    public void newFlight(){
       flight = new Flight(plane, flightNumber, destination);
       takePlaneFromHanger();
    }
}
