package BT5;

public class Ex19Method {

    private int channel;
    private int volume;
    private String power;

    public Ex19Method(int channel, int volume, String power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int upChannel() {
        return channel++;
    }

    public int downChannel() {
        return channel--;
    }

    public int upVolume() {
        return volume++;
    }

    public int downVolume() {
        return volume--;
    }

    public void display() {
        System.out.println("Power " + power);
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
    }



}
