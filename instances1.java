public class instances1 {
    private static int instanceCount = 0;
    private String name;

    public instances1(String name) {
        this.name = name;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        Act1 obj1 = new Act1("Object 1");
        Act1 obj2 = new Act1("Object 2");
        Act1 obj3 = new Act1("Object 3");

        System.out.println("Number of instances created: " + Act1.getInstanceCount());

        int[] numbers = {10, 20, 30, 40, 50};
        double average = MathUtils.calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
}
