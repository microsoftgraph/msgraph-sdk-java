package com.microsoft.graph.devicemanagement.windowsautopilotdeviceidentities.item.updatedeviceproperties;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateDevicePropertiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The addressableUserName property
     */
    private String addressableUserName;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The groupTag property
     */
    private String groupTag;
    /**
     * The userPrincipalName property
     */
    private String userPrincipalName;
    /**
     * Instantiates a new UpdateDevicePropertiesPostRequestBody and sets the default values.
     */
    public UpdateDevicePropertiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateDevicePropertiesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateDevicePropertiesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDevicePropertiesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the addressableUserName property value. The addressableUserName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAddressableUserName() {
        return this.addressableUserName;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addressableUserName", (n) -> { this.setAddressableUserName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupTag", (n) -> { this.setGroupTag(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupTag property value. The groupTag property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupTag() {
        return this.groupTag;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("addressableUserName", this.getAddressableUserName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("groupTag", this.getGroupTag());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the addressableUserName property value. The addressableUserName property
     * @param value Value to set for the addressableUserName property.
     */
    public void setAddressableUserName(@jakarta.annotation.Nullable final String value) {
        this.addressableUserName = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the groupTag property value. The groupTag property
     * @param value Value to set for the groupTag property.
     */
    public void setGroupTag(@jakarta.annotation.Nullable final String value) {
        this.groupTag = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
