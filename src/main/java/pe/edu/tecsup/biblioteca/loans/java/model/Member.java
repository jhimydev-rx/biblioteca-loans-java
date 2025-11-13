/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.tecsup.biblioteca.loans.java.model;

/**
 *
 * @author chboy
 */
import java.time.LocalDate;
import java.util.Objects;

public class Member {
    private final String id;
    private String name;
    private int activeLoans = 0;

    public Member(String id, String name) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getActiveLoans() { return activeLoans; }

    public void incrementLoans() { this.activeLoans++; }
    public void decrementLoans() { if (activeLoans > 0) this.activeLoans--; }
}
