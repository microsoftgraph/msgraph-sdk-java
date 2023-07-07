package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogicAppTriggerEndpointConfiguration extends CustomExtensionEndpointConfiguration implements Parsable {
    /**
     * The name of the logic app.
     */
    private String logicAppWorkflowName;
    /**
     * The Azure resource group name for the logic app.
     */
    private String resourceGroupName;
    /**
     * Identifier of the Azure subscription for the logic app.
     */
    private String subscriptionId;
    /**
     * The URL to the logic app endpoint that will be triggered. Only required for app-only token scenarios where app is creating a customCalloutExtension without a signed-in user.
     */
    private String url;
    /**
     * Instantiates a new LogicAppTriggerEndpointConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LogicAppTriggerEndpointConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.logicAppTriggerEndpointConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LogicAppTriggerEndpointConfiguration
     */
    @javax.annotation.Nonnull
    public static LogicAppTriggerEndpointConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogicAppTriggerEndpointConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("logicAppWorkflowName", (n) -> { this.setLogicAppWorkflowName(n.getStringValue()); });
        deserializerMap.put("resourceGroupName", (n) -> { this.setResourceGroupName(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the logicAppWorkflowName property value. The name of the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogicAppWorkflowName() {
        return this.logicAppWorkflowName;
    }
    /**
     * Gets the resourceGroupName property value. The Azure resource group name for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Gets the subscriptionId property value. Identifier of the Azure subscription for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the url property value. The URL to the logic app endpoint that will be triggered. Only required for app-only token scenarios where app is creating a customCalloutExtension without a signed-in user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeStringValue("logicAppWorkflowName", this.getLogicAppWorkflowName());
        writer.writeStringValue("resourceGroupName", this.getResourceGroupName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the logicAppWorkflowName property value. The name of the logic app.
     * @param value Value to set for the logicAppWorkflowName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogicAppWorkflowName(@javax.annotation.Nullable final String value) {
        this.logicAppWorkflowName = value;
    }
    /**
     * Sets the resourceGroupName property value. The Azure resource group name for the logic app.
     * @param value Value to set for the resourceGroupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceGroupName(@javax.annotation.Nullable final String value) {
        this.resourceGroupName = value;
    }
    /**
     * Sets the subscriptionId property value. Identifier of the Azure subscription for the logic app.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the url property value. The URL to the logic app endpoint that will be triggered. Only required for app-only token scenarios where app is creating a customCalloutExtension without a signed-in user.
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
