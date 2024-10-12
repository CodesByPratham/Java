Here's the updated README file with instructions for adding the JAR file to the lib folder:

# JDBC Concepts and Programming

This project focuses on **JDBC (Java Database Connectivity)**, which provides a standard API for interacting with relational databases using Java. It covers key concepts, architecture, types of JDBC drivers, and practical implementation examples. Below is an overview of the key concepts discussed.

## Introduction to JDBC
JDBC is an API that allows Java applications to connect and interact with databases. It enables querying, updating, and managing data stored in relational databases. JDBC drivers bridge Java applications and database systems.

**JDBC Key Features:**
- Connects Java applications to a database.
- Provides methods for SQL execution and result retrieval.
- Supports multiple database types.

## JDBC Architecture
JDBC is composed of three layers:
1. **Application Layer:** Issues SQL statements.
2. **Driver Manager Layer:** Manages communication between the application and drivers.
3. **Database Layer:** Physically stores data.

## Types of JDBC Drivers
1. **Type 1: JDBC-ODBC Bridge Driver**  
   Converts JDBC calls into ODBC calls; not fully written in Java, less portable, and has performance limitations.
   
2. **Type 2: Native API Driver**  
   Uses native database APIs for interaction, faster than Type 1 but not portable and rarely used in modern applications.

3. **Type 3: Network Protocol Driver**  
   Uses a middleware server to communicate with the database, provides better performance and scalability, ideal for web applications.

4. **Type 4: Native Protocol (Thin) Driver**  
   Directly communicates with the database via Java networking libraries, providing the best performance with no client-side installation.

## Basic Steps for JDBC Programming
### 1. Load and Register Driver:
```java
Class.forName("oracle.jdbc.driver.OracleDriver");
```

### 2. Establish Connection:
```java
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
```

### 3. Create Statement:
```java
Statement stmt = con.createStatement();
```

### 4. Execute SQL Query:
```java
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
```

### 5. Process the Results:
```java
while (rs.next()) {
    System.out.println(rs.getInt("id") + " " + rs.getString("name"));
}
```

### 6. Close the Connection:
```java
con.close();
```

## Adding JDBC JAR Files
To ensure JDBC connectivity, you must add the necessary JDBC driver JAR file to your project's classpath. Follow the steps below to add the JAR file:

1. **Locate the JDBC JAR File**:  
   Download the appropriate JDBC driver for your database (e.g., `ojdbc14.jar` for Oracle 10g Express Edition, or `mysql-connector-java.jar` for MySQL).

2. **Add JAR File to Project**:  
   Place the downloaded JAR file in the **lib** folder of your project:
   - **Windows**:  
     Place the JAR in the required folders (e.g., `C:\Program Files\Java\jdk-11\lib\ojdbc14.jar`) and (e.g., `Java\lib\ojdbc14.jar`).
   - **Linux/MacOS**:  
     Place the JAR in your JDK or project’s `lib` folder.

3. **Configure JAR in IDE**:  
   In your IDE (e.g., Eclipse, IntelliJ IDEA), right-click on your project and select:
   - **Build Path > Add External JARs**.
   - Navigate to the location where you added the JAR file and select it.

4. **Verify Classpath**:  
   Ensure that your IDE includes the JAR file in the project’s classpath. You can check the classpath in your IDE’s project settings or by verifying the external libraries section.

## PreparedStatement and CallableStatement
- **PreparedStatement** is used for executing pre-compiled SQL statements with dynamic parameters. It offers better performance for repetitive queries.
- **CallableStatement** is used to execute stored procedures and functions.

Example of **PreparedStatement**:
```java
PreparedStatement pstmt = con.prepareStatement("INSERT INTO students VALUES (?, ?)");
pstmt.setInt(1, 101);
pstmt.setString(2, "John Doe");
pstmt.executeUpdate();
```

Example of **CallableStatement**:
```java
CallableStatement cstmt = con.prepareCall("{call getAge(?)}");
cstmt.setInt(1, studentId);
cstmt.registerOutParameter(2, Types.INTEGER);
cstmt.execute();
```

## ResultSet Interface
**ResultSet** is used to retrieve and manipulate data returned from SQL queries. It supports iterating over rows using a cursor.

Common methods:
- `next()`: Moves the cursor to the next row.
- `getString()`, `getInt()`: Retrieves column data from the current row.

## Transaction Management
JDBC supports **ACID** properties (Atomicity, Consistency, Isolation, Durability) for managing transactions.

- **commit()**: Permanently saves changes.
- **rollback()**: Reverts changes to the last commit.
- **savepoint()**: Sets a savepoint within a transaction for partial rollbacks.

## Error Handling in JDBC
JDBC uses the **SQLException** class to handle errors. The `SQLException` provides methods to retrieve error details:
- `getMessage()`: Returns the error message.
- `getSQLState()`: Returns the SQLState string.
- `getErrorCode()`: Returns the vendor-specific error code.
