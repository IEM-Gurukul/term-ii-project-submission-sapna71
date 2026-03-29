// Opens door after reaching destination
public class DoorOpenState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Door opening at floor " + elevator.getCurrentFloor());
        elevator.setState(new IdleState());
    }
}