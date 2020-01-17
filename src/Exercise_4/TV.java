package Exercise_4;

class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    void setChannel(int channel){this.channel = channel;}
    int getChannel(){return this.channel;}

    void setVolumeLevel(int volumeLevel){this.volumeLevel = volumeLevel;}
    int getVolumeLevel(){return this.volumeLevel;}

    void setTvState(boolean tvState){this.on = tvState;}
    boolean getTvState(){return this.on;}

    boolean turnOnOrOffTheTv(boolean tvState) {
        return tvState;
    }
}
