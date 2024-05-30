package com.example;

public class RoomWithCarpetCouchTable extends RoomDecorator {

  public RoomWithCarpetCouchTable(Room room) {
    super(room);
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("Table");
  }
}
