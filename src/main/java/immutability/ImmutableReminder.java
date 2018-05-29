package immutability;

import java.util.Date;

public final class ImmutableReminder {

    private final Date remainingdate;

    public ImmutableReminder(Date remainingDate) {

        if (remainingDate.getTime() < System.currentTimeMillis()) {
            throw new IllegalArgumentException("Can not set reminder"
                    + "for past time: " + remainingDate);
        }

        this.remainingdate = new Date(remainingDate.getTime());
    }

    public Date getRemainingdate() {
        return (Date) remainingdate.clone();
    }

}
