package com.kodilla.goodpatterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {
    private List<String> ironManTranslations = new ArrayList<>();
    private List<String> avengersTranslations = new ArrayList<>();
    private List<String> flashTranslations = new ArrayList<>();

    public MovieStore() {
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
    }

    public Map<String, List<String>> getMovies() {
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }
}
