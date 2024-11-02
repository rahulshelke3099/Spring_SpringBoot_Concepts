package learn.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.web.ServerProperties;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * A Java Servlet is a Java class used to extend the capabilities of a server, typically a web server.
 * It handles requests from clients (typically web browsers) and generates responses,
 * typically in the form of HTML or other web content.
 *
 * Servlets are the building blocks of Java-based web applications
 * and are part of the Java EE (Enterprise Edition) platform.
 *
 * Key Concepts of Java Servlets
 * HTTP Protocol Handling: Servlets are primarily used to handle HTTP requests and responses,
 * making them crucial in web applications. They can handle different HTTP methods such as:
 *
 * GET (retrieve data)
 * POST (submit data)
 * PUT, DELETE, etc.
 *
 *
 * Servlet Lifecycle: A servlet’s lifecycle is managed by the servlet container (e.g., Tomcat, Jetty),
 * and it consists of the following phases:
 *
 * Initialization (init): When a servlet is first loaded, its init() method is called by the server
 * to perform any startup configurations. This happens only once in the servlet’s lifetime.
 *
 * Request Handling (service): The service() method is invoked for every request the servlet receives.
 * This method determines whether the request is a GET, POST, or another HTTP method and dispatches
 * it to the appropriate handler (doGet(), doPost(), etc.).
 *
 * Destruction (destroy): When the servlet is taken out of service, the destroy() method is called to
 * perform any cleanup operations, like closing resources or connections.
 *
 * Servlet Methods:
 *
 * doGet(): Handles HTTP GET requests (e.g., when a user accesses a webpage via a browser).
 * doPost(): Handles HTTP POST requests (e.g., when a user submits a form).
 * doPut(), doDelete(), etc.: Other HTTP methods for different types of requests.
 * Servlet Container: A servlet container (or servlet engine) is part of a web server that interacts with servlets. Popular servlet containers include Apache Tomcat, Jetty, WildFly, and GlassFish. The container manages the servlet’s lifecycle, handles requests and responses, and ensures that the servlet adheres to the defined lifecycle.
 *
 * Request and Response Objects: When a servlet receives a request, it’s passed an HttpServletRequest
 * object, and it responds using an HttpServletResponse object. These objects allow the servlet to:
 *
 * Read request parameters (form inputs, query strings, etc.)
 * Write response content (HTML, JSON, XML, etc.)
 * Set headers, cookies, and status codes.
 * Servlet API: The Java Servlet API provides the classes and interfaces needed to build servlets.
 * Key classes/interfaces include:
 *
 * HttpServletRequest: Represents the client's request (headers, parameters, etc.).
 * HttpServletResponse: Represents the server's response (content type, status, output stream, etc.).
 * ServletConfig: Provides servlet configuration information (e.g., initialization parameters).
 * ServletContext: Allows servlets to interact with the web application's environment and
 * share data between servlets.
 */

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(" In Service");
        response.setContentType("text/html");
       PrintWriter out =  response.getWriter();
       out.println("<h2><b>Hello world</b></h2>");
    }
}
