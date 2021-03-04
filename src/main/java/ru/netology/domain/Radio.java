package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount;

    public Radio() {
        stationCount = 10;
    }

    public int getStationCount() {
        return stationCount;
    }

    public void setStationCount(int stationCount) {
        this.stationCount = stationCount;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



    void nextStation() {

        currentStation = currentStation + 1;

        if (currentStation == stationCount)
            currentStation = 0;

    }

    void prevStation() {

        currentStation = currentStation - 1;

        if (currentStation == -1)
            currentStation = stationCount -1;

    }

    void setCurrentStation(int clientStation) {

        if (clientStation < 0) return;
        if (clientStation > stationCount -1) return;

        currentStation = clientStation;
    }

    void volumeUp() {
        if (currentVolume == 100)
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
