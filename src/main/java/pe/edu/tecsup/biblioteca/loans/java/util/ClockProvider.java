/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.tecsup.biblioteca.loans.java.util;

/**
 *
 * @author chboy
 */
import java.time.Clock;
import java.time.ZoneId;

public final class ClockProvider {
    private static Clock clock = Clock.systemDefaultZone();

    private ClockProvider() {}

    public static Clock getClock() {
        return clock;
    }

    public static void setFixedClock(Clock fixedClock) {
        clock = fixedClock;
    }

    public static void reset() {
        clock = Clock.systemDefaultZone();
    }

    public static java.time.LocalDate today() {
        return java.time.LocalDate.now(clock);
    }

    public static java.time.LocalDateTime now() {
        return java.time.LocalDateTime.now(clock);
    }

    public static void setZone(String zoneId) {
        clock = Clock.system(ZoneId.of(zoneId));
    }
}
