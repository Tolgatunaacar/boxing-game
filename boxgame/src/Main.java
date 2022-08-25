public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 30);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 50);
        Fight fight = new Fight (marc,alex,90,110);
        fight.run();
    }
}
