public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("mesajın 7. elemanı : " + mesaj.charAt(6));
        System.out.println(mesaj.concat(" Ankara"));
        // concat metodu varolan String değişkenini etkilemektedir.

        char temp[] = new char[5];

        mesaj.getChars(0, 5, temp, 0);

        System.out.println(temp);
        System.out.println("Bugün kelimesinin başlangıç index'i : " + mesaj.indexOf("Bugün"));
        System.out.println(mesaj.lastIndexOf("a"));
    }
}
