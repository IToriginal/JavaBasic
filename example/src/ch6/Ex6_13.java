package ch6;
class Car2 {
    String color;
    String gearType;
    int door;

    Car2() { //Car(String color, String gearType, int door) 호출
        this("white", "auto", 4);
    }
    Car2(String color) { //Car(String color, String gearType, int door) 호출
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door =door;
    }
}
public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        System.out.println("[c1] color : " + c1.color +
                ", geraType : " + c1.gearType +
                ", door : " +c1.door);
        System.out.println("[c2] color : " + c2.color +
                ", geraType : " + c2.gearType +
                ", door : " +c2.door);
    }
}
