package com.HotelPrabhat.HotelPrabhat.Service;

import com.HotelPrabhat.HotelPrabhat.Model.Room;
import com.HotelPrabhat.HotelPrabhat.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class HotelService implements HotelServiceInterface{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Room addRoom(Room room) {
        return (Room) hotelRepository.save(room);
    }

    @Override
    public List<Room> addRooms(List<Room> rooms) {
        return null;
    }

    @Override
    public List<Room> getAllRooms() {
        return null;
    }

    @Override
    public List<Room> getAllBookedRooms() {
        return null;
    }

    @Override
    public List<Room> getAllUnbookedRooms() {
        return null;
    }

    @Override
    public Room checkInRoom(Room room) {
        room.setBooked(true);
        room.setCheckIn(Instant.now());
        return room;
    }

    @Override
    public void checkOutRoom(Room room) {

    }

    @Override
    public Room deleteRoom(int roomNumber) {
        return null;
    }
}
