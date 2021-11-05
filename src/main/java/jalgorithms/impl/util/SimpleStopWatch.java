package jalgorithms.impl.util;

import jalgorithms.common.util.StopWatch;

import java.time.Duration;
import java.time.LocalDateTime;

public class SimpleStopWatch implements StopWatch {

    LocalDateTime startTime = null;
    LocalDateTime endTime = null;


    @Override
    public void start() {
        startTime = LocalDateTime.now();
    }

    @Override
    public void stop() {
        endTime = LocalDateTime.now();
    }

    @Override
    public void restart() {
        startTime = LocalDateTime.now();
        endTime = null;
    }

    @Override
    public void print() {
        var duration = Duration.between(startTime, endTime);
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
