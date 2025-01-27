# AirTek

Hi there, thanks for taking a look at my submission!

To run the code, just click Run under Main.java and you should see the console output as described in the project document.

The only dependency used in this project is GSON to parse the incoming orders. Please make sure you have that library installed. [Here's a link to download it if you don't already have it.](https://github.com/google/gson). This application can be run on Java 8 or higher. 


### Design
This project follows an object-oriented design. The main components of the application are described as follows:
**Order**: Represents individual orders, including their ID, destination, and scheduling status.
**Flight**: Represents flights with details like flight number, origin, destination, day, capacity, and orders already assigned to that flight.
**FlightSchedule** Represents a list of flights and provides a method for querying flights by destination.
**OrderScheduler**: Implements the core scheduling logic, to assign orders to flights based on the destination/capacity.
**InputParser**: Handles the parsing of JSON, and create a default flight schedule as described in the document.
**OutputGenerator*: Formates and outputs the flight schedule and orders to the console.
**Main**: Orchestrates the entire workflow.

## Flow:
1. We first parse all the orders as described in the JSON file, and convert this into a list of `Order` objects.
2. We then load the flight schedule, using the default flight schedule as described in the scenario.
3. We schedule orders, assigning each order to the first available flight that matches the destination and has some capacity left.
4. We print the flight schedule and the status of each order (if it was scheduled or not) to the console.

### Sample Output

Sample Output:
```
User Story #1: 

Flight: 1, departure: YUL, arrival: YYZ, day: 1
Flight: 2, departure: YUL, arrival: YYC, day: 1
Flight: 3, departure: YUL, arrival: YVR, day: 1
Flight: 4, departure: YUL, arrival: YYZ, day: 2
Flight: 5, departure: YUL, arrival: YYC, day: 2
Flight: 6, departure: YUL, arrival: YVR, day: 2
User Story #2: 

order: order-001, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-002, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-003, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-004, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-005, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-006, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-007, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-008, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-009, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-010, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-011, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-012, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-013, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-014, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-015, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-016, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-017, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-018, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-019, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-020, flightNumber: 1, departure: YUL, arrival: YYZ, day: 1
order: order-021, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-022, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-023, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-024, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-025, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-026, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-027, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-028, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-029, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-030, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-031, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-032, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-033, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-034, flightNumber: 4, departure: YUL, arrival: YYZ, day: 2
order: order-035, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-036, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-037, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-038, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-039, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-040, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-041, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-042, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-043, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-044, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-045, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-046, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-047, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-048, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-049, flightNumber: not scheduled
order: order-050, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-051, flightNumber: not scheduled
order: order-052, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-053, flightNumber: not scheduled
order: order-054, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-055, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-056, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-057, flightNumber: 2, departure: YUL, arrival: YYC, day: 1
order: order-060, flightNumber: 5, departure: YUL, arrival: YYC, day: 2
order: order-061, flightNumber: 5, departure: YUL, arrival: YYC, day: 2
order: order-062, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-063, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-064, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-065, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-066, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-067, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-068, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-069, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-070, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-071, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-072, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-073, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-074, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-075, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-076, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-077, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-078, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-080, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-081, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-082, flightNumber: 3, departure: YUL, arrival: YVR, day: 1
order: order-083, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-084, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-085, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-086, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-087, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-088, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-089, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-090, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-091, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-092, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-093, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-094, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-095, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-096, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-097, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-098, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
order: order-099, flightNumber: 6, departure: YUL, arrival: YVR, day: 2
```
