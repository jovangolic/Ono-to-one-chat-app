# Project One-to-one-chat-app
One On One Chat application with Spring boot & WebSocket

## Overview
One-to-one-chat-app is java web application that allows you to comumnicated with other users. It is websocket application. WebSocket is a communication protocol that enables two-way communication between client and server over a single, persistent TCP connection. Unlike classic HTTP, where communication takes place on the basis of requests and responses, WebSocket allows the server to send data to the client without the need for the client to send a request first.

## Notes
- Before you run application, first, you need to create database. In MySQL Workbench, type this: 
- DROP SCHEMA IF EXISTS chatapp_db;
- CREATE SCHEMA chatapp_db DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
- USE chat_db;
- When you run your application (e.g. Eclipse) in console you'll get random generated password which you need to copy out.
- After that, open browser, type localhost:8080, press enter;
- You'll get this window!
- [Screenshot 2024-08-28 at 14-03-38 Please sign in](https://github.com/user-attachments/assets/d35dc194-f1f4-4bb4-ac28-7dbc89b48e34)
- When you typed your given credentials you'll get this window 
-![Screenshot 2024-08-29 at 16-29-45 Chat Application](https://github.com/user-attachments/assets/e4914466-a631-4f8a-91ee-72fb7a4ae19d)
-After that, chat application will be shown 
-![Screenshot 2024-08-29 at 16-31-18 Chat Application](https://github.com/user-attachments/assets/a46fd3a9-9048-4972-b418-9766e92c6622)

## Table of Contents

- Features
- Installation
- Technologies

## Features
- One to one chat application
- Secure communication
- Persistent chat

## Installation
Provide step-by-step instructions on how to install and set up your project locally.

# Clone the repository
git clone https://github.com/jovangolic/Ono-to-one-chat-app

# Change into the project directory
cd your-project

# Build the project
./mvnw clean install

## Technologies
This project is mainly implement using the following technologies
- Websocket
- Spring Boot 3.x.x
- MySQL
- Javascript
- HTML
- CSS   

### Author
- Jovan Golic

# Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

# License

This project is licensed under the MIT License. See the LICENSE file for details.   

    


