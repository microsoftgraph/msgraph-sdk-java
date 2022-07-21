package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertHistoryState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Application ID of the calling application that submitted an update (PATCH) to the alert. The appId should be extracted from the auth token and not entered manually by the calling application. */
    private String _appId;
    /** UPN of user the alert was assigned to (note: alert.assignedTo only stores the last value/UPN). */
    private String _assignedTo;
    /** Comment entered by signed-in user. */
    private java.util.List<String> _comments;
    /** Analyst feedback on the alert in this update. Possible values are: unknown, truePositive, falsePositive, benignPositive. */
    private AlertFeedback _feedback;
    /** The OdataType property */
    private String _odataType;
    /** Alert status value (if updated). Possible values are: unknown, newAlert, inProgress, resolved, dismissed. */
    private AlertStatus _status;
    /** Date and time of the alert update. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _updatedDateTime;
    /** UPN of the signed-in user that updated the alert (taken from the bearer token - if in user/delegated auth mode). */
    private String _user;
    /**
     * Instantiates a new alertHistoryState and sets the default values.
     * @return a void
     */
    public AlertHistoryState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.alertHistoryState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertHistoryState
     */
    @javax.annotation.Nonnull
    public static AlertHistoryState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertHistoryState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appId property value. The Application ID of the calling application that submitted an update (PATCH) to the alert. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the assignedTo property value. UPN of user the alert was assigned to (note: alert.assignedTo only stores the last value/UPN).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the comments property value. Comment entered by signed-in user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getComments() {
        return this._comments;
    }
    /**
     * Gets the feedback property value. Analyst feedback on the alert in this update. Possible values are: unknown, truePositive, falsePositive, benignPositive.
     * @return a alertFeedback
     */
    @javax.annotation.Nullable
    public AlertFeedback getFeedback() {
        return this._feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlertHistoryState currentObject = this;
        return new HashMap<>(8) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getStringValue()); });
            this.put("comments", (n) -> { currentObject.setComments(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("feedback", (n) -> { currentObject.setFeedback(n.getEnumValue(AlertFeedback.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AlertStatus.class)); });
            this.put("updatedDateTime", (n) -> { currentObject.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the status property value. Alert status value (if updated). Possible values are: unknown, newAlert, inProgress, resolved, dismissed.
     * @return a alertStatus
     */
    @javax.annotation.Nullable
    public AlertStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the updatedDateTime property value. Date and time of the alert update. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this._updatedDateTime;
    }
    /**
     * Gets the user property value. UPN of the signed-in user that updated the alert (taken from the bearer token - if in user/delegated auth mode).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUser() {
        return this._user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfPrimitiveValues("comments", this.getComments());
        writer.writeEnumValue("feedback", this.getFeedback());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
        writer.writeStringValue("user", this.getUser());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appId property value. The Application ID of the calling application that submitted an update (PATCH) to the alert. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the assignedTo property value. UPN of user the alert was assigned to (note: alert.assignedTo only stores the last value/UPN).
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the comments property value. Comment entered by signed-in user.
     * @param value Value to set for the comments property.
     * @return a void
     */
    public void setComments(@javax.annotation.Nullable final java.util.List<String> value) {
        this._comments = value;
    }
    /**
     * Sets the feedback property value. Analyst feedback on the alert in this update. Possible values are: unknown, truePositive, falsePositive, benignPositive.
     * @param value Value to set for the feedback property.
     * @return a void
     */
    public void setFeedback(@javax.annotation.Nullable final AlertFeedback value) {
        this._feedback = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the status property value. Alert status value (if updated). Possible values are: unknown, newAlert, inProgress, resolved, dismissed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AlertStatus value) {
        this._status = value;
    }
    /**
     * Sets the updatedDateTime property value. Date and time of the alert update. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the updatedDateTime property.
     * @return a void
     */
    public void setUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._updatedDateTime = value;
    }
    /**
     * Sets the user property value. UPN of the signed-in user that updated the alert (taken from the bearer token - if in user/delegated auth mode).
     * @param value Value to set for the user property.
     * @return a void
     */
    public void setUser(@javax.annotation.Nullable final String value) {
        this._user = value;
    }
}
