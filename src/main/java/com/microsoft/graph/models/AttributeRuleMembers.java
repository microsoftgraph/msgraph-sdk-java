package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeRuleMembers extends SubjectSet implements Parsable {
    /** A description of the membership rule. */
    private String _description;
    /** Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax. */
    private String _membershipRule;
    /**
     * Instantiates a new AttributeRuleMembers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttributeRuleMembers() {
        super();
        this.setOdataType("#microsoft.graph.attributeRuleMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeRuleMembers
     */
    @javax.annotation.Nonnull
    public static AttributeRuleMembers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeRuleMembers();
    }
    /**
     * Gets the description property value. A description of the membership rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeRuleMembers currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("membershipRule", (n) -> { currentObject.setMembershipRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the membershipRule property value. Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMembershipRule() {
        return this._membershipRule;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
    }
    /**
     * Sets the description property value. A description of the membership rule.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the membershipRule property value. Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax.
     * @param value Value to set for the membershipRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembershipRule(@javax.annotation.Nullable final String value) {
        this._membershipRule = value;
    }
}
