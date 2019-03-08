# spring_cloud_netflix_proxy_microsservices
## Diagrama
![alt text](https://github.com/willyms/spring_cloud_netflix_proxy_microsservices/blob/master/diagram.png)

## Pré requisito
* Gradle 5
* Java 8

## Preparando ambiente
### Com plugin do eclipse
* ```cd spring_cloud_netflix_proxy_microsservices```
* Projeto Gateway
  * ```gradle :gateway:clean```
  * ```gradle :gateway:cleanEclipse```
  * ```gradle :gateway:eclipse```

* Projeto Clientes
  * ```gradle :clientes:clean```
  * ```gradle :clientes:cleanEclipse```
  * ```gradle :clientes:eclipse```

* Projeto Produtos
  * ```gradle :produtos:clean```
  * ```gradle :produtos:cleanEclipse```
  * ```gradle :produtos:eclipse```

### Sem Plugin do eclipse
* ```cd spring_cloud_netflix_proxy_microsservices```
* Projeto Gateway
  * ```gradle :gateway:clean```
  * ```gradle :gateway:build```

* Projeto Clientes
  * ```gradle :clientes:clean```
  * ```gradle :clientes:build```

* Projeto Produtos
  * ```gradle :produtos:clean```
  * ```gradle :produtos:build```
  
## Verificar os projetos 
* ```cd spring_cloud_netflix_proxy_microsservices```
* ```cd gradle -q project```
###### Saída
```------------------------------------------------------------
Root project
------------------------------------------------------------

Root project 'spring_cloud_netflix_proxy_microsservices'
+--- Project ':clientes'
+--- Project ':gateway'
\--- Project ':produtos'
```

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
