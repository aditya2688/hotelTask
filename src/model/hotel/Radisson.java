package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public final class Radisson extends Hotel {

    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            // weekday -> 130, weekend -> 90
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 110;
            } else {
                return 100;
            }
        } else if (customer instanceof RewardCustomer) {
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 90;
            } else {
                return 100;
            }
        }
        return 0;
    }
}
