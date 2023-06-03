package App.Server.Timers;

import App.Server.Entities.Document;

import java.util.TimerTask;

public class ReservationTimer extends AbstractTimer {
    private final  Document         reservedDocument;
    private static ReservationTimer timerInstance;

    public ReservationTimer(Document reservedDocument) {
        this.reservedDocument = reservedDocument;
    }

    public static ReservationTimer getInstance() {
        if (timerInstance == null) {
            timerInstance = new ReservationTimer(null);
        }

        return timerInstance;
    }

    public void run() {
        if (this.reservedDocument != null) {
            this.reservedDocument.resetReservation();
        }
    }

    public String getName() {
        return "RESERVATION_TIMER";
    }

    public int getDuration() {
        return 7_200_000; //2h
    }
}