# Binary Tree  - Lowest Common Ancestor MicroService

Artifact Microservice API REST with the following endpoints:

1. Create new binary tree, if you want to save it.
2. Given a binary tree and two nodes, return the lowest common ancestor

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/2009/08/BST_LCA.gif)

For example

```sh 
LCA of 10 and 14 is 12
LCA of 14 and 8 is 8
LCA of 10 and 22 is 20
```

Payload example

```sh
url: http://localhost:18080/binarytree/lca/10/14 
request body: { "data": 20, "left": { "data": 8, "left": { "data": 4 }, "right": { "data": 12, "left": 10, "right": 14 }}}
response: { "data": 12, "left": 10, "right": 14 }
```


# API Definitions 

https://app.swaggerhub.com/apis/cadolop/binarytree/1.0.0

It was development in Java 11 Spring Framework, H2 Database, and the release branch has the sources.

# Configuration

## Database Table in H2 src/main/resources/data.sql

Table name TREE_NODE files system

Column Name | Type | Nullable | Description
----------- | ---- | -------- | -----------
ID | BIGINT | NO | ID Autoincremental
DATA | INTEGER | NO | Values of Node
LEFT_ID | BIGINT | YES | Tree Node Left (FK)
RIGHT_ID | BIGINT | YES | Tree Node Right (FK)
