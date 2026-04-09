
interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll_no;
    double marks1, marks2;

    void getDetails(String n, int r, double m1, double m2) {
        name = n;
        roll_no = r;
        marks1 = m1;
        marks2 = m2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result extends Student implements Exam {
    double per;

    public void percent_cal() {
        per = (marks1 + marks2) / 2;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per);
    }
}


public class result {
    public static void main(String[] args) {
        Result r = new Result();

        r.getDetails("Subhranil", 4182, 80, 90);
        r.percent_cal();
        r.display();
    }
}
