# Java Servlets

## Overview
Java Servlets are server-side components that run inside a web server and respond to client requests. Servlets are used for creating dynamic web applications in Java by processing and generating content typically in the form of HTML or JSON.

This guide is a comprehensive explanation of the concepts covered in the Java Servlet PDF. It covers theory and implementation topics for understanding and building Java web applications using Servlets.

---

## Prerequisites
- **JDK (Java Development Kit)**
- **Apache Tomcat or any servlet container**
- **NetBeans/IntelliJ IDE**
- Basic knowledge of HTML and Java

---

## Topics Covered

### 1. Servlet Overview
- Servlets are Java programs that run on a web server.
- They handle requests from clients and generate dynamic responses (usually HTML).
- They operate on the server-side.

### 2. HTTP Request & Response
- **Request Line, Headers, Body**: Used to carry client info (GET/POST parameters).
- **Response Line, Headers, Body**: Used by server to send data.
- GET is used for fetching, POST for submitting data.

### 3. Servlet Lifecycle
- **Loading**: Servlet class is loaded by the container.
- **Instantiation**: Container creates an instance of the Servlet.
- **Initialization (`init()`)**: Called once for initialization logic.
- **Request Handling (`service()` / `doGet()` / `doPost()`)**: Called for each client request.
- **Destruction (`destroy()`)**: Called once when servlet is taken out of service.

### 4. Deployment Descriptor (`web.xml`)
- Defines servlet classes, URL mappings, initialization parameters.
- Supports configuration without changing servlet code.

### 5. Servlet Interfaces and Classes
- **Servlet**, **ServletRequest**, **ServletResponse**
- **HttpServlet**, **GenericServlet**
- **ServletConfig**: Provides init params for a servlet.
- **ServletContext**: Application-wide parameters shared among servlets.

### 6. ServletConfig vs ServletContext
| ServletConfig | ServletContext |
|---------------|----------------|
| Per servlet instance | Shared across all servlets |
| Defined inside `<servlet>` tag | Defined inside `<context-param>` |
| Limited scope | Application-wide scope |

### 7. Attributes in Servlet
- Store shared data using `setAttribute()` and retrieve using `getAttribute()`.
- **Scopes**:
  - **Request Scope**: Lives for one request-response cycle.
  - **Session Scope**: Lives as long as the user's session is active.
  - **Application Scope**: Lives as long as the web app is running.

### 8. RequestDispatcher Interface
- Used to **forward** or **include** other resources.
- `forward(request, response)`: Pass control to another resource (same request).
- `include(request, response)`: Include response of another resource in current response.

### 9. Response Redirection
- `response.sendRedirect("url")`: Redirects the client to another resource (new request).
- **Comparison with forward():**
  - Forward is server-side; sendRedirect is client-side.
  - Forward keeps request data; sendRedirect does not.

### 10. Filter API
- Filters can **modify requests/responses**, perform **logging, security checks**, etc.
- Lifecycle Methods:
  - `init(FilterConfig config)`
  - `doFilter(request, response, chain)`
  - `destroy()`
- Configured using `<filter>` tag in `web.xml`.

### 11. Session Tracking Techniques
HTTP is stateless, so these techniques are used to maintain user state across requests:

#### a) Hidden Form Fields
- Hidden input fields carry data to next servlet via forms.
- Works even if cookies are disabled.
- Example: `<input type='hidden' name='userid' value='123'>`

#### b) URL Rewriting
- Adds parameters in URL like: `nextServlet?userid=123`
- Suitable when forms are not required.
- Works without cookies.

#### c) HttpSession
- Server creates session object per user.
- Store/retrieve data via `setAttribute()` and `getAttribute()`.
- Use `HttpSession session = request.getSession();`

#### d) Cookies
- Small pieces of data stored on the client browser.
- Created via `new Cookie(name, value)` and added to response.
- Retrieved using `request.getCookies()`.

### 12. CRUD Example
- Create servlet-based forms and handlers to:
  - Add Student
  - Update Student
  - Delete Student
  - Display Student Data

---

## Practical Demos (Sample Projects)
You can build applications covering:
- Form data submission using GET/POST
- Session & cookie management
- Inter-servlet communication via RequestDispatcher
- Filter-based authentication

---

## Running the Project
1. Configure **Tomcat** in your IDE (e.g., NetBeans, IntelliJ).
2. Place servlet files under `src/java` and HTML under `web/`.
3. Update `web.xml` with servlet and filter mappings.
4. Run using: `http://localhost:8080/YourProjectName/ServletName`

---

## References
- [Servlet API Docs](https://docs.oracle.com/javaee/7/api/javax/servlet/package-summary.html)
- [Java EE Tutorials](https://docs.oracle.com/javaee/7/tutorial/servlets.htm)

---

This README provides a complete theoretical and practical overview of **Java Servlets**, ideal for learners and developers building web apps using Java EE.