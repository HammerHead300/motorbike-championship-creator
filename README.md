# motorbike championship creator
Backend for creating a visual database for custom motorbike championships

## Initial setup
This app requires for an actual database system to create the database so the app can create the different tables on it.

Once you have PostgreSQL installed run pgAdmin 4 and create a database named bikesimdb, you can also create it via console if you prefer.

Having this created you can go to the app, open application.properties in src/main/resources and change "YourPassword" for your actual password for postgreSQL.

Running the program now for the first time it should create the tables for the database, now you can add data to them using external apps like postman, with any database management system like dbeaver or with an Angular visual app now in development to make the management more simple (the link for this app will be posted on this page).

# Fields
Right now the app has 3 different tables, Teams, Drivers and Tracks. All the tables have their own id field

## Team
For the team there are 5 different fields:

Name: The name of the team you are creating.

SlowCornerProficiency: The speed the bike has on slow corners (values go from 1 to 10 having decimals).

FastCornerProficiency: The speed the bike has on fast corners (Values from 1 to 10 with decimals).

LongStraightProficiency: Speed on long straights similar to the max speed the bike can go (values from 1 to 10 with decimals).

ShortStraightProficiency: Speed on short straights similar to acceleration of the bike (values from 1 to 10 with decimals).

## Drivers
For the drivers there are 9 different fields: 

Name: The name of the driver in creation.

ShortName: The acronim for the driver (Length of 4 characters).

Number: number of the driver(preffered from 1 to 3 digits).

TeamId: field that makes the relation with the team of the driver.

QualifyingPace: the ability the driver has on qualifying sessions (values from 0.5 to 1.5 with decimals).

RacePace: the ability the driver has on race sessions (values from 0.5 to 1.5 with decimals).

ChampionshipPoints: Points the driver has on the championship.

ChampionshipPosition: Position of the driver in the championship.

CrashProbability: Probability of the driver on crashing on a session (values from 0.1 to 1.0).

## Tracks
For the tracks there are 4 fields: 

Name: name of the track.

SlowCorners: number of slow corners on track.

FastCorners: number of fast corners on track.

LongStraights: number of long straights on track.

ShortStraights: number of short straigths on track.
