class Hotel {
    String name = "Ambuja";
    Owner owner = new Owner("aruna", 38, "Male");

    public Hotel() {
        System.out.println("This is running in Hotel class");
    }

    public void display() {
        System.out.println("Name: " + this.name);
        owner.show();
    }
}
