package com.HotelPrabhat.HotelPrabhat.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    String id;
    String name;
    String phoneNumber;
    String address;
    int age;
    String comingFrom;
    String goingTo;
}
