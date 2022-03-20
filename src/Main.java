import service.HomeTaskFours;
import service.impl.HomeTaskFoursImpl;

class Main {
    public static void main(String[] args) {
        HomeTaskFours homeTaskFours = new HomeTaskFoursImpl();
        homeTaskFours.runHomeTaskFour();
    }
}
