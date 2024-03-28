package com.HotelPrabhat.HotelPrabhat.Service;

import com.HotelPrabhat.HotelPrabhat.Model.Room;

import java.util.List;

public interface HotelServiceInterface {
    public Room addRoom(Room room);

    public List<Room> addRooms(List<Room> rooms);

    public List<Room> getAllRooms();

    public List<Room> getAllBookedRooms();

    public List<Room> getAllUnbookedRooms();

    public Room checkInRoom(Room room);

    public void checkOutRoom(Room room);

    public Room deleteRoom(int roomNumber);
}
