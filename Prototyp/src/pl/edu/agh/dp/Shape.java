package pl.edu.agh.dp;

abstract public class Shape implements Cloneable {
    private String name;
    protected String type;

    abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw: " + getType());
    }
}

class Square extends Shape {
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw: " + getType());
    }
}

class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("draw: " + getType());
    }
}

