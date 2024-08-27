package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteProtectionRule extends ProtectionRuleBase implements Parsable {
    /**
     * Instantiates a new {@link SiteProtectionRule} and sets the default values.
     */
    public SiteProtectionRule() {
        super();
        this.setOdataType("#microsoft.graph.siteProtectionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteProtectionRule}
     */
    @jakarta.annotation.Nonnull
    public static SiteProtectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteProtectionRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteExpression", (n) -> { this.setSiteExpression(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the siteExpression property value. Contains a site expression. For examples, see siteExpression example.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteExpression() {
        return this.backingStore.get("siteExpression");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("siteExpression", this.getSiteExpression());
    }
    /**
     * Sets the siteExpression property value. Contains a site expression. For examples, see siteExpression example.
     * @param value Value to set for the siteExpression property.
     */
    public void setSiteExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteExpression", value);
    }
}
