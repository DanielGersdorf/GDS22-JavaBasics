public class Tagesabschnitt {
    public static void main(String[] args) {

        // 6-9 -> Früh
        //9-12 -> Vormittag
        //12-16 -> Nachmittag
        //16-20 -> Abend
        //20-6 -> Nacht

        byte hour = 11;
        String abschnitt = "";
       // abschnitt = getDayTimeName(;

        }


        //public static return_type (void) name (parameter)
        public static String getDayTimeName(byte time) {
            String abschnitt = "";

            if(time < 6 || time >= 20) {
                abschnitt = "Nacht";
            } else if(time <9){
                abschnitt = "Früh";
            } else if(time <12){
                abschnitt = "Vormittag";
            } else if(time <16){
                abschnitt = "Nachmittag";
            } else {
                abschnitt = "Früh";
            }

        return abschnitt;
        }

    }
