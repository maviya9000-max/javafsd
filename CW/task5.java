class Main {
    public static void main(String[] args) {
        

        try {
            int quantity = Integer.parseInt("abc");
        double price = 100;
        double total = quantity * price;
        System.out.println("Total: " + total);
        } 
        catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number.");
        System.out.println(" using default quantity of 1.");
        double total = 1 * 100;
        System.out.println("Total: " + total);
        }
        System.out.println("checkout completed successfully1");

    }
}
