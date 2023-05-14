package SwitchExpression;

public class ApiResponseHandler {
    public String handleResponse(ApiResponse response) {
        return switch (response.status()) {
            case OK -> "Success: " + response.data();
            case BAD_REQUEST -> "Bad request: " + response.message();
            case UNAUTHORIZED -> "Unauthorized: " + response.message();
            case NOT_FOUND -> "Not found: " + response.message();
            case INTERNAL_SERVER_ERROR -> "Internal server error: " + response.message();
            default -> throw new IllegalArgumentException("Invalid response status: " + response.message());
        };
    }
}