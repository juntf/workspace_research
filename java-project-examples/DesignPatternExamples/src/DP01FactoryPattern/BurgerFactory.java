package DP01FactoryPattern;

public class BurgerFactory {

    public Burger getBurger(String burgerName) {

        if(burgerName == null ) {
            return null;
        }

        if(burgerName.equalsIgnoreCase("LOTTERIA")) {
            return new LotteriaBurger();
        }else if(burgerName.equalsIgnoreCase("MCDONALS")) {
            return new McdonaldsBuger();
        }else if(burgerName.equalsIgnoreCase("KFC")) {
            return new KFCBurger();
        }

        return null;
    }
}
