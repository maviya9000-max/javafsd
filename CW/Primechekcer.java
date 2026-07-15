class Primechecker {
    public static void main(String[] args) {
        
        for (int num = 1; num <= 100; num++) {
            
                        if (num == 1) {
                System.out.println(1 + " is not prime");
            } 
            else {
                int factors = 0; // Resets for every new number
                
                
                for (int i = 1; i <= num; i++) {
                    
                    if (num % i == 0) {
                        factors = factors + 1;                     }
                }
                
                
                if (factors == 2) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
            }
            
        }
    }
}
