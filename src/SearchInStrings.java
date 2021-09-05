class SearchInStrings {

    public static void main(String[] args) {
        String name = "Shagun";
        char target = 'a';
        //boolean isPresent = search(name, target);
        boolean isPresent = search2(name, target);
        System.out.println(isPresent);
    }

    /**
     * search for a character in a string using forEach loop
     *
     * @param name
     * @param target
     * @return
     */
    static boolean search(String name, char target) {

        if (name.length() == 0) {
            return false;
        }

        for (char c : name.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * search for a character in a string
     *
     * @param name
     * @param target
     * @return
     */
    static boolean search2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
