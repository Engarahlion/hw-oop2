package ru.netology.radio;

public class Radio {
    private int amountStations;
    private int currentStation;
    private int currentVolume;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
    }

    public Radio() {
        this.amountStations = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > (amountStations - 1)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == (amountStations - 1)) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (amountStations - 1);
        } else {
            currentStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}