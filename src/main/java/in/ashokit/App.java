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
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println(app.welcome(););
    }
}
