/**
 * The 'Context' class in the State Design Pattern.
 * Maintains a reference to the current state and coordinates transitions.
 */
public class Elevator {
    private State currentState; // Encapsulated state object
    private int currentFloor;   // Internal data tracking

    public Elevator() {
        this.currentFloor = 0; // Default starting floor
        this.currentState = new IdleState(); // Initial state
    }

    // Standard getters and setters demonstrating Encapsulation
    public void setState(State state) { this.currentState = state; }
    public int getCurrentFloor() { return currentFloor; }
    public void setCurrentFloor(int floor) { this.currentFloor = floor; }

    /**
     * Delegates the request to the current state object.
     * Demonstrates Polymorphism: behavior changes based on the object type of currentState.
     */
    public void requestFloor(int floor) {
        currentState.handleRequest(this, floor);
    }
}