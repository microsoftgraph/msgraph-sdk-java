package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryHoldPolicySyncOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryHoldPolicySyncOperation} and sets the default values.
     */
    public EdiscoveryHoldPolicySyncOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryHoldPolicySyncOperation}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryHoldPolicySyncOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryHoldPolicySyncOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reportFileMetadata", (n) -> { this.setReportFileMetadata(n.getCollectionOfObjectValues(ReportFileMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reportFileMetadata property value. Contains the properties for report file metadata, including downloadUrl, fileName, and size.
     * @return a {@link java.util.List<ReportFileMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReportFileMetadata> getReportFileMetadata() {
        return this.backingStore.get("reportFileMetadata");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("reportFileMetadata", this.getReportFileMetadata());
    }
    /**
     * Sets the reportFileMetadata property value. Contains the properties for report file metadata, including downloadUrl, fileName, and size.
     * @param value Value to set for the reportFileMetadata property.
     */
    public void setReportFileMetadata(@jakarta.annotation.Nullable final java.util.List<ReportFileMetadata> value) {
        this.backingStore.set("reportFileMetadata", value);
    }
}
