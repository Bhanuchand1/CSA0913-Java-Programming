class Sphere {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
class Cone {
    private double radius;
    private double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(3, 7);
        Cylinder cylinder = new Cylinder(4, 8);
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
        System.out.println("Volume of Cone: " + cone.calculateVolume());
        System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());
    }
}
