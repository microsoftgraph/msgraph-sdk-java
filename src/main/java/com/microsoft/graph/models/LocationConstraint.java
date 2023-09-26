package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationConstraint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations.
     */
    private Boolean isRequired;
    /**
     * Constraint information for one or more locations that the client requests for the meeting.
     */
    private java.util.List<LocationConstraintItem> locations;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The client requests the service to suggest one or more meeting locations.
     */
    private Boolean suggestLocation;
    /**
     * Instantiates a new LocationConstraint and sets the default values.
     */
    public LocationConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LocationConstraint
     */
    @jakarta.annotation.Nonnull
    public static LocationConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocationConstraint();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(LocationConstraintItem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("suggestLocation", (n) -> { this.setSuggestLocation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Gets the locations property value. Constraint information for one or more locations that the client requests for the meeting.
     * @return a java.util.List<LocationConstraintItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocationConstraintItem> getLocations() {
        return this.locations;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the suggestLocation property value. The client requests the service to suggest one or more meeting locations.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSuggestLocation() {
        return this.suggestLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("suggestLocation", this.getSuggestLocation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isRequired property value. The client requests the service to include in the response a meeting location for the meeting. If this is true and all the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the resources are busy, findMeetingTimes would still look for meeting times without locations.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
    /**
     * Sets the locations property value. Constraint information for one or more locations that the client requests for the meeting.
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<LocationConstraintItem> value) {
        this.locations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the suggestLocation property value. The client requests the service to suggest one or more meeting locations.
     * @param value Value to set for the suggestLocation property.
     */
    public void setSuggestLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.suggestLocation = value;
    }
}
