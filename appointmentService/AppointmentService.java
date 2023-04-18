package Module5;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService extends Appointment {

    private static List<Appointment> allAppointments = new ArrayList<Appointment>();

    public AppointmentService(String Id, String date, String description) {
        super(Id, date, description);
    }

    public void addAppointment(String Id, String date, String description) {
        Appointment myAppointment = new Appointment(Id, date, description);
        allAppointments.add(myAppointment);
    }

    public int getAppointmentIndexById(String Id) {
        for(int i = 0; i < allAppointments.size(); i++) {
            Appointment matchedAppointment = allAppointments.get(i);
            String matchedAppointmentIndex = matchedAppointment.getId();

            if(Id.equals(matchedAppointmentIndex)) {
                return i;
            }
        }
        return -1;
    }

    public Appointment getAppointmentsById(String Id) {
        for(int i = 0; i < allAppointments.size(); i++) {
            Appointment matchedAppointment = allAppointments.get(i);
            String matchedAppointmentId = matchedAppointment.getId();

            if(Id.equals(matchedAppointmentId)) {
                return matchedAppointment;
            }
        }

        return null;
    }

    public boolean deleteAppointmentPerId(String Id) {
        int foundAppointment = getAppointmentIndexById(Id);
        if(foundAppointment != -1) {
            allAppointments.remove(foundAppointment);
            return true;
        }
        return false;
    }

}
