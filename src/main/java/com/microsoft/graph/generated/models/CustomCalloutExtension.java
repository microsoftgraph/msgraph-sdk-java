package com.microsoft.graph.models;

import com.microsoft.graph.models.identitygovernance.CustomTaskExtension;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomCalloutExtension extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomCalloutExtension} and sets the default values.
     */
    public CustomCalloutExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomCalloutExtension}
     */
    @jakarta.annotation.Nonnull
    public static CustomCalloutExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageAssignmentRequestWorkflowExtension": return new AccessPackageAssignmentRequestWorkflowExtension();
                case "#microsoft.graph.accessPackageAssignmentWorkflowExtension": return new AccessPackageAssignmentWorkflowExtension();
                case "#microsoft.graph.customAuthenticationExtension": return new CustomAuthenticationExtension();
                case "#microsoft.graph.identityGovernance.customTaskExtension": return new CustomTaskExtension();
                case "#microsoft.graph.onAttributeCollectionStartCustomExtension": return new OnAttributeCollectionStartCustomExtension();
                case "#microsoft.graph.onAttributeCollectionSubmitCustomExtension": return new OnAttributeCollectionSubmitCustomExtension();
                case "#microsoft.graph.onOtpSendCustomExtension": return new OnOtpSendCustomExtension();
                case "#microsoft.graph.onTokenIssuanceStartCustomExtension": return new OnTokenIssuanceStartCustomExtension();
            }
        }
        return new CustomCalloutExtension();
    }
    /**
     * Gets the authenticationConfiguration property value. Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     * @return a {@link CustomExtensionAuthenticationConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this.backingStore.get("authenticationConfiguration");
    }
    /**
     * Gets the clientConfiguration property value. HTTP connection settings that define how long Microsoft Entra ID can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @return a {@link CustomExtensionClientConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionClientConfiguration getClientConfiguration() {
        return this.backingStore.get("clientConfiguration");
    }
    /**
     * Gets the description property value. Description for the customCalloutExtension object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the customCalloutExtension object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app&apos;s workflow.
     * @return a {@link CustomExtensionEndpointConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this.backingStore.get("endpointConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationConfiguration", (n) -> { this.setAuthenticationConfiguration(n.getObjectValue(CustomExtensionAuthenticationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("clientConfiguration", (n) -> { this.setClientConfiguration(n.getObjectValue(CustomExtensionClientConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endpointConfiguration", (n) -> { this.setEndpointConfiguration(n.getObjectValue(CustomExtensionEndpointConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authenticationConfiguration", this.getAuthenticationConfiguration());
        writer.writeObjectValue("clientConfiguration", this.getClientConfiguration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("endpointConfiguration", this.getEndpointConfiguration());
    }
    /**
     * Sets the authenticationConfiguration property value. Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     * @param value Value to set for the authenticationConfiguration property.
     */
    public void setAuthenticationConfiguration(@jakarta.annotation.Nullable final CustomExtensionAuthenticationConfiguration value) {
        this.backingStore.set("authenticationConfiguration", value);
    }
    /**
     * Sets the clientConfiguration property value. HTTP connection settings that define how long Microsoft Entra ID can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @param value Value to set for the clientConfiguration property.
     */
    public void setClientConfiguration(@jakarta.annotation.Nullable final CustomExtensionClientConfiguration value) {
        this.backingStore.set("clientConfiguration", value);
    }
    /**
     * Sets the description property value. Description for the customCalloutExtension object.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the customCalloutExtension object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app&apos;s workflow.
     * @param value Value to set for the endpointConfiguration property.
     */
    public void setEndpointConfiguration(@jakarta.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this.backingStore.set("endpointConfiguration", value);
    }
}
