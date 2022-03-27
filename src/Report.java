public class Report {

    private static final int[][] maleCounter = new int[3][3];
    private static final int[][] femaleCounter = new int[3][3];

    public static void generateReport(LinkedList customerList) {
        Node currentNode = customerList.head;

        if (customerList.head != null) {
            while (currentNode != null) {
                // Check gender of customer
                if (currentNode.getData().getGender().equals("Male")) {
                    // Increase male count by 1 for respective level and time
                    maleCounter[currentNode.getData().getPriorityNo()][currentNode.getData().getTime()]++;
                } else {
                    // Increase female count by 1 for respective level and time
                    femaleCounter[currentNode.getData().getPriorityNo()][currentNode.getData().getTime()]++;
                }
                // Go to next node
                currentNode = currentNode.getNextNode();
            }

            UI.pressEnterToContinue();
            UI.changeColor(UI.RED);
            System.out.println("Generating Report...\n");
            UI.sleep();
            UI.resetColor();

            // Display data for each level at the respective times
            for (int level = 1; level <= 2; level++) {
                UI.changeColor(UI.BLUE);
                System.out.println("Number of level " + level + " males on each flight");
                UI.resetColor();

                for (int time = 0; time <= 2; time++) {
                    System.out.println("Time " + time + ": " + maleCounter[level][time]);
                }

                UI.changeColor(UI.BLUE);
                System.out.println("\nNumber of level " + level + " females on each flight");
                UI.resetColor();

                for (int time = 0; time <= 2; time++) {
                    System.out.println("Time " + time + ": " + femaleCounter[level][time]);
                }

                System.out.println();
            }
        }
    }
}
