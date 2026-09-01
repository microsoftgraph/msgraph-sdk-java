package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomExtensionData;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomTaskExtensionResponseData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new {@link CustomTaskExtensionResponseData} and sets the default values.
     */
    public CustomTaskExtensionResponseData() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionResponseData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomTaskExtensionResponseData}
     */
    @jakarta.annotation.Nonnull
    public static CustomTaskExtensionResponseData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionResponseData();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operationStatus", (n) -> { this.setOperationStatus(n.getEnumValue(CustomTaskExtensionOperationStatus::forValue)); });
        deserializerMap.put("statusReasons", (n) -> { this.setStatusReasons(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetSubject", (n) -> { this.setTargetSubject(n.getObjectValue(WorkflowSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operationStatus property value. The operationStatus property
     * @return a {@link CustomTaskExtensionOperationStatus}
     */
    @jakarta.annotation.Nullable
    public CustomTaskExtensionOperationStatus getOperationStatus() {
        return this.backingStore.get("operationStatus");
    }
    /**
     * Gets the statusReasons property value. A collection of status reason strings. May be empty.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStatusReasons() {
        return this.backingStore.get("statusReasons");
    }
    /**
     * Gets the targetSubject property value. The workflow subject that was processed by the custom task extension.
     * @return a {@link WorkflowSubject}
     */
    @jakarta.annotation.Nullable
    public WorkflowSubject getTargetSubject() {
        return this.backingStore.get("targetSubject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operationStatus", this.getOperationStatus());
        writer.writeCollectionOfPrimitiveValues("statusReasons", this.getStatusReasons());
        writer.writeObjectValue("targetSubject", this.getTargetSubject());
    }
    /**
     * Sets the operationStatus property value. The operationStatus property
     * @param value Value to set for the operationStatus property.
     */
    public void setOperationStatus(@jakarta.annotation.Nullable final CustomTaskExtensionOperationStatus value) {
        this.backingStore.set("operationStatus", value);
    }
    /**
     * Sets the statusReasons property value. A collection of status reason strings. May be empty.
     * @param value Value to set for the statusReasons property.
     */
    public void setStatusReasons(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("statusReasons", value);
    }
    /**
     * Sets the targetSubject property value. The workflow subject that was processed by the custom task extension.
     * @param value Value to set for the targetSubject property.
     */
    public void setTargetSubject(@jakarta.annotation.Nullable final WorkflowSubject value) {
        this.backingStore.set("targetSubject", value);
    }
}
