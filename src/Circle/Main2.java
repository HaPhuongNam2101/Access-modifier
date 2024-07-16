package Circle;

public class Main2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(7);

        System.out.println("Tổng số hình tròn đã tạo: " + Circle.getCount());
        System.out.println("Bán kính lớn nhất: " + Circle.getMaxRadius());
        System.out.println("Tổng diện tích các hình tròn: " + Circle.getTotalArea());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}

