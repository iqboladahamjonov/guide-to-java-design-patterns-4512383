package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithCarpetCouch = new RoomWithCarpetAndCouch(room);
        roomWithCarpetCouch.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table
        var roomWithCarpetCouchTable = new RoomWithCarpetCouchTable(roomWithCarpetCouch);
        roomWithCarpetCouchTable.printFurniture();

    }

}
