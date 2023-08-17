package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RuleBasedSubjectSet extends SubjectSet implements Parsable {
    /**
     * The rule for the subject set. Lifecycle Workflows supports a rich set of user properties for configuring the rules using $filter query expressions. For more information, see supported user and query parameters.
     */
    private String rule;
    /**
     * Instantiates a new ruleBasedSubjectSet and sets the default values.
     */
    public RuleBasedSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.ruleBasedSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ruleBasedSubjectSet
     */
    @jakarta.annotation.Nonnull
    public static RuleBasedSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleBasedSubjectSet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("rule", (n) -> { this.setRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the rule property value. The rule for the subject set. Lifecycle Workflows supports a rich set of user properties for configuring the rules using $filter query expressions. For more information, see supported user and query parameters.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRule() {
        return this.rule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("rule", this.getRule());
    }
    /**
     * Sets the rule property value. The rule for the subject set. Lifecycle Workflows supports a rich set of user properties for configuring the rules using $filter query expressions. For more information, see supported user and query parameters.
     * @param value Value to set for the rule property.
     */
    public void setRule(@jakarta.annotation.Nullable final String value) {
        this.rule = value;
    }
}
