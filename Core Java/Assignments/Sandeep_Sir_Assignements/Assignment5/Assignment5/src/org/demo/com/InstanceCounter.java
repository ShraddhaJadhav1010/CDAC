package org.demo.com;

//1) Design and implement a class named InstanceCounter to track and count the number of instances created from this class.

public class InstanceCounter {
  private static int instanceCount = 0;

  public InstanceCounter() {
      // Increment the instance count when a new instance is created
      instanceCount++;
  }

  public static int getInstanceCount() {
      return instanceCount;
  }

  public static void main(String[] args) {
      // Creating instances of InstanceCounter
      InstanceCounter obj1 = new InstanceCounter();
      InstanceCounter obj2 = new InstanceCounter();
      InstanceCounter obj3 = new InstanceCounter();

      System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
  }
}