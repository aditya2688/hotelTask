package model.hotel;

import model.customer.Customer;

public sealed abstract class Hotel permits Oyo, Radisson, Taj {

    // rating number int
    private int rating;

    private int rate;

    public int getRate(Customer customer) {
        return rate;
    }

    public int getRating() {
        return rating;
    }

}
