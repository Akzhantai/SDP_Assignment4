class NonFictionBook implements Book {
    private String title;

    public NonFictionBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return "Non-Fiction Book: " + title;
    }
}