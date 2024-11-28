package src;

import java.time.LocalDateTime;

public record Note(LocalDateTime dateTime, String description)
{
    @Override
    public String toString() {
        return dateTime.toString() + ": " + description;
    }
}