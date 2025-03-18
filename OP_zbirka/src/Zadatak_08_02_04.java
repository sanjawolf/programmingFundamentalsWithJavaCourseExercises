public class Zadatak_08_02_04 {

    static class KešMemorija {

        private ElementKeša[] keš; // keš-memorija
        private int n; // broj elemenata keš-memorije
        // Konstruktor
        public KešMemorija(int veličina) {
            keš = new ElementKeša[veličina];
        }
        public void add(ElementKeša noviElem) {
            ElementKeša elem;
            int i;
// Da li je element već u kešu?
            for (i = 0; i < n; i++) {
//                106 8. Nizovi
                elem = keš[i];
                if (noviElem.equals(elem)) {
                    noviElem = elem;
                    break;
                }
            }
            if (i == n) // element nije nađen
                if (n == keš.length) // i keš je pun
                    i--; // ukloniti poslednji element keša
                else
                    n++;
// Napraviti mesto na početku niza
            for (int j = i; j > 0; j--)
                keš[j] = keš[j - 1];
            keš[0] = noviElem;
        }
        // Najskorije korišćen (prvi) element keša
        public ElementKeša NKE() {
            return keš[0];
        }
        public void prikaži() {
            for (int i = 0; i < n; i++)
                System.out.println(keš[i]);
        }
        public void prikažiSve() {
            for (ElementKeša elem : keš)
                System.out.println(elem);
        }

    }

    public static void main(String[] args) {
        KešMemorija kešReči = new KešMemorija(5);
        kešReči.add(new ElementKeša("Pera"));
        kešReči.add(new ElementKeša("Zika"));
        kešReči.add(new ElementKeša("Laza"));
        kešReči.add(new ElementKeša("Zika"));
//            8.2. Rešenja zadataka 107
        kešReči.add(new ElementKeša("Mika"));
        kešReči.add(new ElementKeša("Mika"));
        kešReči.add(new ElementKeša("Pera"));
        kešReči.add(new ElementKeša("Sava"));
        kešReči.add(new ElementKeša("Deki"));
        kešReči.add(new ElementKeša("Zika"));
        kešReči.add(new ElementKeša("Zika"));
        System.out.println("Sadržaj keša:");
        kešReči.prikaži();
        System.out.println();
        kešReči.prikažiSve();
    }



    static class ElementKeša {
        private String sadržaj; // sadržaj elementa keša
        // Konstruktor
        public ElementKeša(String s) {
            sadržaj = s;
        }
        public String getSadržaj() {
            return sadržaj;
        }
        public boolean equals(Object o) {
            ElementKeša drugiElement = (ElementKeša) o;
            return sadržaj.equals(drugiElement.sadržaj);
        }
        public String toString() {
            return "element keša: " + sadržaj;
        }
    }

}
