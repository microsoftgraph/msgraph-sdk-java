package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TemporaryAccessPassAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The date and time when the temporaryAccessPass was created. */
    private OffsetDateTime _createdDateTime;
    /** The state of the authentication method that indicates whether it's currently usable by the user. */
    private Boolean _isUsable;
    /** Determines whether the pass is limited to a one time use. If true, the pass can be used once; if false, the pass can be used multiple times within the temporaryAccessPass lifetime. */
    private Boolean _isUsableOnce;
    /** The lifetime of the temporaryAccessPass in minutes starting at startDateTime. Minimum 10, Maximum 43200 (equivalent to 30 days). */
    private Integer _lifetimeInMinutes;
    /** Details about usability state (isUsable). Reasons can include: enabledByPolicy, disabledByPolicy, expired, notYetValid, oneTimeUsed. */
    private String _methodUsabilityReason;
    /** The date and time when the temporaryAccessPass becomes available to use. */
    private OffsetDateTime _startDateTime;
    /** The temporaryAccessPass used to authenticate. Returned only on creation of a new temporaryAccessPass; returned as NULL with GET. */
    private String _temporaryAccessPass;
    /**
     * Instantiates a new TemporaryAccessPassAuthenticationMethod and sets the default values.
     * @return a void
     */
    public TemporaryAccessPassAuthenticationMethod() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TemporaryAccessPassAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static TemporaryAccessPassAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemporaryAccessPassAuthenticationMethod();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the temporaryAccessPass was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TemporaryAccessPassAuthenticationMethod currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("isUsable", (n) -> { currentObject.setIsUsable(n.getBooleanValue()); });
            this.put("isUsableOnce", (n) -> { currentObject.setIsUsableOnce(n.getBooleanValue()); });
            this.put("lifetimeInMinutes", (n) -> { currentObject.setLifetimeInMinutes(n.getIntegerValue()); });
            this.put("methodUsabilityReason", (n) -> { currentObject.setMethodUsabilityReason(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("temporaryAccessPass", (n) -> { currentObject.setTemporaryAccessPass(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isUsable property value. The state of the authentication method that indicates whether it's currently usable by the user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUsable() {
        return this._isUsable;
    }
    /**
     * Gets the isUsableOnce property value. Determines whether the pass is limited to a one time use. If true, the pass can be used once; if false, the pass can be used multiple times within the temporaryAccessPass lifetime.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUsableOnce() {
        return this._isUsableOnce;
    }
    /**
     * Gets the lifetimeInMinutes property value. The lifetime of the temporaryAccessPass in minutes starting at startDateTime. Minimum 10, Maximum 43200 (equivalent to 30 days).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLifetimeInMinutes() {
        return this._lifetimeInMinutes;
    }
    /**
     * Gets the methodUsabilityReason property value. Details about usability state (isUsable). Reasons can include: enabledByPolicy, disabledByPolicy, expired, notYetValid, oneTimeUsed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethodUsabilityReason() {
        return this._methodUsabilityReason;
    }
    /**
     * Gets the startDateTime property value. The date and time when the temporaryAccessPass becomes available to use.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the temporaryAccessPass property value. The temporaryAccessPass used to authenticate. Returned only on creation of a new temporaryAccessPass; returned as NULL with GET.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemporaryAccessPass() {
        return this._temporaryAccessPass;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isUsable", this.getIsUsable());
        writer.writeBooleanValue("isUsableOnce", this.getIsUsableOnce());
        writer.writeIntegerValue("lifetimeInMinutes", this.getLifetimeInMinutes());
        writer.writeStringValue("methodUsabilityReason", this.getMethodUsabilityReason());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("temporaryAccessPass", this.getTemporaryAccessPass());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the temporaryAccessPass was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the isUsable property value. The state of the authentication method that indicates whether it's currently usable by the user.
     * @param value Value to set for the isUsable property.
     * @return a void
     */
    public void setIsUsable(@javax.annotation.Nullable final Boolean value) {
        this._isUsable = value;
    }
    /**
     * Sets the isUsableOnce property value. Determines whether the pass is limited to a one time use. If true, the pass can be used once; if false, the pass can be used multiple times within the temporaryAccessPass lifetime.
     * @param value Value to set for the isUsableOnce property.
     * @return a void
     */
    public void setIsUsableOnce(@javax.annotation.Nullable final Boolean value) {
        this._isUsableOnce = value;
    }
    /**
     * Sets the lifetimeInMinutes property value. The lifetime of the temporaryAccessPass in minutes starting at startDateTime. Minimum 10, Maximum 43200 (equivalent to 30 days).
     * @param value Value to set for the lifetimeInMinutes property.
     * @return a void
     */
    public void setLifetimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._lifetimeInMinutes = value;
    }
    /**
     * Sets the methodUsabilityReason property value. Details about usability state (isUsable). Reasons can include: enabledByPolicy, disabledByPolicy, expired, notYetValid, oneTimeUsed.
     * @param value Value to set for the methodUsabilityReason property.
     * @return a void
     */
    public void setMethodUsabilityReason(@javax.annotation.Nullable final String value) {
        this._methodUsabilityReason = value;
    }
    /**
     * Sets the startDateTime property value. The date and time when the temporaryAccessPass becomes available to use.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the temporaryAccessPass property value. The temporaryAccessPass used to authenticate. Returned only on creation of a new temporaryAccessPass; returned as NULL with GET.
     * @param value Value to set for the temporaryAccessPass property.
     * @return a void
     */
    public void setTemporaryAccessPass(@javax.annotation.Nullable final String value) {
        this._temporaryAccessPass = value;
    }
}
