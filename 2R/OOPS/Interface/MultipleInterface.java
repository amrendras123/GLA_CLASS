interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MultipleInterface implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        MultipleInterface obj = new MultipleInterface();
        obj.print();
        obj.show();
    }
}