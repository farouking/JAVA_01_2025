class Phone extends Device {
    public Phone(int battery) {
        super(battery);
    }

    public void makeCall() {
        if (getBattery() >= 5) {
            setBattery(getBattery() - 5);
            System.out.println("Making a call... Battery now: " + getBattery() + "%");
        } else {
            System.out.println("Not enough battery to make a call.");
        }
        checkCriticalBattery();
    }

    public void playGame() {
        if (getBattery() < 25) {
            System.out.println("Battery too low to play a game. Minimum required: 25%.");
            return;
        }
        setBattery(getBattery() - 20);
        System.out.println("Playing a game... Battery now: " + getBattery() + "%");
        checkCriticalBattery();
    }

    public void charge(int amount) {
        setBattery(getBattery() + amount);
        System.out.println("Charging... Battery now: " + getBattery() + "%");
    }

    private void checkCriticalBattery() {
        if (getBattery() < 10) {
            System.out.println("Battery critical! " + getBattery() + "% remaining. Please charge immediately.");
        }
    }
}