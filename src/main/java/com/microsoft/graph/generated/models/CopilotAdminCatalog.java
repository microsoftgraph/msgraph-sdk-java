package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotAdminCatalog extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotAdminCatalog} and sets the default values.
     */
    public CopilotAdminCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotAdminCatalog}
     */
    @jakarta.annotation.Nonnull
    public static CopilotAdminCatalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotAdminCatalog();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("packages", (n) -> { this.setPackages(n.getCollectionOfObjectValues(CopilotPackageDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the packages property value. The packages property
     * @return a {@link java.util.List<CopilotPackageDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotPackageDetail> getPackages() {
        return this.backingStore.get("packages");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("packages", this.getPackages());
    }
    /**
     * Sets the packages property value. The packages property
     * @param value Value to set for the packages property.
     */
    public void setPackages(@jakarta.annotation.Nullable final java.util.List<CopilotPackageDetail> value) {
        this.backingStore.set("packages", value);
    }
}
