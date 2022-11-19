package com.microsoft.graph.communications.presences.item.setuserpreferredpresence;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the setUserPreferredPresence method. */
public class SetUserPreferredPresencePostRequestBody implements AdditionalDataHolder, Parsable {
    /** The activity property */
    private String _activity;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The availability property */
    private String _availability;
    /** The expirationDuration property */
    private Period _expirationDuration;
    /**
     * Instantiates a new setUserPreferredPresencePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SetUserPreferredPresencePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setUserPreferredPresencePostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetUserPreferredPresencePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetUserPreferredPresencePostRequestBody();
    }
    /**
     * Gets the activity property value. The activity property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivity() {
        return this._activity;
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
     * Gets the availability property value. The availability property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailability() {
        return this._availability;
    }
    /**
     * Gets the expirationDuration property value. The expirationDuration property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getExpirationDuration() {
        return this._expirationDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SetUserPreferredPresencePostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("activity", (n) -> { currentObject.setActivity(n.getStringValue()); });
        deserializerMap.put("availability", (n) -> { currentObject.setAvailability(n.getStringValue()); });
        deserializerMap.put("expirationDuration", (n) -> { currentObject.setExpirationDuration(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeStringValue("availability", this.getAvailability());
        writer.writePeriodValue("expirationDuration", this.getExpirationDuration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final String value) {
        this._activity = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the availability property value. The availability property
     * @param value Value to set for the availability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailability(@javax.annotation.Nullable final String value) {
        this._availability = value;
    }
    /**
     * Sets the expirationDuration property value. The expirationDuration property
     * @param value Value to set for the expirationDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDuration(@javax.annotation.Nullable final Period value) {
        this._expirationDuration = value;
    }
}
