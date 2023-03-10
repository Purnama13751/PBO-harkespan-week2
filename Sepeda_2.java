class Sepeda {
    
    int gear = 5;
    int gear2 = 6;
    int Roda;
    String Jenis, Merk;
   
    void ngerem() {
        System.out.println("Sepeda direm");
    }

    Sepeda(int jumlahRoda, String jenis, String merk) {

        Roda = jumlahRoda;
        Jenis = jenis;
        Merk = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}

class lampu {
    //atribut
    boolean nyala;
    
    //method
    void nyalakanLampu() {
        nyala = true;
    }
    void matikanLampu() {
        nyala = false;
    }
}


class Sepeda_2 {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(2, "Listrik", "United");
        Sepeda sepeda2 = new Sepeda(3, "Tricity", "Yamaha");

        int gearSepeda1 = sepeda1.gear;
        System.out.println("Jumlah gear "+gearSepeda1);
        sepeda1.ngerem();

        int gearSepeda2 = sepeda2.gear2;
        System.out.println("Jumlah gear "+gearSepeda2);
        sepeda2.ngerem();

        lampu lampu1 = new lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
        
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
    }
}
