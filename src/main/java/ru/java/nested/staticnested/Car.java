package ru.java.nested.staticnested;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        System.out.println(new Engine(200).horsePower);
    }

    @Override
    public String toString() {
        return "Ma car{"
                + "color='" + color + '\''
                + ", doorCount=" + doorCount
                + ", engine=" + engine
                + '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);

            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine{"
                    + "horsePower=" + horsePower
                    + '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car c = new Car("red", 2, engine);
        System.out.println(c);


    }
}