# Fake Store API

## Installation

## Project Structure

There is 4 Folders in the project

1. Controllers
2. dtos
3. Models
4. Services

### Controllers
This folder contains all the controllers of the project. Each controller is responsible for handling the requests and responses of the API.

### dtos
This folder contains all the Data Transfer Objects of the project. Each DTO is responsible for transferring data between the API and the database.

### Models
This folder contains all the models of the project. Each model is responsible for representing a table in the database.

### Services

This folder contains all the services of the project. Each service is responsible for handling the business logic of the API.

## API Endpoints

### Carts

#### Get all carts
```
GET /api/carts/all
```
This api endpoint will return all the carts in the database.

#### Get cart by id
```
GET /api/carts/:id
```
This api endpoint will return a cart by its id.


#### Create a new cart
```
POST /api/carts
```

This api endpoint will create a new product in cart.
#### Update a cart
```
PUT /api/carts/:id
```
#### Get Limited Cart Items
```
GET /api/carts/limited?limit={enter your count here}
```

#### Delete a cart
```
DELETE /api/carts/:id
```



#### Get Cart Items in a Date Range
```
GET /api/carts/dateRange?startDate={start date}&endDate={end date}
```

This will return a list of Cart Items in provided date range 

Date need to be in this format :- 2019-12-10
#### Get Sorted Cart Items
```
GET /api/carts/sorted?sort={enter your sort type here}
```
Types can be asec or desc

#### Get User Cart Items
```
GET /api/carts/user/:userId
```
This will return a list of Cart Items of provided user id

#BY: - DAKSH JAIN