class Decipherer {
    
/* 
    •Calcule la longueur de la chaîne et divise-la par 2, tu obtiendras ainsi le "chiffre-clé".
    •Récupère ensuite la sous-chaîne de la longueur du chiffre-clé, en commençant à partir du 6ème caractère.
    •Remplace les chaînes '@#?' par un espace.
    •Pour finir, inverse la chaîne de caractères.  */
    
    public static String DecodeMessage (String s)
    {
        int n = s.length();
        int key = (int)(n/2);// arrondi par défaut
        String s2 = "";
        if (n>=6+key)
        {
            s2=s.substring(5,5+key); // on commence à l'indice 0
            s2=s2.replace("@#?", " ");
            s2=reverseIt(s2);
            return s2;
        }
        return "";
    }
        

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

    return dest.toString();
    }

    public static void main(String[] args) {
        System.out.println(DecodeMessage("0@sn9sirppa@#?ia'jgtvryko1")+ " " +
                           DecodeMessage("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj")+ " " +
                           DecodeMessage("aopi?sedohtém@#?sedhtmg+p9l!"));
       
    }
}