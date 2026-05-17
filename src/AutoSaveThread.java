import java.util.ArrayList;

public class AutoSaveThread extends Thread {

    private ArrayList<Student> students;

    public AutoSaveThread(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void run() {

        while (true) {

            try {

                Thread.sleep(10000);

                FileManager.saveToFile(students);

                System.out.println("Auto-save completed.");

            } catch (InterruptedException e) {

                System.out.println("Auto-save thread interrupted.");
            }
        }
    }
}