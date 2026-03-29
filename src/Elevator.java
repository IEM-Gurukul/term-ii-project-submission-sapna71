import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    private State currentState;
    private int currentFloor;
    private Queue<Integer> requests;

    public Elevator() {
        currentState = new IdleState();
        currentFloor = 0;
        requests = new LinkedList<>();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    // Add request to queue
    public void requestFloor(int floor) {
        System.out.println("Request received for floor: " + floor);
        requests.add(floor);
        processRequests();
    }

    // Process queue
    private void processRequests() {
        while (!requests.isEmpty()) {
            int targetFloor = requests.poll();
            currentState.handleRequest(this, targetFloor);
        }
    }
}