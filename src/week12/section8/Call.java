package week12.section8;

public class Call {
    private String callType;
    private String startCall;
    private String endCall;
    private String caller;
    private String recipient;

    // Default constructor
    public Call() {}

    // Getter methods
    public String getCallType() {
        return callType;
    }

    public String getStartCall() {
        return startCall;
    }

    public String getEndCall() {
        return endCall;
    }

    public String getCaller() {
        return caller;
    }

    public String getRecipient() {
        return recipient;
    }

    // Setter methods
    public void setCallType(String callType) {
        this.callType = callType;
    }

    public void setStartCall(String startCall) {
        if (startCall.isEmpty()) {
            System.out.println("Start time cannot be empty.");
        } else {
            this.startCall = startCall;
        }
    }

    public void setEndCall(String endCall) {
        if (endCall.isEmpty()) {
            System.out.println("End time cannot be empty.");
        } else if (this.startCall != null && !isValidEndTime(endCall)) {
            System.out.println("End time cannot be earlier than the start time.");
        } else {
            this.endCall = endCall;
        }
    }

    public void setCaller(String caller) {
        if (isValidPhoneNumber(caller)) {
            this.caller = caller;
        } else {
            System.out.println("Invalid caller phone number.");
        }
    }

    public void setRecipient(String recipient) {
        if (isValidPhoneNumber(recipient)) {
            this.recipient = recipient;
        } else {
            System.out.println("Invalid recipient phone number.");
        }
    }

    // Additional instance method
    public void displayCallDetails() {
        System.out.println("Call Type: " + callType);
        System.out.println("Start Time: " + startCall);
        System.out.println("End Time: " + endCall);
        System.out.println("Caller: " + caller);
        System.out.println("Recipient: " + recipient);
    }

    // Helper method to validate phone number format
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\+\\d{10}");
    }

    // Helper method to validate end time
    private boolean isValidEndTime(String endTime) {
        // This is a simplified check. For a more robust solution,
        // you might want to use java.time.LocalTime for parsing and comparison.
        return endTime.compareTo(this.startCall) >= 0;
    }
}