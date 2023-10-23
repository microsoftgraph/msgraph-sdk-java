package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentitySet implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional. The application associated with this action.
     */
    private Identity application;
    /**
     * Optional. The device associated with this action.
     */
    private Identity device;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Optional. The user associated with this action.
     */
    private Identity user;
    /**
     * Instantiates a new IdentitySet and sets the default values.
     */
    public IdentitySet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentitySet
     */
    @jakarta.annotation.Nonnull
    public static IdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.chatMessageFromIdentitySet": return new ChatMessageFromIdentitySet();
                case "#microsoft.graph.chatMessageMentionedIdentitySet": return new ChatMessageMentionedIdentitySet();
                case "#microsoft.graph.chatMessageReactionIdentitySet": return new ChatMessageReactionIdentitySet();
                case "#microsoft.graph.communicationsIdentitySet": return new CommunicationsIdentitySet();
                case "#microsoft.graph.sharePointIdentitySet": return new SharePointIdentitySet();
            }
        }
        return new IdentitySet();
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
     * Gets the application property value. Optional. The application associated with this action.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getApplication() {
        return this.application;
    }
    /**
     * Gets the device property value. Optional. The device associated with this action.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getDevice() {
        return this.device;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("application", (n) -> { this.setApplication(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the user property value. Optional. The user associated with this action.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the application property value. Optional. The application associated with this action.
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final Identity value) {
        this.application = value;
    }
    /**
     * Sets the device property value. Optional. The device associated with this action.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Identity value) {
        this.device = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the user property value. Optional. The user associated with this action.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final Identity value) {
        this.user = value;
    }
}
