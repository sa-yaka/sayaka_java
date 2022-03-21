package ship;

public class ship implements all_ship {
    private String type;
    private String className;
    private String name;
    private int weight;
    private int length;

    public ship(String type, String className, String name, int weight, int length) {
        this.type = shipType;
        this.className = shipClassName;
        this.name = shipName;
        this.weight = allWeight;
        this.length = allLength;
    }

    public void setType(String shipType) {
        type = shipType;
    }

    public void setClassName(String shipClassName) {
        className = shipClassName;
    }

    public void setName(String shipName) {
        name = shipName;
    }

    public void setWeight(int allWeight) {
        weight = allWeight;
    }

    public void setLength(int allLength) {
        length = allLength;
    }

    @Override
    public String getShipType() {
        return type;
    }

    @Override
    public String getShipClassName() {
        return className;
    }

    @Override
    public String getShipName() {
        return shipName;
    }

    @Override
    public int getAllWeight() {
        return allWeight;
    }

    @Override
    public int getAllLength() {
        return allLength;
    }


}
