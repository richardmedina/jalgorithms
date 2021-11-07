package jalgorithms.impl.util;

import jalgorithms.common.util.StopWatch;

import java.time.Duration;
import java.time.LocalDateTime;

public class SimpleStopWatch implements StopWatch {

    LocalDateTime startTime = null;

    @Override
    public void init() {
        startTime = LocalDateTime.now();
    }

    @Override
    public void print() {
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);
    }

    private static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
}
