public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(20, 10, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
