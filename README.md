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



# Build and Run using Docker

## Install Docker Community Edition in your machine
check the version installed with 

    $ docker --version


# Kill running tomcat in port 8080

## MacOS
    
    $ netstat -vanp tcp | grep 3000

    results
    
    tcp46      0      0  *.8080                 *.*                    LISTEN      131072 131072  70010      0 0x0000 0x00000006

    $ kill 70010

## Windows

    $ netstat -nao | find str 8080
