package moje;
// test
public class PalindromV2 {


    private static boolean polishSignChecker(char c) { //czy jest polskim znakiem
        char[] alphabetPL = {'Ą', 'Ć', 'Ę', 'Ł', 'Ń', 'Ó', 'Ś', 'Ź', 'Ż', 'ą', 'ć', 'ę', 'ł', 'ń', 'ó', 'ś', 'ź', 'ż'};
        boolean found = false;
        for (char x : alphabetPL) {
            if (x == c) {
                found = true;
                break;
            }
        }
        if ((c > 64 & c < 91) || (c > 96 & c < 123) || found) {
            return true;
        } else return false;
    }


        private static String stringCleaner(String s){ //czyści stringa z innych znaków niż litery
            StringBuilder stringBuilder = new StringBuilder("");
            char c;
            for (int i = 0; i < s.length(); i++) {
                c =s.charAt(i);
                if(polishSignChecker(c)){
                    stringBuilder=stringBuilder.append(c);

                }

            }
                s=stringBuilder.toString().toLowerCase();
            return s;
        }

        private void isPalindrom (String s){
            String p = new StringBuilder(stringCleaner(s)).reverse().toString();

            System.out.println(p);
            System.out.println(p.equals(stringCleaner(s)) ? s + " jest palindromem" : s + " nie jest palindromem");
        }

        public static void main (String[]args){
            PalindromV2 palindrom = new PalindromV2();

            palindrom.isPalindrom("Co mi dał duch   \n- cud, ład i moc.");

        }
    }


