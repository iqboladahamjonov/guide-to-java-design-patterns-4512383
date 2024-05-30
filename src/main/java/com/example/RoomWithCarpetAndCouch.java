package com.example;

public class RoomWithCarpetAndCouch extends RoomDecorator {
  public RoomWithCarpetAndCouch(Room room) {
    super(room);
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("Couch");
  }

}
