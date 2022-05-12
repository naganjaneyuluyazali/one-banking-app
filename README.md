# one-banking-app

1. It's a Spring boot application.
2. Using Spring MVC annotations.
3. It accepts parameterized get requests to get ATM Location information.
4. Parameter type is String and name is : identification
5. This application consumes another get service (https://api.lloydsbank.com/open-banking/v2.2/atms) to fetch ATM location data.
6. Using HttpClient building, get request.
7. Having well-defined POJO classes for ATM location data.
8. Loading the fetched ATM location data into POJO class.
9. Search through the LIST of ATM's data using identification received in the Application get service.
10. If a match is found - return LIST of ATM's data.
11. If a match is not found - returning blank list.
12. ATM location data getting cached using cacheable spring annotation.
13. The second and further request first Cache instead of calling open-banking service. If ATM identification is not found, then only will consume open-banking service to fetch the latest ATM data.

ATMService Interface has been implemented by ATMFinderService and BasicATMService.
We can improve the performance this App - by implementing BasicATMService.
In our scenario using of for loops better than streams.

I have tested with ATMFinderService and BasicATMService implementations. I'm seeing a better performance with BasicATMService implementation.

BasicATMService
---------------
Start   2022-05-11T12:43:36.253297900
Finish  2022-05-11T12:43:38.177854600

ATMFinderService
----------------
Start   2022-05-11T12:51:04.474563500
Finish  2022-05-11T12:51:09.681555100

We can automate the test using serveral frameworks - Karate cucmber, Postman.
Attaching postman collection to test couple of scenarios.

Note : I have developed test framework using Karate cucmber.  Please refer the following repo - https://github.com/naganjaneyuluyazali/covid19assignment






