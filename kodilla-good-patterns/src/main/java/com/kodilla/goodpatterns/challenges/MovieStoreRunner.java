package com.kodilla.goodpatterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieStoreRunner {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> map = movieStore.getMovies();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            entry.getValue().stream()
                    .forEach(s -> System.out.print(s + "!"));
        }
    }
}
