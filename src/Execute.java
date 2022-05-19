
// Пример со зданиями.

class Building {
    String purpose;
    String address;
    int floors_number;
    private String wallMaterial;

    public Building() //default constructor
    {
        this.purpose = " ";
        this.address = " ";
        this.floors_number = 0;
        this.wallMaterial = " ";
    }

    public Building(String purpose, String address, int floors_number, String wallMaterial) {
        this.purpose = purpose;
        this.address = address;
        this.floors_number = floors_number;
        this.wallMaterial = wallMaterial;
    }

    public void setWallMaterial (String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getInfo() {
        return (" The purpose is " + purpose + ".\n Address: " + address+".\n Number of floors: " + floors_number + " and wall material is " + wallMaterial);
    }
}

public class Execute {
    public static void main(String []args) {
        Building cafe = new Building();
        cafe.purpose="organization of recreation";
        cafe.address="London, Baker Street";
        cafe.floors_number = 2;
        // cafe.wallMaterial="brick"; // error because of private type
        cafe.setWallMaterial("brick");
        System.out.println("Information about the cafe:\n" + cafe.getInfo());

        Building shop = new Building("organization of shopping", "London, Crawford street", 1, "wood");
        System.out.println("Information about the shop:\n" + shop.getInfo());
    }
}