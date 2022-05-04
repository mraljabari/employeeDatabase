# employeeDatabase
Simple program CRUD for employee databases made with java swing and databases MySql

## Note
Change Configuration on \src\com\mraljabari\employeedatabase\ConnectionClass.java to connect databases MySql
example database can find on directory \database\employeedatabase.sql in this project

```
String url = "jdbc:mysql://localhost:3306/employeedatabase";
            String user = "userdb";
            String pass = "passworddb";
            
```

## Libraries used in this project
1. mysql JDBC Driver

```
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
```

## What Fiture in this Project
1. CRUD Data Employee
2. Show Data Table
3. Clear Form
