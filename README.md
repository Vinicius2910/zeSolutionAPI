# Zé Challenge solution
An application with Spring Boot

Instructions to run the project:

- Do download for your own machine.

- Open your prefer IDEA and import the project;
# IntelliJ Config for Lombok
- Enable annotation processing in:
  Settings -> Compiler -> Annotation Processors

- Install Lombok plugin and rebuild project
- Run the class "MySolutionApplication"

## Input Examples:
(Copy and past the String below in the browser)
- create: (https://localhost:8080/pvds) (POST)  <br>
{
        "id": 3, 
        "tradingName": "Adega da Cerveja - Pinheiros",
        "ownerName": "Zé da Silva",
        "document": "1432132123891/0001",
        "coverageArea": { 
          "type": "MultiPolygon", 
          "coordinates": [
            [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
            [[[15, 5], [40, 10], [10, 20], [5, 10], [10, 5]]]
          ]
        },
        "address": { 
          "type": "Point", 
          "coordinates": [-46.57425, -21.785741]
        }
}

- List ALL : https://localhost:8080/pvds (GET) 

- Get by id : https://localhost:8080/pvds/3 (GET)  

## Technologies used in the project:

- Java <br>
- Spring Boot/ Spring DevTools/ Spring Data JPA <br>
- Hibernate <br>
- Lombok <br>
- H2 DB <br>
