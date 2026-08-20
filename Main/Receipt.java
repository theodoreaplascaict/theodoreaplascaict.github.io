class Receipt {
    public static void main(String[] args) {

        String driverName = "dan";
        double baseFare = 1;
        double distanceKm = 1;
        double ratePerKm = 1;

        double distanceFare = distanceKm * ratePerKm;
        double totalFare = baseFare + distanceFare;

        double cashPaid = 2;
        double exchange = cashPaid - totalFare;

        System.out.println("================================");
        System.out.println("Driver Name   : " + driverName);
        System.out.println("--------------------------------");
        System.out.println("Base Fare     : ₱" + baseFare);
        System.out.println("Distance (km) : " + distanceKm);
        System.out.println("Rate per km   : ₱" + ratePerKm);
        System.out.println("--------------------------------");
        System.out.println("Distance Fare : ₱" + distanceFare);
        System.out.println("TOTAL FARE    : ₱" + totalFare);
        System.out.println("--------------------------------");
        System.out.println("Cash Paid     : ₱" + cashPaid);
        System.out.println("Exchange      : ₱" + exchange);
        System.out.println("================================");
        System.out.println("     Thank you for riding!");
        System.out.println("================================");
    }
}