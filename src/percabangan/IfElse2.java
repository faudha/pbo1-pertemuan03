package percabangan;

public class IfElse2 {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDidompet = 50000;

        if (uangDidompet < totalBelanja) {
            System.out.println("Uang Kurang, kurangi jajan anda");
        } else {
            System.out.println("Uang cukup, berelaan lah");
        }
    }
}