public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
               double bmi = service.calculate(60,180);
        System.out.println(bmi);
    }
}

