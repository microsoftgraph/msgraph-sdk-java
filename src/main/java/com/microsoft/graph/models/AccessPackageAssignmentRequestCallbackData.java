package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestCallbackData extends CustomExtensionData implements Parsable {
    /**
     * The customExtensionStageInstanceDetail property
     */
    private String customExtensionStageInstanceDetail;
    /**
     * The customExtensionStageInstanceId property
     */
    private String customExtensionStageInstanceId;
    /**
     * The stage property
     */
    private AccessPackageCustomExtensionStage stage;
    /**
     * The state property
     */
    private String state;
    /**
     * Instantiates a new accessPackageAssignmentRequestCallbackData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentRequestCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestCallbackData
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentRequestCallbackData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestCallbackData();
    }
    /**
     * Gets the customExtensionStageInstanceDetail property value. The customExtensionStageInstanceDetail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionStageInstanceDetail() {
        return this.customExtensionStageInstanceDetail;
    }
    /**
     * Gets the customExtensionStageInstanceId property value. The customExtensionStageInstanceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionStageInstanceId() {
        return this.customExtensionStageInstanceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtensionStageInstanceDetail", (n) -> { this.setCustomExtensionStageInstanceDetail(n.getStringValue()); });
        deserializerMap.put("customExtensionStageInstanceId", (n) -> { this.setCustomExtensionStageInstanceId(n.getStringValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the stage property value. The stage property
     * @return a accessPackageCustomExtensionStage
     */
    @javax.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.stage;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
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
        writer.writeStringValue("customExtensionStageInstanceDetail", this.getCustomExtensionStageInstanceDetail());
        writer.writeStringValue("customExtensionStageInstanceId", this.getCustomExtensionStageInstanceId());
        writer.writeEnumValue("stage", this.getStage());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the customExtensionStageInstanceDetail property value. The customExtensionStageInstanceDetail property
     * @param value Value to set for the customExtensionStageInstanceDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionStageInstanceDetail(@javax.annotation.Nullable final String value) {
        this.customExtensionStageInstanceDetail = value;
    }
    /**
     * Sets the customExtensionStageInstanceId property value. The customExtensionStageInstanceId property
     * @param value Value to set for the customExtensionStageInstanceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionStageInstanceId(@javax.annotation.Nullable final String value) {
        this.customExtensionStageInstanceId = value;
    }
    /**
     * Sets the stage property value. The stage property
     * @param value Value to set for the stage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStage(@javax.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.stage = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
}
