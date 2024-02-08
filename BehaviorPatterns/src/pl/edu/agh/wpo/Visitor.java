package pl.edu.agh.wpo;

interface Elements {
    // Elements kolekcji musi akpcetować obiekt Visitora
    public void accept(Visitor v);
}

class Element1 implements Elements {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String element1() {
        return "Element1";
    }
}

class Element2 implements Elements {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String element2() {
        return "Element2";
    }
}

class Element3 implements Elements {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String element3() {
        return "Element3";
    }
}

interface Visitor {
    public void visit(Element1 e);

    public void visit(Element2 e);

    public void visit(Element3 e);
}

class FirstVisitor implements Visitor {
    public void visit(Element1 e) {
        System.out.println("do first visit on " + e.element1());
    }

    public void visit(Element2 e) {
        System.out.println("do first visit on  " + e.element2());
    }

    public void visit(Element3 e) {
        System.out.println("do first visit on  " + e.element3());
    }
}

class SecondVisitor implements Visitor {
    public void visit(Element1 e) {
        System.out.println("do second visit on " + e.element1());
    }

    public void visit(Element2 e) {
        System.out.println("do second visit on " + e.element2());
    }

    public void visit(Element3 e) {
        System.out.println("do second visit on " + e.element3());
    }
}

class VisitorDemo {
    public static Elements[] list = {new Element1(), new Element2(), new Element3()};

    public static void main(String[] args) {
        FirstVisitor up = new FirstVisitor();
        SecondVisitor down = new SecondVisitor();
        for (int i = 0; i < list.length; i++) {
            list[i].accept(up);
        }
        for (int i = 0; i < list.length; i++) {
            list[i].accept(down);
        }
    }
}
