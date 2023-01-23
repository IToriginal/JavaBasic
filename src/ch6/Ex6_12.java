package ch6;

class Car {
    String color; //색상
    String gearType; //변속기 종류 - auto, manual
    int door; //문 개수

    Car() {} //기본 생성자
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
        System.out.println("[c1] color : " + c1.color +
                ", geraType : " + c1.gearType +
                ", door : " +c1.door);
        System.out.println("[c2] color : " + c2.color +
                ", geraType : " + c2.gearType +
                ", door : " +c2.door);
    }
}
