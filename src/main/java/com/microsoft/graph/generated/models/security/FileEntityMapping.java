package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link FileEntityMapping} and sets the default values.
     */
    public FileEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.fileEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static FileEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEntityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("nameColumn", (n) -> { this.setNameColumn(n.getStringValue()); });
        deserializerMap.put("sha1Column", (n) -> { this.setSha1Column(n.getStringValue()); });
        deserializerMap.put("sha256Column", (n) -> { this.setSha256Column(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameColumn() {
        return this.backingStore.get("nameColumn");
    }
    /**
     * Gets the sha1Column property value. Name of the detection query column that maps to the SHA-1 hash of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha1Column() {
        return this.backingStore.get("sha1Column");
    }
    /**
     * Gets the sha256Column property value. Name of the detection query column that maps to the SHA-256 hash of the alert entity.
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
        writer.writeStringValue("nameColumn", this.getNameColumn());
        writer.writeStringValue("sha1Column", this.getSha1Column());
        writer.writeStringValue("sha256Column", this.getSha256Column());
    }
    /**
     * Sets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @param value Value to set for the nameColumn property.
     */
    public void setNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nameColumn", value);
    }
    /**
     * Sets the sha1Column property value. Name of the detection query column that maps to the SHA-1 hash of the alert entity.
     * @param value Value to set for the sha1Column property.
     */
    public void setSha1Column(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha1Column", value);
    }
    /**
     * Sets the sha256Column property value. Name of the detection query column that maps to the SHA-256 hash of the alert entity.
     * @param value Value to set for the sha256Column property.
     */
    public void setSha256Column(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256Column", value);
    }
}
