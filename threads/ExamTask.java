class ExamTask extends Thread {
    private String task;
    private int delay;

    public ExamTask(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }

    public void run() {
        try {
            System.out.println(task + " State: " + getState());
            Thread.sleep(delay);
            System.out.println(task + " started by " + getName());
        } catch (Exception e) {}
    }
}

public class ExamHall {
    public static void main(String[] args) {
        ExamTask entry = new ExamTask("Student Entry", 0);
        ExamTask question = new ExamTask("Question Distribution", 5000);
        ExamTask attendance = new ExamTask("Attendance", 10000);
        ExamTask collection = new ExamTask("Answer Collection", 15000);

        question.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        entry.start();
        question.start();
        attendance.start();
        collection.start();
    }
}