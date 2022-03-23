import service.IRunSolvdLaba;
import service.impl.RunSolvdLabaImpl;

class Main {
    public static void main(String[] args) {
        IRunSolvdLaba solvdLaba = new RunSolvdLabaImpl();
        solvdLaba.runProject();
    }
}
