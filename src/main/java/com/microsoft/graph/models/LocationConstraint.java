package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LocationConstraint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations. */
    private Boolean _isRequired;
    /** Constraint information for one or more locations that the client requests for the meeting. */
    private java.util.List<LocationConstraintItem> _locations;
    /** The client requests the service to suggest one or more meeting locations. */
    private Boolean _suggestLocation;
    /**
     * Instantiates a new locationConstraint and sets the default values.
     * @return a void
     */
    public LocationConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a locationConstraint
     */
    @javax.annotation.Nonnull
    public static LocationConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocationConstraint();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LocationConstraint currentObject = this;
        return new HashMap<>(3) {{
            this.put("isRequired", (n) -> { currentObject.setIsRequired(n.getBooleanValue()); });
            this.put("locations", (n) -> { currentObject.setLocations(n.getCollectionOfObjectValues(LocationConstraintItem::createFromDiscriminatorValue)); });
            this.put("suggestLocation", (n) -> { currentObject.setSuggestLocation(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isRequired property value. The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this._isRequired;
    }
    /**
     * Gets the locations property value. Constraint information for one or more locations that the client requests for the meeting.
     * @return a locationConstraintItem
     */
    @javax.annotation.Nullable
    public java.util.List<LocationConstraintItem> getLocations() {
        return this._locations;
    }
    /**
     * Gets the suggestLocation property value. The client requests the service to suggest one or more meeting locations.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSuggestLocation() {
        return this._suggestLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeBooleanValue("suggestLocation", this.getSuggestLocation());
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
     * Sets the isRequired property value. The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequired = value;
    }
    /**
     * Sets the locations property value. Constraint information for one or more locations that the client requests for the meeting.
     * @param value Value to set for the locations property.
     * @return a void
     */
    public void setLocations(@javax.annotation.Nullable final java.util.List<LocationConstraintItem> value) {
        this._locations = value;
    }
    /**
     * Sets the suggestLocation property value. The client requests the service to suggest one or more meeting locations.
     * @param value Value to set for the suggestLocation property.
     * @return a void
     */
    public void setSuggestLocation(@javax.annotation.Nullable final Boolean value) {
        this._suggestLocation = value;
    }
}
