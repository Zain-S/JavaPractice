package com.company;

public class OOP3 {
}
//Java Nested and Inner Class
class CPU {
    double price;
    class Processor{
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    protected class RAM{
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
}

//Accessing Members of Outer Class within Inner Class
class Car {
    private String carName;
    private String carType;
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    private String getCarName() {
        return this.carName;
    }
    class Engine {
        private String engineType;
        void setEngine() {
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return engineType;
            //this.engineType & engineType are same
        }
    }
}

//Static Inner Class
class MotherBoard {
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}

//Static Nested Class
class Animal6 {
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}

//Anonymous Class Extending a Class
class Polygon4{
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}
class AnonymousDemo {
    public void createClass() {
        Polygon4 polygon4 = new Polygon4() {
            public void display(){
                System.out.println("Inside an anonymous class.");
            }
        };
        polygon4.display();
    }
}

//Anonymous Class Implementing an Interface
interface Polygon5 {
    public void display();
}
class AnonymousDemo5 {
    public void createClass() {
        Polygon5 p1 = new Polygon5() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

//Use of Singleton in Java
class Database {
    private static Database dbObject;
    private Database() {
    }
    public static Database getInstance() {
        if(dbObject == null) {
            dbObject = new Database();
        }
        return dbObject;
    }
    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}


//Java Enum
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

