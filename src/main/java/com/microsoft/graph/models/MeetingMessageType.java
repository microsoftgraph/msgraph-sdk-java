package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of application entities. */
public enum MeetingMessageType implements ValuedEnum {
    None("none"),
    MeetingRequest("meetingRequest"),
    MeetingCancelled("meetingCancelled"),
    MeetingAccepted("meetingAccepted"),
    MeetingTenativelyAccepted("meetingTenativelyAccepted"),
    MeetingDeclined("meetingDeclined");
    public final String value;
    MeetingMessageType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeetingMessageType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "meetingRequest": return MeetingRequest;
            case "meetingCancelled": return MeetingCancelled;
            case "meetingAccepted": return MeetingAccepted;
            case "meetingTenativelyAccepted": return MeetingTenativelyAccepted;
            case "meetingDeclined": return MeetingDeclined;
            default: return null;
        }
    }
}
