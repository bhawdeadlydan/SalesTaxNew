package com.pathshala.Sales;

public class Item {
    private boolean isFoodBookMedical;
    private double basePrice;
    private boolean isImported;
    private int amount;
    String name;


    public Item(double basePrice, boolean isImported, int amount, String name, boolean isFoodBookMedical) {
        this.basePrice = basePrice;
        this.amount = amount;
        this.isImported = isImported;
        this.name = name;
        this.isFoodBookMedical = isFoodBookMedical;
    }

    @Override
    public String toString() {
        return amount + ((isImported) ? " imported" : "") + " " + name + " " + "at" + " " + basePrice;
    }

    public double salesTax() {
        return 0;
        //return computeSalesTax(name, isImported);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Item item = (Item) o;

        if (isFoodBookMedical != item.isFoodBookMedical)
            return false;
        if (Double.compare(item.basePrice, basePrice) != 0)
            return false;
        if (isImported != item.isImported)
            return false;
        if (amount != item.amount)
            return false;
        return !(name != null ? !name.equals(item.name) : item.name != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (isFoodBookMedical ? 1 : 0);
        temp = Double.doubleToLongBits(basePrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isImported ? 1 : 0);
        result = 31 * result + amount;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public double calculateSalesTax() {
        if (!isFoodBookMedical) {
            return 0.1 * basePrice;
        }
    }

    public double calculateImportDuty() {
        if (isImported) {
            return 0.05 * basePrice;
        }
    }

    public double price() {
        return basePrice + calculateSalesTax()+calculateImportDuty();
    }
}
