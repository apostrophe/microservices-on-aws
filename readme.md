

### Simple API for MicroService Project ###

Running and calling this API:

1. Sign up for New York Times APIs
2. Create the file apikey, in the folder src/main/resources/
3. Add your API key (no quotes, no spaces--just the key) to the file apikey
4. From the Package Explorer view in Eclipse/STS: > right-click on project > Run As > Spring Boot App, or from the command line run:

		./mvnw spring-boot:run
		
5. From another command line, run one of the following:

````bash	
	# get all the current opinion pieces
	$ curl -X GET "http://localhost:8080/v1/articles/latest/opinion" | jq '.' | less
	
	# get all movies
	$ curl -X GET "http://localhost:8080/v1/articles/latest/movies" | jq '.' | less

	# science
	$ curl -X GET "http://localhost:8080/v1/articles/latest/science" | jq '.' | less
	
	# get just the titles 
	$ curl -X GET "http://localhost:8080/v1/articles/latest/opinion" | jq -r '.[].title'
````	

