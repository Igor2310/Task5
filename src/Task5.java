class Task5 {

    private String line1;

    public Task5(String s1) {
        line1 = s1;
    }

    public void getline() {

        for (int i = 0; i < line1.length(); i++) {
            if (Character.isUpperCase(line1.toCharArray()[i]) && i!=0) {
                System.out.println();
                System.out.print(line1.toCharArray()[i]);
            } else {
                System.out.print(line1.toCharArray()[i]);
            }
        }
    }


    public static void main(String[] args) {
        String s1 = "ILoveJavaProgramming";
        Task5 s2 = new Task5(s1);
        s2.getline();
    }
}
