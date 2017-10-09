public class HelloWorld {
    public static void main(String []args) {
        SandwichBuilder boring = new SandwichBuilder();
        Sandwich sandwich = boring.build();
        System.out.println(sandwich.toString());

        SandwichBuilder moreFun = new SandwichBuilder();
        moreFun.setName("The Usual")
               .setBread("wheat roll")
               .addContents("ham")
               .addContents("mayo")
               .addContents("cheese");
        sandwich = moreFun.build();

        SandwichBuilder burger = new HamburgerBuilder();
        System.out.println(burger.build().toString());

        SandwichBuilder cheeseBurger = new HamburgerBuilder();
        cheeseBurger.addContents("cheese");
        System.out.println(cheeseBurger.build().toString());

        SandwichBuilder hotDog = new HotDogBuilder();
        System.out.println(hotDog.build().toString());
    }
}