class Box {
    double length;
    double width;
    double height;

    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        double volume = myBox.calculateVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
