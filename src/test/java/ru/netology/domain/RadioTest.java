package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void nextStation() {
        Radio friends = new Radio();
        friends.nextStation();
        assertEquals(1, friends.getCurrentStation());
    }

    @Test
    void nextStationOver9() {
        Radio friends = new Radio();
        friends.setCurrentStation(9);
        friends.nextStation();
        assertEquals(0, friends.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio friends = new Radio();
        friends.setCurrentStation(5);
        friends.prevStation();
        assertEquals(4, friends.getCurrentStation());
    }


    @Test
    void prevStationLess0() {
        Radio friends = new Radio();
        friends.setCurrentStation(0);
        friends.prevStation();
        assertEquals(9, friends.getCurrentStation());
    }

    @Test
    void setStationLess0() {
        Radio friends = new Radio();
        friends.setCurrentStation(-1);
        assertEquals(0, friends.getCurrentStation());
    }

    @Test
    void setStationMore9() {
        Radio friends = new Radio();
        friends.setCurrentStation(10);
        assertEquals(0, friends.getCurrentStation());
    }


    @Test
    void setStation() {
        Radio friends = new Radio();
        friends.setCurrentStation(6);
        assertEquals(6, friends.getCurrentStation());
    }

    @Test
    void VolumeDown() {
        Radio friends = new Radio();
        friends.volumeDown();
        assertEquals(0, friends.getCurrentStation());
    }

    @Test
    void VolumeDownMore1() {
        Radio friends = new Radio();
        friends.volumeUp();
        friends.volumeDown();
        assertEquals(0, friends.getCurrentStation());
    }

    @Test
    void VolumeUpMore10() {
        Radio friends = new Radio();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        friends.volumeUp();
        assertEquals(0, friends.getCurrentStation());
    }

    @Test
    void getCurrentVolume() {
        Radio friends = new Radio();

        assertEquals(0, friends.getCurrentVolume());
    }


}