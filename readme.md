# Conceitos do Spring Boot

Neste documento, vamos explorar alguns conceitos fundamentais do Spring Boot:

## DTO (Data Transfer Object)

Um DTO é um objeto usado para transferir dados entre sistemas de aplicativos. Ele geralmente contém apenas campos de dados e não contém lógica de negócios. DTOs são úteis para separar as camadas de uma aplicação e para evitar o acoplamento entre os objetos de domínio e os objetos usados para transferir dados entre as camadas.

## Record

`Record` é uma nova feature do Java introduzida na versão 14. É uma maneira concisa de criar classes de dados imutáveis. Um `record` é uma classe de dados imutável que define automaticamente os métodos `equals()`, `hashCode()`, `toString()`, entre outros, com base nos campos definidos no record. Os records são úteis para representar dados imutáveis, como DTOs.

## Domain

O domínio representa as entidades de negócio e a lógica de negócio da aplicação. No contexto do Spring Boot, as classes de domínio são frequentemente usadas para modelar entidades que representam os principais conceitos de negócio da aplicação. Por exemplo, em um sistema de gerenciamento de pedidos, as classes de domínio podem incluir `Order`, `Product`, `Customer`, etc.

## Repository

O padrão Repository é uma maneira de abstrair o acesso a dados em uma aplicação. No Spring Boot, um repositório geralmente é uma interface que estende `JpaRepository` ou uma de suas variantes. Essas interfaces fornecem métodos para realizar operações comuns de persistência de dados, como salvar, buscar, atualizar e excluir registros em um banco de dados. Os repositórios são responsáveis por lidar com a persistência e a recuperação de objetos de domínio.

## Service

Em uma aplicação Spring Boot, os serviços (ou camada de serviço) contêm a lógica de negócio da aplicação. Eles são responsáveis por coordenar as operações entre os objetos de domínio e os objetos de acesso a dados (como repositórios). Os serviços geralmente encapsulam a lógica de negócio complexa e podem ser injetados em outros componentes, como controladores, para serem utilizados na implementação dos requisitos de negócio.

Esses conceitos são parte fundamental da arquitetura de uma aplicação Spring Boot e são frequentemente usados juntos para criar aplicativos robustos e modularizados.
