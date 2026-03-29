# Design Explanation

## Design Pattern Used
State Design Pattern

## Why State Pattern?
The elevator behavior changes based on its current state (Idle, Moving, DoorOpen). Using conditional logic would make the system complex. The State Pattern allows each behavior to be encapsulated in separate classes.

## How It Works
- Elevator acts as the context
- State interface defines behavior
- Concrete states implement different actions
- State transitions occur dynamically

## Benefits
- Cleaner code
- Easy to extend
- Better maintainability
