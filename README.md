# Design Challenge 1

##Problem

A travel agency has a flight searching API which can search flights based on different criteria. Now they need to build an SDK for their API so that their partners can also easily integrate the flight searching capability to their own systems. Initial idea was to have one method which has following 10 parameters and return flights list. But then they realize that things can easily go wrong when caller need to pass 10 arguments in correct order. So they decide to use the builder design pattern with a fluent interface.

1. From (Airport of City leaving from)
2. To (Airport or City going to)
3. Departure Date
4. Arrival Date
5. Adults count
6. Children count
7. Infants count
8. Class
9. Preferred airline
10. Direct flight only

How would you design a builder class to satisfy their requirement?

##Note

The given solution is implemented only considering first five parameters and can be easily extended.