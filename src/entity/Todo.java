package entity;

/**
 * Represents a Todo task or item with details about the task and its metadata.
 */
public class Todo {
    private final int id;               // Unique ID of the Todo item
    private final String title;         // Title or name of the task
    private final String description;   // Detailed description of the task
    private final String dueDate;       // Due date of the task (formatted as String, e.g., "YYYY-MM-DD")
    private final String priority;      // Priority of the task (e.g., "High", "Medium", "Low")
    private final String username;      // Username of the user responsible for the task
    private final String password;      // Password for accessing or editing the task (if applicable)

    /**
     * Constructs a Todo object with all fields initialized.
     *
     * @param id          Unique ID of the task.
     * @param title       Title or name of the task.
     * @param description Detailed description of the task.
     * @param dueDate     Due date of the task.
     * @param priority    Priority level of the task.
     * @param username    Username associated with the task.
     * @param password    Password for task access (if applicable).
     */
    public Todo(int id, String title, String description, String dueDate, String priority, String username, String password) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.username = username;
        this.password = password;
    }

    // Getters for all fields
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Returns a string representation of the Todo object.
     * Note: Password is redacted for security reasons.
     *
     * @return A string containing task details except the password.
     */
    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", priority='" + priority + '\'' +
                ", username='" + username + '\'' +
                ", password='******'" + // Mask the password
                '}';
    }
}
