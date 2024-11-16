package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country polska = new Country("Polska", new BigDecimal(37636508));
        Country niemcy = new Country("Niemcy", new BigDecimal(84358845));
        Country francja =  new Country("Francja", new BigDecimal(63713926));
        Country usa = new Country("Usa", new BigDecimal(332403650));
        Country kanada = new Country("Kanada", new BigDecimal(37943231));
        Country meksyk = new Country("Meksyk", new BigDecimal(128600000));
        Country chiny = new Country("Chiny", new BigDecimal(1411778724));
        Country indie  = new Country("Indie", new BigDecimal(1399179585));
        Country japonia =  new Country("Japonia", new BigDecimal(124090000));
        Country egipt = new Country("Egipt", new BigDecimal(106437241));
        Country tunezja =  new Country("Tunezja", new BigDecimal(11403800));
        Country maroko = new Country("Maroko", new BigDecimal(37076584));
        Country brazylia = new Country("Brazylia", new BigDecimal(217240060));
        Country argentyna =  new Country("Argentyna", new BigDecimal(45864941));
        Country kolumbia = new Country("Kolumbia", new BigDecimal(49292000));
        Country australia = new Country("Australia", new BigDecimal(26821600));
        Country nowaZelandia = new Country("Nowa Zelandia", new BigDecimal(4510327));
        Country samoa = new Country("Samoa", new BigDecimal(200108));
        Continent europa = new Continent("Europa");
        Continent azja = new Continent("Azja");
        Continent afryka = new Continent("Afryka");
        Continent amerykaPn = new Continent("Ameryka Pn");
        Continent amerykaPd = new Continent("Ameryka Pd");
        Continent australiaIOceania = new Continent("Australia i Oceania");
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        europa.addCountry(francja);
        azja.addCountry(chiny);
        azja.addCountry(indie);
        azja.addCountry(japonia);
        afryka.addCountry(egipt);
        afryka.addCountry(tunezja);
        afryka.addCountry(maroko);
        amerykaPn.addCountry(usa);
        amerykaPn.addCountry(kanada);
        amerykaPn.addCountry(meksyk);
        amerykaPd.addCountry(brazylia);
        amerykaPd.addCountry(argentyna);
        amerykaPd.addCountry(kolumbia);
        australiaIOceania.addCountry(australia);
        australiaIOceania.addCountry(nowaZelandia);
        australiaIOceania.addCountry(samoa);
        World world = new World();
        world.addContinent(europa);
        world.addContinent(azja);
        world.addContinent(afryka);
        world.addContinent(amerykaPn);
        world.addContinent(amerykaPd);
        world.addContinent(australiaIOceania);
        //When
        BigDecimal expected = new BigDecimal("4118551130");
        BigDecimal actual = world.getPeopleQuantity();
        //Then
        Assertions.assertEquals(expected, actual);
    }
}