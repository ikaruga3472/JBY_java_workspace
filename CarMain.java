public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car() ;
        car1.maker = "Hyundai" ;
        car1.price = 5000 ;
        System.out.println("제조사 : " + car1.maker);
        System.out.println("가격 : " + car1.price);
    }
}
