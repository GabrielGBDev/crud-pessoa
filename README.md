CRUD de Pessoas com Spring Boot

Este projeto é um CRUD de Pessoas utilizando Spring Boot, Java SDK 23 e banco de dados relacional.

Tecnologias Utilizadas
Java SDK 23
Spring Boot
Spring Data JPA
Banco de dados relacional (H2)

Endpoints da API

PESSOA
Criar uma nova pessoa
POST /pessoas

{
"nome": "João Silva",
"dataNascimento": "1990-05-20",
"cpf": "123.456.789-00",
"enderecos": [
{
"rua": "Rua A",
"numero": 100,
"bairro": "Centro",
"cidade": "São Paulo",
"estado": "SP",
"cep": "01010-000"
}
]
}

Listar todas as pessoas
GET /pessoas

Atualizar uma pessoa
PUT /pessoas/{id}

{
"nome": "João Silva Atualizado",
"dataNascimento": "1990-05-20",
"cpf": "123.456.789-00",
"enderecos": [
{
"rua": "Rua B",
"numero": 200,
"bairro": "Jardins",
"cidade": "São Paulo",
"estado": "SP",
"cep": "01110-000"
}
]
}

Excluir uma pessoa
DELETE /pessoas/{id}

ENDERECO

Criar um novo endereço
POST /enderecos

{
"rua": "Rua C",
"numero": 300,
"bairro": "Vila Mariana",
"cidade": "São Paulo",
"estado": "SP",
"cep": "01234-567"
}

Configuração do Banco de Dados

No arquivo application.properties configure o banco de dados:

//Banco de dados H2 (em memória)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

//Habilita o console do H2 para acessar o banco via web
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

//DDL auto-criação do banco (cria as tabelas automaticamente)
spring.jpa.hibernate.ddl-auto=update

//Desabilitar logging detalhado do Hibernate
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

//Usar H2 com modo de desenvolvimento
spring.datasource.platform=h2

Como Rodar o Projeto

Clone este repositório
git clone https://github.com/seu-usuario/crud-pessoas.git
Acesse a pasta do projeto
Compile e execute o projeto (Application.java)
Agora a API estará rodando em http://localhost:8080

Desenvolvido por: Gabriel Luis Blank
