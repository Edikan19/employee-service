\#Employee REST Service



A RESTful web service built with Java Spring Boot and Gradle that manages employee data.



\##Features

\- `GET /employees` returns all employees as JSON

\- `POST /employees` adds a new employee from a JSON body

\- Unit tests with JUnit 5 and Mockito



\##Employee format

{

&#x20; "employee\_id": "string",

&#x20; "first\_name": "string",

&#x20; "last\_name": "string",

&#x20; "email": "string",

&#x20; "title": "string"

}



\##Run it

./gradlew bootRun

(or `gradle bootRun` if the wrapper download times out)



\##Test it

gradle test



\##Notes

Data is stored in memory and resets on restart.

Built as part of the HPE Software Engineering job simulation.

