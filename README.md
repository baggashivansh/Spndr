# Spndr

A personal expense tracking backend built with **Java and Spring Boot**.

Spndr is designed to provide a simple backend system for recording and managing daily expenses. The application exposes REST APIs that allow users to store expenses, organize them, and retrieve spending data in a structured way.

Many people track their spending through scattered notes, spreadsheets, or basic mobile apps. The purpose of Spndr is to demonstrate how a backend service can handle financial records through a clean API based architecture.

This project focuses on building the **backend foundation of an expense tracking system** rather than a full user interface. Any frontend application, mobile app, or dashboard could connect to this API to display and manage spending data.

---

# Live Backend

You can access the deployed backend here

https://spndr.onrender.com

If the service is inactive, the first request may take a few seconds while the server wakes up because it runs on a free hosting tier.

---

# What Spndr Provides

Spndr acts as the backend engine for an expense tracking system.

It provides:

A structured API for recording expenses
A backend service for retrieving spending history
A data storage layer for financial records
A modular backend architecture built with Spring Boot

The system allows a client application to interact with expense data through simple HTTP requests.

A frontend application, mobile app, or dashboard could use these APIs to display user expenses and analyze spending habits.

---

# Key Features

Create and store expense records

Retrieve stored expenses

Organize expenses by category

REST based backend architecture

Automatic database table creation using JPA

Simple development setup using H2 in memory database

Container ready deployment using Docker

---

# Technology Stack

Backend
Java 21
Spring Boot
Spring Data JPA
Spring Security

Database
H2 In Memory Database

Build Tool
Maven

Deployment
Docker
Render Cloud Platform

---

# System Architecture

Spndr follows a layered backend architecture where each layer has a clear responsibility.

Controller Layer
Handles incoming HTTP requests and exposes REST endpoints.

Service Layer
Contains the business logic responsible for processing expense related operations.

Repository Layer
Manages database communication using Spring Data JPA.

Database Layer
Stores expense records using an H2 in memory database.

This structure keeps the code organized and makes the system easier to maintain and extend.

---

# How Expense Tracking Works in Spndr

Expense tracking applications generally work by storing financial entries and retrieving them when needed.

The workflow inside Spndr is straightforward.

1 A client application sends a request to create a new expense.

2 The request reaches the controller which forwards it to the service layer.

3 The service layer validates and processes the expense data.

4 The expense is stored in the database using the repository layer.

5 The backend returns a structured JSON response to the client.

When a client requests expense history, the backend retrieves the stored records and sends them back in the response.

This process allows any application connected to the API to view or manage spending data.

---

# Running the Project Locally

## Clone the repository

git clone https://github.com/baggashivansh/spndr.git

cd spndr

---

## Build the project

mvn clean install

This command compiles the code and builds the application.

---

## Run the application

mvn spring-boot:run

Once the server starts, the backend will be available at

http://localhost:8080

---

# Accessing the Database

Spndr uses an **H2 in memory database** for development simplicity.

You can inspect the database using the built in H2 console.

Open the following URL in your browser

http://localhost:8080/h2-console

Use the following configuration

JDBC URL
jdbc:h2:mem:spndrdb

Username
sa

Password
leave empty

Since the database runs in memory, all stored data will reset whenever the application restarts.

---

# Example API Endpoints

Create Expense
POST /expenses

Retrieve All Expenses
GET /expenses

Register User
POST /auth/register

Login User
POST /auth/login

These endpoints allow external applications to interact with the backend.

---

# Deployment

Spndr is containerized using Docker and deployed on the Render cloud platform.

Live backend

https://spndr.onrender.com

The deployment uses the free tier of Render, which means the service may sleep when inactive. The first request after inactivity may take a few seconds.

---

# Author

Built by **Shivansh Bagga**

