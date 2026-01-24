# 🍃 Scala 3 + Spring Boot 4 Minimal Starter

A minimalist, high-performance boilerplate demonstrating the synergy between **Spring Boot 4** and **Scala 3**. This project showcases how to build a clean REST API using **Spring MVC** for web routing and **Spring Data JDBC** for lightweight, boilerplate-free persistence.

## 🚀 Tech Stack

* **Language:** [Scala 3](https://www.scala-lang.org/)
* **Framework:** [Spring Boot 4](https://spring.io/projects/spring-boot)
* **Web Layer:** Spring MVC
* **Data Layer:** Spring Data JDBC
* **Build Tool:** [Maven](https://maven.apache.org/) (via `scala-maven-plugin`)

---

## 🏗️ Key Features

* **Scala 3 Syntax:** Clean, indentation-based code leveraging the latest language features.
* **Immutable Models:** Uses Scala `case classes` for domain entities, ensuring thread safety and clarity.
* **Maven Integration:** Standard dependency management via `pom.xml`, making it easy to integrate into common CI/CD pipelines.
* **Lightweight Persistence:** Spring Data JDBC provides a simple "one-to-one" mapping between objects and tables, avoiding the complexity of full ORMs like Hibernate.
* **Modern Entry Point:** Concise application bootstrapping using the Scala 3 `@main` annotation.