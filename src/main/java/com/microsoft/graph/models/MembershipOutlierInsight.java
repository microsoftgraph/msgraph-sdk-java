package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MembershipOutlierInsight extends GovernanceInsight implements Parsable {
    /**
     * Navigation link to the container directory object. For example, to a group.
     */
    private DirectoryObject container;
    /**
     * Indicates the identifier of the container, for example, a group ID.
     */
    private String containerId;
    /**
     * Navigation link to a member object who modified the record. For example, to a user.
     */
    private User lastModifiedBy;
    /**
     * Navigation link to a member object. For example, to a user.
     */
    private DirectoryObject member;
    /**
     * Indicates the identifier of the user.
     */
    private String memberId;
    /**
     * The outlierContainerType property
     */
    private OutlierContainerType outlierContainerType;
    /**
     * The outlierMemberType property
     */
    private OutlierMemberType outlierMemberType;
    /**
     * Instantiates a new membershipOutlierInsight and sets the default values.
     */
    public MembershipOutlierInsight() {
        super();
        this.setOdataType("#microsoft.graph.membershipOutlierInsight");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a membershipOutlierInsight
     */
    @jakarta.annotation.Nonnull
    public static MembershipOutlierInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipOutlierInsight();
    }
    /**
     * Gets the container property value. Navigation link to the container directory object. For example, to a group.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getContainer() {
        return this.container;
    }
    /**
     * Gets the containerId property value. Indicates the identifier of the container, for example, a group ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContainerId() {
        return this.containerId;
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
        deserializerMap.put("outlierContainerType", (n) -> { this.setOutlierContainerType(n.getEnumValue(OutlierContainerType.class)); });
        deserializerMap.put("outlierMemberType", (n) -> { this.setOutlierMemberType(n.getEnumValue(OutlierMemberType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Navigation link to a member object who modified the record. For example, to a user.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the member property value. Navigation link to a member object. For example, to a user.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getMember() {
        return this.member;
    }
    /**
     * Gets the memberId property value. Indicates the identifier of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMemberId() {
        return this.memberId;
    }
    /**
     * Gets the outlierContainerType property value. The outlierContainerType property
     * @return a outlierContainerType
     */
    @jakarta.annotation.Nullable
    public OutlierContainerType getOutlierContainerType() {
        return this.outlierContainerType;
    }
    /**
     * Gets the outlierMemberType property value. The outlierMemberType property
     * @return a outlierMemberType
     */
    @jakarta.annotation.Nullable
    public OutlierMemberType getOutlierMemberType() {
        return this.outlierMemberType;
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
        this.container = value;
    }
    /**
     * Sets the containerId property value. Indicates the identifier of the container, for example, a group ID.
     * @param value Value to set for the containerId property.
     */
    public void setContainerId(@jakarta.annotation.Nullable final String value) {
        this.containerId = value;
    }
    /**
     * Sets the lastModifiedBy property value. Navigation link to a member object who modified the record. For example, to a user.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final User value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the member property value. Navigation link to a member object. For example, to a user.
     * @param value Value to set for the member property.
     */
    public void setMember(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.member = value;
    }
    /**
     * Sets the memberId property value. Indicates the identifier of the user.
     * @param value Value to set for the memberId property.
     */
    public void setMemberId(@jakarta.annotation.Nullable final String value) {
        this.memberId = value;
    }
    /**
     * Sets the outlierContainerType property value. The outlierContainerType property
     * @param value Value to set for the outlierContainerType property.
     */
    public void setOutlierContainerType(@jakarta.annotation.Nullable final OutlierContainerType value) {
        this.outlierContainerType = value;
    }
    /**
     * Sets the outlierMemberType property value. The outlierMemberType property
     * @param value Value to set for the outlierMemberType property.
     */
    public void setOutlierMemberType(@jakarta.annotation.Nullable final OutlierMemberType value) {
        this.outlierMemberType = value;
    }
}
