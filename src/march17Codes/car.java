package march17Codes;

public class car {
    private int modelYear;
    private int numOfTickets;
    private int numOfAccidents;
    double priceOffer;
    double basePrice;

    public car(int modelYear, int numOfTickets, int numOfAccidents, double priceOffer, double basePrice){
        this.modelYear=modelYear;
        this.numOfTickets=numOfTickets;
        this.numOfAccidents=numOfAccidents;
        this.priceOffer=priceOffer;
        this.basePrice=basePrice;

        }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public int getNumOfAccidents() {
        return numOfAccidents;
    }

    public void setNumOfAccidents(int numOfAccidents) {
        this.numOfAccidents = numOfAccidents;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "car{" +
                "modelYear=" + modelYear +
                ", numOfTickets=" + numOfTickets +
                ", numOfAccidents=" + numOfAccidents +
                ", priceOffer=" + priceOffer +
                ", basePrice=" + basePrice +
                '}';
    }

    public double offer(int currentYear){
       double yourOffer= this.basePrice+(currentYear-this.modelYear)*50+(30*this.numOfTickets)+(100*this.numOfAccidents);

            return yourOffer;
    }

    }
