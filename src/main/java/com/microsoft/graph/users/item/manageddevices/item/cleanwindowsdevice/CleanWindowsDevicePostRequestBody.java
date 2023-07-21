package com.microsoft.graph.users.item.manageddevices.item.cleanwindowsdevice;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CleanWindowsDevicePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The keepUserData property
     */
    private Boolean keepUserData;
    /**
     * Instantiates a new cleanWindowsDevicePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CleanWindowsDevicePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cleanWindowsDevicePostRequestBody
     */
    @javax.annotation.Nonnull
    public static CleanWindowsDevicePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CleanWindowsDevicePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("keepUserData", (n) -> { this.setKeepUserData(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepUserData() {
        return this.keepUserData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeepUserData(@javax.annotation.Nullable final Boolean value) {
        this.keepUserData = value;
    }
}
