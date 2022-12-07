package earth.world.hello;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.print("Hello, " + (0==args.length ? "World" : String.join(", ", args)) + "!");
    }

}
