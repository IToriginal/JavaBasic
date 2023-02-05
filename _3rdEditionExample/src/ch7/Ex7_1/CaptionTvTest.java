package ch7.Ex7_1;

class Tv{
    boolean power; //Power On/Off
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
class CaptionTv extends Tv{
    boolean caption; //caption status (On/Off)
    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 On(true) 일 때만 text 출력
            System.out.println(text);
        }
    }
}
class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true; // 캡션 기능 On
        ctv.displayCaption("Hello, World");
    }
}
