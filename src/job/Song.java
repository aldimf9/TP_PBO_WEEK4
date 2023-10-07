package job;
import art.Artist;
public class Song extends Artist {
    protected String title;
    protected String release;
    protected Artist[] artis;
    public Song(String title, String artist, String release,String birthdate) {
        super(artist,birthdate);
        this.name = artist;
        this.birthdate = birthdate;
        this.release = release;
        this.title = title;   
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRelease() {
          return release;
    }
    public void setRelease(String release) {
        this.release = release;
    }
    public Artist[] getArtis() {
        return artis;
    }
    public void setArtis(Artist[] artis) {
        this.artis = artis;
    }
    public int getAgeRelease(){
        String[] date = release.split("-");
        String tahun = date[0];
        String bulan = date[1];
        String tanggal = date[2];
        int hitungLahir = Integer.parseInt(tanggal)+(Integer.parseInt(bulan)*30)+(Integer.parseInt(tahun)*365);
        int hitungSekarang = 9+(10*30)+(2023*365);
        int hasil = (hitungSekarang - hitungLahir)/365;
        return hasil;
    }
    public void displayInfo(){
        System.out.println("Title   :"+getTitle());
        System.out.println("Artist  :"+getName());
        System.out.println("Release :"+getRelease());
        getBirthdate();
        int age = getAge()- getAgeRelease();
        System.out.println("Artist age is "+age+" when song released");
    }
}

