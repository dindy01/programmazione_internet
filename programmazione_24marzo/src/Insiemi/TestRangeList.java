package Insiemi;

public class TestRangeList {

    public static void main(String[] args) {
        // Test costruttori
        System.out.println("Test 1: Creazione RangeList vuota");
        RangeList emptyList = new RangeList();
        System.out.println("Expected: {}");
        System.out.println("Actual: " + emptyList);

        System.out.println("\nTest 2: Creazione RangeList con un solo valore (5)");
        RangeList singleElementList = new RangeList(5);
        System.out.println("Expected: {5}");
        System.out.println("Actual: " + singleElementList);

        System.out.println("\nTest 3: Creazione RangeList con un intervallo (5, 10)");
        RangeList rangeList = new RangeList(5, 10);
        System.out.println("Expected: {5..10}");
        System.out.println("Actual: " + rangeList);

        System.out.println("\nTest 4: Creazione RangeList con un array di valori");
        int[] values = {1, 3, 5, 6, 7, 10, 15};
        RangeList listFromArray = new RangeList(values);
        System.out.println("Expected: {1, 3, 5..7, 10, 15}");
        System.out.println("Actual: " + listFromArray);

        // Test metodi isEmpty, size, min, max, contains
        System.out.println("\nTest 5: Test isEmpty");
        System.out.println("Expected: true");
        System.out.println("Actual: " + emptyList.isEmpty());

        System.out.println("\nTest 6: Test size");
        System.out.println("Expected: 7");
        System.out.println("Actual: " + listFromArray.size());

        System.out.println("\nTest 7: Test min");
        System.out.println("Expected: 1");
        System.out.println("Actual: " + listFromArray.min());

        System.out.println("\nTest 8: Test max");
        System.out.println("Expected: 15");
        System.out.println("Actual: " + listFromArray.max());

        System.out.println("\nTest 9: Test contains (valore presente)");
        System.out.println("Expected: true");
        System.out.println("Actual: " + listFromArray.contains(6));

        System.out.println("\nTest 10: Test contains (valore non presente)");
        System.out.println("Expected: false");
        System.out.println("Actual: " + listFromArray.contains(8));

        // Test metodi equals
        System.out.println("\nTest 11: Test equals (uguale)");
        RangeList anotherListFromArray = new RangeList(values);
        System.out.println("Expected: true");
        System.out.println("Actual: " + listFromArray.equals(anotherListFromArray));

        System.out.println("\nTest 12: Test equals (diverso)");
        int[] differentValues = {1, 3, 5, 6, 8, 10, 15};
        RangeList differentListFromArray = new RangeList(differentValues);
        System.out.println("Expected: false");
        System.out.println("Actual: " + listFromArray.equals(differentListFromArray));

        // Test eccezioni
        System.out.println("\nTest 13: Test min su lista vuota (eccezione)");
        try {
            System.out.println(emptyList.min());
        } catch (UnsupportedOperationException e) {
            System.out.println("Expected: UnsupportedOperationException");
        }

        System.out.println("\nTest 14: Test max su lista vuota (eccezione)");
        try {
            System.out.println(emptyList.max());
        } catch (UnsupportedOperationException e) {
            System.out.println("Expected: UnsupportedOperationException");
        }
    }
}
