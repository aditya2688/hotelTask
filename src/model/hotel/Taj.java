package model.hotel;

import model.customer.Customer;
import model.customer.RegularCustomer;
import model.customer.RewardCustomer;

import java.time.LocalDate;

public final class Taj extends Hotel {

    @Override
    public int getRating() {
        return 2;
    }

    @Override
    public int getRate(Customer customer) {
        if (customer instanceof RegularCustomer) {
            // weekday -> 130, weekend -> 90
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 110;
            } else {
                return 120;
            }
        } else if (customer instanceof RewardCustomer) {
            if (LocalDate.now().getDayOfWeek().name().equals("SATURDAY")
                    || LocalDate.now().getDayOfWeek().name().equals("SUNDAY")) {
                return 95;
            } else {
                return 110;
            }
        }
        return 0;
    }
}
