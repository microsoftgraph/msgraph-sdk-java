package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10CompliancePolicyCollectionResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /** The value property */
    private java.util.List<Windows10CompliancePolicy> value;
    /**
     * Instantiates a new Windows10CompliancePolicyCollectionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10CompliancePolicyCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10CompliancePolicyCollectionResponse
     */
    @javax.annotation.Nonnull
    public static Windows10CompliancePolicyCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10CompliancePolicyCollectionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(Windows10CompliancePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a windows10CompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<Windows10CompliancePolicy> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<Windows10CompliancePolicy> value) {
        this.value = value;
    }
}
