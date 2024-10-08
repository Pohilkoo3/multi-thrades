package ru.pohilko.multithrades.lessons.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String message;

    @Override
    public String toString() {
        return message;
    }
}
