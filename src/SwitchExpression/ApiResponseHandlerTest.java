package SwitchExpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiResponseHandlerTest {

    private final ApiResponseHandler handler = new ApiResponseHandler();

    @Test
    void handleResponse_ok() {
        ApiResponse response = new ApiResponse(Status.OK, "Data", null);
        String message = handler.handleResponse(response);
        assertEquals("Success: null", message);    // null object provided as data
    }

    @Test
    void handleResponse_badRequest() {
        ApiResponse response = new ApiResponse(Status.BAD_REQUEST, "Invalid parameter", null);
        String message = handler.handleResponse(response);
        assertEquals("Bad request: Invalid parameter", message);
    }

    @Test
    void handleResponse_unauthorized() {
        ApiResponse response = new ApiResponse(Status.UNAUTHORIZED, "Invalid credentials", null);
        String message = handler.handleResponse(response);
        assertEquals("Unauthorized: Invalid credentials", message);
    }

    @Test
    void handleResponse_notFound() {
        ApiResponse response = new ApiResponse(Status.NOT_FOUND, "Resource not found", null);
        String message = handler.handleResponse(response);
        assertEquals("Not found: Resource not found", message);
    }

    @Test
    void handleResponse_internalServerError() {
        ApiResponse response = new ApiResponse(Status.INTERNAL_SERVER_ERROR, "Server error", null);
        String message = handler.handleResponse(response);
        assertEquals("Internal server error: Server error", message);
    }
}