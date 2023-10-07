package job;
/**
 *
 * @author Aldi M F
 */
import art.Artist;
public class DriverSong {
    public static void main(String[] args){
        Artist a1 = new Artist("Alan Walker","1997-08-24");
        Artist a2 = new Artist("Ari Lasso","1973-01-17");
        a1.displayInfo();
        a2.displayInfo();
        System.out.println("");
        Song song1 = new Song("Not You",a1.getName(),"2021-12-03","1997-08-24");
        Song song2 = new Song("Hampa",a2.getName(),"2003-02-10","1973-01-17");
        song1.displayInfo();
        song2.displayInfo();
    }
}
