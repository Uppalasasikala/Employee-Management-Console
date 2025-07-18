# 🧑‍💼 Employee Management Console

A Java console-based application to manage employee data through a menu-driven interface. Built using clean object-oriented design with future extensibility for file or database persistence.

---

## 📌 Features

* Add, update, delete, view employees
* Search employees by ID
* Modular OOP structure (DAO, Service, Model)
* Interactive CLI navigation
* Designed for potential DB/file integration

---

## 📁 Project Structure

```
Employee-Management-Console/
├── src/
│   └── employee/
│       ├── dao/                # CRUD logic (in-memory)
│       ├── model/              # Employee entity class
│       ├── service/            # Business logic
│       ├── util/               # Utility methods
│       └── EmployeeManagement.java   # Main menu (entry point)
├── sql/
│   ├── schema.sql              # SQL schema for future DB
│   └── sample_data.sql         # Optional: insert statements
├── data/
│   └── employees.csv           # (Optional) CSV for file-based persistence
├── config/
│   └── app.properties          # (Optional) config like db.url, user, etc.
├── README.md
```

---

## 🚀 Getting Started

### ✅ Prerequisites

* Java 8+
* Terminal or command prompt
* (Optional) MySQL/PostgreSQL if using SQL scripts

### 🔧 Run the Console App

1. **Compile source files:**

   ```bash
   javac -d out src/employee/**/*.java
   ```

2. **Run main program:**

   ```bash
   java -cp out employee.EmployeeManagement
   ```

---

## 💾 Optional Database Integration

> This project currently uses in-memory storage. However, future versions can use a real database using `schema.sql`.

### 📜 `sql/schema.sql`

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    designation VARCHAR(50) NOT NULL,
    department VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);
```

### 🌱 `sql/sample_data.sql`

```sql
INSERT INTO employees (id, name, designation, department, salary) VALUES
(1, 'Alice Johnson', 'Manager', 'HR', 85000.00),
(2, 'Bob Smith', 'Developer', 'IT', 72000.00),
(3, 'Charlie Brown', 'Analyst', 'Finance', 64000.00),
(4, 'Diana Prince', 'Team Lead', 'IT', 78000.00);
```

---

## 📋 Configuration

To enable easy switching to file/DB storage in future:

### `config/app.properties`

```properties
# Storage mode can be: memory, file, db
storage.mode=memory

# Database config (used if storage.mode = db)
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/employee_db
db.username=root
db.password=password

# File path config (used if storage.mode = file)
file.path=data/employees.csv
```

---

## 📦 How It Works

The app starts with:

```
====== Employee Management System ======
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
5. Search Employee
6. Exit
```

Choose an action and follow the prompts. All logic is routed through the service and DAO layers.

---

## 🧩 Future Enhancements

* [ ] File-based storage using CSV or JSON
* [ ] JDBC/MySQL persistence
* [ ] Exception handling improvements
* [ ] Unit testing with JUnit
* [ ] GUI or Web Frontend

---

## 🤝 Contributing

1. Fork this repository
2. Create a branch (`git checkout -b feature/new-feature`)
3. Commit your changes
4. Push to GitHub
5. Submit a Pull Request

---

## 📄 License

MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙋‍♂️ Author

Developed by [Uppalasasikala](https://github.com/Uppalasasikala)
