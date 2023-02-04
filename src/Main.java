public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight = 100;
        double height = 1.6;

        double imt = service.calculate(weight, height);

        System.out.println("Ваш ИМТ равен " + imt);


    }
}