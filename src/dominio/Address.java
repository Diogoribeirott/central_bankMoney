package dominio;

abstract class Address {
  protected String road;
  protected int house;

  
    public Address(String road,int house){
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

   
    public void setHouse(int house) {
        this.house = house;
    }

}