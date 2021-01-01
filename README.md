# CouchPlanner

You have to have installed docker.
There are two ways to start the application. 

1. mvn clean install -Dskip.surefire.tests && docker-compose build && docker-compose up -d
This runs the mvn clean install without the tests (because we dont have any right now) then builds the docker compose and runs it.
It may happen that this command may not work for you. (i had problems with docker, it wouldnt let me connect to it from the IDE)

2. mvn clean install -Dskip.surefire.tests
Then go into the docker compose file and start it from there.

Once you have run the mvn clean install you can replace it with mvn clean package (its a bit faster and install only installs new packages from the POM). If you add something to the POM, you have to run it with install once again.

There is an example entity in every microservice on how to create an entity in Spring.
