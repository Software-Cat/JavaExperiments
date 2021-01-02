/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.*;
import java.util.stream.Collectors;

class Monitor {

    public static Map<String, Long> getUrlToNumberOfVisited(List<LogEntry> logs) {
//        Map<String, Long> urlToVisits = new HashMap<>();
//        for (LogEntry entry : logs) {
//            if (urlToVisits.containsKey(entry.getUrl())) {
//                urlToVisits.put(entry.getUrl(), urlToVisits.get(entry.getUrl()) + 1);
//            } else {
//                urlToVisits.put(entry.getUrl(), 1L);
//            }
//        }
//        return urlToVisits;
        return logs.stream().collect(Collectors.groupingBy(LogEntry::getUrl, Collectors.summingLong(a -> 1L)));
    }

    static class LogEntry {

        private Date created;
        private String login;
        private String url;

        public LogEntry(Date created, String login, String url) {
            this.created = created;
            this.login = login;
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LogEntry)) {
                return false;
            }

            LogEntry logEntry = (LogEntry) o;

            if (!login.equals(logEntry.login)) {
                return false;
            }
            return url.equals(logEntry.url);
        }

        @Override
        public int hashCode() {
            int result = login.hashCode();
            result = 31 * result + url.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "LogEntry{" +
                    ", created=" + created +
                    ", login='" + login + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}