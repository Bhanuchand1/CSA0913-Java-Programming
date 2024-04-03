
public class DataTypeConversionExample {
    public static void main(String[] args) {
        int intValue = 42;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        double largeDoubleValue = 123.456;
        float narrowedFloatValue = (float) largeDoubleValue;
        long narrowedLongValue = (long) narrowedFloatValue;
        int narrowedIntValue = (int) narrowedLongValue;

        int overflowValue = Integer.MAX_VALUE + 1;
        int underflowValue = Integer.MIN_VALUE - 1;

        System.out.println("Implicit Conversion (Widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + narrowedFloatValue);
        System.out.println("float to long: " + narrowedLongValue);
        System.out.println("long to int: " + narrowedIntValue);

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow Value: " + overflowValue);
        System.out.println("Underflow Value: " + underflowValue);
    }
}