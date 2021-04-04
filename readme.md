

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

`jq` is a command-line json formatter ([installation instructions](https://stedolan.github.io/jq/download/)) 


### Deployment to AWS EC2 Instance Using a CloudFormation Template ###

- Build this project using maven
	- $ mvn clean package

- Copy the jar to an s3 bucket
	- $ aws s3 cp target/spring-main-api-0.0.1-SNAPSHOT.jar s3://microservices-on-aws/
	
- CloudFormation template is stored at artifacts/cloudformation/cf-template.yaml
- It creates an EC2 instance, security group, and instance profile.
- Userdata installs java, copies the jar from s3, and runs it.

- Creating the stack from the cf template:
````bash
	$ aws cloudformation create-stack \
		--stack-name spring-main-api \
		--template-body file://`pwd`/artifacts/cloudformation/cf-template.yaml \
		--parameters \
		ParameterKey=InstanceType,ParameterValue=t3.small \
		ParameterKey=KeyName,ParameterValue=key-pair00 \
		ParameterKey=LatestAmiId,ParameterValue=/aws/service/ami-amazon-linux-latest/amzn2-ami-hvm-x86_64-gp2\
		ParameterKey=SSHLocation,ParameterValue=0.0.0.0/0 --capabilities CAPABILITY_IAM

	$ aws cloudformation delete-stack --stack-name spring-main-api

	$ aws cloudformation validate-template --template-body file://`pwd`/artifacts/cloudformation/cf-template.yaml

````



