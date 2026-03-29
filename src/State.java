public interface State {
    /**
     * Handles the floor request based on the current state of the elevator.
     * @param elevator The context object (the elevator itself).
     * @param floor The destination floor requested by the user.
     */
    void handleRequest(Elevator elevator, int floor);
}
