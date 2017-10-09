class HamburgerBuilder extends SandwichBuilder{
    public HamburgerBuilder() {
        super();
        name = "hamburger";
        bread = "seeded bun";
        addContents("beef patty");
        addContents("lettuce");
        addContents("tomato");
        addContents("onion");
    }
}