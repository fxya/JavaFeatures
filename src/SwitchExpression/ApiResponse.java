package SwitchExpression;

public class ApiResponse {
    private final Status status;
    private final String message;
    private final Object data;

    public ApiResponse(Status status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
