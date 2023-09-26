package com.microsoft.graph.models.security;

import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseOperationCollectionResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * The value property
     */
    private java.util.List<CaseOperation> value;
    /**
     * Instantiates a new CaseOperationCollectionResponse and sets the default values.
     */
    public CaseOperationCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CaseOperationCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public static CaseOperationCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseOperationCollectionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(CaseOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a java.util.List<CaseOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CaseOperation> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<CaseOperation> value) {
        this.value = value;
    }
}
