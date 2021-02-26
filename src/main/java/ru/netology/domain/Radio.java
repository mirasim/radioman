package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    void nextStation() {

        currentStation = currentStation + 1;

        if (currentStation == 10)
            currentStation = 0;

    }

    void prevStation() {

        currentStation = currentStation - 1;

        if (currentStation == -1)
            currentStation = 9;

    }

    void setCurrentStation(int clientStation) {

        if (clientStation < 0) return;
        if (clientStation > 9) return;

        currentStation = clientStation;
    }

    void volumeUp() {
        if (currentVolume == 10)
            return;
        currentVolume = currentVolume + 1;
    }

    void volumeDown() {
        if (currentVolume == 0)
            return;
        currentVolume = currentVolume - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }


}
