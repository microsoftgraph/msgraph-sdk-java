package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StopAndQuarantineFileAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link StopAndQuarantineFileAction} and sets the default values.
     */
    public StopAndQuarantineFileAction() {
        super();
        this.setOdataType("#microsoft.graph.security.stopAndQuarantineFileAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StopAndQuarantineFileAction}
     */
    @jakarta.annotation.Nonnull
    public static StopAndQuarantineFileAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StopAndQuarantineFileAction();
    }
    /**
     * Gets the deviceIdColumn property value. Name of the hunting-query result column that contains the device ID for the device where the file was observed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceIdColumn() {
        return this.backingStore.get("deviceIdColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceIdColumn", (n) -> { this.setDeviceIdColumn(n.getStringValue()); });
        deserializerMap.put("sha1Column", (n) -> { this.setSha1Column(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sha1Column property value. Name of the hunting-query result column that contains the SHA-1 hash of the file to stop and quarantine.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha1Column() {
        return this.backingStore.get("sha1Column");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceIdColumn", this.getDeviceIdColumn());
        writer.writeStringValue("sha1Column", this.getSha1Column());
    }
    /**
     * Sets the deviceIdColumn property value. Name of the hunting-query result column that contains the device ID for the device where the file was observed.
     * @param value Value to set for the deviceIdColumn property.
     */
    public void setDeviceIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceIdColumn", value);
    }
    /**
     * Sets the sha1Column property value. Name of the hunting-query result column that contains the SHA-1 hash of the file to stop and quarantine.
     * @param value Value to set for the sha1Column property.
     */
    public void setSha1Column(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha1Column", value);
    }
}
