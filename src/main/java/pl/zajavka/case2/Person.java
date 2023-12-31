package pl.zajavka.case2;

import java.math.BigDecimal;


record Person(String name, BigDecimal salary) {

    public BigDecimal howMuchDoYouEarn() {
        return salary;
    }

    public Boolean doYouLikePizza() {
        return true;
    }
    public Boolean doYouHaveABike() {
        return true;
    }

    public String whatIsYourJob() {
        return "Software developer!";
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }

}
