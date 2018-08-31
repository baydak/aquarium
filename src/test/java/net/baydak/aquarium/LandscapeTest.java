package net.baydak.aquarium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LandscapeTest {

    private Landscape landscape;

    @Before
    public void initTest() {
        landscape = new Landscape();
    }

    @After
    public void afterTest() {
        landscape = null;
    }

    @Test
    public void calculateVolume() {
        assertEquals(3, landscape.calculateVolume(Landscape.parseStringToIntArr("4, 2, 3, 4, 0, 3")));
        assertEquals(0, landscape.calculateVolume(Landscape.parseStringToIntArr("4, 3, 0, 2, 5")));
        assertEquals(4, landscape.calculateVolume(Landscape.parseStringToIntArr("4, 3, 1, 4, 2")));
        assertEquals(7, landscape.calculateVolume(Landscape.parseStringToIntArr("1, 4, 2, 0, 6, 1, 2, 5")));
        assertEquals(9, landscape.calculateVolume(Landscape.parseStringToIntArr("[1, 3, 1, 4, 2, 0, 6, 1, 2, 5]")));
    }

    @Test
    public void parseStringToIntArr() {
        assertArrayEquals(new int[]{4, 2, 3, 4, 30}, Landscape.parseStringToIntArr("[4,2, 3, 4, 30]"));
        assertArrayEquals(new int[]{3, 2, 3, 0, 4, 2, 3}, Landscape.parseStringToIntArr("[3, 2, 3, 0,4,2,3]"));
    }

    @Test
    public void arr1dTO2d() {
    }

    @Test
    public void getLandscapeLineStr() {
    }

    @Test
    public void setLandscapeLineStr() {
    }
}