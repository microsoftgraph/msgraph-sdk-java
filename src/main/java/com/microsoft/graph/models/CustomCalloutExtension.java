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
     * Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     */
    private CustomExtensionAuthenticationConfiguration authenticationConfiguration;
    /**
     * HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     */
    private CustomExtensionClientConfiguration clientConfiguration;
    /**
     * Description for the customCalloutExtension object.
     */
    private String description;
    /**
     * Display name for the customCalloutExtension object.
     */
    private String displayName;
    /**
     * The type and details for configuring the endpoint to call the logic app's workflow.
     */
    private CustomExtensionEndpointConfiguration endpointConfiguration;
    /**
     * Instantiates a new customCalloutExtension and sets the default values.
     */
    public CustomCalloutExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customCalloutExtension
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
                case "#microsoft.graph.identityGovernance.customTaskExtension": return new CustomTaskExtension();
            }
        }
        return new CustomCalloutExtension();
    }
    /**
     * Gets the authenticationConfiguration property value. Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     * @return a customExtensionAuthenticationConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * Gets the clientConfiguration property value. HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @return a customExtensionClientConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionClientConfiguration getClientConfiguration() {
        return this.clientConfiguration;
    }
    /**
     * Gets the description property value. Description for the customCalloutExtension object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name for the customCalloutExtension object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app's workflow.
     * @return a customExtensionEndpointConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
        this.authenticationConfiguration = value;
    }
    /**
     * Sets the clientConfiguration property value. HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     * @param value Value to set for the clientConfiguration property.
     */
    public void setClientConfiguration(@jakarta.annotation.Nullable final CustomExtensionClientConfiguration value) {
        this.clientConfiguration = value;
    }
    /**
     * Sets the description property value. Description for the customCalloutExtension object.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name for the customCalloutExtension object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endpointConfiguration property value. The type and details for configuring the endpoint to call the logic app's workflow.
     * @param value Value to set for the endpointConfiguration property.
     */
    public void setEndpointConfiguration(@jakarta.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this.endpointConfiguration = value;
    }
}
