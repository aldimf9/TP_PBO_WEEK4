package art;

public class Artist {
    protected String name;
    protected String birthdate;
    
    public Artist(String name,String birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        String[] date = birthdate.split("-");
        String tahun = date[0];
        String bulan = date[1];
        String tanggal = date[2];
        if(bulan.equals("01")){
            bulan = "Januari";
        } else if(bulan.equals("02")){
            bulan = "Februari";
        } else if(bulan.equals("03")){
            bulan = "Maret";
        } else if(bulan.equals("04")){
            bulan = "April";
        } else if(bulan.equals("05")){
            bulan = "Mei";
        } else if(bulan.equals("06")){
            bulan = "Juni";
        } else if(bulan.equals("07")){
            bulan = "Juli";
        } else if(bulan.equals("08")){
            bulan = "Agustus";
        } else if(bulan.equals("09")){
            bulan = "September";
        } else if(bulan.equals("10")){
            bulan = "Oktober";
        } else if(bulan.equals("11")){
            bulan = "November";
        } else if(bulan.equals("12")){
            bulan = "Desember";
        }
        birthdate = tanggal+" "+bulan+" "+tahun;
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public int getAge(){
        String[] date = birthdate.split(" ");
        String tahun = date[2];
        String bulan = date[1];
        if(bulan.equals("Januari")){
            bulan = "1";
        } else if(bulan.equals("Februari")){
            bulan = "2";
        } else if(bulan.equals("Maret")){
            bulan = "3";
        } else if(bulan.equals("April")){
            bulan = "4";
        } else if(bulan.equals("Mei")){
            bulan = "5";
        } else if(bulan.equals("Juni")){
            bulan = "6";
        } else if(bulan.equals("Juli")){
            bulan = "7";
        } else if(bulan.equals("Agustus")){
            bulan = "8";
        } else if(bulan.equals("September")){
            bulan = "9";
        } else if(bulan.equals("Oktober")){
            bulan = "10";
        } else if(bulan.equals("November")){
            bulan = "11";
        } else if(bulan.equals("Desember")){
            bulan = "12";
        }
        String tanggal = date[0];
        int hitungLahir = Integer.parseInt(tanggal)+(Integer.parseInt(bulan)*30)+(Integer.parseInt(tahun)*365);
        int hitungSekarang = 9+(10*30)+(2023*365);
        int hasil = (hitungSekarang - hitungLahir)/365;
        return hasil;
    }
    public void displayInfo(){
        System.out.println("Artist name :"+getName());
        System.out.println("Birthdate   :"+getBirthdate());
        System.out.println("Age         :"+getAge());
    }
}
