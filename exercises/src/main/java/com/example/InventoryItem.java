public class InventoryItem{

    private String name;
    private int quantity;
    private double pricePerUnit;
    private int lowStockThreshold;

    public InventoryItem(String name, int quantity, double pricePerUnit, int lowStockThreshold){
    
        this.name = name;
        if(quantity < 0){
            throw new IllegalArgumentException();
        } else{
        this.quantity = quantity;
    }
        if (pricePerUnit < 0){
            throw new IllegalArgumentException();
        } else{
            this.pricePerUnit = pricePerUnit;
        }
        this.lowStockThreshold = lowStockThreshold;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPricePerPoint(){
        return pricePerUnit;
    }

    public int getLowStockThreshold(){
        return lowStockThreshold;
    }

    public void restock(int units){
        if(units > 0){
            quantity = quantity + units;
        } else{
            throw new IllegalArgumentException();
        }

    }

    public void sell(int units){
        if (units > quantity){
            throw new IllegalArgumentException();
        } else if(units <= 0){
            throw new IllegalArgumentException();
        }

        quantity = quantity - units;


    }

    public boolean isLowStock(){
        if(quantity <= lowStockThreshold){
            return true;
        }
        return false;
    }

    public double getTotalValue(){
        return quantity * pricePerUnit;
        
    }
}