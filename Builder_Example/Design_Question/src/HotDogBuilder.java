class HotDogBuilder extends SandwichBuilder{
    public HotDogBuilder() {
        super();
        name = "hot dog";
        bread = "hot dog bun";
        addContents("sausage");
        addContents("ketchup");
        addContents("mustard");
    }
}