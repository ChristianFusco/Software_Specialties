public class HelloWorld {
     public static void main(String []args) {
        //This is too hard and so inflexible. If only there were a better way!
        Outfit outfit1 = new Outfit("blue shirt", "jeans", "wooly socks", "boots", "leather jacket");
        System.out.println(outfit1);
        
        //Now with the builder pattern, I can enter the variables in any order!
        OutfitBuilder outfitBuilder = new OutfitBuilder();
        //Because the setters return the builder object, I can chain them!
        outfitBuilder.setTop("tank top").setShoes("sandals");
        Outfit outfit2 = outfitBuilder.buildOutfit();
        //It's that easy!
        System.out.println(outfit2);
        
        //I can even make different kinds of outfit builders that will generate objects according to their own instructions!
        OutfitBuilder winterBuilder = new WinterBuilder();
        Outfit outfit3 = winterBuilder.buildOutfit();
        //My life will never be the same!
        System.out.println(outfit3);
     }
}
