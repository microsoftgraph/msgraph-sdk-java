package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipOutlierInsight extends GovernanceInsight implements Parsable {
    /**
     * Instantiates a new MembershipOutlierInsight and sets the default values.
     */
    public MembershipOutlierInsight() {
        super();
        this.setOdataType("#microsoft.graph.membershipOutlierInsight");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MembershipOutlierInsight
     */
    @jakarta.annotation.Nonnull
    public static MembershipOutlierInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipOutlierInsight();
    }
    /**
     * Gets the container property value. Navigation link to the container directory object. For example, to a group.
     * @return a DirectoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getContainer() {
        return this.backingStore.get("container");
    }
    /**
     * Gets the containerId property value. Indicates the identifier of the container, for example, a group ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContainerId() {
        return this.backingStore.get("containerId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("container", (n) -> { this.setContainer(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("containerId", (n) -> { this.setContainerId(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("member", (n) -> { this.setMember(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("memberId", (n) -> { this.setMemberId(n.getStringValue()); });
        deserializerMap.put("outlierContainerType", (n) -> { this.setOutlierContainerType(n.getEnumValue(OutlierContainerType::forValue)); });
        deserializerMap.put("outlierMemberType", (n) -> { this.setOutlierMemberType(n.getEnumValue(OutlierMemberType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Navigation link to a member object who modified the record. For example, to a user.
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the member property value. Navigation link to a member object. For example, to a user.
     * @return a DirectoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getMember() {
        return this.backingStore.get("member");
    }
    /**
     * Gets the memberId property value. Indicates the identifier of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMemberId() {
        return this.backingStore.get("memberId");
    }
    /**
     * Gets the outlierContainerType property value. The outlierContainerType property
     * @return a OutlierContainerType
     */
    @jakarta.annotation.Nullable
    public OutlierContainerType getOutlierContainerType() {
        return this.backingStore.get("outlierContainerType");
    }
    /**
     * Gets the outlierMemberType property value. The outlierMemberType property
     * @return a OutlierMemberType
     */
    @jakarta.annotation.Nullable
    public OutlierMemberType getOutlierMemberType() {
        return this.backingStore.get("outlierMemberType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("container", this.getContainer());
        writer.writeStringValue("containerId", this.getContainerId());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeObjectValue("member", this.getMember());
        writer.writeStringValue("memberId", this.getMemberId());
        writer.writeEnumValue("outlierContainerType", this.getOutlierContainerType());
        writer.writeEnumValue("outlierMemberType", this.getOutlierMemberType());
    }
    /**
     * Sets the container property value. Navigation link to the container directory object. For example, to a group.
     * @param value Value to set for the container property.
     */
    public void setContainer(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("container", value);
    }
    /**
     * Sets the containerId property value. Indicates the identifier of the container, for example, a group ID.
     * @param value Value to set for the containerId property.
     */
    public void setContainerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("containerId", value);
    }
    /**
     * Sets the lastModifiedBy property value. Navigation link to a member object who modified the record. For example, to a user.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final User value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the member property value. Navigation link to a member object. For example, to a user.
     * @param value Value to set for the member property.
     */
    public void setMember(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("member", value);
    }
    /**
     * Sets the memberId property value. Indicates the identifier of the user.
     * @param value Value to set for the memberId property.
     */
    public void setMemberId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberId", value);
    }
    /**
     * Sets the outlierContainerType property value. The outlierContainerType property
     * @param value Value to set for the outlierContainerType property.
     */
    public void setOutlierContainerType(@jakarta.annotation.Nullable final OutlierContainerType value) {
        this.backingStore.set("outlierContainerType", value);
    }
    /**
     * Sets the outlierMemberType property value. The outlierMemberType property
     * @param value Value to set for the outlierMemberType property.
     */
    public void setOutlierMemberType(@jakarta.annotation.Nullable final OutlierMemberType value) {
        this.backingStore.set("outlierMemberType", value);
    }
}
