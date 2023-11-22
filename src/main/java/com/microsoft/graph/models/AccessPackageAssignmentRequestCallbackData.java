package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentRequestCallbackData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new AccessPackageAssignmentRequestCallbackData and sets the default values.
     */
    public AccessPackageAssignmentRequestCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAssignmentRequestCallbackData
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestCallbackData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestCallbackData();
    }
    /**
     * Gets the customExtensionStageInstanceDetail property value. Details for the callback.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomExtensionStageInstanceDetail() {
        return this.backingStore.get("customExtensionStageInstanceDetail");
    }
    /**
     * Gets the customExtensionStageInstanceId property value. Unique identifier of the callout to the custom extension.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomExtensionStageInstanceId() {
        return this.backingStore.get("customExtensionStageInstanceId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtensionStageInstanceDetail", (n) -> { this.setCustomExtensionStageInstanceDetail(n.getStringValue()); });
        deserializerMap.put("customExtensionStageInstanceId", (n) -> { this.setCustomExtensionStageInstanceId(n.getStringValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the stage property value. Indicates the stage at which the custom callout extension is executed. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @return a AccessPackageCustomExtensionStage
     */
    @jakarta.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.backingStore.get("stage");
    }
    /**
     * Gets the state property value. Allow the extension to be able to deny or cancel the request submitted by the requestor. The supported values are Denied and Canceled. This property can only be set for an assignmentRequestCreated stage.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customExtensionStageInstanceDetail", this.getCustomExtensionStageInstanceDetail());
        writer.writeStringValue("customExtensionStageInstanceId", this.getCustomExtensionStageInstanceId());
        writer.writeEnumValue("stage", this.getStage());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the customExtensionStageInstanceDetail property value. Details for the callback.
     * @param value Value to set for the customExtensionStageInstanceDetail property.
     */
    public void setCustomExtensionStageInstanceDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customExtensionStageInstanceDetail", value);
    }
    /**
     * Sets the customExtensionStageInstanceId property value. Unique identifier of the callout to the custom extension.
     * @param value Value to set for the customExtensionStageInstanceId property.
     */
    public void setCustomExtensionStageInstanceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customExtensionStageInstanceId", value);
    }
    /**
     * Sets the stage property value. Indicates the stage at which the custom callout extension is executed. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.backingStore.set("stage", value);
    }
    /**
     * Sets the state property value. Allow the extension to be able to deny or cancel the request submitted by the requestor. The supported values are Denied and Canceled. This property can only be set for an assignmentRequestCreated stage.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
}
