public class IdleState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        if (floor == elevator.getCurrentFloor()) {
            System.out.println("Already on same floor");
            return;
        }

        if (floor > elevator.getCurrentFloor()) {
            elevator.setState(new MovingUpState());
        } else {
            elevator.setState(new MovingDownState());
        }

        elevator.requestFloor(floor);
    }
}