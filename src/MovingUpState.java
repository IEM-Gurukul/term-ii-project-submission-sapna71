public class MovingUpState implements State {
    public void handleRequest(Elevator elevator, int floor) {
        System.out.println("Moving up to floor " + floor);
        elevator.setCurrentFloor(floor);
        elevator.setState(new DoorOpenState());
        elevator.requestFloor(floor);
    }
}