package in.ashokit;

/**
 * Hello world!
 *
 */
public class App 
{
    public String welcome(){
        System.out.println("Welcome to GitHub.com")
    }
    public String greet(){
        System.out.println("Grettings from Vaibhav..");
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println(app.welcome(););
        String msg = app.greet();
        System.out.println(msg);
    }

}
