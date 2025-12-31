import java.util.Scanner;

public class MCQQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String[] questions = {
                "1. Which language is platform-independent?",
                "2. Who invented Java?",
                "3. Which of these is NOT a Java primitive data type?",
                "4. Which keyword is used to create an object in Java?",
                "5. Which method is the entry point of a Java program?",
                "6. Arrays in Java are:",
                "7. Which operator is used for comparison?",
                "8. Which OOP concept means 'many forms'?",
                "9. Which package contains Java's built-in classes?",
                "10. Which keyword prevents inheritance?"
            };

            String[][] options = {
                {"A) Java", "B) C", "C) Assembly", "D) COBOL"},
                {"A) Dennis Ritchie", "B) James Gosling", "C) Bill Gates", "D) Bjarne Stroustrup"},
                {"A) int", "B) float", "C) char", "D) string"},
                {"A) create", "B) build", "C) new", "D) object"},
                {"A) run()", "B) start()", "C) main()", "D) execute()"},
                {"A) Objects", "B) Variables", "C) Functions", "D) Homogeneous collections"},
                {"A) =", "B) ==", "C) !", "D) +"},
                {"A) Encapsulation", "B) Abstraction", "C) Polymorphism", "D) Inheritance"},
                {"A) java.util", "B) java.lang", "C) java.io", "D) java.api"},
                {"A) final", "B) static", "C) abstract", "D) private"}
            };

            char[] answers = {'A', 'B', 'D', 'C', 'C', 'D', 'B', 'C', 'B', 'A'};
            char[] userAnswers = new char[10];

            int score = 0;

            System.out.println("\n===== MCQ Quiz (10 Questions) =====\n");

            for (int i = 0; i < questions.length; i++) {

                System.out.println(questions[i]);

                for (String opt : options[i]) {
                    System.out.println(opt);
                }

                System.out.print("Your answer: ");
                char userAns = Character.toUpperCase(sc.next().charAt(0));
                userAnswers[i] = userAns;

                if (userAns == answers[i]) {
                    System.out.println("✔ Correct!\n");
                    score++;
                } else {
                    System.out.println("✘ Wrong! Correct answer: " + answers[i] + "\n");
                }
            }

            System.out.println("===== Quiz Finished =====");
            System.out.println("Your Score: " + score + "/" + questions.length);

            System.out.println("\n===== Correct Answers Summary =====");
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.println("Your Answer: " + userAnswers[i]);
                System.out.println("Correct Answer: " + answers[i] + "\n");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            char choice = Character.toUpperCase(sc.next().charAt(0));

            if (choice != 'Y') {
                System.out.println("\nThank you for playing, Harshit!");
                break;
            }
        }

        sc.close();
    }
}