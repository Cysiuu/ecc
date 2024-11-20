
![Logo](ecclogo.png)


# Extended Caesar Cipher 

The Extended Caesar Cipher is a modified version of the classic Caesar cipher. Unlike the traditional cipher, which uses a single shift for all letters, this extended version allows you to specify different shifts for different parts of the text. This adds an extra layer of complexity and security, making it more versatile than the original Caesar cipher.


## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Docker Run

The Extended Caesar Cipher project is containerized using Docker to simplify local development and testing. Follow the instructions below to build and run the project.

### Prerequisites
- Ensure [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/) are installed on your machine.

### Run the Application
1. Clone the repository:
    ```bash
    git clone https://github.com/Cysiuu/ecc.git
    cd ecc
    ```

2. Start the services using Docker Compose:
    ```bash
    docker-compose up --build
    ```

3. Access the application:
    - Frontend: [http://localhost:5173](http://localhost:5173)
    - Backend: [http://localhost:8080](http://localhost:8080)

### Stopping the Services
To stop the services, press `Ctrl+C` in the terminal or run:
```bash
docker-compose down
```

---