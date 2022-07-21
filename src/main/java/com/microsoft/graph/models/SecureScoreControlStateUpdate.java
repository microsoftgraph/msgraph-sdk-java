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
public class SecureScoreControlStateUpdate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Assigns the control to the user who will take the action. */
    private String _assignedTo;
    /** Provides optional comment about the control. */
    private String _comment;
    /** The OdataType property */
    private String _odataType;
    /** State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty). */
    private String _state;
    /** ID of the user who updated tenant state. */
    private String _updatedBy;
    /** Time at which the control state was updated. */
    private OffsetDateTime _updatedDateTime;
    /**
     * Instantiates a new secureScoreControlStateUpdate and sets the default values.
     * @return a void
     */
    public SecureScoreControlStateUpdate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.secureScoreControlStateUpdate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a secureScoreControlStateUpdate
     */
    @javax.annotation.Nonnull
    public static SecureScoreControlStateUpdate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecureScoreControlStateUpdate();
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
     * Gets the assignedTo property value. Assigns the control to the user who will take the action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the comment property value. Provides optional comment about the control.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecureScoreControlStateUpdate currentObject = this;
        return new HashMap<>(6) {{
            this.put("assignedTo", (n) -> { currentObject.setAssignedTo(n.getStringValue()); });
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("updatedBy", (n) -> { currentObject.setUpdatedBy(n.getStringValue()); });
            this.put("updatedDateTime", (n) -> { currentObject.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the state property value. State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the updatedBy property value. ID of the user who updated tenant state.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdatedBy() {
        return this._updatedBy;
    }
    /**
     * Gets the updatedDateTime property value. Time at which the control state was updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this._updatedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("updatedBy", this.getUpdatedBy());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
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
     * Sets the assignedTo property value. Assigns the control to the user who will take the action.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the comment property value. Provides optional comment about the control.
     * @param value Value to set for the comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
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
     * Sets the state property value. State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the updatedBy property value. ID of the user who updated tenant state.
     * @param value Value to set for the updatedBy property.
     * @return a void
     */
    public void setUpdatedBy(@javax.annotation.Nullable final String value) {
        this._updatedBy = value;
    }
    /**
     * Sets the updatedDateTime property value. Time at which the control state was updated.
     * @param value Value to set for the updatedDateTime property.
     * @return a void
     */
    public void setUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._updatedDateTime = value;
    }
}
