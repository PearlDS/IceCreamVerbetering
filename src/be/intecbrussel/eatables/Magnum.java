package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a magnum of type: "+type);
    }


    public enum MagnumType {

        MILKCHOCOLTATE(2.0), ROMANTICSTRAWBERRIES(1.5), WHITECHOCOLATE(1);

        private double price;

        MagnumType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
