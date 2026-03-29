public class DoorOpenState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Door opening at floor " + elevator.getCurrentFloor());
        // Reset the elevator to Idle so it can accept the next request in the queue
        elevator.setState(new IdleState());
    }
}
