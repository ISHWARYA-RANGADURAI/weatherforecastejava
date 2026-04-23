# Weather Forecast Java

A console-based Java application that retrieves real-time weather information for a user-specified city using the OpenWeatherMap API.
This project is built using **Java**, **Maven**, and **IntelliJ IDEA**, and demonstrates how to integrate APIs, send HTTP requests, and parse JSON responses in Java.

---

## Features

* Fetches real-time weather data for any city
* Displays:

  * Current temperature
  * "Feels like" temperature
* Uses OpenWeatherMap API
* Simple console-based interface
* Built with Maven for dependency management

---

## Technologies Used

* **Java**
* **Maven**
* **OpenWeatherMap API**
* **IntelliJ IDEA**

---

## Project Structure

weatherforecastjava/
├── src/
│   └── main/
│       └── java/
│           └── WeatherForecast.java
├── pom.xml
└── .gitignore

---

## How It Works

1. The user enters the city name in the console.
2. The application sends an HTTP GET request to the OpenWeatherMap API.
3. The API returns weather data in JSON format.
4. The program parses the JSON response.
5. Temperature and "feels like" values are displayed.

---

## Sample Output

Enter the city name: kumbakonam
Weather forecast for Kumbakonam:
Temperature: 37.81 °C
Feels like: 36.21 °C

---

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/weatherforecastjava.git
```

### 2. Open the project in IntelliJ IDEA

Import the project as a **Maven Project**.

### 3. Add your OpenWeatherMap API Key

In `WeatherForecast.java`, replace:

```java
private static final String API_KEY = "YOUR_API_KEY";
```

with your actual API key:

```java
private static final String API_KEY = "your_actual_api_key";
```

### 4. Run the application

Run the `WeatherForecast.java` file and enter a city name.

---

## Future Enhancements

* Add humidity and wind speed
* Improve error handling
* Create a graphical user interface
* Support multiple cities
* Store API key securely using environment variables

---

## Author

Developed as a Java mini-project for learning API integration and HTTP requests.
