

# Registration and Login Authenticator

Welcome to the **Registration and Login Authenticator** repository! This project is a web application that provides user registration and login functionalities, demonstrating database connectivity using JSP, Servlets, JDBC, and MySQL.

## Features

- **User Registration**: Allows new users to create an account by providing necessary details.
- **User Login**: Authenticates users based on their credentials.
- **Session Management**: Maintains user sessions upon successful login.
- **Input Validation**: Ensures that user inputs meet the required criteria.
- **Database Integration**: Stores user information securely in a MySQL database.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: JSP, Servlets
- **Database**: MySQL
- **Connectivity**: JDBC
- **Tools**: Apache Tomcat, NetBeans IDE

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK)
- Apache Tomcat Server
- MySQL Server
- NetBeans IDE or any preferred Java IDE

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/kunnub/RegistrationPage.git
   ```

2. **Import the project**:
   - Open your IDE and import the cloned project.

3. **Set up the database**:
   - Start your MySQL server.
   - Create a database named `userdb`.
   - Execute the SQL script provided in the `database` directory to create the necessary tables.

4. **Configure database connection**:
   - Locate the database configuration file (e.g., `dbconfig.properties` or within the Servlet code).
   - Update the database URL, username, and password to match your MySQL configuration.

5. **Deploy the application**:
   - Deploy the project on the Apache Tomcat server through your IDE.

6. **Run the application**:
   - Access the application via `http://localhost:8080/RegistrationPage/`.

## Usage

### Screenshots

_Add relevant screenshots of the application here to provide a visual overview._

1. **Register a new user**:
   - Navigate to the registration page.
   - Fill in the required details and submit the form.

2. **Login**:
   - Navigate to the login page.
   - Enter your credentials and submit the form.

3. **Session Management**:
   - Upon successful login, you will be redirected to a welcome page.
   - Use the logout option to end the session.

1. **Register a new user**:
   - Navigate to the registration page.
   - Fill in the required details and submit the form.

2. **Login**:
   - Navigate to the login page.
   - Enter your credentials and submit the form.

3. **Session Management**:
   - Upon successful login, you will be redirected to a welcome page.
   - Use the logout option to end the session.

## Contributing

Contributions are welcome! If you have suggestions or encounter issues, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to explore and enhance this project! If you have any questions, contact me at [contact me](kunalbobde19@gmail.com).
