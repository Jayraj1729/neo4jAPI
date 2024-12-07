# Neo4j API Project

A Spring Boot application that fetches list of users from google workspace/entra id/ AWS identity and ingest into neo4j 
## Features
- User management with Neo4j.
- Dockerized setup with `docker-compose`.
- Secure environment configuration.

## Prerequisites
- [Docker](https://www.docker.com/) installed.

## Quick Start

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/neo4jAPI.git
   cd neo4jAPI
2. Set credentials:
   ```bash
   cp sample.env .env
   # Edit .env with your credentials
3. Deploy with Docker Compose:
   ```bash
   docker-compose up --build
## Access the app:

- Neo4j Browser: http://localhost:7474
- App: http://localhost:8080