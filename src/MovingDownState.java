public class MovingDownState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Moving down to floor " + floor);
        elevator.setCurrentFloor(floor);
        elevator.setState(new DoorOpenState());
        elevator.requestFloor(floor);
    }
}