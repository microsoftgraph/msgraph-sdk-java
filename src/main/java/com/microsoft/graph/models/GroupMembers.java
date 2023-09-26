package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupMembers extends SubjectSet implements Parsable {
    /**
     * The name of the group in Azure AD. Read only.
     */
    private String description;
    /**
     * The ID of the group in Azure AD.
     */
    private String groupId;
    /**
     * Instantiates a new GroupMembers and sets the default values.
     */
    public GroupMembers() {
        super();
        this.setOdataType("#microsoft.graph.groupMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupMembers
     */
    @jakarta.annotation.Nonnull
    public static GroupMembers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupMembers();
    }
    /**
     * Gets the description property value. The name of the group in Azure AD. Read only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The ID of the group in Azure AD.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the description property value. The name of the group in Azure AD. Read only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the groupId property value. The ID of the group in Azure AD.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
}
