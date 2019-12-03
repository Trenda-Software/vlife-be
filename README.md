# LOCAL setup
luego de clonar el repo, correr

    $ mvn spring-boot:run

testear la API

    http://localhost:8080/

# API endpoints

## Usuarios
    GET http://localhost:8080/usuarios -> list all
    GET http://localhost:8080/usuarios/{id} -> get one
    POST http://localhost:8080/usuarios/ -> creates one
    UPDATE http://localhost:8080/usuarios/{id} -> updates one
    DELETE http://localhost:8080/usuarios/{id} -> delete one

