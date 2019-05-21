public abstract class Person {
    private void walk() {
        System.out.println("Person is walking");
    }

    public static void main(String[] args) {
        Employee p = new Employee();
        p.walk();
    }
}

class Employee extends Person {

    protected void walk() {
        System.out.println("Employee is walking");
    }
}

