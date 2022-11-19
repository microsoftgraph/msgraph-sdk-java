package com.microsoft.graph.me.wipemanagedappregistrationsbydevicetag;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the wipeManagedAppRegistrationsByDeviceTag method. */
public class WipeManagedAppRegistrationsByDeviceTagPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceTag property */
    private String _deviceTag;
    /**
     * Instantiates a new wipeManagedAppRegistrationsByDeviceTagPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WipeManagedAppRegistrationsByDeviceTagPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipeManagedAppRegistrationsByDeviceTagPostRequestBody
     */
    @javax.annotation.Nonnull
    public static WipeManagedAppRegistrationsByDeviceTagPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipeManagedAppRegistrationsByDeviceTagPostRequestBody();
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
     * Gets the deviceTag property value. The deviceTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceTag() {
        return this._deviceTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WipeManagedAppRegistrationsByDeviceTagPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("deviceTag", (n) -> { currentObject.setDeviceTag(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the deviceTag property value. The deviceTag property
     * @param value Value to set for the deviceTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceTag(@javax.annotation.Nullable final String value) {
        this._deviceTag = value;
    }
}
