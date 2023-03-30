import java.util.Scanner;
import java.util.ArrayList;

class LawnServiceProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Appointment> schedule = new ArrayList<>();
        int totalAppointments = 0;

        System.out.println("Welcome to the Lawn Service Program!");
        while (totalAppointments < 40) {
            System.out.print("Would you like to add an appointment (Y/N)? ");
            String input = in.nextLine().toLowerCase();

            if (input.equals("y")) {
                System.out.print("Enter the day of the appointment: ");
                String day = in.nextLine();
                System.out.print("Enter the time of the appointment: ");
                String time = in.nextLine();
                Appointment newAppointment = new Appointment(day, time);
                schedule.add(newAppointment);
                totalAppointments++;
                System.out.println("Appointment added!");
            } else if (input.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
        System.out.println("\nSchedule:");
        for (Appointment appointment : schedule) {
            System.out.println(appointment.toString());
        }
        System.out.println("\nGoodbye!");
    }
}

class Appointment {
    private final String day;
    private final String time;

    public Appointment(String day, String time) {
        this.day = day;
        this.time = time;
    }

    public String toString() {
        return this.day + " at " + this.time;
    }
}
