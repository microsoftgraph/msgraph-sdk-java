package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveProtectionUnitsBulkAdditionJob extends ProtectionUnitsBulkJobBase implements Parsable {
    /**
     * Instantiates a new {@link DriveProtectionUnitsBulkAdditionJob} and sets the default values.
     */
    public DriveProtectionUnitsBulkAdditionJob() {
        super();
        this.setOdataType("#microsoft.graph.driveProtectionUnitsBulkAdditionJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveProtectionUnitsBulkAdditionJob}
     */
    @jakarta.annotation.Nonnull
    public static DriveProtectionUnitsBulkAdditionJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveProtectionUnitsBulkAdditionJob();
    }
    /**
     * Gets the directoryObjectIds property value. The directoryObjectIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDirectoryObjectIds() {
        return this.backingStore.get("directoryObjectIds");
    }
    /**
     * Gets the drives property value. The drives property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDrives() {
        return this.backingStore.get("drives");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directoryObjectIds", (n) -> { this.setDirectoryObjectIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("directoryObjectIds", this.getDirectoryObjectIds());
        writer.writeCollectionOfPrimitiveValues("drives", this.getDrives());
    }
    /**
     * Sets the directoryObjectIds property value. The directoryObjectIds property
     * @param value Value to set for the directoryObjectIds property.
     */
    public void setDirectoryObjectIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("directoryObjectIds", value);
    }
    /**
     * Sets the drives property value. The drives property
     * @param value Value to set for the drives property.
     */
    public void setDrives(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("drives", value);
    }
}
