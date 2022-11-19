package RocketLeague;

public class Car {
    
    String name;
    String color;
    int boost;
    String wheels;
    String decal;
    String goalExplosion;
    String alianceColor;

    public Car(String name, String color, String wheels, String decal, String goalExplosion) {
        this.name = name;
        this.color = color;
        this.boost = 100;
        this.wheels = wheels;
        this.decal = decal;
        this.goalExplosion = goalExplosion;
        this.alianceColor = null;
    }

    public void changeAlianceColor (String alianceColor) {
        this.alianceColor = alianceColor;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + ", boost=" + boost + ", wheels=" + wheels + ", decal=" + decal
                + ", goalExplosion=" + goalExplosion + ", alianceColor=" + alianceColor + "]";
    }

    
}