# Recipe
## Server App
### Prerequisite
```
% java -version
openjdk version "9.0.4"
OpenJDK Runtime Environment (build 9.0.4+11)
OpenJDK 64-Bit Server VM (build 9.0.4+11, mixed mode)
```

### Spring Boot
- [Build with Spring Initializr](https://start.spring.io/)
    - Gradle Project
        - my favorite task runner
    - With Java
        - Team familiar
    - 2.0.2
        - Stable newest
    - Plugins
        - DevTools
            - for like hot deploy
        - Jersey(JAX-RS) 
            - lightweight API
        - Web
        - PostgreSQL
            - familiar with heroku
        - Flyway
            - simple db migration
        - JOOQ
            - lightweight type safe query RDB 
## Client APP
### Prerequisite
```
% npm -v
5.6.0

% yarn -version
1.7.0
```

### Operations
```concept
% yarn add vue axios
% yarn add webpack webpack-cli babel-core babel-loader vue-loader vue-template-compiler --dev

```
            
## build Heroku app/Heroku PostgreSQL
ref. [Heroku Dev Center](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku)            


# Operations
## Dev and Local Run
## Build
## DB Migration
TBD

# Reference
- [Spring Boot and vue dev env](https://backpaper0.github.io/ghosts/spring-boot-doma-vue)
- [Webpack4](https://qiita.com/soarflat/items/28bf799f7e0335b68186)