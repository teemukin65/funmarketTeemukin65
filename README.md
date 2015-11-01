# Funmarket-teemukin65 - Frontend and Backend server


## Description

This is demo backend server for exposing the Funmarket API found at

http://mepa-store-api.herokuapp.com/

Backend server provides
 - serves the frontend as static pages
 - consumes REST api at mepa-store-api
 - provides frontend an REST Api with input validation
 - Heroku deploy available and worked :)


Backend server is implemented using
Spring Boot


### Features

End user features:
- Listing of the currently stored advertisements
- Adding of a new advertisement
- about page: shows the current Build version and latest git commit date if available in local repo



## Installation

You need to have following sw installed in your system.

- Apache Maven 3.3.3 or later
- Java 1.8.0_66 or later

Then clone the repository to a work area.
from the git repo:
`````
git clone https://github.com/teemukin65/funmarketTeemukin65.git
`````






## Usage

```
mvn clean
mvn install
mvn spring-boot:run
```
And the service will be available at http://localhost:8080/


For Heroku deploy you need the heroku toolbelt installed.
After logging in to heroku with the toolbelt, you just
````
git push heroku master
````
and watch how the service starts up.



## TODO

For production deployments, some items are missing still. I have identified the following:

- https - operation to be configured to protect eavesdropping.
Comprises server certificates to be created and installed. Spring boot provides pretty much the rest.

- user account management required for advertisement posting. Mail sending config would be needed for mail address confirmation and password reset purposes.
- user database e.g. Postgress

- Registration, login and  logout  views for UI

- Service logging arrangements to see to what has happened

- Automated testing for both frontend and backend
- CI setup for jenkins
- User agreement text for the registration view.

See also the README.md at `src/main/resources/static` for frontend description.

And probably something more, too...





