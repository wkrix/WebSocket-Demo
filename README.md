# WebSocket-Demo
It's a Spring Boot WebSocket application. Working with Spring’s low-level WebSocket API.

Summary
-------
It's a simple application to demonstrate how to use Spring Boot with WebSocket. 
Using pure javascript for WebSocket client. (no SockJS)


Installation
------------

To install the archetype in your local repository execute following commands:

```bash
    git clone https://github.com/wkrix/WebSocket-Demo.git
    cd WebSocket-Demo
    mvn clean install
```

Run the project
----------------

```bash
	java -jar target/websocket-demo.war
	
	(It will run on the embedded tomcat, but you could easily deploy on your favorite web container too)
```

Test on the browser
-------------------

	http://localhost:8080/
	
	Check the Firebug Console and the Server log.
