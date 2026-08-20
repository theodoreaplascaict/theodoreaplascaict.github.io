public class Loop {
    public static void main(String[] args) {
        // Outer loop
for (int i = 5; i >= 2; i--) {
  System.out.println("Outer: " + i); // Executes 4 times
  
  // Inner loop
  for (int j = 5; j >= 3; j--) {
    System.out.println(" Inner: " + j); // Executes 3 times (2 * 3)
            }
        } 

    }
}

/* This is a nested loop, it executes the first "for" condition statements. Starting from S1 (Statement 1) 
all the way to S3 (Statement 3) Then executes the inner loop if condition = true */
