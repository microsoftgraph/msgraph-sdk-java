package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link FileAction} and sets the default values.
     */
    public FileAction() {
        super();
        this.setOdataType("#microsoft.graph.security.fileAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileAction}
     */
    @jakarta.annotation.Nonnull
    public static FileAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAction();
    }
    /**
     * Gets the deviceGroupNames property value. Names of the device groups where the file action applies.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeviceGroupNames() {
        return this.backingStore.get("deviceGroupNames");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceGroupNames", (n) -> { this.setDeviceGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sha1Column", (n) -> { this.setSha1Column(n.getStringValue()); });
        deserializerMap.put("sha256Column", (n) -> { this.setSha256Column(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sha1Column property value. Name of the hunting-query result column that contains the SHA-1 hash of the targeted file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha1Column() {
        return this.backingStore.get("sha1Column");
    }
    /**
     * Gets the sha256Column property value. Name of the hunting-query result column that contains the SHA-256 hash of the targeted file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256Column() {
        return this.backingStore.get("sha256Column");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("deviceGroupNames", this.getDeviceGroupNames());
        writer.writeStringValue("sha1Column", this.getSha1Column());
        writer.writeStringValue("sha256Column", this.getSha256Column());
    }
    /**
     * Sets the deviceGroupNames property value. Names of the device groups where the file action applies.
     * @param value Value to set for the deviceGroupNames property.
     */
    public void setDeviceGroupNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("deviceGroupNames", value);
    }
    /**
     * Sets the sha1Column property value. Name of the hunting-query result column that contains the SHA-1 hash of the targeted file.
     * @param value Value to set for the sha1Column property.
     */
    public void setSha1Column(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha1Column", value);
    }
    /**
     * Sets the sha256Column property value. Name of the hunting-query result column that contains the SHA-256 hash of the targeted file.
     * @param value Value to set for the sha256Column property.
     */
    public void setSha256Column(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256Column", value);
    }
}
