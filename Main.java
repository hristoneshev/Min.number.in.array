public class Main {

    public static void main(String[] args) {

        int [] array = {3,-2,4,12,-10,34,-25,200};
        int MIN = array [0];

        for (int i=1; i<array.length; i++) {
            if (MIN>array[i]) {
                MIN = array[i];
            }
        }
        System.out.println("MIN element is " + MIN);
    }
}
