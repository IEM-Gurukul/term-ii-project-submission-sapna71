public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator();
//requests
        elevator.requestFloor(5);
        elevator.requestFloor(2);
        elevator.requestFloor(7);
        elevator.requestFloor(7); // same floor test
    }
}
