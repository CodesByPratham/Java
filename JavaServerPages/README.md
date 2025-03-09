# JSP (Java Server Pages) - Complete Guide

## Overview
Java Server Pages (JSP) is a technology used to create **dynamic web applications** in Java. JSP simplifies the development process by allowing Java code to be embedded within HTML. This guide covers **theoretical concepts** and **practical examples** based on the provided PDF.

## Prerequisites
Ensure you have the following tools and dependencies installed:

- **NetBeans IDE** (or any Java-supporting IDE)
- **Apache Tomcat 10 or higher** (Servlet container to run JSP)
- **JSTL (JavaServer Pages Standard Tag Library)**
  - [jakarta.servlet.jsp.jstl-2.0.0.jar](https://repo1.maven.org/maven2/org/glassfish/web/jakarta.servlet.jsp.jstl/2.0.0/jakarta.servlet.jsp.jstl-2.0.0.jar)
  - [jakarta.servlet.jsp.jstl-api-3.0.2.jar](https://repo1.maven.org/maven2/jakarta/servlet/jsp/jstl/jakarta.servlet.jsp.jstl-api/3.0.2/jakarta.servlet.jsp.jstl-api-3.0.2.jar)

## Topics Covered
This guide includes both **theoretical explanations** and **practical implementations** (stored in project directories).

### 1. JSP Overview
JSP allows embedding Java code into HTML, making it easy to develop dynamic web pages. It provides built-in objects and supports reusable components through tag libraries.

**Practical Example:** `src/main/webapp/JspOverviewExample.jsp`

### 2. Life Cycle of JSP
JSP follows a **five-phase lifecycle**:
1. **Translation Phase:** The JSP file is converted into a servlet.
2. **Compilation Phase:** The servlet is compiled into a Java class.
3. **Class Loading Phase:** The servlet class is loaded into memory.
4. **Execution Phase:** The `_jspService()` method processes requests.
5. **Destruction Phase:** The `jspDestroy()` method is called when the page is removed from memory.

**Practical Example:** [/jspLifeCycle.jsp](web/jspLifeCycle.jsp)

### 3. JSP Implicit Objects
JSP provides **9 built-in objects** that can be used without declaration:
- `request` – Handles client requests.
- `response` – Sends responses to the client.
- `session` – Stores user-specific data.
- `application` – Shares data across the application.
- `out` – Outputs dynamic content.
- `config` – Provides servlet configuration.
- `pageContext` – Manages page attributes.
- `page` – Represents the JSP instance.
- `exception` – Handles exceptions in error pages.

**Practical Example:** [/jspImplicitObjects.jsp](web/jspImplicitObjects.jsp)

### 4. JSP Scope & Directives
JSP provides **four scopes** to store data:
- **Page Scope:** Available only within the JSP page.
- **Request Scope:** Available during a single request-response cycle.
- **Session Scope:** Available throughout the user session.
- **Application Scope:** Available across the entire web application.

JSP Directives:
- `<%@ page %>` – Defines JSP settings like language, session management, and error pages.
- `<%@ include %>` – Includes static content.
- `<%@ taglib %>` – Registers custom tag libraries.

**Practical Example:** [/jspScope.jsp](web/jspScope.jsp)

### 5. JSP Actions
JSP provides **action tags** for dynamic operations:
- `<jsp:include>` – Includes another JSP dynamically.
- `<jsp:forward>` – Redirects the request to another JSP.
- `<jsp:useBean>` – Creates or retrieves a JavaBean.
- `<jsp:setProperty>` – Sets properties in a JavaBean.
- `<jsp:getProperty>` – Retrieves properties from a JavaBean.

**Practical Example:** [/jspActions.jsp](web/jspActions.jsp)

### 6. JSP Session Tracking
Session tracking allows **maintaining user-specific data** across multiple requests:
- **HttpSession:** Stores session data on the server.
- **Cookies:** Stores small amounts of data on the client’s browser.

**Practical Example:**
- [/jspSession.jsp](web/jspSession.jsp)
- [/jspCookie.jsp](web/jspCookie.jsp)

### 7. JSP Standard Tag Library (JSTL)
JSTL provides a set of standard tags to avoid scriptlet code:
- **Core Tags (`c:`)** – Loops, conditions, variables.
- **Formatting Tags (`fmt:`)** – Date & currency formatting.
- **Functions (`fn:`)** – String manipulations.

**Practical Example:** [/jspTagLib.jsp](web/jspTagLib.jsp)

### 8. JSP Custom Tags
Custom tags allow creating **reusable components** for JSP pages.
- Defined using **Tag Handler Classes**.
- Registered via **TLD (Tag Library Descriptor) files**.

**Practical Example:**
- [/CustomHelloTag.java](/src/java/beans/CustomHelloTag.java)
- [/customtags.tld](/web/WEB-INF/tlds/customtags.tld)
- [/jspCustomTag.jsp](web/jspCustomTag.jsp)

### 9. JSP Exception Handling
Exception handling in JSP:
- Using **try-catch** blocks inside JSP.
- Redirecting to **custom error pages** using `isErrorPage` and `errorPage` attributes.

**Practical Example:** [/jspImplicitObjects.jsp](web/jspImplicitObjects.jsp)

### 10. JSP XML Processing
JSP supports XML data processing using **JSTL and DOM parsing**.

**Practical Example:** [/jspTagLib.jsp](web/jspTagLib.jsp)

## Running the Project
1. **Set up Tomcat 10+** in **NetBeans**.
2. **Ensure required `.jar` files** are in `WEB-INF/lib`.
3. **Run the JSP files** from **NetBeans** (Right-click → Run).
4. **Access JSP pages** via `http://localhost:8080/JavaServerPages/yourfile.jsp`

This README.md provides a brief overview of the key concepts within the Java Server Pages. For more detailed information and examples, refer to the respective Java documentation or explore the source code provided in this repository.
