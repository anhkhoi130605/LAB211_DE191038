/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProcessFlightInFormation {

    Scanner sc = new Scanner(System.in);
    ArrayList<Reservation> arrrs = new ArrayList<>();

    public void inputNumberofReservation(int n) {
        n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            Reservation rs = new Reservation();

            // Mã đặt phòng
            while (true) {
                String id = sc.nextLine().trim();
                if (id.length() != 6 || !id.matches("\\d{6}")) {
                    System.out.println("Invalid ID! Must be 6 digits.");
                    continue;
                }
                boolean isDuplicate = false;
                for (Reservation reser : arrrs) {
                    if (reser.getBookingID().equals(id)) {
                        System.out.println("BookingID already exists. Please enter a unique ID.");
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) continue;
                rs.setBookingID(id);
                break;
            }

            // Tên khách hàng
            while (true) {
                String namecus = sc.nextLine().trim();
                boolean isValid = true;
                for (int k = 0; k < namecus.length(); k++) {
                    char c = namecus.charAt(k);
                    if (!Character.isLetter(c) && c != ' ') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    rs.setCustomerName(namecus);
                    break;
                } else {
                    System.out.println("Invalid Data!!");
                }
            }

            // Số điện thoại
            while (true) {
                String phone = sc.nextLine().trim();
                if (phone.matches("\\d{12}")) {
                    rs.setPhoneNumber(phone);
                    break;
                }
                System.out.println("Invalid Data");
            }

            // Số phòng
            while (true) {
                String roomnumber = sc.nextLine().trim();
                if (roomnumber.matches("\\d{4}")) {
                    rs.setRoomNumber(roomnumber);
                    break;
                }
                System.out.println("Invalid Data");
            }

            // Ngày đặt phòng
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime bookingDate;
            while (true) {
                try {
                    String input = sc.nextLine().trim();
                    LocalDate date = LocalDate.parse(input, dtf);
                    bookingDate = date.atStartOfDay();
                    if (bookingDate.isAfter(LocalDateTime.now())) {
                        rs.setDateTime(bookingDate);
                        break;
                    } else {
                        System.out.println("Booking date must be after today.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid date format. Use dd/MM/yyyy");
                }
            }

            // Hỏi có cần đón sân bay không
            System.out.print("Need airport pick up? (Y/N): ");
            String choice = sc.nextLine().trim();
            if (choice.equalsIgnoreCase("Y")) {
                FlightInformation fi = new FlightInformation();
                System.out.print("Flight Number: ");
                fi.setFlightNumber(sc.nextLine().trim());

                System.out.print("Seat Number: ");
                fi.setSeatNumber(sc.nextLine().trim());

                DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                while (true) {
                    try {
                        System.out.print("Pick Up Time (dd/MM/yyyy HH:mm): ");
                        String input = sc.nextLine().trim();
                        LocalDateTime pickup = LocalDateTime.parse(input, dtfTime);
                        if (pickup.isAfter(LocalDateTime.now()) && pickup.isBefore(rs.getDateTime())) {
                            fi.setTimePickUp(pickup);
                            break;
                        } else {
                            System.out.println("Pickup time must be after now and before booking date.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid datetime format. Use dd/MM/yyyy HH:mm");
                    }
                }
                rs.setFlightInformation(fi);
            }

            arrrs.add(rs);
            System.out.println("Information saved successfully.");
        }
    }
     public void updateReservation() {
        System.out.print("Enter booking ID to update: ");
        String id = sc.nextLine().trim();
        for (Reservation rs : arrrs) {
            if (rs.getBookingID().equals(id)) {
                System.out.println("Leave field blank to keep current value");

                // Name
                System.out.print("Name: ");
                String name = sc.nextLine().trim();
                if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                    rs.setCustomerName(name);
                }

                // Phone
                System.out.print("Phone: ");
                String phone = sc.nextLine().trim();
                if (!phone.isEmpty() && phone.matches("\\d{12}")) {
                    rs.setPhoneNumber(phone);
                }

                // Room number
                System.out.print("Room Number: ");
                String room = sc.nextLine().trim();
                if (!room.isEmpty() && room.matches("\\d{4}")) {
                    rs.setRoomNumber(room);
                }

                // Booking Date
                System.out.print("Booking Date (dd/MM/yyyy): ");
                String dateStr = sc.nextLine().trim();
                if (!dateStr.isEmpty()) {
                    try {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDateTime date = LocalDate.parse(dateStr, dtf).atStartOfDay();
                        if (date.isAfter(LocalDateTime.now())) {
                            rs.setDateTime(date);
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid date format.");
                    }
                }

                // Airport pickup
                System.out.print("Update flight info? (Y/N): ");
                String pick = sc.nextLine().trim();
                if (pick.equalsIgnoreCase("Y")) {
                    FlightInformation fi = new FlightInformation();
                    System.out.print("Flight Number: ");
                    fi.setFlightNumber(sc.nextLine().trim());
                    System.out.print("Seat Number: ");
                    fi.setSeatNumber(sc.nextLine().trim());

                    DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    while (true) {
                        try {
                            System.out.print("Pick Up Time (dd/MM/yyyy HH:mm): ");
                            String input = sc.nextLine().trim();
                            LocalDateTime pickup = LocalDateTime.parse(input, dtfTime);
                            if (pickup.isAfter(LocalDateTime.now()) && pickup.isBefore(rs.getDateTime())) {
                                fi.setTimePickUp(pickup);
                                break;
                            } else {
                                System.out.println("Pickup time must be after now and before booking date.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid datetime format.");
                        }
                    }
                    rs.setFlightInformation(fi);
                }
                System.out.println("Reservation updated.");
                return;
            }
        }
        System.out.println("Booking ID not found.");
    }

    public void deleteReservation() {
        System.out.print("Enter booking ID to delete: ");
        String id = sc.nextLine().trim();
        for (int i = 0; i < arrrs.size(); i++) {
            if (arrrs.get(i).getBookingID().equals(id)) {
                System.out.print("Are you sure? (Y/N): ");
                String confirm = sc.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    arrrs.remove(i);
                    System.out.println("Reservation deleted.");
                } else {
                    System.out.println("Delete cancelled.");
                }
                return;
            }
        }
        System.out.println("Booking ID not found.");
    }

    public void printPickUpReservations() {
        ArrayList<Reservation> filtered = new ArrayList<>();
        for (Reservation rs : arrrs) {
            if (rs.getFlightInformation() != null) {
                filtered.add(rs);
            }
        }
        Collections.sort(filtered, Comparator.comparing(r -> r.getFlightInformation().getTimePickUp()));
        for (Reservation rs : filtered) {
            System.out.printf("%s - %s - %s - %s - %s - %s - %s\n",
                rs.getBookingID(),
                rs.getCustomerName(),
                rs.getPhoneNumber(),
                rs.getFlightInformation().getFlightNumber(),
                rs.getFlightInformation().getSeatNumber(),
                rs.getFlightInformation().getTimePickUp().toString(),
                rs.getRoomNumber()
            );
        }
    }

    public void printAllReservations() {
        for (Reservation rs : arrrs) {
            System.out.printf("%s - %s - %s - %s - %s",
                rs.getBookingID(),
                rs.getCustomerName(),
                rs.getPhoneNumber(),
                rs.getRoomNumber(),
                rs.getDateTime().toString()
            );
            if (rs.getFlightInformation() != null) {
                System.out.printf(" - %s - %s - %s\n",
                    rs.getFlightInformation().getFlightNumber(),
                    rs.getFlightInformation().getSeatNumber(),
                    rs.getFlightInformation().getTimePickUp().toString()
                );
            } else {
                System.out.println();
            }
        }
    }
}

