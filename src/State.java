public interface State {
    void handleRequest(Elevator elevator, int floor);
}