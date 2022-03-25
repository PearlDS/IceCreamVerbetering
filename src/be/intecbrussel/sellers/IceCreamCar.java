package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {

        Cone cone = prepareCone(flavors);

        profit+=priceList.getBallPrice()*flavors.length;
        return cone;
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
        if (stock.getCones()<=0){
            throw new NoMoreIceCreamException();
        }
        if (stock.getBalls()<flavors.length){
            throw new NoMoreIceCreamException();
        }

        int currentConeStock = stock.getCones()-1;
        int currentBallStock= stock.getBalls()-flavors.length;
        stock.setCones(currentConeStock);
        stock.setBalls(currentBallStock);
        return new Cone(flavors);

    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        IceRocket iceRocket = prepareIceRocket();
        profit+=priceList.getRocketPrice();
        return iceRocket;
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if(stock.getRockets()<=0) {
            throw new NoMoreIceCreamException();
        }
        int currentStock = stock.getRockets()-1;
        stock.setRockets(currentStock);
        return new IceRocket();


    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
