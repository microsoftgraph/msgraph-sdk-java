package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SkypeForBusinessUserConversationMember extends ConversationMember implements Parsable {
    /**
     * ID of the tenant that the user belongs to.
     */
    private String tenantId;
    /**
     * Azure Active Directory ID of the user.
     */
    private String userId;
    /**
     * Instantiates a new skypeForBusinessUserConversationMember and sets the default values.
     */
    public SkypeForBusinessUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.skypeForBusinessUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a skypeForBusinessUserConversationMember
     */
    @jakarta.annotation.Nonnull
    public static SkypeForBusinessUserConversationMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkypeForBusinessUserConversationMember();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. ID of the tenant that the user belongs to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the userId property value. Azure Active Directory ID of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the tenantId property value. ID of the tenant that the user belongs to.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the userId property value. Azure Active Directory ID of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
