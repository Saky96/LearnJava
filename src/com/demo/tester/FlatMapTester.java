package com.demo.tester;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatMapTester {
    public static void main(String[] args) {
        List<City> haryanaCities = new ArrayList<>();
        haryanaCities.add(new City("Ambala", 500_000));
        haryanaCities.add(new City("Kurukshetra", 400_000));
        haryanaCities.add(new City("Karnal", 700_000));

        List<State> states = new ArrayList<>();
        states.add(new State("Haryana", haryanaCities));
        states.add(new State("Punjab", List.of(
                new City("Ludhiyana", 1_000_000),
                new City("Jalandhar", 2_000_000),
                new City("Amritsar", 12_000_000),
                new City("Patiala", 6_000_000)
        )));
        states.add(new State("Rajasthan", List.of(
                new City("Jaipur", 15_000_000),
                new City("Jodhpur", 7_000_000),
                new City("Udaipur", 4_000_000),
                new City("Jesalmer", 6_000_000)
        )));

        var stateNames = states.stream().map(State::getName).toList();
//        System.out.println(stateNames);
        var cityNames = states.stream()
                .flatMap(state -> state.getCities().stream())
                .map(City::getName)
                .collect(toList());

//        System.out.println(cityNames);

        var totalPopulation = states.stream()
                .flatMap(state -> state.getCities().stream())
                .mapToInt(City::getPopulation)
                .sum();
//        System.out.println("totalPopulation: "+totalPopulation);

        // State with cities map
        var stateMapToCities = states.stream()
                        .collect(Collectors.groupingBy(
                                State::getName,
                                Collectors.flatMapping(state -> state.getCities().stream().map(City::getName), Collectors.toList())
                        ));
//                .collect(Collectors.toMap(
//                        State::getName,
//                        State::getCities
//                ));
        System.out.println(stateMapToCities);

        // Citites with population
        var mapCityPopulation = states.stream()
                .flatMap(state -> state.getCities().stream())
                .collect(Collectors.toMap(
                        City::getName,
                        City::getPopulation
                ));
//        System.out.println(mapCityPopulation);

        // State with population
        var mapStatePopulation = states.stream()
                .collect(Collectors.groupingBy(
                   State::getName,
                   Collectors.flatMapping(state -> state.getCities().stream().map(City::getPopulation), Collectors.summingInt(Integer::intValue))
                ));
//        System.out.println(mapStatePopulation);

//        List<String> strings = List.of("1", " ", "2", "3 ", "", "3");
//        List<Integer> ints =
//                strings.stream()
//                        .<Integer>mapMulti((string, consumer) -> {
//                            try {
//                                consumer.accept(Integer.parseInt(string));
//                            } catch (NumberFormatException ignored) {
//                            }
//                        })
//                        .collect(Collectors.toList());
//        System.out.println("ints = " + ints);

        Map<String, List<String>> mapStateToCities = new HashMap<>();

        for (var state: states) {
            var cityNamesList = new ArrayList<String>();
            for (var city: state.getCities()) {
//                var cityName = city.getName();
                cityNamesList.add(city.getName());
            }
            mapStateToCities.put(state.getName(), cityNamesList);
        }
//        System.out.println(mapStateToCities);

//        System.out.println(states);

    }
}

class City {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (population != city.population) return false;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + population;
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}

class State {

    private String name;
    private List<City> cities;

    public State(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
    // constructors, getters
    // toString, equals and hashCode
}
