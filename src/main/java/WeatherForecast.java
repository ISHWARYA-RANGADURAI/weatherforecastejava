import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherForecast {
    // Replace with your OpenWeatherMap API key
    private static final String API_KEY = "308feeb8919b9f1f20230652d65744e2";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city name: ");
        String city = scanner.nextLine();
        String response = getWeatherData(city);

        if (response != null) {
            parseAndDisplayWeather(response);
        } else {
            System.out.println("Failed to get weather data.");
        }
    }

    private static String getWeatherData(String city) {
        try {
            String urlString = BASE_URL + city + "&appid=" + API_KEY;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void parseAndDisplayWeather(String response) {
        JSONObject jsonResponse = new JSONObject(response);
        String cityName = jsonResponse.getString("name");
        JSONObject main = jsonResponse.getJSONObject("main");
        double temp = main.getDouble("temp") - 273.15; // Convert Kelvin to Celsius
        double feelsLike = main.getDouble("feels_like") - 273.15;

        System.out.println("Weather forecast for " + cityName + ":");
        System.out.println("Temperature: " + String.format("%.2f", temp) + " °C");
        System.out.println("Feels like: " + String.format("%.2f", feelsLike) + " °C");
    }
}
