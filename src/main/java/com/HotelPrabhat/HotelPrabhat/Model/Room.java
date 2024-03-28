package com.HotelPrabhat.HotelPrabhat.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    String id;
    boolean isBooked;
    int RoomNumber;
    String roomType;
    int numberOfCustomer;
    double roomRentPerDay;
    Instant checkIn;
    Instant checkOut;

}
