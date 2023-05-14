package SwitchExpression;

public class ApiResponseHandler {
    public String handleResponse(ApiResponse response) {
        return switch (response.getStatus()) {
            case OK -> "Success: " + response.getData();
            case BAD_REQUEST -> "Bad request: " + response.getMessage();
            case UNAUTHORIZED -> "Unauthorized: " + response.getMessage();
            case NOT_FOUND -> "Not found: " + response.getMessage();
            case INTERNAL_SERVER_ERROR -> "Internal server error: " + response.getMessage();
            default -> throw new IllegalArgumentException("Invalid response status: " + response.getStatus());
        };
    }
}