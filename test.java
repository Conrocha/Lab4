public class test {

    public static void addsFive(int intFiveIsAddedTo){
        intFiveIsAddedTo += 5;
    }

    public static void main(String[] args){
        int thisIsAnInt = 5;
        addsFive(thisIsAnInt);

        System.out.print(thisIsAnInt);
        addsFive(thisIsAnInt);
    }
}
