# spring_cloud_netflix_proxy_microsservices

## Pré requisito
* Gradle 5
* Java 8

## Preparando ambiente
### Com plugin do eclipse
* ```cd spring_cloud_netflix_proxy_microsservices```
* ```gradle clean cleanEclipse```
* ```gradle eclipse```

### Sem Plugin do eclipse
* ```cd spring_cloud_netflix_proxy_microsservices```
* ```gradle clean build```

## Executando
Service Discovery (Eureka) e Proxy
* ``` cd spring_cloud_netflix_proxy_microsservices ```
* ``` gradle :gateway:bootRun ```

APi do Clientes
* ``` cd spring_cloud_netflix_proxy_microsservices ```
* ``` gradle :clientes:bootRun ```

APi do Produtos
* ``` cd spring_cloud_netflix_proxy_microsservices ```
* ``` gradle :produtos:bootRun ```

## Endereços
### Diretamente
* [Todos Clientes] - http://localhost:8060/v1/clientes
* [Todos Produtos] - http://localhost:8070/v1/produtos

### Via Proxy (Zuul)
* [Dashboard Eureka] - http://localhost:8080/
* [API Todos Clientes] - http://localhost:8080/api/clientes/v1/clientes
* [API Todos Produtos] - http://localhost:8080//api/produtos/v1/produtos
