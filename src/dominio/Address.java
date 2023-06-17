package dominio;

public abstract class Address {

    protected String road;
    protected Integer house;

    public Address(String road, Integer house) {
        this.road = road;
        this.house = house;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

}
