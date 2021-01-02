/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("title=").append(title).append(",");

        sb.append("yearOfPublishing=").append(yearOfPublishing).append(",");

        sb.append("authors=[").append(String.join(",", authors)).append("]");

        return sb.toString();
    }
}