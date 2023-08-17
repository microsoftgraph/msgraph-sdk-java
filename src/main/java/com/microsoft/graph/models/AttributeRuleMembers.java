package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeRuleMembers extends SubjectSet implements Parsable {
    /**
     * A description of the membership rule.
     */
    private String description;
    /**
     * Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax.
     */
    private String membershipRule;
    /**
     * Instantiates a new attributeRuleMembers and sets the default values.
     */
    public AttributeRuleMembers() {
        super();
        this.setOdataType("#microsoft.graph.attributeRuleMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeRuleMembers
     */
    @jakarta.annotation.Nonnull
    public static AttributeRuleMembers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeRuleMembers();
    }
    /**
     * Gets the description property value. A description of the membership rule.
     * @return a string
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
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the membershipRule property value. Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.membershipRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
    }
    /**
     * Sets the description property value. A description of the membership rule.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the membershipRule property value. Determines the allowed target users for this policy. For more information about the syntax of the membership rule, see Membership Rules syntax.
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.membershipRule = value;
    }
}
