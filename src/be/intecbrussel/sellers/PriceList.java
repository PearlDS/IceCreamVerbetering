package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double standardMagnumPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double standardMagnumPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.standardMagnumPrice = standardMagnumPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getStandardMagnumPrice(Magnum.MagnumType type) {
        double price = standardMagnumPrice;

        //methode 1 met if else
//        if(type.equals(Magnum.MagnumType.ROMANTICSTRAWBERRIES)){
//            price*=1.5;
//        }else if (type.equals(Magnum.MagnumType.MILKCHOCOLTATE)){
//            price*=2;
//        }

        //methode 2 met switch
//        switch (type){
//
//            case MILKCHOCOLTATE:price*=2; break;
//            case ROMANTICSTRAWBERRIES:price*=1.5;
//
//        }

        //methode 3 met waarden in de enums
        return price*type.getPrice();
    }

    public void setStandardMagnumPrice(double standardMagnumPrice) {
        this.standardMagnumPrice = standardMagnumPrice;
    }
}
