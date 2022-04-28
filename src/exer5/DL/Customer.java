package exer5.DL;

public class Customer {
    long id;
    String name;
    short tier;



    public Customer(){
        id = -1;
        name = null;
        tier = -1;
    }
    public Customer(String line){

      var linedata = line.split(" ");

      id = Long.parseLong(linedata[0].split(":")[1]);
      name = linedata[1].split(":")[1].trim();
      tier = Short.parseShort( linedata[2].split(":")[1].trim());
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(short tier) {
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getTier() {
        return tier;
    }
}
