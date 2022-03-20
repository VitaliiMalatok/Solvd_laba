import service.ISolvdLaba;
import service.impl.SolvdLabaImpl;

class Main {
    public static void main(String[] args) {
        ISolvdLaba solvdLaba = new SolvdLabaImpl();
        solvdLaba.runProject();
    }
}
