# Airline lab for CodeClan Week 11 Weekend Homework
CodeClan homework with the following brief:

Your task is to model a system for the world renowned online travel booking agent TravelJava. You should use the tools you have learnt this week where appropriate and useful. Remember to TDD!

TravelJava doesn't really exist (sadly) - don't stress about how a "real" example of this would work differently. This is just an exercise to practice some different concepts.

### Assumptions:

- Each passenger bag weighs the same
- Planes reserve half of their total weight for passenger bags
- The weight of bag per person is the weight reserved for passenger bags divided by the capacity
- Passengers exist for a single flight only

## MVP
Create a Passenger class which has:

- a name
- a number of bags

Create a Plane class which has:

- an enum PlaneType (e.g. BOEING747) which stores capacity and total weight

Create a Flight class which has:

- an empty list of booked Passenger's
- a Plane
- flight number (i.e. "FR756")
- destination (i.e. GLA, EDI)
- departure airport (i.e. GLA, EDI)
- departure time (use a String)

The Flight class should have methods to:

- return the number of available seats
- book a passenger (if there are remaining seats)
