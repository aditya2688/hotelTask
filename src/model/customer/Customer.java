package model.customer;

import model.hotel.Hotel;

public sealed interface Customer permits RegularCustomer, RewardCustomer {

    public void bookHotel(Hotel hotel);

}
// Hotel hotel = new Hotel(); X abstract class -> no object
// Hotel hotel = new Oyo();
// Hotel hotel = new Radisson();
// Hotel hotel = new Taj();
