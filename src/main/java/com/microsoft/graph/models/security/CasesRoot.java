package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CasesRoot extends Entity implements Parsable {
    /**
     * The ediscoveryCases property
     */
    private java.util.List<EdiscoveryCase> ediscoveryCases;
    /**
     * Instantiates a new CasesRoot and sets the default values.
     */
    public CasesRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CasesRoot
     */
    @jakarta.annotation.Nonnull
    public static CasesRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CasesRoot();
    }
    /**
     * Gets the ediscoveryCases property value. The ediscoveryCases property
     * @return a java.util.List<EdiscoveryCase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryCase> getEdiscoveryCases() {
        return this.ediscoveryCases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ediscoveryCases", (n) -> { this.setEdiscoveryCases(n.getCollectionOfObjectValues(EdiscoveryCase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("ediscoveryCases", this.getEdiscoveryCases());
    }
    /**
     * Sets the ediscoveryCases property value. The ediscoveryCases property
     * @param value Value to set for the ediscoveryCases property.
     */
    public void setEdiscoveryCases(@jakarta.annotation.Nullable final java.util.List<EdiscoveryCase> value) {
        this.ediscoveryCases = value;
    }
}
