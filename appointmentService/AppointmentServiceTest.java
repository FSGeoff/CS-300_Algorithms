package Module5;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

    @Test
    void testGetId() {
        Appointment appointment = new Appointment("id3456", "2023-04-07", "This is only a test");

        assertTrue(appointment.getId().equals("id3456"));
    }



    @Test
    void testGetDescription() {
        Appointment appointment = new Appointment("id3456", "2023-04-07", "This is only a test");

        appointment.setDescription("No need to worry");

        assertTrue(appointment.getDescription().equals("No need to worry"));
    }



    @Test
    void testAddAppointment() {
        AppointmentService appointment = new AppointmentService("id3456", "2023-04-07", "This is only a test");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate = formatter.format(appointment.getDate());

        assertTrue(appointment.getId().equals("id3456"));
        assertEquals("2023-04-07", formattedDate);
        assertTrue(appointment.getDescription().equals("This is only a test"));
    }





    @Test
    void testDeleteAppointmentPerId() {
        AppointmentService appointment = new AppointmentService("id3456", "2023-04-07", "This is only a test");

        appointment.addAppointment("id3456", "2023-04-07", "This is only a test");

        assertTrue(appointment.deleteAppointmentPerId(appointment.getId()));
    }
}