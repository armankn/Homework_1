package Exercise_4;

public class Main {
    public static void main(String[] args){
        int channel = 5;
        int volumeLevel = 12;
        boolean tvState = true;     //TV state controls from here

        TV tv = new TV();
        tv.setTvState(tvState);

        if(tv.turnOnOrOffTheTv(tv.getTvState())){
            tv.setChannel(channel);
            tv.setVolumeLevel(volumeLevel);
            System.out.println("TV channel number is: " + tv.getChannel());
            System.out.println("TV volume level is: " + tv.getVolumeLevel());
        } else {
            System.out.println("TV is turn off");
        }
    }
}
