public class Main {
    public static void main(String[] args) {
        int ticketCost = 24376;
        int mileCost = 20;
        int milesCount = Math.round((float) ticketCost / mileCost);
        System.out.printf("Стоимость мили: %s%n", mileCost);
        System.out.printf("Стоимость билета: %s%n", ticketCost);
        System.out.printf("Стоимость начислено миль: %s%n", milesCount);
    }
}