public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle yertle = new Turtle();
         for (int i = 0; i < 5; i++) {
            yertle.forward(100);
            yertle.right(72);
            }

        // Task 2: Draw a regular shape many times
        yertle.backward(200);
         for (int j = 0; j < 10; j++) {
            for (int l = 0; l < 5; l++) {
               yertle.forward(100);
               yertle.right(72);
            }
            yertle.right(36);
         }

        // Task 3: How many times does Turtle turn!
        int turns = 0;
         yertle.forward(500);
            for (int j = 0; j < 10; j++) {
               for (int l = 0; l < 5; l++) {
                  yertle.forward(100);
                  yertle.right(72);
                  turns++;
               }
               yertle.right(36);
   
            }
         System.out.println("Yertle has turned " + turns + " times!");
        // Extension 1:


        // Extension 2:

    }
}
