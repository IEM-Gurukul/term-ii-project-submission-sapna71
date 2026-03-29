//Structure
public class Elevator {
    private State currentState;
    private int currentFloor;

    public Elevator() {
        currentState = new IdleState();
        currentFloor = 0;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void requestFloor(int floor) {
        currentState.handleRequest(this, floor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }
}