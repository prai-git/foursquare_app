# foursquare_app

## Swagger API:
- `https://app.swaggerhub.com/apis-docs/prai-git/LFinder/1.0.0#/default/get_api_v1_locatoins_explore`

## Git Repo:

- `git clone https://github.com/prai-git/foursquare_app.git`
- `cd foursquare_app` 

## Setup Java Instructions
- `cd location_finder_service`
- `mvn clean install`
- `java -jar target/lFinder-0.0.1-SNAPSHOT.jar`

Browse below URL, It will load the locations info. 
http://localhost:8080/api/v1/locatoins/explore/?query=food&near=Sydney&limit=10


## Setup UI Instructions
- `cd reactApp` 
- `npm install`
- `npm start`

A Live Preview will opens via `http://localhost:3000/` by your default browser!
