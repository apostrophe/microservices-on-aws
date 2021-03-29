

Running and calling this API

	- add API key to file src/main/resources/apikey
	- from eclipse: Package Explorer > right-click on project > Run As > Spring Boot App
	- from command line, run one of the following:
	
	# get all the current opinion pieces
	$ curl -X GET "http://localhost:8080/v1/articles/latest/opinion" | jq '.' | less
	
	# get all movies
	$ curl -X GET "http://localhost:8080/v1/articles/latest/movies" | jq '.' | less

	# science
	$ curl -X GET "http://localhost:8080/v1/articles/latest/science" | jq '.' | less
	
	# get just the titles 
	$ curl -X GET "http://localhost:8080/v1/articles/latest/opinion" | jq -r '.[].title'
	

API Call to New York Times API: see postman collection in this project

