package com.sda.she_likes_java.visibility.examples;

public class Robot {
private String model;
private String generation;
private int xPosition;
private int yPosition;

    public Robot(String model, String generation, int xPosition, int yPosition) {
        this.model = model;
        this.generation = generation;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String createJavaProgram(){
        return """
                public class RobotJavaProgram {
                public static void main () {
                }
             
                }
                """;

    }
    public void moveForward(){
        xPosition++;
        System.out.println("I'm moving forward");
    }

    public void moveBackward (){
        yPosition--;
        System.out.println("I'm moving backwards");
    }

    public void turnLeft (){
        System.out.println("I am turning left");
    }

    public void turnRight (){
        System.out.println("I am turning left");

    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
