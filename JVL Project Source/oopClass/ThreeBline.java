public class ThreeBline {
    public static void main(String[] args) {
        print_mice[] runMice = new print_mice[2];
        runMice[0] = new print_mice("Three bline mice\n");
        runMice[1] = new print_mice("See how they run\n");

        System.out.println(runMice[0].getReturn().repeat(2));
        System.out.println(runMice[1].getReturn().repeat(2));
    }
}


class print_mice{
    private String print_ruturn;

    public print_mice(String n){
        print_ruturn = n;
    }

    public String getReturn(){
        return print_ruturn;
    }
}