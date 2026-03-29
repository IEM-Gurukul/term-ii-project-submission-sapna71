public class IdleState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        // Redundancy check: Prevent movement if already at destination
        if (floor == elevator.getCurrentFloor()) {
            System.out.println("Already on same floor");
            return;
        }

        if (floor > elevator.getCurrentFloor()) {
            elevator.setState(new MovingUpState());
        } else {
            elevator.setState(new MovingDownState());
        }
// Recursive call: The new state will now handle the same request
        elevator.requestFloor(floor);
    }
}
