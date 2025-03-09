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
- Difference between **JSP and Servlets**
- **Lifecycle of JSP** (`jspInit()`, `_jspService()`, `jspDestroy()`)
- Setting up JSP in **NetBeans & Tomcat**
- **JSP Processing** flow
  - `C:\Program Files\Apache Software Foundation\Tomcat10.1\work\Catalina\localhost\YourProject\org\apache\jsp\`

**Practical Example:** `src/main/webapp/JspOverviewExample.jsp`

### 2. JSP Implicit Objects
- **Built-in objects:** `request`, `response`, `session`, `application`, `out`, `config`, `pageContext`, `page`, `exception`

**Practical Example:** `src/main/webapp/JspImplicitObjectsExample.jsp`

### 3. JSP Scope & Directives
- **Request, Session, Application, Page Scope**
- **Directives: `page`, `include`, `taglib`**

**Practical Example:** `src/main/webapp/JspScopeExample.jsp`

### 4. JSP Actions
- `<jsp:include>` (Dynamic Inclusion)
- `<jsp:forward>` (Request Forwarding)
- `<jsp:useBean>`, `<jsp:setProperty>`, `<jsp:getProperty>` (JavaBean Interaction)

**Practical Example:** `src/main/webapp/JspActionsExample.jsp`

### 5. JSP MVC Architecture
- **Model**: JavaBeans (Handles Business Logic)
- **View**: JSP (Presentation Layer)
- **Controller**: Servlets (Request-Response Handling)

**Practical Example:**
- `src/main/java/beans/UserBean.java`
- `src/main/java/controllers/UserController.java`
- `src/main/webapp/userForm.jsp`
- `src/main/webapp/userDetails.jsp`

### 6. JSP Session Tracking
- **Using `HttpSession` for user sessions**
- **Using Cookies to store client-side data**

**Practical Example:**
- `src/main/webapp/JspSessionExample.jsp`
- `src/main/webapp/JspCookieExample.jsp`

### 7. JSP Standard Tag Library (JSTL)
- **Core Tags (`c:`)** – Loops, conditions, variables
- **Formatting Tags (`fmt:`)** – Date & currency formatting
- **Functions (`fn:`)** – String manipulations

**Practical Example:** `src/main/webapp/JstlCompleteExample.jsp`

### 8. JSP Custom Tags
- **Creating reusable JSP tags**
- **Defining in TLD (Tag Library Descriptor) files**

**Practical Example:**
- `src/main/java/customtags/CustomHelloTag.java`
- `src/main/webapp/WEB-INF/customtags.tld`
- `src/main/webapp/JspCustomTagExample.jsp`

### 9. JSP Exception Handling
- **Using try-catch inside JSP**
- **Defining error pages using `isErrorPage` and `errorPage` attributes**

**Practical Example:** `src/main/webapp/JspExceptionHandlingExample.jsp`

### 10. JSP XML Processing
- **Parsing XML Data in JSP using JSTL & DOM**

**Practical Example:** `src/main/webapp/JspXmlProcessingExample.jsp`

## Running the Project
1. **Set up Tomcat 10+** in **NetBeans**.
2. **Ensure required `.jar` files** are in `WEB-INF/lib`.
3. **Run the JSP files** from **NetBeans** (Right-click → Run).
4. **Access JSP pages** via `http://localhost:8080/your-project-name/yourfile.jsp`

## Conclusion
This guide covers **theory and practical implementation** of JSP, providing a structured approach for dynamic web development. With **JSTL, MVC, and Custom Tags**, JSP offers a **powerful and modular** solution for enterprise applications.

Happy Coding! 🚀