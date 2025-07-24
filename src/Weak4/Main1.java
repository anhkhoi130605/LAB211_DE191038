package Weak4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessStudentlist ps = new ProcessStudentlist();
        Menu menu = new Menu();
        ps.loadFromFile("D:\\NetBeansProjects\\LAB211\\MyLab211\\StudentforWeak4.txt");
        while (true) {
            menu.showmenu();
            System.out.print("Your choice: ");
            String input = sc.nextLine().trim();
            
            
            if (!input.matches("[1-5]")) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.\n");
                continue;
            }

            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1: 
                    for (int i = 0; i < 3; i++) {
                        System.out.println("\nEnter student " + (i + 1));
                        System.out.print("ID: ");
                        String id = sc.nextLine().trim();

                        System.out.print("Full Name: ");
                        String name = sc.nextLine().trim();

                        int sem = -1;
                        while (true) {
                            System.out.print("Semester (number): ");
                            try {
                                sem = Integer.parseInt(sc.nextLine().trim());
                                if (sem < 0) {
                                    System.out.println("Semester must be >= 0.");
                                    continue;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid semester. Enter a valid number.");
                            }
                        }

                        System.out.print("Major: ");
                        String major = sc.nextLine().trim();

                        if (id.isEmpty() || name.isEmpty() || major.isEmpty()) {
                            System.out.println("All fields must be filled. Skipping student.");
                            continue;
                        }

                        Students s = new Students(id, name, sem, major);
                        ps.create(s);
                    }
                    System.out.println("Created students.\n");
                    break;

                case 2: 
                    System.out.print("Enter name to search: ");
                    String keyword = sc.nextLine().trim().toLowerCase();
                    ps.FindAndSort(keyword);

                    if (ps.studentlistforsort.isEmpty()) {
                        System.out.println("No student found with that name.\n");
                    } else {
                        System.out.println("Students found and sorted:");
                        for (Students s : ps.studentlistforsort) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3: // Update/Delete
                    System.out.print("Enter Student ID: ");
                    String findId = sc.nextLine().trim();

                    System.out.print("Do you want to Update (U) or Delete (D)? ");
                    String op = sc.nextLine().trim().toUpperCase();
                    if (!(op.equals("U") || op.equals("D"))) {
                        System.out.println("Invalid option. Please enter U or D.\n");
                        break;
                    }

                    if (op.equals("U")) {
                        System.out.print("New Full Name: ");
                        String newName = sc.nextLine().trim();
                        int newSem = -1;
                        while (true) {
                            System.out.print("New Semester: ");
                            try {
                                newSem = Integer.parseInt(sc.nextLine().trim());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number. Try again.");
                            }
                        }
                        System.out.print("New Major: ");
                        String newMajor = sc.nextLine().trim();

                        Students updated = new Students(findId, newName, newSem, newMajor);
                        Students result = ps.UpdateAndDelte(updated, 'U');
                        if (result != null) {
                            System.out.println("Updated successfully: " + result + "\n");
                        } else {
                            System.out.println("Student not found.\n");
                        }

                    } else { 
                        Students dummy = new Students(findId, "", 0, "");
                        Students result = ps.UpdateAndDelte(dummy, 'D');
                        if (result != null) {
                            System.out.println("Deleted successfully: " + result + "\n");
                        } else {
                            System.out.println("Student not found.\n");
                        }
                    }
                    break;

                case 4: 
                    System.out.println("=== Student Report ===");
                    for (Students s : ps.getStudentlist()) {
                        System.out.println(s);
                    }
                    break;

                case 5: 
                    System.out.println("Thank you for using the app!");
                    return;
            }
        }
    }
}
