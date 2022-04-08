package LAB8.Program4;

public class Pro4 {
    public static void main(String[] args) throws Exception {
        Octagon firstOctagon = new Octagon(5);
        Octagon secondOctagon;
        System.out.println(firstOctagon);
        secondOctagon = firstOctagon.clone();
        System.out.println("\nClone Octagon");
        System.out.println(secondOctagon);
        System.out.println("");
        int compare = firstOctagon.compareTo(secondOctagon);
        if (compare == 0) {
            System.out.println("Octagon is equal!");
        } else
            System.out.println("Octagon is not equal!");
    }
}
