package Assignment;

import java.io.*;
import java.util.*;

public class CityStateMap {
    private final Map<String, String> cityStateMap;

    public CityStateMap() {
        this.cityStateMap = new LinkedHashMap<>(); // Preserves insertion order
    }

    public void loadFromFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); 
                if (parts.length == 2) {
                    addCityState(parts[0].trim(), parts[1].trim());
                }
            }
        }
    }

    // Add a new city-state pair
    public void addCityState(String city, String state) {
        cityStateMap.put(city, state);
    }

    // Get the state of a city
    public String getState(String city) {
        return cityStateMap.getOrDefault(city, "City not found");
    }

    // Get all cities
    public Set<String> getAllCities() {
        return cityStateMap.keySet();
    }

    // Get all states
    public Set<String> getAllStates() {
        return new HashSet<>(cityStateMap.values());
    }

    // Get all cities 
    public Set<String> getCitiesForState(String state) {
        Set<String> cities = new HashSet<>();
        for (Map.Entry<String, String> entry : cityStateMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(state)) {
                cities.add(entry.getKey());
            }
        }
        return cities;
    }

    // Delete all cities 
    public void deleteCitiesForState(String state) {
        cityStateMap.entrySet().removeIf(entry -> entry.getValue().equalsIgnoreCase(state));
    }

    public void displayMap() {
        if (cityStateMap.isEmpty()) {
            System.out.println("No city-state pairs found.");
        } else {
            cityStateMap.forEach((city, state) -> System.out.println(city + " -> " + state));
        }
    }
}