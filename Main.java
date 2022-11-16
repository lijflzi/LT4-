class Mammals {
    public void sound() {
        System.out.println("Mammal sounds");
    }
}

class Monkey extends Mammals {
    public void sound() {
        System.out.println("Ooh-ooh-ah-ah");
    }
}

class Lion extends Mammals {
    public void sound() {
        System.out.println("Rawrrrr");
    }
}

class Cow extends Mammals {
    public void sound() {
        System.out.println("Moooooo");
    }
}

public class Main {
    public static void main(String[] args) {
        Monkey c = new Monkey();
        Lion p = new Lion();
        Cow l = new Cow();

        c.sound();
        p.sound();
        l.sound();
    }
}
