# UltraTeam 7.1 Demo : Server - Data Viz 
This project is a project carried out by two teams, this is the server part with data visualization.

The first team composed of Enzo MOLION and Léo VALETTE [UltraTeamMV](https://air.imag.fr/index.php/RICM4_2017_2018_-_UltraTeamMV) is in charge of creating a mobile application allowing the members of a team or a group of hikers to locate each other with different information such as walking speed, distance between users, the possibility to see if a user is in distress (e. g. if he has broken a leg), etc.

This application will use the LoRa network with ESP-32 cards, connected via Bluetooth to the team's smartphones to run.

The smartphones of the team, if they are connected to the 3G/4G network, will send through a REST API all the information accumulated during the hike to a server that our team composed of Bastien TERRIER and Hugo GROS-DAILLON will have to set up.

This server will be implemented with the JHipster application generator. It will be a web application allowing hikers to create an account and thanks to the information provided by the mobile application, to visualize the information of the current or completed hike (with the route taken during the hike, average speed, participating members, etc.).

It can also be used to visualize the position of hikers during a hike and display whether a person sent a distress signal with their smartphone. This can be useful in cases where rescue workers are trying to locate the injured person precisely.

## Team
-   Supervisor : [Didier DONSEZ](http://lig-membres.imag.fr/donsez/)

-   Members : Hugo GROS-DAILLON, Bastien TERRIER

-   Departement : [RICM 4](http://www.polytech-grenoble.fr/ricm.html), [Polytech Grenoble](https://air.imag.fr/index.php/Polytech_Grenoble "Polytech Grenoble")

# Run UltraTeam 7.1 Demo Application

* `./mvnw` in the current directory (root of the project)

## If it doesn't work, please install the following programs (BUT it should directly work)

1.  Install Java 8 from [the Oracle website](http://www.oracle.com/technetwork/java/javase/downloads/index.html).
2.  Install Node.js from [the Node.js website](http://nodejs.org/) 
3.  Install Yarn from [the Yarn website](https://yarnpkg.com/en/docs/install)
4.  Install Yeoman: `yarn global add yo`
5.  Install JHipster: `yarn global add generator-jhipster`
6.  Import the project from GitLab.

# Use UltraTeam 7.1 Demo Application

To see the main goal of our application we have made this special demo application. The only different repository is target/ ! Now the application contains data (when you add data: Hikes, Messages, Hikers), and this is automatically stored in target/ repository.

In order to see the hikes of a special user, we have made 2 users.
* Username : 'user1'  Password : '1234'
* Username : 'user2'  Password : '1234'

If you when to see the detail of all entities you can log in as admin :
* Username : 'admin'  Password : 'admin'




