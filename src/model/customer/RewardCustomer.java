package model.customer;

import model.hotel.Hotel;
import model.hotel.Oyo;
import model.hotel.Radisson;
import model.hotel.Taj;

import javax.swing.*;

public final class RewardCustomer implements Customer {

    @Override
    public void bookHotel(Hotel hotel) {
        int bookingRate = 0;
        if (hotel instanceof Oyo) {
            // call the getRate method of Oyo
            Oyo oyo = new Oyo();
            bookingRate = oyo.getRate(this);
        } else if (hotel instanceof Radisson) {
            // call the getRate method of Radisson
            Radisson radisson = new Radisson();
            bookingRate = radisson.getRate(this);
        } else if (hotel instanceof Taj) {
            // call the getRate method of Taj
            Taj taj = new Taj();
            bookingRate = taj.getRate(this);
        }
        JOptionPane.showConfirmDialog(
                null,
                "The booking rate for the hotel is ₹ " + bookingRate
        );
    }

}
