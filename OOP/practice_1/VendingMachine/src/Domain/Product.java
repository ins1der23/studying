package Domain;

public class Product {
    private String name;
    private int price;
    private int place;

    public Product(String name, int price, int place) {
        this.name = name;
        this.price = price;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0)
            this.price = 10;
        else
            this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("%s, цена - %d, место - %d", this.name, this.price, this.place);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 3;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + place;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
