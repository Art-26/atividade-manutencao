public class BorrowRequest {
    public int userId;
    public int bookId;
    public String borrowDate;
    public String dueDate;
    public String channel;
    public int maxDays;
    public String process;
    public int policyCode;

    public BorrowRequest(int userId, int bookId, String borrowDate, String dueDate, String channel, int maxDays, String process, int policyCode) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.channel = channel;
        this.maxDays = maxDays;
        this.process = process;
        this.policyCode = policyCode;
    }
}
